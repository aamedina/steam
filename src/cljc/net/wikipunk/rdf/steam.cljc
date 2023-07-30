(ns net.wikipunk.rdf.steam
  "A work-in-progress ontology describing the Steam platform. Use the rdfs:label property on tag classes to get the name of the tag as catalogued by Steam."
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
   :rdfs/comment
   "A work-in-progress ontology describing the Steam platform. Use the rdfs:label property on tag classes to get the name of the tag as catalogued by Steam.",
   :rdfs/label "Steam Ontology",
   :rdfs/seeAlso [{:rdfa/uri "https://partner.steamgames.com/doc/store/tags"}
                  {:rdfa/uri "https://partner.steamgames.com/doc/home"}]})

(def Action
  "Action games emphasize physical challenges that require hand-eye coordination and motor skill to overcome. They center around the player controlling a character in a world where they must navigate obstacles and fight enemies to succeed."
  {:db/ident :steam/Action,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Action games emphasize physical challenges that require hand-eye coordination and motor skill to overcome. They center around the player controlling a character in a world where they must navigate obstacles and fight enemies to succeed.",
   :rdfs/label "Action",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Action_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Action/"}})

(def ActionAdventure
  "Action-Adventure games blend elements of action games with elements of adventure games, typically featuring an emphasis on combat along with puzzle-solving and item-gathering."
  {:db/ident :steam/ActionAdventure,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Action-Adventure games blend elements of action games with elements of adventure games, typically featuring an emphasis on combat along with puzzle-solving and item-gathering.",
   :rdfs/label "Action-Adventure",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Action-adventure_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Action-Adventure/"}})

(def ActionRPG
  "Action RPG games combine elements of action games with elements of role-playing games, typically featuring real-time combat where the player has direct control over characters, as opposed to turn-based or menu-based combat."
  {:db/ident :steam/ActionRPG,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Action RPG games combine elements of action games with elements of role-playing games, typically featuring real-time combat where the player has direct control over characters, as opposed to turn-based or menu-based combat.",
   :rdfs/label "Action RPG",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Action_role-playing_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Action%20RPG/"}})

(def Adventure
  "Adventure games focus on puzzle solving within a narrative framework, generally with few or no action elements. These games encourage players to explore, interact with different objects, and solve complex puzzles to progress the story."
  {:db/ident :steam/Adventure,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Adventure games focus on puzzle solving within a narrative framework, generally with few or no action elements. These games encourage players to explore, interact with different objects, and solve complex puzzles to progress the story.",
   :rdfs/label "Adventure",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Adventure_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Adventure/"}})

(def Arcade
  "Arcade games are focused on short, simple gameplay offering immediate satisfaction but also challenge and replayability. They often mimic games found in real-world arcades, like racing, shooting, or sports games."
  {:db/ident :steam/Arcade,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Arcade games are focused on short, simple gameplay offering immediate satisfaction but also challenge and replayability. They often mimic games found in real-world arcades, like racing, shooting, or sports games.",
   :rdfs/label "Arcade",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Arcade_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Arcade/"}})

(def Assessments
  "A tag used to categorize the assessments of a game on Steam"
  {:db/ident :steam/Assessments,
   :rdf/type :owl/Class,
   :rdfs/comment "A tag used to categorize the assessments of a game on Steam",
   :rdfs/label "Assessments",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def AutoBattler
  "Auto Battler games, also known as auto chess, involve automatic battles between characters controlled by the game rather than the player. Players typically focus on strategy, such as character placement and upgrades."
  {:db/ident :steam/AutoBattler,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Auto Battler games, also known as auto chess, involve automatic battles between characters controlled by the game rather than the player. Players typically focus on strategy, such as character placement and upgrades.",
   :rdfs/label "Auto Battler",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Auto%20Battler/"}})

(def AutomobileSim
  "Automobile Sim games simulate the experience of driving or racing cars. They often focus on realistic physics and vehicle handling, as well as potentially managing aspects of the car's performance such as fuel usage or mechanical wear."
  {:db/ident :steam/AutomobileSim,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Automobile Sim games simulate the experience of driving or racing cars. They often focus on realistic physics and vehicle handling, as well as potentially managing aspects of the car's performance such as fuel usage or mechanical wear.",
   :rdfs/label "Automobile Sim",
   :rdfs/subClassOf [:steam/Racing :steam/Simulation],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Automobile%20Sim/"}})

(def BMX
  "BMX games simulate the sport of BMX biking, allowing players to perform tricks, compete in races, or explore environments on a BMX bike."
  {:db/ident :steam/BMX,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "BMX games simulate the sport of BMX biking, allowing players to perform tricks, compete in races, or explore environments on a BMX bike.",
   :rdfs/label "BMX",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/BMX"},
   :rdfs/subClassOf [:steam/Racing :steam/Sports],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/BMX/"}})

(def BaseBuilding
  "Base Building games focus on the construction and management of a home base or headquarters for the player. This often involves gathering resources, managing infrastructure, and defending against attacks."
  {:db/ident :steam/BaseBuilding,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Base Building games focus on the construction and management of a home base or headquarters for the player. This often involves gathering resources, managing infrastructure, and defending against attacks.",
   :rdfs/label "Base Building",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Base%20Building/"}})

(def Baseball
  "Baseball games simulate the sport of baseball, allowing players to control a team and compete in games or seasons. They often focus on realistic gameplay and statistics."
  {:db/ident :steam/Baseball,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Baseball games simulate the sport of baseball, allowing players to control a team and compete in games or seasons. They often focus on realistic gameplay and statistics.",
   :rdfs/label "Baseball",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Baseball"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Baseball/"}})

(def Basketball
  "Basketball games simulate the sport of basketball, allowing players to control a team and compete in games or seasons. They often focus on realistic gameplay and statistics."
  {:db/ident :steam/Basketball,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Basketball games simulate the sport of basketball, allowing players to control a team and compete in games or seasons. They often focus on realistic gameplay and statistics.",
   :rdfs/label "Basketball",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Basketball"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Basketball/"}})

(def BattleRoyale
  "Battle Royale games involve numerous players that compete to be the last person or team standing. These games often involve a shrinking play area to bring players closer together over time."
  {:db/ident :steam/BattleRoyale,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Battle Royale games involve numerous players that compete to be the last person or team standing. These games often involve a shrinking play area to bring players closer together over time.",
   :rdfs/label "Battle Royale",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Battle_royale_game"},
   :rdfs/subClassOf {:owl/hasValue   :schema/MultiPlayer,
                     :owl/onProperty :schema/playMode,
                     :rdf/type       :owl/Restriction},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Battle%20Royale/"}})

(def BoardGame
  "Board Game genre includes games that are digital adaptations of traditional or modern board games. They often involve strategic decision making, and can be played solo or multiplayer."
  {:db/ident :steam/BoardGame,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Board Game genre includes games that are digital adaptations of traditional or modern board games. They often involve strategic decision making, and can be played solo or multiplayer.",
   :rdfs/label "Board Game",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Board_game"},
   :rdfs/subClassOf :steam/Tabletop,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Board%20Game/"}})

(def Bowling
  "Bowling games simulate the sport of bowling, allowing players to compete in games or tournaments. They often focus on realistic physics and gameplay."
  {:db/ident :steam/Bowling,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Bowling games simulate the sport of bowling, allowing players to compete in games or tournaments. They often focus on realistic physics and gameplay.",
   :rdfs/label "Bowling",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Bowling"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Bowling/"}})

(def Building
  "Building games focus on the construction of structures or environments. They often involve gathering resources, planning and designing buildings, and managing infrastructure."
  {:db/ident :steam/Building,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Building games focus on the construction of structures or environments. They often involve gathering resources, planning and designing buildings, and managing infrastructure.",
   :rdfs/label "Building",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Construction_and_management_simulation"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Building/"}})

(def CardGame
  "Card games are digital adaptations of traditional or modern card games. They often involve strategic decision making, and can be played solo or multiplayer."
  {:db/ident :steam/CardGame,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Card games are digital adaptations of traditional or modern card games. They often involve strategic decision making, and can be played solo or multiplayer.",
   :rdfs/label "Card Game",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Card_game"},
   :rdfs/subClassOf :steam/Tabletop,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Card%20Game/"}})

(def Casual
  "Casual games are designed to be easily picked up and put down again, allowing for potentially short bursts of play. They often have simpler rules, shorter sessions, and less learned skill than hardcore games."
  {:db/ident :steam/Casual,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Casual games are designed to be easily picked up and put down again, allowing for potentially short bursts of play. They often have simpler rules, shorter sessions, and less learned skill than hardcore games.",
   :rdfs/label "Casual",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Casual_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Casual/"}})

(def CharacterActionGame
  "Character Action Games are action games that allow players to control a single, or sometimes multiple, characters. These games often feature combat and exploration."
  {:db/ident :steam/CharacterActionGame,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Character Action Games are action games that allow players to control a single, or sometimes multiple, characters. These games often feature combat and exploration.",
   :rdfs/label "Character Action Game",
   :rdfs/subClassOf :steam/Action,
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Character%20Action%20Game/"}})

(def Chess
  "Chess games are digital adaptations of the traditional board game of chess. They often allow for play against AI or human opponents, and may offer additional features like tutorials or puzzles."
  {:db/ident :steam/Chess,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Chess games are digital adaptations of the traditional board game of chess. They often allow for play against AI or human opponents, and may offer additional features like tutorials or puzzles.",
   :rdfs/label "Chess",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Chess"},
   :rdfs/subClassOf [:steam/BoardGame :steam/Tabletop],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Chess/"}})

(def Clicker
  "Clicker games, also known as incremental or idle games, involve simple gameplay that can often run without player intervention. They often involve clicking or tapping to gain some form of currency, which can be used to purchase upgrades."
  {:db/ident :steam/Clicker,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Clicker games, also known as incremental or idle games, involve simple gameplay that can often run without player intervention. They often involve clicking or tapping to gain some form of currency, which can be used to purchase upgrades.",
   :rdfs/label "Clicker",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Incremental_game"},
   :rdfs/subClassOf :steam/Casual,
   :schema/sameAs :steam/Idler,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Clicker/"}})

(def Cycling
  "Cycling games simulate the sport of cycling, allowing players to compete in races or explore environments on a bike."
  {:db/ident :steam/Cycling,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Cycling games simulate the sport of cycling, allowing players to compete in races or explore environments on a bike.",
   :rdfs/label "Cycling",
   :rdfs/subClassOf [:steam/Racing :steam/Sports],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cycling/"}})

(def Diplomacy
  "Diplomacy games involve negotiation, strategy, and social interaction. Players often need to form alliances, make deals, or negotiate with other players to achieve their goals."
  {:db/ident :steam/Diplomacy,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Diplomacy games involve negotiation, strategy, and social interaction. Players often need to form alliances, make deals, or negotiate with other players to achieve their goals.",
   :rdfs/label "Diplomacy",
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Diplomacy/"}})

(def Esports
  "Esports games are competitive games that are often played in professional competitions. They often require high levels of skill and strategy, and have large online communities."
  {:db/ident :steam/Esports,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Esports games are competitive games that are often played in professional competitions. They often require high levels of skill and strategy, and have large online communities.",
   :rdfs/label "eSports",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Esports"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/eSports/"}})

(def Experimental
  "Experimental games are those that challenge the status quo of gaming and offer a unique, sometimes strange, gaming experience. These games often explore new game mechanics, storytelling methods, and art styles."
  {:db/ident :steam/Experimental,
   :rdf/type
   [:steam/Genre :steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Experimental games are those that challenge the status quo of gaming and offer a unique, sometimes strange, gaming experience. These games often explore new game mechanics, storytelling methods, and art styles.",
   :rdfs/label "Experimental",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Art_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Experimental/"}})

(def Exploration
  "Exploration games focus on the act of exploring an environment. They often feature open-world settings, and encourage players to explore and discover new areas, items, or storylines."
  {:db/ident :steam/Exploration,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Exploration games focus on the act of exploring an environment. They often feature open-world settings, and encourage players to explore and discover new areas, items, or storylines.",
   :rdfs/label "Exploration",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Exploration/"}})

(def FarmingSim
  "Farming Sim games simulate the experience of farming, including the cultivation of crops, raising of livestock, and management of a farm. They often involve elements of strategy and resource management."
  {:db/ident :steam/FarmingSim,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Farming Sim games simulate the experience of farming, including the cultivation of crops, raising of livestock, and management of a farm. They often involve elements of strategy and resource management.",
   :rdfs/label "Farming Sim",
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Farming%20Sim/"}})

(def Features
  "A tag used to describe the features of a game on Steam"
  {:db/ident        :steam/Features,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to describe the features of a game on Steam",
   :rdfs/label      "Features",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Fighting
  "Fighting games are characterized by close combat between two fighters or groups of fighters, often set in arenas. Players must master techniques, combos, and strategy to overcome their opponents."
  {:db/ident :steam/Fighting,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Fighting games are characterized by close combat between two fighters or groups of fighters, often set in arenas. Players must master techniques, combos, and strategy to overcome their opponents.",
   :rdfs/label "Fighting",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Fighting_game"},
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Fighting/"}})

(def Football
  "Football games simulate the sport of football, allowing players to control a team and compete in matches or seasons. They often focus on realistic gameplay and statistics."
  {:db/ident :steam/Football,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Football games simulate the sport of football, allowing players to control a team and compete in matches or seasons. They often focus on realistic gameplay and statistics.",
   :rdfs/label "Football",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Football_game"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Football/"}})

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

(def GodGame
  "God games are a type of game where players control a character with divine powers. They often involve elements of creation, terraforming, and control over nature."
  {:db/ident :steam/GodGame,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "God games are a type of game where players control a character with divine powers. They often involve elements of creation, terraforming, and control over nature.",
   :rdfs/label "God Game",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/God_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/God%20Game/"}})

(def Golf
  "Golf games simulate the sport of golf, allowing players to compete in matches or tournaments. They often focus on realistic physics and gameplay."
  {:db/ident :steam/Golf,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Golf games simulate the sport of golf, allowing players to compete in matches or tournaments. They often focus on realistic physics and gameplay.",
   :rdfs/label "Golf",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Golf_game"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Golf/"}})

(def Hacking
  "Hacking games involve elements of computer hacking. They often require players to solve puzzles, exploit systems, or engage in simulated computer hacking tasks."
  {:db/ident :steam/Hacking,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Hacking games involve elements of computer hacking. They often require players to solve puzzles, exploit systems, or engage in simulated computer hacking tasks.",
   :rdfs/label "Hacking",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Hacking/"}})

(def HardwareInput
  "A tag used to categorize the hardware input of a game on Steam"
  {:db/ident :steam/HardwareInput,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to categorize the hardware input of a game on Steam",
   :rdfs/label "Hardware Input",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def HiddenObject
  "Hidden Object games require players to find specific items from a list that are hidden within a picture or scene."
  {:db/ident :steam/HiddenObject,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Hidden Object games require players to find specific items from a list that are hidden within a picture or scene.",
   :rdfs/label "Hidden Object",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Hidden_object_game"},
   :rdfs/subClassOf :steam/Puzzle,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Hidden%20Object/"}})

(def Hockey
  "Hockey games simulate the sport of hockey, allowing players to control a team and compete in matches or seasons. They often focus on realistic gameplay and statistics."
  {:db/ident :steam/Hockey,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Hockey games simulate the sport of hockey, allowing players to control a team and compete in matches or seasons. They often focus on realistic gameplay and statistics.",
   :rdfs/label "Hockey",
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Hockey/"}})

(def Idler
  "Idler games, also known as incremental or idle games, involve simple gameplay that can often run without player intervention. They often involve clicking or tapping to gain some form of currency, which can be used to purchase upgrades."
  {:db/ident :steam/Idler,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Idler games, also known as incremental or idle games, involve simple gameplay that can often run without player intervention. They often involve clicking or tapping to gain some form of currency, which can be used to purchase upgrades.",
   :rdfs/label "Idler",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Incremental_game"},
   :rdfs/subClassOf :steam/Casual,
   :schema/sameAs :steam/Clicker,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Idler/"}})

(def InteractiveFiction
  "Interactive Fiction games are games that emphasize narrative and player choice. They often involve complex branching narratives and multiple endings."
  {:db/ident :steam/InteractiveFiction,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Interactive Fiction games are games that emphasize narrative and player choice. They often involve complex branching narratives and multiple endings.",
   :rdfs/label "Interactive Fiction",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Interactive_fiction"},
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Interactive%20Fiction/"}})

(def MMORPG
  "MMORPGs (Massively Multiplayer Online Role-Playing Games) are games that involve large numbers of players interacting in a virtual world. They often involve character development, quests, and multiplayer cooperation or competition."
  {:db/ident :steam/MMORPG,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "MMORPGs (Massively Multiplayer Online Role-Playing Games) are games that involve large numbers of players interacting in a virtual world. They often involve character development, quests, and multiplayer cooperation or competition.",
   :rdfs/label "MMORPG",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Massively_multiplayer_online_role-playing_game"},
   :rdfs/subClassOf [{:owl/hasValue   :schema/MultiPlayer,
                      :owl/onProperty :schema/playMode,
                      :rdf/type       :owl/Restriction}
                     :steam/RPG],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/MMORPG/"}})

(def MOBA
  "MOBA (Multiplayer Online Battle Arena) games involve teams of players competing against each other in an arena. They often require strategic decision-making, teamwork, and player skill."
  {:db/ident :steam/MOBA,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "MOBA (Multiplayer Online Battle Arena) games involve teams of players competing against each other in an arena. They often require strategic decision-making, teamwork, and player skill.",
   :rdfs/label "MOBA",
   :rdfs/seeAlso
   {:rdfa/uri "http://dbpedia.org/resource/Multiplayer_online_battle_arena"},
   :rdfs/subClassOf [{:owl/hasValue   :schema/MultiPlayer,
                      :owl/onProperty :schema/playMode,
                      :rdf/type       :owl/Restriction}
                     :steam/Strategy],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/MOBA/"}})

(def Management
  "Management games involve managing resources and making strategic decisions. They often require players to manage businesses, cities, or other entities."
  {:db/ident :steam/Management,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Management games involve managing resources and making strategic decisions. They often require players to manage businesses, cities, or other entities.",
   :rdfs/label "Management",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Construction_and_management_simulation"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Management/"}})

(def Match3
  "Match 3 games require players to match three or more items of the same type to achieve a goal. They often involve puzzle-solving and strategic thinking."
  {:db/ident :steam/Match3,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Match 3 games require players to match three or more items of the same type to achieve a goal. They often involve puzzle-solving and strategic thinking.",
   :rdfs/label "Match 3",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Tile-matching_video_game"},
   :rdfs/subClassOf :steam/Puzzle,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Match%203/"}})

(def MedicalSim
  "Medical Sim games simulate medical scenarios or procedures. They often require players to diagnose and treat patients, manage a medical facility, or perform simulated surgeries."
  {:db/ident :steam/MedicalSim,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Medical Sim games simulate medical scenarios or procedures. They often require players to diagnose and treat patients, manage a medical facility, or perform simulated surgeries.",
   :rdfs/label "Medical Sim",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Medical_simulation"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Medical%20Sim/"}})

(def MiniGolf
  "Mini Golf games simulate the sport of mini golf, allowing players to compete in matches or tournaments. They often focus on realistic physics and gameplay."
  {:db/ident :steam/MiniGolf,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Mini Golf games simulate the sport of mini golf, allowing players to compete in matches or tournaments. They often focus on realistic physics and gameplay.",
   :rdfs/label "Mini Golf",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Miniature_golf"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Mini%20Golf/"}})

(def Mining
  "Mining games involve the extraction of valuable minerals or other geological materials from the earth. They often require players to manage resources, explore environments, and develop mining operations."
  {:db/ident :steam/Mining,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Mining games involve the extraction of valuable minerals or other geological materials from the earth. They often require players to manage resources, explore environments, and develop mining operations.",
   :rdfs/label "Mining",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mining/"}})

(def Motocross
  "Motocross games simulate the sport of motocross, allowing players to compete in races or perform stunts on a motocross bike."
  {:db/ident :steam/Motocross,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Motocross games simulate the sport of motocross, allowing players to compete in races or perform stunts on a motocross bike.",
   :rdfs/label "Motocross",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Motocross_video_game"},
   :rdfs/subClassOf [:steam/Sports :steam/Racing],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Motocross/"}})

(def OpenWorld
  "Open World games provide a large, open environment for players to explore and interact with. They often allow players to choose their own objectives and play at their own pace."
  {:db/ident :steam/OpenWorld,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Open World games provide a large, open environment for players to explore and interact with. They often allow players to choose their own objectives and play at their own pace.",
   :rdfs/label "Open World",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Open_world"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Open%20World/"}})

(def Other
  "A tag used to categorize other aspects of a game on Steam"
  {:db/ident        :steam/Other,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize other aspects of a game on Steam",
   :rdfs/label      "Other",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def OutbreakSim
  "Outbreak Sim games simulate the spread of diseases or other outbreaks and often involve strategy and management elements."
  {:db/ident :steam/OutbreakSim,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Outbreak Sim games simulate the spread of diseases or other outbreaks and often involve strategy and management elements.",
   :rdfs/label "Outbreak Sim",
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Outbreak%20Sim/"}})

(def PartyBasedRPG
  "Party-Based RPGs are role-playing games where players control a group of characters, often with different abilities and roles, and must use teamwork and strategy to succeed."
  {:db/ident :steam/PartyBasedRPG,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Party-Based RPGs are role-playing games where players control a group of characters, often with different abilities and roles, and must use teamwork and strategy to succeed.",
   :rdfs/label "Party-Based RPG",
   :rdfs/subClassOf :steam/RPG,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Party-Based%20RPG/"}})

(def Pinball
  "Pinball games simulate the classic arcade game of pinball, where players use flippers to hit a ball and score points."
  {:db/ident :steam/Pinball,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Pinball games simulate the classic arcade game of pinball, where players use flippers to hit a ball and score points.",
   :rdfs/label "Pinball",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Pinball"},
   :rdfs/subClassOf :steam/Arcade,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Pinball/"}})

(def Platformer
  "Platformer games involve guiding a character through levels and overcoming obstacles, often by jumping onto platforms at different heights."
  {:db/ident :steam/Platformer,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Platformer games involve guiding a character through levels and overcoming obstacles, often by jumping onto platforms at different heights.",
   :rdfs/label "Platformer",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Platform_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Platformer/"}})

(def Players
  "A tag used to describe the player options of a game on Steam"
  {:db/ident :steam/Players,
   :rdf/type :owl/Class,
   :rdfs/comment "A tag used to describe the player options of a game on Steam",
   :rdfs/label "Players",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def PointAndClick
  "Point & Click games involve interacting with the environment and solving puzzles through a point-and-click interface."
  {:db/ident :steam/PointAndClick,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Point & Click games involve interacting with the environment and solving puzzles through a point-and-click interface.",
   :rdfs/label "Point & Click",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Point%20&%20Click/"}})

(def Puzzle
  "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience."
  {:db/ident :steam/Puzzle,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience.",
   :rdfs/label "Puzzle",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Puzzle_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Puzzle/"}})

(def RPG
  "Role-playing games (RPGs) often involve story-telling and narrative elements, character development, complexity, as well as replayability and immersion. The player controls a character in a world where they undertake quests and challenges."
  {:db/ident :steam/RPG,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Role-playing games (RPGs) often involve story-telling and narrative elements, character development, complexity, as well as replayability and immersion. The player controls a character in a world where they undertake quests and challenges.",
   :rdfs/label "RPG",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Role-playing_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/RPG/"}})

(def RTS
  "Real-Time Strategy (RTS) games require strategic decision making in real time, often involving resource management and direct control over units."
  {:db/ident :steam/RTS,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Real-Time Strategy (RTS) games require strategic decision making in real time, often involving resource management and direct control over units.",
   :rdfs/label "RTS",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Real-time_strategy"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/RTS/"}})

(def Racing
  "Racing games simulate the competition of racing, where the player controls a vehicle or other transport. They often have a time limit, and can include obstacles and competitors to beat."
  {:db/ident :steam/Racing,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
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

(def Rhythm
  "Rhythm games challenge players to follow the beat or rhythm of music tracks."
  {:db/ident :steam/Rhythm,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Rhythm games challenge players to follow the beat or rhythm of music tracks.",
   :rdfs/label "Rhythm",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Rhythm_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Rhythm/"}})

(def Roguelike
  "Roguelike games feature procedurally generated levels and permadeath, often with RPG elements."
  {:db/ident :steam/Roguelike,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Roguelike games feature procedurally generated levels and permadeath, often with RPG elements.",
   :rdfs/label "Roguelike",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Roguelike"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Roguelike/"}})

(def Sandbox
  "Sandbox games allow players to explore, create, and manipulate their environment with few imposed goals or restrictions."
  {:db/ident :steam/Sandbox,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Sandbox games allow players to explore, create, and manipulate their environment with few imposed goals or restrictions.",
   :rdfs/label "Sandbox",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sandbox_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sandbox/"}})

(def Shooter
  "Shooter games focus on combat involving projectile weapons, such as guns and missiles."
  {:db/ident :steam/Shooter,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Shooter games focus on combat involving projectile weapons, such as guns and missiles.",
   :rdfs/label "Shooter",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Shooter_game"},
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Shooter/"}})

(def Simulation
  "Simulation games are designed to accurately simulate real-world activities. They can cover a variety of activities, including driving vehicles, managing a business, or living a life."
  {:db/ident :steam/Simulation,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Simulation games are designed to accurately simulate real-world activities. They can cover a variety of activities, including driving vehicles, managing a business, or living a life.",
   :rdfs/label "Simulation",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Simulation_video_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Simulation/"}})

(def Skateboarding
  "Skateboarding games simulate skateboarding activities, often with a focus on performing tricks and stunts."
  {:db/ident :steam/Skateboarding,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Skateboarding games simulate skateboarding activities, often with a focus on performing tricks and stunts.",
   :rdfs/label "Skateboarding",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Skateboarding"},
   :rdfs/subClassOf [:steam/Skating :steam/Sports],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Skateboarding/"}})

(def Skating
  "Skating games simulate skating activities, often with a focus on performing tricks and stunts."
  {:db/ident :steam/Skating,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Skating games simulate skating activities, often with a focus on performing tricks and stunts.",
   :rdfs/label "Skating",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Skating"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Skating/"}})

(def Skiing
  "Skiing games simulate skiing activities, often with a focus on racing or performing tricks."
  {:db/ident :steam/Skiing,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Skiing games simulate skiing activities, often with a focus on racing or performing tricks.",
   :rdfs/label "Skiing",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Skiing"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Skiing/"}})

(def Snowboarding
  "Snowboarding games simulate snowboarding activities, often with a focus on racing or performing tricks."
  {:db/ident :steam/Snowboarding,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Snowboarding games simulate snowboarding activities, often with a focus on racing or performing tricks.",
   :rdfs/label "Snowboarding",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Snowboarding"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Snowboarding/"}})

(def Soccer
  "Soccer games simulate the sport of soccer, often with a focus on controlling a team and competing in matches."
  {:db/ident :steam/Soccer,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Soccer games simulate the sport of soccer, often with a focus on controlling a team and competing in matches.",
   :rdfs/label "Soccer",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Association_football"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Soccer/"}})

(def Software
  "A tag used to categorize the software of a game on Steam"
  {:db/ident        :steam/Software,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize the software of a game on Steam",
   :rdfs/label      "Software",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def SpaceSim
  "Space Sim games simulate space exploration or combat in a space setting."
  {:db/ident :steam/SpaceSim,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Space Sim games simulate space exploration or combat in a space setting.",
   :rdfs/label "Space Sim",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Space_flight_simulation_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Space%20Sim/"}})

(def Sports
  "Sports games simulate the practice of traditional physical sports. This can be team sports such as soccer, basketball, or individual activities like golf, fishing, skateboarding."
  {:db/ident :steam/Sports,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Sports games simulate the practice of traditional physical sports. This can be team sports such as soccer, basketball, or individual activities like golf, fishing, skateboarding.",
   :rdfs/label "Sports",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sports_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sports/"}})

(def Stealth
  "Stealth games challenge players to avoid detection, often by sneaking past enemies or obstacles."
  {:db/ident :steam/Stealth,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Stealth games challenge players to avoid detection, often by sneaking past enemies or obstacles.",
   :rdfs/label "Stealth",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Stealth_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Stealth/"}})

(def Strategy
  "Strategy games require strategic, tactical, and sometimes logistical challenges. Many games also offer economic challenges and exploration."
  {:db/ident :steam/Strategy,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Strategy games require strategic, tactical, and sometimes logistical challenges. Many games also offer economic challenges and exploration.",
   :rdfs/label "Strategy",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Strategy_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Strategy/"}})

(def StrategyRPG
  "Strategy RPGs combine strategic gameplay with role-playing elements, often involving character development and tactical combat."
  {:db/ident :steam/StrategyRPG,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Strategy RPGs combine strategic gameplay with role-playing elements, often involving character development and tactical combat.",
   :rdfs/label "Strategy RPG",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Tactical_role-playing_game"},
   :rdfs/subClassOf [:steam/Strategy :steam/RPG],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Strategy%20RPG/"}})

(def SubGenre
  "A sub genre used to categorize a game on Steam"
  {:db/ident        :steam/SubGenre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A sub genre used to categorize a game on Steam",
   :rdfs/label      "Sub Genre",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Survival
  "Survival games challenge players to survive in a hostile environment, often by gathering resources, crafting tools, and building shelters."
  {:db/ident :steam/Survival,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Survival games challenge players to survive in a hostile environment, often by gathering resources, crafting tools, and building shelters.",
   :rdfs/label "Survival",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Survival_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Survival/"}})

(def Tabletop
  "Tabletop games are those that are normally played on a table or other flat surface, such as board games, card games, dice games, miniatures wargames, tile-based games and role-playing games. In the digital context, these games are often adaptations of traditional tabletop games."
  {:db/ident :steam/Tabletop,
   :rdf/type [:steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
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

(def Tennis
  "Tennis games simulate the sport of tennis, often with a focus on controlling a player and competing in matches."
  {:db/ident :steam/Tennis,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Tennis games simulate the sport of tennis, often with a focus on controlling a player and competing in matches.",
   :rdfs/label "Tennis",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Tennis"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Tennis/"}})

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

(def TowerDefense
  "Tower Defense games challenge players to defend a location by placing defensive structures along the path of incoming enemies."
  {:db/ident :steam/TowerDefense,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Tower Defense games challenge players to defend a location by placing defensive structures along the path of incoming enemies.",
   :rdfs/label "Tower Defense",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Tower_defense"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Tower%20Defense/"}})

(def Trivia
  "Trivia games test players' knowledge of various topics, often in a quiz format."
  {:db/ident :steam/Trivia,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Trivia games test players' knowledge of various topics, often in a quiz format.",
   :rdfs/label "Trivia",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Trivia"},
   :rdfs/subClassOf :steam/Casual,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Trivia/"}})

(def TurnBasedStrategy
  "Turn-Based Strategy games involve strategic gameplay where players take turns when playing."
  {:db/ident :steam/TurnBasedStrategy,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Turn-Based Strategy games involve strategic gameplay where players take turns when playing.",
   :rdfs/label "Turn-Based Strategy",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Turn-based_strategy"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Turn-Based%20Strategy/"}})

(def VisualNovel
  "Visual Novels are a narrative genre of game, featuring mostly static graphics, most often using anime-style art or occasionally live-action stills."
  {:db/ident :steam/VisualNovel,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Visual Novels are a narrative genre of game, featuring mostly static graphics, most often using anime-style art or occasionally live-action stills.",
   :rdfs/label "Visual Novel",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Visual_novel"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Visual%20Novel/"}})

(def VisualsAndViewpoint
  "A tag used to describe the visuals and viewpoint of a game on Steam"
  {:db/ident :steam/VisualsAndViewpoint,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to describe the visuals and viewpoint of a game on Steam",
   :rdfs/label "Visuals and Viewpoint",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def WalkingSimulator
  "Walking Simulator games focus on exploration and narrative over gameplay, often involving walking through an environment to uncover the story."
  {:db/ident :steam/WalkingSimulator,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Walking Simulator games focus on exploration and narrative over gameplay, often involving walking through an environment to uncover the story.",
   :rdfs/label "Walking Simulator",
   :rdfs/subClassOf :steam/Adventure,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Walking%20Simulator/"}})

(def WordGame
  "Word games involve the creation or solving of words, often in a puzzle format."
  {:db/ident :steam/WordGame,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Word games involve the creation or solving of words, often in a puzzle format.",
   :rdfs/label "Word Game",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Word_game"},
   :rdfs/subClassOf [:steam/Casual :steam/Puzzle],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Word%20Game/"}})

(def Wrestling
  "Wrestling games simulate the sport of wrestling, often with a focus on controlling a wrestler and competing in matches."
  {:db/ident :steam/Wrestling,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Wrestling games simulate the sport of wrestling, often with a focus on controlling a wrestler and competing in matches.",
   :rdfs/label "Wrestling",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Professional_wrestling"},
   :rdfs/subClassOf :steam/Sports,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Wrestling/"}})