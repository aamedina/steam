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

(def Action
  "Action games emphasize physical challenges that require hand-eye coordination and motor skill to overcome. They center around the player controlling a character in a world where they must navigate obstacles and fight enemies to succeed."
  {:db/ident :steam/Action,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Action games emphasize physical challenges that require hand-eye coordination and motor skill to overcome. They center around the player controlling a character in a world where they must navigate obstacles and fight enemies to succeed.",
   :rdfs/label "Action",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Action_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Action/"}})

(def Adventure
  "Adventure games focus on puzzle solving within a narrative framework, generally with few or no action elements. These games encourage players to explore, interact with different objects, and solve complex puzzles to progress the story."
  {:db/ident :steam/Adventure,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Adventure games focus on puzzle solving within a narrative framework, generally with few or no action elements. These games encourage players to explore, interact with different objects, and solve complex puzzles to progress the story.",
   :rdfs/label "Adventure",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Adventure_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Adventure/"}})

(def Assessments
  "A tag used to categorize the assessments of a game on Steam"
  {:db/ident :steam/Assessments,
   :rdf/type :owl/Class,
   :rdfs/comment "A tag used to categorize the assessments of a game on Steam",
   :rdfs/label "Assessments",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Casual
  "Casual games are designed to be easily picked up and put down again, allowing for potentially short bursts of play. They often have simpler rules, shorter sessions, and less learned skill than hardcore games."
  {:db/ident :steam/Casual,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Casual games are designed to be easily picked up and put down again, allowing for potentially short bursts of play. They often have simpler rules, shorter sessions, and less learned skill than hardcore games.",
   :rdfs/label "Casual",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Casual_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Casual/"}})

(def Experimental
  "Experimental games are those that challenge the status quo of gaming and offer a unique, sometimes strange, gaming experience. These games often explore new game mechanics, storytelling methods, and art styles."
  {:db/ident :steam/Experimental,
   :rdf/type [:steam/Genre
              :steam/TopLevelGenre
              :owl/NamedIndividual
              :steam/Tag
              :schema/Thing],
   :rdfs/comment
   "Experimental games are those that challenge the status quo of gaming and offer a unique, sometimes strange, gaming experience. These games often explore new game mechanics, storytelling methods, and art styles.",
   :rdfs/label "Experimental",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Art_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Experimental/"}})

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

(def Puzzle
  "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience."
  {:db/ident :steam/Puzzle,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience.",
   :rdfs/label "Puzzle",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Puzzle_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Puzzle/"}})

(def RPG
  "Role-playing games (RPGs) often involve story-telling and narrative elements, character development, complexity, as well as replayability and immersion. The player controls a character in a world where they undertake quests and challenges."
  {:db/ident :steam/RPG,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Role-playing games (RPGs) often involve story-telling and narrative elements, character development, complexity, as well as replayability and immersion. The player controls a character in a world where they undertake quests and challenges.",
   :rdfs/label "RPG",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Role-playing_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/RPG/"}})

(def Racing
  "Racing games simulate the competition of racing, where the player controls a vehicle or other transport. They often have a time limit, and can include obstacles and competitors to beat."
  {:db/ident :steam/Racing,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Racing games simulate the competition of racing, where the player controls a vehicle or other transport. They often have a time limit, and can include obstacles and competitors to beat.",
   :rdfs/label "Racing",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Racing_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Racing/"}})

(def Ratings
  "A tag used to categorize the ratings of a game on Steam"
  {:db/ident        :steam/Ratings,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize the ratings of a game on Steam",
   :rdfs/label      "Ratings",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Simulation
  "Simulation games are designed to accurately simulate real-world activities. They can cover a variety of activities, including driving vehicles, managing a business, or living a life."
  {:db/ident :steam/Simulation,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Simulation games are designed to accurately simulate real-world activities. They can cover a variety of activities, including driving vehicles, managing a business, or living a life.",
   :rdfs/label "Simulation",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Simulation_video_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Simulation/"}})

(def Software
  "A tag used to categorize the software of a game on Steam"
  {:db/ident        :steam/Software,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize the software of a game on Steam",
   :rdfs/label      "Software",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Sports
  "Sports games simulate the practice of traditional physical sports. This can be team sports such as soccer, basketball, or individual activities like golf, fishing, skateboarding."
  {:db/ident :steam/Sports,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Sports games simulate the practice of traditional physical sports. This can be team sports such as soccer, basketball, or individual activities like golf, fishing, skateboarding.",
   :rdfs/label "Sports",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sports_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sports/"}})

(def Strategy
  "Strategy games require strategic, tactical, and sometimes logistical challenges. Many games also offer economic challenges and exploration."
  {:db/ident :steam/Strategy,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Strategy games require strategic, tactical, and sometimes logistical challenges. Many games also offer economic challenges and exploration.",
   :rdfs/label "Strategy",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Strategy_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Strategy/"}})

(def SubGenre
  "A sub genre used to categorize a game on Steam"
  {:db/ident        :steam/SubGenre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A sub genre used to categorize a game on Steam",
   :rdfs/label      "Sub Genre",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Tabletop
  "Tabletop games are those that are normally played on a table or other flat surface, such as board games, card games, dice games, miniatures wargames, tile-based games and role-playing games. In the digital context, these games are often adaptations of traditional tabletop games."
  {:db/ident :steam/Tabletop,
   :rdf/type
   [:steam/TopLevelGenre :owl/NamedIndividual :steam/Tag :schema/Thing],
   :rdfs/comment
   "Tabletop games are those that are normally played on a table or other flat surface, such as board games, card games, dice games, miniatures wargames, tile-based games and role-playing games. In the digital context, these games are often adaptations of traditional tabletop games.",
   :rdfs/label "Tabletop",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Tabletop_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Tabletop/"}})

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