(ns net.wikipunk.rdf.steam
  "A work-in-progress ontology describing the Steam platform."
  {:dcat/downloadURL "resources/steam.ttl",
   :rdf/ns-prefix-map {"owl"    "http://www.w3.org/2002/07/owl#",
                       "rdf"    "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"   "http://www.w3.org/2000/01/rdf-schema#",
                       "schema" "http://schema.org/",
                       "steam"  "https://wikipunk.net/steam/",
                       "xsd"    "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "steam",
   :rdfa/uri "https://wikipunk.net/steam/",
   :rdfs/comment "A work-in-progress ontology describing the Steam platform.",
   :rdfs/label "Steam Ontology",
   :rdfs/seeAlso {:rdfa/uri "https://partner.steamgames.com/doc/home"}})

(def Assessments
  "A tag used to categorize the assessments of a game on Steam"
  {:db/ident :steam/Assessments,
   :rdf/type :owl/Class,
   :rdfs/comment "A tag used to categorize the assessments of a game on Steam",
   :rdfs/label "Assessments",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Features
  "A tag used to describe the features of a game on Steam"
  {:db/ident        :steam/Features,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to describe the features of a game on Steam",
   :rdfs/label      "Features",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Funding
  "A tag used to categorize the funding of a game on Steam"
  {:db/ident        :steam/Funding,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize the funding of a game on Steam",
   :rdfs/label      "Funding",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Genre
  "A genre used to categorize a game on Steam"
  {:db/ident        :steam/Genre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A genre used to categorize a game on Steam",
   :rdfs/label      "Genre",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def HardwareInput
  "A tag used to categorize the hardware input of a game on Steam"
  {:db/ident :steam/HardwareInput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to categorize the hardware input of a game on Steam",
   :rdfs/label "Hardware Input",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Other
  "A tag used to categorize other aspects of a game on Steam"
  {:db/ident        :steam/Other,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize other aspects of a game on Steam",
   :rdfs/label      "Other",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Players
  "A tag used to describe the player options of a game on Steam"
  {:db/ident :steam/Players,
   :rdf/type :owl/Class,
   :rdfs/comment "A tag used to describe the player options of a game on Steam",
   :rdfs/label "Players",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Ratings
  "A tag used to categorize the ratings of a game on Steam"
  {:db/ident        :steam/Ratings,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize the ratings of a game on Steam",
   :rdfs/label      "Ratings",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Software
  "A tag used to categorize the software of a game on Steam"
  {:db/ident        :steam/Software,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize the software of a game on Steam",
   :rdfs/label      "Software",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def SubGenre
  "A sub genre used to categorize a game on Steam"
  {:db/ident        :steam/SubGenre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A sub genre used to categorize a game on Steam",
   :rdfs/label      "Sub Genre",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Tag
  "A tag used to categorize a game on Steam"
  {:db/ident        :steam/Tag,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize a game on Steam",
   :rdfs/label      "Tag",
   :rdfs/subClassOf :schema/Thing})

(def ThemesAndMoods
  "A tag used to describe the themes and moods of a game on Steam"
  {:db/ident :steam/ThemesAndMoods,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to describe the themes and moods of a game on Steam",
   :rdfs/label "Themes and Moods",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def TopLevelGenre
  "A top level genre used to categorize a game on Steam"
  {:db/ident        :steam/TopLevelGenre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A top level genre used to categorize a game on Steam",
   :rdfs/label      "Top Level Genre",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def VisualsAndViewpoint
  "A tag used to describe the visuals and viewpoint of a game on Steam"
  {:db/ident :steam/VisualsAndViewpoint,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to describe the visuals and viewpoint of a game on Steam",
   :rdfs/label "Visuals and Viewpoint",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})