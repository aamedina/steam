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
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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

(def ActionRoguelike
  "Action Roguelike games combine the action genre with roguelike elements, including procedural generation and permadeath."
  {:db/ident :steam/ActionRoguelike,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Action Roguelike games combine the action genre with roguelike elements, including procedural generation and permadeath.",
   :rdfs/label "Action Roguelike",
   :rdfs/subClassOf :steam/Roguelike,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Action%20Roguelike/"}})

(def Adventure
  "Adventure games focus on puzzle solving within a narrative framework, generally with few or no action elements. These games encourage players to explore, interact with different objects, and solve complex puzzles to progress the story."
  {:db/ident :steam/Adventure,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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

(def ArenaShooter
  "Arena Shooter games are shooter games that take place in contained arena environments, often with a focus on multiplayer combat."
  {:db/ident :steam/ArenaShooter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Arena Shooter games are shooter games that take place in contained arena environments, often with a focus on multiplayer combat.",
   :rdfs/label "Arena Shooter",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Shooter_game"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Arena%20Shooter/"}})

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

(def BeatEmUp
  "Beat 'em up games are action games that feature hand-to-hand combat between the protagonist and an improbably large number of opponents."
  {:db/ident :steam/BeatEmUp,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Beat 'em up games are action games that feature hand-to-hand combat between the protagonist and an improbably large number of opponents.",
   :rdfs/label "Beat 'em up",
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Beat%20'Em%20Up/"}})

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

(def BulletHell
  "Bullet Hell games are shooting games that feature overwhelming numbers of enemy projectiles, often in visually impressive patterns."
  {:db/ident :steam/BulletHell,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Bullet Hell games are shooting games that feature overwhelming numbers of enemy projectiles, often in visually impressive patterns.",
   :rdfs/label "Bullet Hell",
   :rdfs/subClassOf [:steam/ShootEmUp :steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Bullet%20Hell/"}})

(def CRPG
  "CRPG (Computer Role-Playing Games) are a type of role-playing video game which are played on a computer and use similar mechanics to traditional tabletop RPGs."
  {:db/ident :steam/CRPG,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "CRPG (Computer Role-Playing Games) are a type of role-playing video game which are played on a computer and use similar mechanics to traditional tabletop RPGs.",
   :rdfs/label "CRPG",
   :rdfs/subClassOf :steam/RPG,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/CRPG/"}})

(def CardBattler
  "Card Battler games are games that use cards as a primary element to let players strategize and compete against each other."
  {:db/ident :steam/CardBattler,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Card Battler games are games that use cards as a primary element to let players strategize and compete against each other.",
   :rdfs/label "Card Battler",
   :rdfs/subClassOf [:steam/CardGame :steam/Tabletop],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Card%20Battler/"}})

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
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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

(def ChooseYourOwnAdventure
  "Choose Your Own Adventure games are games that feature interactive stories where the player can make choices that affect the outcome."
  {:db/ident :steam/ChooseYourOwnAdventure,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Choose Your Own Adventure games are games that feature interactive stories where the player can make choices that affect the outcome.",
   :rdfs/label "Choose Your Own Adventure",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Gamebook"},
   :rdfs/subClassOf :steam/Adventure,
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Choose%20Your%20Own%20Adventure/"}})

(def CityBuilder
  "City Builder games are a type of simulation game where players build, expand and manage fictional communities or projects with limited resources."
  {:db/ident :steam/CityBuilder,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "City Builder games are a type of simulation game where players build, expand and manage fictional communities or projects with limited resources.",
   :rdfs/label "City Builder",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/City-building_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/City%20Builder/"}})

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

(def Collectathon
  "Collectathon games are games that feature collecting a large number of items as a core mechanic."
  {:db/ident :steam/Collectathon,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Collectathon games are games that feature collecting a large number of items as a core mechanic.",
   :rdfs/label "Collectathon",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Collectathon/"}})

(def ColonySim
  "Colony Sim games are a type of simulation game where players build, expand and manage a colony or project with limited resources."
  {:db/ident :steam/ColonySim,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Colony Sim games are a type of simulation game where players build, expand and manage a colony or project with limited resources.",
   :rdfs/label "Colony Sim",
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Colony%20Sim/"}})

(def CombatRacing
  "Combat Racing games are racing games that feature combat elements, such as weapons or aggressive driving maneuvers."
  {:db/ident :steam/CombatRacing,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Combat Racing games are racing games that feature combat elements, such as weapons or aggressive driving maneuvers.",
   :rdfs/label "Combat Racing",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/List_of_vehicular_combat_games"},
   :rdfs/subClassOf [:steam/Action :steam/Racing],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Combat%20Racing/"}})

(def Cycling
  "Cycling games simulate the sport of cycling, allowing players to compete in races or explore environments on a bike."
  {:db/ident :steam/Cycling,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Cycling games simulate the sport of cycling, allowing players to compete in races or explore environments on a bike.",
   :rdfs/label "Cycling",
   :rdfs/subClassOf [:steam/Racing :steam/Sports],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cycling/"}})

(def DatingSim
  "Dating Sim games are a type of simulation game where players simulate romantic or sexual relationships. They often involve dialogues and character development."
  {:db/ident :steam/DatingSim,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Dating Sim games are a type of simulation game where players simulate romantic or sexual relationships. They often involve dialogues and character development.",
   :rdfs/label "Dating Sim",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dating_sim"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Dating%20Sim/"}})

(def Diplomacy
  "Diplomacy games involve negotiation, strategy, and social interaction. Players often need to form alliances, make deals, or negotiate with other players to achieve their goals."
  {:db/ident :steam/Diplomacy,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Diplomacy games involve negotiation, strategy, and social interaction. Players often need to form alliances, make deals, or negotiate with other players to achieve their goals.",
   :rdfs/label "Diplomacy",
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Diplomacy/"}})

(def DungeonCrawler
  "Dungeon Crawler games are a type of adventure games where players navigate a labyrinth environment, battling various monsters, and looting any treasure they may find."
  {:db/ident :steam/DungeonCrawler,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Dungeon Crawler games are a type of adventure games where players navigate a labyrinth environment, battling various monsters, and looting any treasure they may find.",
   :rdfs/label "Dungeon Crawler",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dungeon_crawl"},
   :rdfs/subClassOf :steam/Adventure,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Dungeon%20Crawler/"}})

(def Education
  "Education games are designed to teach people about certain subjects, expand concepts, reinforce development, or assist them in learning a skill as they play."
  {:db/ident :steam/Education,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Education games are designed to teach people about certain subjects, expand concepts, reinforce development, or assist them in learning a skill as they play.",
   :rdfs/label "Education",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Educational_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Education/"}})

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

(def FPS
  "FPS (First-Person Shooter) games are a type of 3D shooter games played from a first-person perspective, where the player experiences the action through the eyes of the protagonist."
  {:db/ident :steam/FPS,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "FPS (First-Person Shooter) games are a type of 3D shooter games played from a first-person perspective, where the player experiences the action through the eyes of the protagonist.",
   :rdfs/label "FPS",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/First-person_shooter"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/FPS/"}})

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

(def Flight
  "Flight games are games that involve piloting a vehicle, often an aircraft, through the sky."
  {:db/ident :steam/Flight,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Flight games are games that involve piloting a vehicle, often an aircraft, through the sky.",
   :rdfs/label "Flight",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Flight_simulator"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Flight/"}})

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

(def GrandStrategy
  "Grand Strategy games are a type of strategy game that includes aspects of military, economic, and political development. Players control a nation or faction and make long-term strategic decisions."
  {:db/ident :steam/GrandStrategy,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Grand Strategy games are a type of strategy game that includes aspects of military, economic, and political development. Players control a nation or faction and make long-term strategic decisions.",
   :rdfs/label "Grand Strategy",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Grand_strategy_wargame"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Grand%20Strategy/"}})

(def HackAndSlash
  "Hack and Slash games are a type of action game that emphasizes combat with melee-based weapons."
  {:db/ident :steam/HackAndSlash,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Hack and Slash games are a type of action game that emphasizes combat with melee-based weapons.",
   :rdfs/label "Hack and Slash",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Hack_and_slash"},
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Hack%20and%20Slash/"}})

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

(def Heist
  "Heist games are games that involve a plot to commit a burglary or theft of some kind."
  {:db/ident :steam/Heist,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Heist games are games that involve a plot to commit a burglary or theft of some kind.",
   :rdfs/label "Heist",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Heist_film"},
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Heist/"}})

(def HeroShooter
  "Hero Shooter games are a sub-genre of shooter games that assign players into two or more teams, with each player selecting their own unique 'hero' character, each with their own unique abilities or skills."
  {:db/ident :steam/HeroShooter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Hero Shooter games are a sub-genre of shooter games that assign players into two or more teams, with each player selecting their own unique 'hero' character, each with their own unique abilities or skills.",
   :rdfs/label "Hero Shooter",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Hero_shooter"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Hero%20Shooter/"}})

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

(def Horror
  "Horror games are games that aim to elicit fear and horror from the player. They often feature dark atmospheres, scary graphics, and chilling audio."
  {:db/ident :steam/Horror,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Horror games are games that aim to elicit fear and horror from the player. They often feature dark atmospheres, scary graphics, and chilling audio.",
   :rdfs/label "Horror",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Category:Horror_video_games"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Horror/"}})

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

(def ImmersiveSim
  "Immersive Sim games are a type of video game that emphasizes player choice. Their key defining features are a blend of multiple gameplay genres, and a highly interactive world."
  {:db/ident :steam/ImmersiveSim,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Immersive Sim games are a type of video game that emphasizes player choice. Their key defining features are a blend of multiple gameplay genres, and a highly interactive world.",
   :rdfs/label "Immersive Sim",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Immersive_sim"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Immersive%20Sim/"}})

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

(def Investigation
  "Investigation games are games that involve players solving a mystery or crime by gathering clues and evidence."
  {:db/ident :steam/Investigation,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Investigation games are games that involve players solving a mystery or crime by gathering clues and evidence.",
   :rdfs/label "Investigation",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Detective_fiction"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Investigation/"}})

(def JRPG
  "JRPG (Japanese Role-Playing Games) are a type of role-playing video game that originated in Japan and have a distinct art style and narrative structure."
  {:db/ident :steam/JRPG,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "JRPG (Japanese Role-Playing Games) are a type of role-playing video game that originated in Japan and have a distinct art style and narrative structure.",
   :rdfs/label "JRPG",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/History_of_Eastern_role-playing_video_games"},
   :rdfs/subClassOf :steam/RPG,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/JRPG/"}})

(def LifeSim
  "Life Sim games are a type of simulation game where players simulate living or controlling one or more artificial lives."
  {:db/ident :steam/LifeSim,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Life Sim games are a type of simulation game where players simulate living or controlling one or more artificial lives.",
   :rdfs/label "Life Sim",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Life_simulation_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Life%20Sim/"}})

(def LooterShooter
  "Looter Shooter games are a sub-genre of shooter games that include elements of looting, shooting, and often role-playing."
  {:db/ident :steam/LooterShooter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Looter Shooter games are a sub-genre of shooter games that include elements of looting, shooting, and often role-playing.",
   :rdfs/label "Looter Shooter",
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Looter%20Shooter/"}})

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

(def Metroidvania
  "Metroidvania games are a sub-genre of action-adventure games that includes elements of exploration, backtracking, and item gathering."
  {:db/ident :steam/Metroidvania,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Metroidvania games are a sub-genre of action-adventure games that includes elements of exploration, backtracking, and item gathering.",
   :rdfs/label "Metroidvania",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Metroidvania"},
   :rdfs/subClassOf [:steam/Platformer :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Metroidvania/"}})

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

(def MysteryDungeon
  "Mystery Dungeon games are a sub-genre of role-playing games that feature randomly generated dungeons and turn-based combat."
  {:db/ident :steam/MysteryDungeon,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Mystery Dungeon games are a sub-genre of role-playing games that feature randomly generated dungeons and turn-based combat.",
   :rdfs/label "Mystery Dungeon",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Mystery_Dungeon"},
   :rdfs/subClassOf {:owl/intersectionOf [:steam/RPG :steam/Roguelike],
                     :rdf/type :owl/Class},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Mystery%20Dungeon/"}})

(def OnRailsShooter
  "On-Rails Shooter games are a type of shooter game where the player's movement is automatically guided along a fixed path, or 'on rails'."
  {:db/ident :steam/OnRailsShooter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "On-Rails Shooter games are a type of shooter game where the player's movement is automatically guided along a fixed path, or 'on rails'.",
   :rdfs/label "On-Rails Shooter",
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/On-Rails%20Shooter/"}})

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

(def OpenWorldSurvivalCraft
  "Open World Survival Craft games are a type of survival game where players must gather resources, build their own items, and manage their needs, all while exploring an open world."
  {:db/ident :steam/OpenWorldSurvivalCraft,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Open World Survival Craft games are a type of survival game where players must gather resources, build their own items, and manage their needs, all while exploring an open world.",
   :rdfs/label "Open World Survival Craft",
   :rdfs/subClassOf [:steam/OpenWorld :steam/Survival],
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Open%20World%20Survival%20Craft/"}})

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

(def PoliticalSim
  "Political Sim games are a type of simulation game where players simulate the politics and government of a nation or civilization."
  {:db/ident :steam/PoliticalSim,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Political Sim games are a type of simulation game where players simulate the politics and government of a nation or civilization.",
   :rdfs/label "Political Sim",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Government_simulation_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Political%20Sim/"}})

(def PrecisionPlatformer
  "Precision Platformer games are a sub-genre of platformer games that require precise control and timing."
  {:db/ident :steam/PrecisionPlatformer,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Precision Platformer games are a sub-genre of platformer games that require precise control and timing.",
   :rdfs/label "Precision Platformer",
   :rdfs/subClassOf :steam/Platformer,
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Precision%20Platformer/"}})

(def Programming
  "Programming games are games where the player has limited direct control over the game characters, and completes levels or achieves goals by programming game elements."
  {:db/ident :steam/Programming,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Programming games are games where the player has limited direct control over the game characters, and completes levels or achieves goals by programming game elements.",
   :rdfs/label "Programming",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Programming_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Programming/"}})

(def Puzzle
  "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience."
  {:db/ident :steam/Puzzle,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience.",
   :rdfs/label "Puzzle",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Puzzle_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Puzzle/"}})

(def RPG
  "Role-playing games (RPGs) often involve story-telling and narrative elements, character development, complexity, as well as replayability and immersion. The player controls a character in a world where they undertake quests and challenges."
  {:db/ident :steam/RPG,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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

(def RealTimeTactics
  "Real Time Tactics games are a type of strategy game that focuses on tactical and operational aspects of warfare, as opposed to strategic or grand strategy."
  {:db/ident :steam/RealTimeTactics,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Real Time Tactics games are a type of strategy game that focuses on tactical and operational aspects of warfare, as opposed to strategic or grand strategy.",
   :rdfs/label "Real Time Tactics",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Real-time_tactics"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Real%20Time%20Tactics/"}})

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

(def Roguelite
  "Roguelite games feature procedurally generated levels, permadeath, and other elements of roguelikes. They are characterized by their difficulty and replayability."
  {:db/ident :steam/Roguelite,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Roguelite games feature procedurally generated levels, permadeath, and other elements of roguelikes. They are characterized by their difficulty and replayability.",
   :rdfs/label "Roguelite",
   :rdfs/subClassOf :steam/Rougelike,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Roguelite/"}})

(def Roguevania
  "Roguevania games are a sub-genre of action-adventure games that combine elements of roguelike and metroidvania games."
  {:db/ident :steam/Roguevania,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Roguevania games are a sub-genre of action-adventure games that combine elements of roguelike and metroidvania games.",
   :rdfs/label "Roguevania",
   :rdfs/subClassOf {:owl/intersectionOf [:steam/Rougelike :steam/Metroidvania],
                     :rdf/type :owl/Class},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Roguevania/"}})

(def Rougelike {:db/ident :steam/Rougelike})

(def Runner
  "Runner games are a type of action game where the player character is continuously moving forward and the player must control their actions to avoid obstacles and collect items."
  {:db/ident :steam/Runner,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Runner games are a type of action game where the player character is continuously moving forward and the player must control their actions to avoid obstacles and collect items.",
   :rdfs/label "Runner",
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Runner/"}})

(def Sandbox
  "Sandbox games allow players to explore, create, and manipulate their environment with few imposed goals or restrictions."
  {:db/ident :steam/Sandbox,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Sandbox games allow players to explore, create, and manipulate their environment with few imposed goals or restrictions.",
   :rdfs/label "Sandbox",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sandbox_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sandbox/"}})

(def ShootEmUp
  "Shoot 'Em Up games are a sub-genre of shooter games where the player controls a character or vehicle and fights large numbers of enemies using shooting."
  {:db/ident :steam/ShootEmUp,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Shoot 'Em Up games are a sub-genre of shooter games where the player controls a character or vehicle and fights large numbers of enemies using shooting.",
   :rdfs/label "Shoot 'Em Up",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Shoot_'em_up"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Shoot%20'Em%20Up/"}})

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

(def SideScroller
  "Side Scroller games are a type of game in which gameplay is viewed from a side-view camera angle, and the characters move from the left side of the screen to the right (or vice versa)."
  {:db/ident :steam/SideScroller,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Side Scroller games are a type of game in which gameplay is viewed from a side-view camera angle, and the characters move from the left side of the screen to the right (or vice versa).",
   :rdfs/label "Side Scroller",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Side-scrolling_video_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Side%20Scroller/"}})

(def Simulation
  "Simulation games are designed to accurately simulate real-world activities. They can cover a variety of activities, including driving vehicles, managing a business, or living a life."
  {:db/ident :steam/Simulation,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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

(def Sokoban
  "Sokoban games are a type of puzzle game where the player pushes boxes or crates around in a warehouse, trying to get them to storage locations."
  {:db/ident :steam/Sokoban,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Sokoban games are a type of puzzle game where the player pushes boxes or crates around in a warehouse, trying to get them to storage locations.",
   :rdfs/label "Sokoban",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sokoban"},
   :rdfs/subClassOf :steam/Puzzle,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sokoban/"}})

(def Solitaire
  "Solitaire games are a type of card game that can be played by a single player."
  {:db/ident :steam/Solitaire,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Solitaire games are a type of card game that can be played by a single player.",
   :rdfs/label "Solitaire",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Solitaire"},
   :rdfs/subClassOf [{:owl/hasValue   :schema/SinglePlayer,
                      :owl/onProperty :schema/playMode,
                      :rdf/type       :owl/Restriction}
                     :steam/CardGame
                     :steam/Tabletop],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Solitaire/"}})

(def SoulsLike
  "Souls-like games are a sub-genre of action RPGs that include elements of challenging combat, exploration, and character development, inspired by the Dark Souls series."
  {:db/ident :steam/SoulsLike,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Souls-like games are a sub-genre of action RPGs that include elements of challenging combat, exploration, and character development, inspired by the Dark Souls series.",
   :rdfs/label "Souls-like",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Souls_(series)"},
   :rdfs/subClassOf :steam/ActionRPG,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Souls-like/"}})

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

(def SpectacleFighter
  "Spectacle Fighter games are a sub-genre of action games that feature fast-paced combat with flashy, over-the-top attacks and combos."
  {:db/ident :steam/SpectacleFighter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Spectacle Fighter games are a sub-genre of action games that feature fast-paced combat with flashy, over-the-top attacks and combos.",
   :rdfs/label "Spectacle Fighter",
   :rdfs/subClassOf [:steam/Fighting :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Spectacle%20Fighter/"}})

(def Spelling
  "Spelling games are a type of educational game that focuses on the correct spelling of words."
  {:db/ident :steam/Spelling,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Spelling games are a type of educational game that focuses on the correct spelling of words.",
   :rdfs/label "Spelling",
   :rdfs/subClassOf :steam/Education,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Spelling/"}})

(def Sports
  "Sports games simulate the practice of traditional physical sports. This can be team sports such as soccer, basketball, or individual activities like golf, fishing, skateboarding."
  {:db/ident :steam/Sports,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
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
  "A sub-genre used to categorize a game on Steam"
  {:db/ident        :steam/SubGenre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A sub-genre used to categorize a game on Steam",
   :rdfs/label      "Sub-Genre",
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

(def SurvivalHorror
  "Survival Horror games are a sub-genre of horror games that focus on survival of the character and the fear of the unknown."
  {:db/ident :steam/SurvivalHorror,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Survival Horror games are a sub-genre of horror games that focus on survival of the character and the fear of the unknown.",
   :rdfs/label "Survival Horror",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Survival_horror"},
   :rdfs/subClassOf {:owl/intersectionOf [:steam/Horror :steam/Survival],
                     :rdf/type :owl/Class},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Survival%20Horror/"}})

(def Tabletop
  "Tabletop games are those that are normally played on a table or other flat surface, such as board games, card games, dice games, miniatures wargames, tile-based games and role-playing games. In the digital context, these games are often adaptations of traditional tabletop games."
  {:db/ident :steam/Tabletop,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Tabletop games are those that are normally played on a table or other flat surface, such as board games, card games, dice games, miniatures wargames, tile-based games and role-playing games. In the digital context, these games are often adaptations of traditional tabletop games.",
   :rdfs/label "Tabletop",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Tabletop_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Tabletop/"}})

(def TacticalRPG
  "Tactical RPG games are a sub-genre of role-playing games that focus on tactical and strategic battles, often using turn-based combat."
  {:db/ident :steam/TacticalRPG,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Tactical RPG games are a sub-genre of role-playing games that focus on tactical and strategic battles, often using turn-based combat.",
   :rdfs/label "Tactical RPG",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Tactical_role-playing_game"},
   :rdfs/subClassOf {:owl/intersectionOf [:steam/RPG :steam/Strategy],
                     :rdf/type :owl/Class},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Tactical%20RPG/"}})

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

(def ThirdPersonShooter
  "Third-Person Shooter games are a sub-genre of shooter games where the player views the game from a third-person perspective, usually behind the character they are controlling."
  {:db/ident :steam/ThirdPersonShooter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Third-Person Shooter games are a sub-genre of shooter games where the player views the game from a third-person perspective, usually behind the character they are controlling.",
   :rdfs/label "Third-Person Shooter",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Third-person_shooter"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Third-Person%20Shooter/"}})

(def TimeManagement
  "Time Management games are a sub-genre of strategy games that require the player to complete specific tasks within a certain timeframe to succeed."
  {:db/ident :steam/TimeManagement,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Time Management games are a sub-genre of strategy games that require the player to complete specific tasks within a certain timeframe to succeed.",
   :rdfs/label "Time Management",
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Time%20Management/"}})

(def TopDownShooter
  "Top-Down Shooter games are a sub-genre of shooter games where the player views the game from a top-down perspective, shooting enemies and avoiding obstacles from this viewpoint."
  {:db/ident :steam/TopDownShooter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Top-Down Shooter games are a sub-genre of shooter games where the player views the game from a top-down perspective, shooting enemies and avoiding obstacles from this viewpoint.",
   :rdfs/label "Top-Down Shooter",
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Top-Down%20Shooter/"}})

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

(def Trading
  "Trading games are a type of game that focuses on trading goods and services, often in an economic simulation context."
  {:db/ident :steam/Trading,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Trading games are a type of game that focuses on trading goods and services, often in an economic simulation context.",
   :rdfs/label "Trading",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Trading/"}})

(def TradingCardGame
  "Trading Card Game games are a type of card game where players use collectible cards to strategize and defeat their opponents."
  {:db/ident :steam/TradingCardGame,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Trading Card Game games are a type of card game where players use collectible cards to strategize and defeat their opponents.",
   :rdfs/label "Trading Card Game",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Collectible_card_game"},
   :rdfs/subClassOf [:steam/CardGame :steam/Tabletop],
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Trading%20Card%20Game/"}})

(def TraditionalRoguelike
  "Traditional Roguelike games are a sub-genre of roguelike games that adhere closely to the original roguelike design, featuring turn-based combat, grid-based movement, and permadeath."
  {:db/ident :steam/TraditionalRoguelike,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Traditional Roguelike games are a sub-genre of roguelike games that adhere closely to the original roguelike design, featuring turn-based combat, grid-based movement, and permadeath.",
   :rdfs/label "Traditional Roguelike",
   :rdfs/subClassOf :steam/Roguelike,
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Traditional%20Roguelike/"}})

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

(def TurnBasedTactics
  "Turn-Based Tactics games are a type of strategy game that features tactical combat in which players take turns to command their units."
  {:db/ident :steam/TurnBasedTactics,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Turn-Based Tactics games are a type of strategy game that features tactical combat in which players take turns to command their units.",
   :rdfs/label "Turn-Based Tactics",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Turn-based_tactics"},
   :rdfs/subClassOf [:steam/TurnBasedStrategy :steam/Strategy],
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Turn-Based%20Tactics/"}})

(def TwinStickShooter
  "Twin Stick Shooter games are a sub-genre of shooter games that use a dual-stick control scheme, where one stick controls movement and the other controls the direction of shooting."
  {:db/ident :steam/TwinStickShooter,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Twin Stick Shooter games are a sub-genre of shooter games that use a dual-stick control scheme, where one stick controls movement and the other controls the direction of shooting.",
   :rdfs/label "Twin Stick Shooter",
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Twin%20Stick%20Shooter/"}})

(def Typing
  "Typing games are a type of educational game that focuses on typing skills. Players are often tasked with typing words or phrases correctly and quickly to achieve goals in the game."
  {:db/ident :steam/Typing,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Typing games are a type of educational game that focuses on typing skills. Players are often tasked with typing words or phrases correctly and quickly to achieve goals in the game.",
   :rdfs/label "Typing",
   :rdfs/subClassOf :steam/Education,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Typing/"}})

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

(def Wargame
  "Wargame games are a type of strategy game that simulates warfare. They often focus on realistic tactical and strategic battles, and can cover various periods of history."
  {:db/ident :steam/Wargame,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Wargame games are a type of strategy game that simulates warfare. They often focus on realistic tactical and strategic battles, and can cover various periods of history.",
   :rdfs/label "Wargame",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Computer_wargame"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Wargame/"}})

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

(def |2DFighter|
  "2D Fighter games are fighting games with a gameplay in a two-dimensional environment."
  {:db/ident :steam/|2DFighter|,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "2D Fighter games are fighting games with a gameplay in a two-dimensional environment.",
   :rdfs/label "2D Fighter",
   :rdfs/subClassOf [:steam/Fighting :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/2D%20Fighter/"}})

(def |2DPlatformer|
  "2D Platformer games are platform games with a gameplay in a two-dimensional environment."
  {:db/ident :steam/|2DPlatformer|,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "2D Platformer games are platform games with a gameplay in a two-dimensional environment.",
   :rdfs/label "2D Platformer",
   :rdfs/subClassOf :steam/Platformer,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/2D%20Platformer/"}})

(def |3DFighter|
  "3D Fighter games are fighting games with a gameplay in a three-dimensional environment."
  {:db/ident :steam/|3DFighter|,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "3D Fighter games are fighting games with a gameplay in a three-dimensional environment.",
   :rdfs/label "3D Fighter",
   :rdfs/subClassOf [:steam/Fighting :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/3D%20Fighter/"}})

(def |3DPlatformer|
  "3D Platformer games are platform games with a gameplay in a three-dimensional environment."
  {:db/ident :steam/|3DPlatformer|,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "3D Platformer games are platform games with a gameplay in a three-dimensional environment.",
   :rdfs/label "3D Platformer",
   :rdfs/subClassOf :steam/Platformer,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/3D%20Platformer/"}})

(def |4X|
  "4X games are a genre of strategy video game in which players control an empire and 'eXplore, eXpand, eXploit, and eXterminate'."
  {:db/ident :steam/|4X|,
   :rdf/type [:steam/SubGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "4X games are a genre of strategy video game in which players control an empire and 'eXplore, eXpand, eXploit, and eXterminate'.",
   :rdfs/label "4X",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/4X"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/4X/"}})