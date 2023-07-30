(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [clj-http.client :as http]
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [datomic.client.api :as d]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [net.wikipunk.datomic.boot :as db]
   [zprint.core :as zprint]
   [net.wikipunk.steam.boot :as boot]
   [net.wikipunk.rdf.steam]))

(set-init
  (fn [_]
    (set! *print-namespace-maps* nil)
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(defmacro inspect
  "Evaluate forms in an implicit do and inspect the value of the last
  expression using Reveal."
  [& body]
  `(do (@user/reveal (do ~@body))
       true))

(comment
  (def boot-db (db/test-bootstrap (:db system))))

;; SteamSpy API Documentation

;; This is an API for Steam Spy. It accepts requests in a GET string and returns data in JSON arrays.

;;   *IMPORTANT:* some things have changed, please, read this document through!

;;   The data is refreshed once a day, there is no reason to request the same information more than once every 24 hours.

;;   Allowed poll rate - 1 request per second for most requests, 1 request per 60 seconds for the *all* requests.

;;   ## Examples: ##
   
;;   * steamspy.com/api.php?request=appdetails&appid=730 - returns data for Counter-Strike: Global Offensive
;;   * steamspy.com/api.php?request=top100in2weeks - return Top 100 apps by players in the last two weeks
;;   * steamspy.com/api.php?request=all&page=1 - return apps 1,000-1,999 of all apps.


;;   ## Common parameters: ##
 
;;   * request - code for API request call.
;;   * appid - Application ID (a number).


;;   ## Accepted requests: ##
  
;;   ### appdetails ###

;;   Returns details for the specific application. Requires *appid* parameter.  

;;   ### genre ###

;;   Returns games in this particular genre. Requires *genre* parameter and works like this:
  
;;   * steamspy.com/api.php?request=genre&genre=Early+Access

;;   ### tag ###

;;   Returns games with this particular tag. Requires *tag* parameter and works like this:
  
;;   * steamspy.com/api.php?request=tag&tag=Early+Access

;;   ### top100in2weeks ###

;;   Returns Top 100 games by players in the last two weeks.

;;   ### top100forever ###

;;   Returns Top 100 games by players since March 2009.

;;   ### top100owned ###

;;   Returns Top 100 games by owners.

;;   ### all ###

;;   Returns all games with owners data sorted by owners. Returns 1,000 entries per page.
;;   * page - page number for the list (starts at 0)


;;   ## Return format for an app: ##

;;   * appid - Steam Application ID. If it's 999999, then data for this application is hidden on developer's request, sorry.
;;   * name - game's name
;;   * developer - comma separated list of the developers of the game
;;   * publisher - comma separated list of the publishers of the game
;;   * score_rank - score rank of the game based on user reviews
;;   * owners - owners of this application on Steam as a range.
;;   * average_forever - average playtime since March 2009. In minutes.
;;   * average_2weeks - average playtime in the last two weeks. In minutes.
;;   * median_forever - median playtime since March 2009. In minutes.
;;   * median_2weeks - median playtime in the last two weeks. In minutes.
;;   * ccu - peak CCU yesterday.
;;   * price - current US price in cents.
;;   * initialprice - original US price in cents.
;;   * discount - current discount in percents.
;;   * tags - game's tags with votes in JSON array.
;;   * languages - list of supported languages.
;;   * genre - list of genres.


;;   ## Questions? ##

;;   Contact me by e-mail: *sergey at galyonkin dot com*.

(defn fetch-page
  [page]
  (assoc (http/get "https://steamspy.com/api.php"
                   {:query-params {:request "all" :page page}
                    :as           :json})
         :page page))

(defn fetch-pages
  [num-pages]
  (->> (iteration fetch-page
                  :initk 0
                  :kf    (comp inc :page)
                  :somef (comp seq :body)
                  :vf    :body)
       (take num-pages)
       (reduce merge)))

(defn fetch-tag
  [tag]
  (some->> (http/get "https://steamspy.com/api.php"
                     {:query-params {:request "tag" :tag tag}
                      :as           :json})
           :body))

(defn spit-tag
  [tag]
  (spit (str "resources/" tag ".edn") (fetch-tag tag)))

(comment
  (doseq [tag (->> (sort (descendants :steam/Tag))
                   (map datafy)
                   (map :rdfs/label))]
    (spit-tag tag)
    (Thread/sleep 1000)))
