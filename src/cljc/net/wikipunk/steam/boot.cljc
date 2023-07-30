(ns net.wikipunk.steam.boot
  {:rdf/type :jsonld/Context})

(def steam
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "https://wikipunk.net/steam/"
   :rdfa/prefix      "steam"
   :dcat/downloadURL "resources/steam.ttl"})
