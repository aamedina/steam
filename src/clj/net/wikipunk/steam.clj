(ns net.wikipunk.steam
  "Steam"
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.steam.boot]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.rdf.steam]))

(defrecord Steam []
  com/Lifecycle
  (start [this]
    this)
  (stop [this]
    this))
