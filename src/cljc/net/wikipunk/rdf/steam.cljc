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

(def ATV
  "ATV (All-Terrain Vehicle) is a feature that involves the use of off-road vehicles. This can add an element of exploration, racing, or combat to the game, often in rugged, outdoor environments."
  {:db/ident :steam/ATV,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "ATV (All-Terrain Vehicle) is a feature that involves the use of off-road vehicles. This can add an element of exploration, racing, or combat to the game, often in rugged, outdoor environments.",
   :rdfs/label "ATV",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/All-terrain_vehicle"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/ATV/"}})

(def Abstract
  "Abstract refers to a visual style that does not attempt to represent an accurate depiction of visual reality. It uses shapes, colors, forms and gestural marks to achieve its effect."
  {:db/ident :steam/Abstract,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Abstract refers to a visual style that does not attempt to represent an accurate depiction of visual reality. It uses shapes, colors, forms and gestural marks to achieve its effect.",
   :rdfs/label "Abstract",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Abstract_art"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Abstract/"}})

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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Action Roguelike games combine the action genre with roguelike elements, including procedural generation and permadeath.",
   :rdfs/label "Action Roguelike",
   :rdfs/subClassOf :steam/Roguelike,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Action%20Roguelike/"}})

(def Addictive
  "A tag used to describe games that are highly engaging and difficult to put down."
  {:db/ident :steam/Addictive,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that are highly engaging and difficult to put down.",
   :rdfs/label "Addictive",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Addictive/"}})

(def Adventure
  "Adventure games focus on puzzle solving within a narrative framework, generally with few or no action elements. These games encourage players to explore, interact with different objects, and solve complex puzzles to progress the story."
  {:db/ident :steam/Adventure,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Adventure games focus on puzzle solving within a narrative framework, generally with few or no action elements. These games encourage players to explore, interact with different objects, and solve complex puzzles to progress the story.",
   :rdfs/label "Adventure",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Adventure_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Adventure/"}})

(def Agriculture
  "The Agriculture tag is used for games that allow players to cultivate and manage their own farms, gardens, or vineyards. These games often emphasize patience, planning, and a connection with the land."
  {:db/ident :steam/Agriculture,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Agriculture tag is used for games that allow players to cultivate and manage their own farms, gardens, or vineyards. These games often emphasize patience, planning, and a connection with the land.",
   :rdfs/label "Agriculture",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Agriculture"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Agriculture/"}})

(def Aliens
  "The Aliens tag is used for games that feature extraterrestrial life. These games often explore themes of exploration, discovery, and sometimes conflict with unknown life forms."
  {:db/ident :steam/Aliens,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Aliens tag is used for games that feature extraterrestrial life. These games often explore themes of exploration, discovery, and sometimes conflict with unknown life forms.",
   :rdfs/label "Aliens",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Extraterrestrial_life"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Aliens/"}})

(def AlternateHistory
  "The Alternate History tag is used for games that re-imagine history. These games explore 'what if' scenarios, providing a unique twist on historical events or periods."
  {:db/ident :steam/AlternateHistory,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Alternate History tag is used for games that re-imagine history. These games explore 'what if' scenarios, providing a unique twist on historical events or periods.",
   :rdfs/label "Alternate History",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Alternate_history"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Alternate%20History/"}})

(def America
  "The America tag is used for games that explore aspects of American life, history, or culture. These games might feature iconic American landscapes, historical events, or cultural touchstones."
  {:db/ident :steam/America,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The America tag is used for games that explore aspects of American life, history, or culture. These games might feature iconic American landscapes, historical events, or cultural touchstones.",
   :rdfs/label "America",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/United_States"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/America/"}})

(def AnimationAndModeling
  "Software that is used for animation and modeling purposes. This can include 3D modeling, 2D animation, sculpting, and more."
  {:db/ident :steam/AnimationAndModeling,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for animation and modeling purposes. This can include 3D modeling, 2D animation, sculpting, and more.",
   :rdfs/label "Animation & Modeling",
   :schema/applicationCategory "DesignApplication",
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Animation%20%26%20Modeling/"}})

(def Anime
  "Anime is a style of animation originating from Japan, characterized by colorful artwork, fantastical themes, and vibrant characters."
  {:db/ident :steam/Anime,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Anime is a style of animation originating from Japan, characterized by colorful artwork, fantastical themes, and vibrant characters.",
   :rdfs/label "Anime",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Anime"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Anime/"}})

(def Arcade
  "Arcade games are focused on short, simple gameplay offering immediate satisfaction but also challenge and replayability. They often mimic games found in real-world arcades, like racing, shooting, or sports games."
  {:db/ident :steam/Arcade,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Arcade games are focused on short, simple gameplay offering immediate satisfaction but also challenge and replayability. They often mimic games found in real-world arcades, like racing, shooting, or sports games.",
   :rdfs/label "Arcade",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Arcade_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Arcade/"}})

(def Archery
  "Archery is a feature that involves the use of bows and arrows as a primary mechanic. It often requires precision and timing, and can be used in combat, hunting, or sport scenarios within the game."
  {:db/ident :steam/Archery,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Archery is a feature that involves the use of bows and arrows as a primary mechanic. It often requires precision and timing, and can be used in combat, hunting, or sport scenarios within the game.",
   :rdfs/label "Archery",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Archery"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Archery/"}})

(def ArenaShooter
  "Arena Shooter games are shooter games that take place in contained arena environments, often with a focus on multiplayer combat."
  {:db/ident :steam/ArenaShooter,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Arena Shooter games are shooter games that take place in contained arena environments, often with a focus on multiplayer combat.",
   :rdfs/label "Arena Shooter",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Shooter_game"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Arena%20Shooter/"}})

(def ArtificialIntelligence
  "Artificial Intelligence is a feature that involves the use of AI-controlled characters or systems. These can range from enemy combatants to friendly NPCs, and their behavior can significantly impact the gameplay experience."
  {:db/ident :steam/ArtificialIntelligence,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Artificial Intelligence is a feature that involves the use of AI-controlled characters or systems. These can range from enemy combatants to friendly NPCs, and their behavior can significantly impact the gameplay experience.",
   :rdfs/label "Artificial Intelligence",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Artificial_intelligence"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Artificial%20Intelligence/"}})

(def Assassin
  "The Assassin tag is used for games that place the player in the role of an assassin. These games often involve stealth, strategy, and sometimes moral ambiguity as players navigate the shadowy world of their profession."
  {:db/ident :steam/Assassin,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Assassin tag is used for games that place the player in the role of an assassin. These games often involve stealth, strategy, and sometimes moral ambiguity as players navigate the shadowy world of their profession.",
   :rdfs/label "Assassin",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Assassin/"}})

(def Assessment
  "A tag used to assess something on Steam."
  {:db/ident        :steam/Assessment,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to assess something on Steam.",
   :rdfs/label      "Assessment",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def AsymmetricVR
  "Asymmetric VR is a feature that involves different experiences for VR and non-VR players in the same game. This can create unique cooperative or competitive scenarios, enhancing the diversity of gameplay."
  {:db/ident :steam/AsymmetricVR,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Asymmetric VR is a feature that involves different experiences for VR and non-VR players in the same game. This can create unique cooperative or competitive scenarios, enhancing the diversity of gameplay.",
   :rdfs/label "Asymmetric VR",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Asymmetric%20VR/"}})

(def AsynchronousMultiplayer
  "Asynchronous Multiplayer represents games that offer the option for players to participate without all being active at the same time. This feature is often found in strategy and role-playing games, allowing for thoughtful planning and strategy."
  {:db/ident :steam/AsynchronousMultiplayer,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Asynchronous Multiplayer represents games that offer the option for players to participate without all being active at the same time. This feature is often found in strategy and role-playing games, allowing for thoughtful planning and strategy.",
   :rdfs/label "Asynchronous Multiplayer",
   :rdfs/subClassOf [:steam/Multiplayer :schema/MultiPlayer],
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Asynchronous%20Multiplayer/"}})

(def Atmospheric
  "The Atmospheric tag is used for games that place a strong emphasis on creating a specific mood or feeling. These games often use detailed environments, sound design, and visual aesthetics to draw players into their world."
  {:db/ident :steam/Atmospheric,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Atmospheric tag is used for games that place a strong emphasis on creating a specific mood or feeling. These games often use detailed environments, sound design, and visual aesthetics to draw players into their world.",
   :rdfs/label "Atmospheric",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Atmospheric/"}})

(def AudioProduction
  "Software that is used for audio production. This can include digital audio workstations, audio editors, music production software, and more."
  {:db/ident :steam/AudioProduction,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for audio production. This can include digital audio workstations, audio editors, music production software, and more.",
   :rdfs/label "Audio Production",
   :schema/applicationCategory ["DesignApplication" "MultimediaApplication"],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Audio%20Production/"}})

(def AutoBattler
  "Auto Battler games, also known as auto chess, involve automatic battles between characters controlled by the game rather than the player. Players typically focus on strategy, such as character placement and upgrades."
  {:db/ident :steam/AutoBattler,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Auto Battler games, also known as auto chess, involve automatic battles between characters controlled by the game rather than the player. Players typically focus on strategy, such as character placement and upgrades.",
   :rdfs/label "Auto Battler",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Auto%20Battler/"}})

(def Automation
  "Automation is a feature that allows certain tasks or processes to be automatically controlled or carried out within the game. This can involve resource management, base building, or AI-controlled characters."
  {:db/ident :steam/Automation,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Automation is a feature that allows certain tasks or processes to be automatically controlled or carried out within the game. This can involve resource management, base building, or AI-controlled characters.",
   :rdfs/label "Automation",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Automation"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Automation/"}})

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
   :rdf/type [:steam/Feature :steam/Genre :owl/Class :steam/Tag :schema/Thing],
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

(def BasedOnANovel
  "Based on a Novel represents games that are adaptations of literary works. These games often strive to capture the narrative, themes, and characters of the original novels, providing an interactive experience of the story."
  {:db/ident :steam/BasedOnANovel,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Based on a Novel represents games that are adaptations of literary works. These games often strive to capture the narrative, themes, and characters of the original novels, providing an interactive experience of the story.",
   :rdfs/label "Based on a Novel",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Video_game_adaptation"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Based%20On%20A%20Novel/"}})

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

(def Batman
  "Batman represents games that are based on the Batman franchise. These games often feature Batman as the main character and are set in Gotham City, involving themes of crime-fighting, detective work, and superhero action."
  {:db/ident :steam/Batman,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Batman represents games that are based on the Batman franchise. These games often feature Batman as the main character and are set in Gotham City, involving themes of crime-fighting, detective work, and superhero action.",
   :rdfs/label "Batman",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Batman"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Batman/"}})

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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Beat 'em up games are action games that feature hand-to-hand combat between the protagonist and an improbably large number of opponents.",
   :rdfs/label "Beat 'em up",
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Beat%20'Em%20Up/"}})

(def Beautiful
  "A tag used to describe games that are visually stunning and aesthetically pleasing."
  {:db/ident :steam/Beautiful,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that are visually stunning and aesthetically pleasing.",
   :rdfs/label "Beautiful",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Beautiful/"}})

(def Benchmark
  "Software that is used to benchmark the performance of a computer system. This can include CPU benchmarks, GPU benchmarks, and more."
  {:db/ident :steam/Benchmark,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used to benchmark the performance of a computer system. This can include CPU benchmarks, GPU benchmarks, and more.",
   :rdfs/label "Benchmark",
   :schema/applicationCategory "UtilitiesApplication",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Benchmark/"}})

(def Bikes
  "The Bikes tag is used for games that feature bicycles or motorcycles as a significant element. These games might involve racing, stunts, or simply the joy of exploring on two wheels."
  {:db/ident :steam/Bikes,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Bikes tag is used for games that feature bicycles or motorcycles as a significant element. These games might involve racing, stunts, or simply the joy of exploring on two wheels.",
   :rdfs/label "Bikes",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Bikes/"}})

(def Blood
  "A tag used to describe games that feature blood in their visual or thematic content."
  {:db/ident :steam/Blood,
   :rdf/type [:steam/Rating :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that feature blood in their visual or thematic content.",
   :rdfs/label "Blood",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Blood/"}})

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

(def Boxing
  "Boxing, as a feature in games, simulates the sport of boxing, focusing on timing, strategy, and quick reflexes. It often involves one-on-one combat where players control a boxer."
  {:db/ident :steam/Boxing,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Boxing, as a feature in games, simulates the sport of boxing, focusing on timing, strategy, and quick reflexes. It often involves one-on-one combat where players control a boxer.",
   :rdfs/label "Boxing",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Boxing"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Boxing/"}})

(def Building
  "Building games focus on the construction of structures or environments. They often involve gathering resources, planning and designing buildings, and managing infrastructure."
  {:db/ident :steam/Building,
   :rdf/type [:steam/Feature :steam/Genre :owl/Class :steam/Tag :schema/Thing],
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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Bullet Hell games are shooting games that feature overwhelming numbers of enemy projectiles, often in visually impressive patterns.",
   :rdfs/label "Bullet Hell",
   :rdfs/subClassOf [:steam/ShootEmUp :steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Bullet%20Hell/"}})

(def BulletTime
  "Bullet Time is a feature where time slows down, often during combat scenarios. It allows players to see actions such as bullets moving in slow motion, adding a cinematic feel to the gameplay."
  {:db/ident :steam/BulletTime,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Bullet Time is a feature where time slows down, often during combat scenarios. It allows players to see actions such as bullets moving in slow motion, adding a cinematic feel to the gameplay.",
   :rdfs/label "Bullet Time",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Bullet_time"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Bullet%20Time/"}})

(def CRPG
  "CRPG (Computer Role-Playing Games) are a type of role-playing video game which are played on a computer and use similar mechanics to traditional tabletop RPGs."
  {:db/ident :steam/CRPG,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "CRPG (Computer Role-Playing Games) are a type of role-playing video game which are played on a computer and use similar mechanics to traditional tabletop RPGs.",
   :rdfs/label "CRPG",
   :rdfs/subClassOf :steam/RPG,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/CRPG/"}})

(def Capitalism
  "The Capitalism tag is used for games that explore themes of free-market economics. These games might involve running a business, trading stocks, or navigating the complex world of finance."
  {:db/ident :steam/Capitalism,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Capitalism tag is used for games that explore themes of free-market economics. These games might involve running a business, trading stocks, or navigating the complex world of finance.",
   :rdfs/label "Capitalism",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Capitalism"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Capitalism/"}})

(def CardBattler
  "Card Battler games are games that use cards as a primary element to let players strategize and compete against each other."
  {:db/ident :steam/CardBattler,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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

(def Cartoon
  "Cartoon is a style of drawing that is typically non-realistic or semi-realistic artistic style, often used in animations and graphic novels."
  {:db/ident :steam/Cartoon,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Cartoon is a style of drawing that is typically non-realistic or semi-realistic artistic style, often used in animations and graphic novels.",
   :rdfs/label "Cartoon",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cartoon"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cartoon/"}})

(def Cartoony
  "Cartoony is a visual style that resembles traditional cartoon aesthetics, often characterized by exaggerated features, bright colors, and a lack of realistic details."
  {:db/ident :steam/Cartoony,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Cartoony is a visual style that resembles traditional cartoon aesthetics, often characterized by exaggerated features, bright colors, and a lack of realistic details.",
   :rdfs/label "Cartoony",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cartoony/"}})

(def Casual
  "Casual games are designed to be easily picked up and put down again, allowing for potentially short bursts of play. They often have simpler rules, shorter sessions, and less learned skill than hardcore games."
  {:db/ident :steam/Casual,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Casual games are designed to be easily picked up and put down again, allowing for potentially short bursts of play. They often have simpler rules, shorter sessions, and less learned skill than hardcore games.",
   :rdfs/label "Casual",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Casual_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Casual/"}})

(def Cats
  "The Cats tag is used for games that feature cats as a significant element. These games might involve caring for cats, playing as a cat, or simply feature cats as part of the game's world."
  {:db/ident :steam/Cats,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Cats tag is used for games that feature cats as a significant element. These games might involve caring for cats, playing as a cat, or simply feature cats as part of the game's world.",
   :rdfs/label "Cats",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cat"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cats/"}})

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

(def CharacterCustomization
  "Character Customization is a feature that offers detailed control over the visual design and/or abilities of player characters. It allows players to create unique avatars, enhancing immersion and personal connection to the game world."
  {:db/ident :steam/CharacterCustomization,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Character Customization is a feature that offers detailed control over the visual design and/or abilities of player characters. It allows players to create unique avatars, enhancing immersion and personal connection to the game world.",
   :rdfs/label "Character Customization",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Character_creation"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Character%20Customization/"}})

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

(def ChoicesMatter
  "Choices Matter is a feature where the decisions made by the player significantly affect the course of the game's narrative or gameplay. It often leads to multiple endings, enhancing replayability and player agency."
  {:db/ident :steam/ChoicesMatter,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Choices Matter is a feature where the decisions made by the player significantly affect the course of the game's narrative or gameplay. It often leads to multiple endings, enhancing replayability and player agency.",
   :rdfs/label "Choices Matter",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Choices%20Matter/"}})

(def ChooseYourOwnAdventure
  "Choose Your Own Adventure games are games that feature interactive stories where the player can make choices that affect the outcome."
  {:db/ident :steam/ChooseYourOwnAdventure,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Choose Your Own Adventure games are games that feature interactive stories where the player can make choices that affect the outcome.",
   :rdfs/label "Choose Your Own Adventure",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Gamebook"},
   :rdfs/subClassOf :steam/Adventure,
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Choose%20Your%20Own%20Adventure/"}})

(def Cinematic
  "Cinematic refers to a visual style that resembles the aesthetics of movies, often characterized by high-quality graphics, dramatic lighting, and camera angles."
  {:db/ident :steam/Cinematic,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Cinematic refers to a visual style that resembles the aesthetics of movies, often characterized by high-quality graphics, dramatic lighting, and camera angles.",
   :rdfs/label "Cinematic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cinematic_techniques"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cinematic/"}})

(def CityBuilder
  "City Builder games are a type of simulation game where players build, expand and manage fictional communities or projects with limited resources."
  {:db/ident :steam/CityBuilder,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "City Builder games are a type of simulation game where players build, expand and manage fictional communities or projects with limited resources.",
   :rdfs/label "City Builder",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/City-building_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/City%20Builder/"}})

(def ClassBased
  "Class-Based is a feature that involves the use of distinct character classes, each with their own unique abilities, skills, and roles within the game. This can add depth and variety to gameplay, encouraging different playstyles and strategies."
  {:db/ident :steam/ClassBased,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Class-Based is a feature that involves the use of distinct character classes, each with their own unique abilities, skills, and roles within the game. This can add depth and variety to gameplay, encouraging different playstyles and strategies.",
   :rdfs/label "Class-Based",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Character_class"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Class-Based/"}})

(def Classic
  "A tag used to describe games that have stood the test of time and are considered to be of high quality."
  {:db/ident :steam/Classic,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that have stood the test of time and are considered to be of high quality.",
   :rdfs/label "Classic",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Classic/"}})

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

(def ColdWar
  "The Cold War tag is used for games that explore the tense geopolitical period from 1947 to 1991. These games might involve espionage, nuclear brinkmanship, or the ideological clash between capitalism and communism."
  {:db/ident :steam/ColdWar,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Cold War tag is used for games that explore the tense geopolitical period from 1947 to 1991. These games might involve espionage, nuclear brinkmanship, or the ideological clash between capitalism and communism.",
   :rdfs/label "Cold War",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cold_War"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Cold%20War/"}})

(def Collectathon
  "Collectathon games are games that feature collecting a large number of items as a core mechanic."
  {:db/ident :steam/Collectathon,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Collectathon games are games that feature collecting a large number of items as a core mechanic.",
   :rdfs/label "Collectathon",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Collectathon/"}})

(def ColonySim
  "Colony Sim games are a type of simulation game where players build, expand and manage a colony or project with limited resources."
  {:db/ident :steam/ColonySim,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Colony Sim games are a type of simulation game where players build, expand and manage a colony or project with limited resources.",
   :rdfs/label "Colony Sim",
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Colony%20Sim/"}})

(def Colorful
  "Colorful refers to a visual style that uses a wide range of colors, often in a vibrant and eye-catching manner."
  {:db/ident :steam/Colorful,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Colorful refers to a visual style that uses a wide range of colors, often in a vibrant and eye-catching manner.",
   :rdfs/label "Colorful",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Colorful/"}})

(def Combat
  "Combat is a feature that involves fighting between characters. This can take many forms, from melee to ranged, magic to technology, and can be a central part of many game genres."
  {:db/ident :steam/Combat,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Combat is a feature that involves fighting between characters. This can take many forms, from melee to ranged, magic to technology, and can be a central part of many game genres.",
   :rdfs/label "Combat",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Combat"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Combat/"}})

(def CombatRacing
  "Combat Racing games are racing games that feature combat elements, such as weapons or aggressive driving maneuvers."
  {:db/ident :steam/CombatRacing,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Combat Racing games are racing games that feature combat elements, such as weapons or aggressive driving maneuvers.",
   :rdfs/label "Combat Racing",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/List_of_vehicular_combat_games"},
   :rdfs/subClassOf [:steam/Action :steam/Racing],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Combat%20Racing/"}})

(def Comedy
  "A tag used to describe games that are intended to be humorous and comedic."
  {:db/ident :steam/Comedy,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that are intended to be humorous and comedic.",
   :rdfs/label "Comedy",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Comedy/"}})

(def ComicBook
  "The Comic Book tag is used for games that draw inspiration from the world of comic books. These games might feature bold, colorful art styles, larger-than-life characters, or narrative structures inspired by comic book storytelling."
  {:db/ident :steam/ComicBook,
   :rdf/type [:steam/ThemeAndMood
              :steam/VisualsAndViewpoint
              :owl/Class
              :schema/Thing
              :steam/Tag],
   :rdfs/comment
   "The Comic Book tag is used for games that draw inspiration from the world of comic books. These games might feature bold, colorful art styles, larger-than-life characters, or narrative structures inspired by comic book storytelling.",
   :rdfs/label "Comic Book",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Comic_book"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Comic%20Book/"}})

(def Competitive
  "A tag used to describe games that have a strong competitive element, often involving multiplayer gameplay."
  {:db/ident :steam/Competitive,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that have a strong competitive element, often involving multiplayer gameplay.",
   :rdfs/label "Competitive",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Competitive/"}})

(def Conspiracy
  "The Conspiracy tag is used for games that delve into the world of secret plots and hidden agendas. These games might involve unraveling complex mysteries, navigating shadowy organizations, or uncovering hidden truths."
  {:db/ident :steam/Conspiracy,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Conspiracy tag is used for games that delve into the world of secret plots and hidden agendas. These games might involve unraveling complex mysteries, navigating shadowy organizations, or uncovering hidden truths.",
   :rdfs/label "Conspiracy",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Conspiracy_theory"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Conspiracy/"}})

(def Controller
  "A tag used to describe games that are designed to be played with a game controller."
  {:db/ident :steam/Controller,
   :rdf/type [:steam/Input :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that are designed to be played with a game controller.",
   :rdfs/label "Controller",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Controller/"}})

(def Conversation
  "Conversation is a feature that involves dialogue between characters. This can be a key part of narrative-driven games, and can also involve elements of choice and consequence."
  {:db/ident :steam/Conversation,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Conversation is a feature that involves dialogue between characters. This can be a key part of narrative-driven games, and can also involve elements of choice and consequence.",
   :rdfs/label "Conversation",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Conversation"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Conversation/"}})

(def Coop
  "Co-op represents games that offer the option for players to work together cooperatively. This feature is often found in action and role-playing games, promoting teamwork and cooperation among players."
  {:db/ident :steam/Coop,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Co-op represents games that offer the option for players to work together cooperatively. This feature is often found in action and role-playing games, promoting teamwork and cooperation among players.",
   :rdfs/label "Co-op",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cooperative_gameplay"},
   :rdfs/subClassOf :schema/CoOp,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Co-op/"}})

(def CoopCampaign
  "Co-op Campaign represents games that offer the option for players to play through the game's campaign or story mode cooperatively. This feature is often found in action and role-playing games, fostering teamwork and shared narrative experiences."
  {:db/ident :steam/CoopCampaign,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Co-op Campaign represents games that offer the option for players to play through the game's campaign or story mode cooperatively. This feature is often found in action and role-playing games, fostering teamwork and shared narrative experiences.",
   :rdfs/label "Co-op Campaign",
   :rdfs/subClassOf [:steam/Coop :schema/CoOp],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Co-op%20Campaign/"}})

(def Crafting
  "Crafting is a feature that allows players to create new items or equipment from resources. This can be a key part of survival games, RPGs, and more, allowing for customization and progression."
  {:db/ident :steam/Crafting,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Crafting is a feature that allows players to create new items or equipment from resources. This can be a key part of survival games, RPGs, and more, allowing for customization and progression.",
   :rdfs/label "Crafting",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Craft"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Crafting/"}})

(def Crime
  "The Crime tag is used for games that involve the world of crime as a significant element. These games might involve playing as a criminal, solving crimes, or exploring the impact of crime on individuals and societies."
  {:db/ident :steam/Crime,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Crime tag is used for games that involve the world of crime as a significant element. These games might involve playing as a criminal, solving crimes, or exploring the impact of crime on individuals and societies.",
   :rdfs/label "Crime",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Crime"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Crime/"}})

(def Crowdfunded
  "A tag used to describe games that have been funded by the collective effort of individuals who pool their money, usually via the Internet."
  {:db/ident :steam/Crowdfunded,
   :rdf/type [:steam/Funding :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that have been funded by the collective effort of individuals who pool their money, usually via the Internet.",
   :rdfs/label "Crowdfunded",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Crowdfunded/"}})

(def CultClassic
  "A tag used to describe games that have a dedicated and passionate fan base, despite not necessarily being mainstream hits."
  {:db/ident :steam/CultClassic,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that have a dedicated and passionate fan base, despite not necessarily being mainstream hits.",
   :rdfs/label "Cult Classic",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Cult%20Classic/"}})

(def Cute
  "Cute is a visual style that is designed to be adorable and charming, often characterized by soft colors, round shapes, and endearing characters."
  {:db/ident :steam/Cute,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Cute is a visual style that is designed to be adorable and charming, often characterized by soft colors, round shapes, and endearing characters.",
   :rdfs/label "Cute",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cute/"}})

(def Cyberpunk
  "The Cyberpunk tag is used for games that explore themes of a dystopian future dominated by advanced technology, corporate power, and social inequality. These games often feature neon-lit cityscapes, rogue AI, and anti-hero protagonists."
  {:db/ident :steam/Cyberpunk,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Cyberpunk tag is used for games that explore themes of a dystopian future dominated by advanced technology, corporate power, and social inequality. These games often feature neon-lit cityscapes, rogue AI, and anti-hero protagonists.",
   :rdfs/label "Cyberpunk",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cyberpunk"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cyberpunk/"}})

(def Cycling
  "Cycling games simulate the sport of cycling, allowing players to compete in races or explore environments on a bike."
  {:db/ident :steam/Cycling,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Cycling games simulate the sport of cycling, allowing players to compete in races or explore environments on a bike.",
   :rdfs/label "Cycling",
   :rdfs/subClassOf [:steam/Racing :steam/Sports],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Cycling/"}})

(def Dark
  "The Dark tag is used for games that feature a dark, often unsettling atmosphere. These games might involve horror elements, mature themes, or a sense of dread and unease."
  {:db/ident :steam/Dark,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Dark tag is used for games that feature a dark, often unsettling atmosphere. These games might involve horror elements, mature themes, or a sense of dread and unease.",
   :rdfs/label "Dark",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Dark/"}})

(def DarkComedy
  "A tag used to describe games that incorporate humor into dark, serious, or taboo subjects."
  {:db/ident :steam/DarkComedy,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that incorporate humor into dark, serious, or taboo subjects.",
   :rdfs/label "Dark Comedy",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Dark%20Comedy/"}})

(def DarkFantasy
  "The Dark Fantasy tag is used for games that blend the fantastical elements of fantasy with darker, more horrifying themes. These games often feature grim settings, morally ambiguous characters, and a sense of impending doom."
  {:db/ident :steam/DarkFantasy,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Dark Fantasy tag is used for games that blend the fantastical elements of fantasy with darker, more horrifying themes. These games often feature grim settings, morally ambiguous characters, and a sense of impending doom.",
   :rdfs/label "Dark Fantasy",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dark_fantasy"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Dark%20Fantasy/"}})

(def DatingSim
  "Dating Sim games are a type of simulation game where players simulate romantic or sexual relationships. They often involve dialogues and character development."
  {:db/ident :steam/DatingSim,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Dating Sim games are a type of simulation game where players simulate romantic or sexual relationships. They often involve dialogues and character development.",
   :rdfs/label "Dating Sim",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dating_sim"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Dating%20Sim/"}})

(def Deckbuilding
  "Deckbuilding is a feature that involves creating and customizing a deck of cards to use in gameplay. This is a key part of many card games, and can involve strategic decision-making and planning."
  {:db/ident :steam/Deckbuilding,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Deckbuilding is a feature that involves creating and customizing a deck of cards to use in gameplay. This is a key part of many card games, and can involve strategic decision-making and planning.",
   :rdfs/label "Deckbuilding",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Deck-building_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Deckbuilding/"}})

(def Demons
  "The Demons tag is used for games that feature demons and might involve battling demons, playing as a demon, or exploring a world where demons exist."
  {:db/ident :steam/Demons,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Demons tag is used for games that feature demons and might involve battling demons, playing as a demon, or exploring a world where demons exist.",
   :rdfs/label "Demons",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Demon"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Demons/"}})

(def DesignAndIllustration
  "Software that is used for design and illustration purposes. This can include graphic design software, illustration software, and more."
  {:db/ident :steam/DesignAndIllustration,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for design and illustration purposes. This can include graphic design software, illustration software, and more.",
   :rdfs/label "Design & Illustration",
   :schema/applicationCategory "DesignApplication",
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Design%20%26%20Illustration/"}})

(def Destruction
  "The Destruction tag is used for games that might involve destroying environments, buildings, or other structures as part of the gameplay."
  {:db/ident :steam/Destruction,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Destruction tag is used for games that might involve destroying environments, buildings, or other structures as part of the gameplay.",
   :rdfs/label "Destruction",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Destruction"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Destruction/"}})

(def Detective
  "The Detective tag is used for games that involve detective work and may involve solving mysteries, investigating crimes, or playing as a detective character."
  {:db/ident :steam/Detective,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Detective tag is used for games that involve detective work and may involve solving mysteries, investigating crimes, or playing as a detective character.",
   :rdfs/label "Detective",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Detective"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Detective/"}})

(def Difficult
  "A tag used to describe games that provide a high level of challenge to the player."
  {:db/ident :steam/Difficult,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that provide a high level of challenge to the player.",
   :rdfs/label "Difficult",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Difficult/"}})

(def Dinosaurs
  "The Dinosaurs tag is used for games that feature dinosaurs and may involve interacting with dinosaurs, playing as a dinosaur, or exploring a world where dinosaurs exist."
  {:db/ident :steam/Dinosaurs,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Dinosaurs tag is used for games that feature dinosaurs and may involve interacting with dinosaurs, playing as a dinosaur, or exploring a world where dinosaurs exist.",
   :rdfs/label "Dinosaurs",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dinosaur"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Dinosaurs/"}})

(def Diplomacy
  "Diplomacy games involve negotiation, strategy, and social interaction. Players often need to form alliances, make deals, or negotiate with other players to achieve their goals."
  {:db/ident :steam/Diplomacy,
   :rdf/type
   [:steam/ThemeAndMood :steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Diplomacy games involve negotiation, strategy, and social interaction. Players often need to form alliances, make deals, or negotiate with other players to achieve their goals.",
   :rdfs/label "Diplomacy",
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Diplomacy/"}})

(def Documentary
  "Documentary represents media that aim to document reality, providing factual information and often focusing on a particular subject or theme."
  {:db/ident :steam/Documentary,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Documentary represents media that aim to document reality, providing factual information and often focusing on a particular subject or theme.",
   :rdfs/label "Documentary",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Documentary_film"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Documentary/"}})

(def Dog
  "The Dog tag is used for games that feature dogs. These games might involve caring for dogs, playing as a dog, or simply feature dogs as part of the game's world."
  {:db/ident :steam/Dog,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Dog tag is used for games that feature dogs. These games might involve caring for dogs, playing as a dog, or simply feature dogs as part of the game's world.",
   :rdfs/label "Dog",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dog"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Dog/"}})

(def Dragons
  "The Dragons tag is used for games that may involve battling dragons, playing as a dragon, or exploring a world where dragons exist."
  {:db/ident :steam/Dragons,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Dragons tag is used for games that may involve battling dragons, playing as a dragon, or exploring a world where dragons exist.",
   :rdfs/label "Dragons",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dragon"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Dragons/"}})

(def Drama
  "Drama represents media that focus on dramatic, emotional storytelling. These games often involve complex characters, moral dilemmas, and narrative arcs that evoke emotional responses from the players."
  {:db/ident :steam/Drama,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Drama represents media that focus on dramatic, emotional storytelling. These games often involve complex characters, moral dilemmas, and narrative arcs that evoke emotional responses from the players.",
   :rdfs/label "Drama",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Drama"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Drama/"}})

(def Driving
  "Driving is a feature that involves controlling a vehicle. This can be a key part of racing games, but can also feature in a wide range of other genres."
  {:db/ident :steam/Driving,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Driving is a feature that involves controlling a vehicle. This can be a key part of racing games, but can also feature in a wide range of other genres.",
   :rdfs/label "Driving",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Driving"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Driving/"}})

(def DungeonCrawler
  "Dungeon Crawler games are a type of adventure games where players navigate a labyrinth environment, battling various monsters, and looting any treasure they may find."
  {:db/ident :steam/DungeonCrawler,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Dungeon Crawler games are a type of adventure games where players navigate a labyrinth environment, battling various monsters, and looting any treasure they may find.",
   :rdfs/label "Dungeon Crawler",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dungeon_crawl"},
   :rdfs/subClassOf :steam/Adventure,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Dungeon%20Crawler/"}})

(def DungeonsAndDragons
  "Dungeons & Dragons represents media that are based on the Dungeons & Dragons franchise."
  {:db/ident :steam/DungeonsAndDragons,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Dungeons & Dragons represents media that are based on the Dungeons & Dragons franchise.",
   :rdfs/label "Dungeons & Dragons",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Dungeons_%26_Dragons"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Dungeons%20%26%20Dragons/"}})

(def DynamicNarration
  "The Dynamic Narration tag is used for games that feature a narrative that changes based on player actions. These games often offer a high degree of player agency and multiple branching story paths."
  {:db/ident :steam/DynamicNarration,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Dynamic Narration tag is used for games that feature a narrative that changes based on player actions. These games often offer a high degree of player agency and multiple branching story paths.",
   :rdfs/label "Dynamic Narration",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Dynamic%20Narration/"}})

(def EarlyAccess
  "A tag used to describe games that are still in development, but are available to purchase and play in their current form."
  {:db/ident :steam/EarlyAccess,
   :rdf/type [:steam/Funding :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that are still in development, but are available to purchase and play in their current form.",
   :rdfs/label "Early Access",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Early%20Access/"}})

(def Economy
  "The Economy tag is used for games that involve economic systems. These games might involve trading, resource management, or running a business."
  {:db/ident :steam/Economy,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Economy tag is used for games that involve economic systems. These games might involve trading, resource management, or running a business.",
   :rdfs/label "Economy",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Economy"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Economy/"}})

(def Education
  "Education games are designed to teach people about certain subjects, expand concepts, reinforce development, or assist them in learning a skill as they play."
  {:db/ident :steam/Education,
   :rdf/type
   [:steam/ThemeAndMood :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Education games are designed to teach people about certain subjects, expand concepts, reinforce development, or assist them in learning a skill as they play.",
   :rdfs/label "Education",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Educational_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Education/"}})

(def Emotional
  "A tag used to describe games that evoke strong emotions in the player, often through storytelling or character development."
  {:db/ident :steam/Emotional,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that evoke strong emotions in the player, often through storytelling or character development.",
   :rdfs/label "Emotional",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Emotional/"}})

(def Epic
  "A tag used to describe games that have a grand and ambitious scale, often involving large worlds or complex narratives."
  {:db/ident :steam/Epic,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that have a grand and ambitious scale, often involving large worlds or complex narratives.",
   :rdfs/label "Epic",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Epic/"}})

(def Episodic
  "Episodic represents games that are released in parts or episodes, with each episode often featuring a self-contained story that contributes to a larger narrative. This format allows for ongoing storytelling and character development."
  {:db/ident :steam/Episodic,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Episodic represents games that are released in parts or episodes, with each episode often featuring a self-contained story that contributes to a larger narrative. This format allows for ongoing storytelling and character development.",
   :rdfs/label "Episodic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Episodic_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Episodic/"}})

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

(def Experience
  "Experience represents games that prioritize creating a unique, immersive experience for the player. These games often focus on atmosphere, aesthetics, and exploration, rather than traditional gameplay mechanics."
  {:db/ident :steam/Experience,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Experience represents games that prioritize creating a unique, immersive experience for the player. These games often focus on atmosphere, aesthetics, and exploration, rather than traditional gameplay mechanics.",
   :rdfs/label "Experience",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Experience/"}})

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

(def FMV
  "FMV, or Full Motion Video, refers to a technique used in video games that features pre-recorded video files (rather than sprites, vectors, or 3D models) to display action."
  {:db/ident :steam/FMV,
   :rdf/type [:steam/Feature
              :steam/VisualsAndViewpoint
              :owl/Class
              :steam/Tag
              :schema/Thing],
   :rdfs/comment
   "FMV, or Full Motion Video, refers to a technique used in video games that features pre-recorded video files (rather than sprites, vectors, or 3D models) to display action.",
   :rdfs/label "FMV",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Full_motion_video"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/FMV/"}})

(def FPS
  "FPS (First-Person Shooter) games are a type of 3D shooter games played from a first-person perspective, where the player experiences the action through the eyes of the protagonist."
  {:db/ident :steam/FPS,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "FPS (First-Person Shooter) games are a type of 3D shooter games played from a first-person perspective, where the player experiences the action through the eyes of the protagonist.",
   :rdfs/label "FPS",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/First-person_shooter"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/FPS/"}})

(def Faith
  "The Faith tag is used for games that explore themes of faith, religion, or spirituality. These games might involve exploring religious beliefs, engaging with spiritual practices, or navigating the complexities of faith."
  {:db/ident :steam/Faith,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Faith tag is used for games that explore themes of faith, religion, or spirituality. These games might involve exploring religious beliefs, engaging with spiritual practices, or navigating the complexities of faith.",
   :rdfs/label "Faith",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Faith"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Faith/"}})

(def FamilyFriendly
  "The Family Friendly tag is used for games that are suitable for players of all ages. These games often avoid explicit content, focus on positive themes, and are designed to be accessible and enjoyable for a wide audience."
  {:db/ident :steam/FamilyFriendly,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Family Friendly tag is used for games that are suitable for players of all ages. These games often avoid explicit content, focus on positive themes, and are designed to be accessible and enjoyable for a wide audience.",
   :rdfs/label "Family Friendly",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Family%20Friendly/"}})

(def Fantasy
  "The Fantasy tag is used for games that feature elements of fantasy, such as magic, mythical creatures, or fantastical settings. These games often involve quests, epic narratives, and exploration of magical worlds."
  {:db/ident :steam/Fantasy,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Fantasy tag is used for games that feature elements of fantasy, such as magic, mythical creatures, or fantastical settings. These games often involve quests, epic narratives, and exploration of magical worlds.",
   :rdfs/label "Fantasy",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Fantasy"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Fantasy/"}})

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

(def FastPaced
  "A tag used to describe games that require quick reactions and decision-making from the player."
  {:db/ident :steam/FastPaced,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that require quick reactions and decision-making from the player.",
   :rdfs/label "Fast-Paced",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Fast-Paced/"}})

(def Feature
  "A tag used to describe the features of a game on Steam."
  {:db/ident        :steam/Feature,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to describe the features of a game on Steam.",
   :rdfs/label      "Features",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def FeatureFilm
  "Feature Film represents games that are associated with a feature film. These games often share the same characters, settings, and storylines as the film, providing an interactive extension of the cinematic experience."
  {:db/ident :steam/FeatureFilm,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Feature Film represents games that are associated with a feature film. These games often share the same characters, settings, and storylines as the film, providing an interactive extension of the cinematic experience.",
   :rdfs/label "Feature Film",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Feature_film"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Feature%20Film/"}})

(def FemaleProtagonist
  "Female Protagonist is a feature that involves the main character of the game being female. This can be a key part of many games, and often involves a focus on character development and narrative."
  {:db/ident :steam/FemaleProtagonist,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Female Protagonist is a feature that involves the main character of the game being female. This can be a key part of many games, and often involves a focus on character development and narrative.",
   :rdfs/label "Female Protagonist",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Category:Video_games_featuring_female_protagonists"},
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Female%20Protagonist/"}})

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

(def FirstPerson
  "First-Person refers to a perspective in which the audience experiences the world directly through the eyes of the character."
  {:db/ident :steam/FirstPerson,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "First-Person refers to a perspective in which the audience experiences the world directly through the eyes of the character.",
   :rdfs/label "First-Person",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/First-person_(video_games)"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/First-Person/"}})

(def Fishing
  "Fishing is a feature that involves catching fish. This can be a relaxing pastime within a larger game, or the central focus of a fishing game."
  {:db/ident :steam/Fishing,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Fishing is a feature that involves catching fish. This can be a relaxing pastime within a larger game, or the central focus of a fishing game.",
   :rdfs/label "Fishing",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Fishing"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Fishing/"}})

(def Flight
  "Flight games are games that involve piloting a vehicle, often an aircraft, through the sky."
  {:db/ident :steam/Flight,
   :rdf/type
   [:steam/Feature :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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

(def Foreign
  "The Foreign tag is used for games that originate from or are set in countries outside of the player's own. These games often offer insights into different cultures, languages, and perspectives."
  {:db/ident :steam/Foreign,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Foreign tag is used for games that originate from or are set in countries outside of the player's own. These games often offer insights into different cultures, languages, and perspectives.",
   :rdfs/label "Foreign",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Foreign/"}})

(def FourPlayerLocal
  "4 Player Local represents games that offer the option for up to four players to play simultaneously on the same device. This feature is often found in party and multiplayer games, fostering cooperation and competition among players."
  {:db/ident :steam/FourPlayerLocal,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "4 Player Local represents games that offer the option for up to four players to play simultaneously on the same device. This feature is often found in party and multiplayer games, fostering cooperation and competition among players.",
   :rdfs/label "4 Player Local",
   :rdfs/subClassOf
   [:steam/LocalMultiplayer :steam/Multiplayer :schema/MultiPlayer],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/4%20Player%20Local/"}})

(def FreeToPlay
  "A tag used to describe games that can be played without purchasing the game itself. These games may include in-game purchases."
  {:db/ident :steam/FreeToPlay,
   :rdf/type [:steam/Funding :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that can be played without purchasing the game itself. These games may include in-game purchases.",
   :rdfs/label "Free to Play",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Free%20to%20Play/"}})

(def Funding
  "A tag used to categorize the funding of something on Steam."
  {:db/ident :steam/Funding,
   :rdf/type :owl/Class,
   :rdfs/comment "A tag used to categorize the funding of something on Steam.",
   :rdfs/label "Funding",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Funny
  "A tag used to describe games that incorporate humor and are intended to make the player laugh."
  {:db/ident :steam/Funny,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that incorporate humor and are intended to make the player laugh.",
   :rdfs/label "Funny",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Funny/"}})

(def Futuristic
  "The Futuristic tag is used for games that are set in or draw inspiration from visions of the future. These games often feature advanced technology, futuristic settings, and themes of exploration and innovation."
  {:db/ident :steam/Futuristic,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Futuristic tag is used for games that are set in or draw inspiration from visions of the future. These games often feature advanced technology, futuristic settings, and themes of exploration and innovation.",
   :rdfs/label "Futuristic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Future"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Futuristic/"}})

(def Gambling
  "The Gambling tag is used for games that involve playing casino games, betting on outcomes, or other forms of wagering."
  {:db/ident :steam/Gambling,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Gambling tag is used for games that involve playing casino games, betting on outcomes, or other forms of wagering.",
   :rdfs/label "Gambling",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Gambling"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Gambling/"}})

(def GameDevelopment
  "The Game Development tag is used for games that might involve creating your own games, managing a game development studio, or exploring the process of game development."
  {:db/ident :steam/GameDevelopment,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Game Development tag is used for games that might involve creating your own games, managing a game development studio, or exploring the process of game development.",
   :rdfs/label "Game Development",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Video_game_development"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Game%20Development/"}})

(def GameMaker
  "Software that is used to create games. GameMaker is also a specific brand of game development software that allows users to create their own video games."
  {:db/ident :steam/GameMaker,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used to create games. GameMaker is also a specific brand of game development software that allows users to create their own video games.",
   :rdfs/label "GameMaker",
   :schema/applicationCategory ["GameApplication" "DeveloperApplication"],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/GameMaker/"}})

(def GamesWorkshop
  "Games Workshop represents games that are based on franchises created by Games Workshop. These games often feature elements of fantasy or science fiction, including Warhammer 40,000 and Warhammer Fantasy Battles."
  {:db/ident :steam/GamesWorkshop,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Games Workshop represents games that are based on franchises created by Games Workshop. These games often feature elements of fantasy or science fiction, including Warhammer 40,000 and Warhammer Fantasy Battles.",
   :rdfs/label "Games Workshop",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Games_Workshop"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Games%20Workshop/"}})

(def Gaming
  "Software that is related to gaming. This can include game launchers, game optimization software, and more."
  {:db/ident :steam/Gaming,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is related to gaming. This can include game launchers, game optimization software, and more.",
   :rdfs/label "Gaming",
   :schema/applicationCategory "GameApplication",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Gaming/"}})

(def Genre
  "A genre used to categorize a game on Steam."
  {:db/ident        :steam/Genre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A genre used to categorize a game on Steam.",
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

(def Gore
  "A tag used to describe games that feature explicit violence and gore."
  {:db/ident :steam/Gore,
   :rdf/type [:steam/Rating :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that feature explicit violence and gore.",
   :rdfs/label "Gore",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Gore/"}})

(def Gothic
  "The Gothic tag is used for games that feature gothic themes or aesthetics. These games might involve dark and atmospheric settings, supernatural elements, or a focus on horror and mystery."
  {:db/ident :steam/Gothic,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Gothic tag is used for games that feature gothic themes or aesthetics. These games might involve dark and atmospheric settings, supernatural elements, or a focus on horror and mystery.",
   :rdfs/label "Gothic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Gothic_fiction"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Gothic/"}})

(def GrandStrategy
  "Grand Strategy games are a type of strategy game that includes aspects of military, economic, and political development. Players control a nation or faction and make long-term strategic decisions."
  {:db/ident :steam/GrandStrategy,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Grand Strategy games are a type of strategy game that includes aspects of military, economic, and political development. Players control a nation or faction and make long-term strategic decisions.",
   :rdfs/label "Grand Strategy",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Grand_strategy_wargame"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Grand%20Strategy/"}})

(def GreatSoundtrack
  "A tag used to describe games that are notable for their high-quality music or sound design."
  {:db/ident :steam/GreatSoundtrack,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that are notable for their high-quality music or sound design.",
   :rdfs/label "Great Soundtrack",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Great%20Soundtrack/"}})

(def GridBasedMovement
  "Grid-Based Movement is a feature that restricts movement to a grid. This can be a key part of many strategy and puzzle games, and can add a layer of tactical decision-making to gameplay."
  {:db/ident :steam/GridBasedMovement,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Grid-Based Movement is a feature that restricts movement to a grid. This can be a key part of many strategy and puzzle games, and can add a layer of tactical decision-making to gameplay.",
   :rdfs/label "Grid-Based Movement",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Grid_plan"},
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Grid-Based%20Movement/"}})

(def GunCustomization
  "Gun Customization is a feature that allows players to modify and personalize firearms. This can be a key part of many shooter games, allowing for a wide range of playstyles and strategies."
  {:db/ident :steam/GunCustomization,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Gun Customization is a feature that allows players to modify and personalize firearms. This can be a key part of many shooter games, allowing for a wide range of playstyles and strategies.",
   :rdfs/label "Gun Customization",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Firearm"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Gun%20Customization/"}})

(def HackAndSlash
  "Hack and Slash games are a type of action game that emphasizes combat with melee-based weapons."
  {:db/ident :steam/HackAndSlash,
   :rdf/type
   [:steam/Feature :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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
   :rdf/type [:steam/Feature :steam/Genre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Hacking games involve elements of computer hacking. They often require players to solve puzzles, exploit systems, or engage in simulated computer hacking tasks.",
   :rdfs/label "Hacking",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Hacking/"}})

(def HandDrawn
  "Hand-drawn refers to a visual style that appears to have been created by hand, often characterized by unique textures, lines, and colors that resemble traditional art mediums."
  {:db/ident :steam/HandDrawn,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Hand-drawn refers to a visual style that appears to have been created by hand, often characterized by unique textures, lines, and colors that resemble traditional art mediums.",
   :rdfs/label "Hand-drawn",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Hand-drawn/"}})

(def Hardware
  "A tag used to describe games that require specific hardware to play."
  {:db/ident :steam/Hardware,
   :rdf/type [:steam/Input :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that require specific hardware to play.",
   :rdfs/label "Hardware",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Hardware/"}})

(def Heist
  "Heist games are games that involve a plot to commit a burglary or theft of some kind."
  {:db/ident :steam/Heist,
   :rdf/type
   [:steam/ThemeAndMood :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Heist games are games that involve a plot to commit a burglary or theft of some kind.",
   :rdfs/label "Heist",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Heist_film"},
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Heist/"}})

(def HeroShooter
  "Hero Shooter games are a sub-genre of shooter games that assign players into two or more teams, with each player selecting their own unique 'hero' character, each with their own unique abilities or skills."
  {:db/ident :steam/HeroShooter,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Hero Shooter games are a sub-genre of shooter games that assign players into two or more teams, with each player selecting their own unique 'hero' character, each with their own unique abilities or skills.",
   :rdfs/label "Hero Shooter",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Hero_shooter"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Hero%20Shooter/"}})

(def HexGrid
  "Hex Grid is a feature that involves a grid of hexagonal tiles. This can be a key part of many strategy games, and can allow for more complex and varied movement than a square grid."
  {:db/ident :steam/HexGrid,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Hex Grid is a feature that involves a grid of hexagonal tiles. This can be a key part of many strategy games, and can allow for more complex and varied movement than a square grid.",
   :rdfs/label "Hex Grid",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Hex_map"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Hex%20Grid/"}})

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

(def Historical
  "The Historical tag is used for games that are set in or draw inspiration from real historical periods. These games often involve exploring historical events, interacting with historical figures, or recreating historical settings."
  {:db/ident :steam/Historical,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Historical tag is used for games that are set in or draw inspiration from real historical periods. These games often involve exploring historical events, interacting with historical figures, or recreating historical settings.",
   :rdfs/label "Historical",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/History"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Historical/"}})

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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Horror games are games that aim to elicit fear and horror from the player. They often feature dark atmospheres, scary graphics, and chilling audio.",
   :rdfs/label "Horror",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Category:Horror_video_games"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Horror/"}})

(def Horses
  "The Horses tag is used for games that feature horses. These games might involve riding horses, caring for horses, or exploring a world where horses play a significant role."
  {:db/ident :steam/Horses,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Horses tag is used for games that feature horses. These games might involve riding horses, caring for horses, or exploring a world where horses play a significant role.",
   :rdfs/label "Horses",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Horse"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Horses/"}})

(def Hunting
  "Hunting is a feature that involves tracking and killing animals. This can be a key part of many survival games, and can involve elements of tracking, stealth, and resource management."
  {:db/ident :steam/Hunting,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Hunting is a feature that involves tracking and killing animals. This can be a key part of many survival games, and can involve elements of tracking, stealth, and resource management.",
   :rdfs/label "Hunting",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Hunting"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Hunting/"}})

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

(def Illuminati
  "The Illuminati tag is used for games that involve the Illuminati or similar secret societies as a significant element. These games might involve uncovering conspiracies, battling secret societies, or exploring the influence of all-powerful organizations."
  {:db/ident :steam/Illuminati,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Illuminati tag is used for games that involve the Illuminati or similar secret societies as a significant element. These games might involve uncovering conspiracies, battling secret societies, or exploring the influence of all-powerful organizations.",
   :rdfs/label "Illuminati",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Illuminati"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Illuminati/"}})

(def ImmersiveSim
  "Immersive Sim games are a type of video game that emphasizes player choice. Their key defining features are a blend of multiple gameplay genres, and a highly interactive world."
  {:db/ident :steam/ImmersiveSim,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Immersive Sim games are a type of video game that emphasizes player choice. Their key defining features are a blend of multiple gameplay genres, and a highly interactive world.",
   :rdfs/label "Immersive Sim",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Immersive_sim"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Immersive%20Sim/"}})

(def Indie
  "Indie represents games that are developed by independent studios. These games often feature innovative gameplay, unique art styles, and personal creative visions, free from the constraints of larger publishers."
  {:db/ident :steam/Indie,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Indie represents games that are developed by independent studios. These games often feature innovative gameplay, unique art styles, and personal creative visions, free from the constraints of larger publishers.",
   :rdfs/label "Indie",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Indie_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Indie/"}})

(def Input
  "A tag used to categorize the input of a game on Steam."
  {:db/ident        :steam/Input,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize the input of a game on Steam.",
   :rdfs/label      "Input (Hardware)",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def IntentionallyAwkwardControls
  "Intentionally Awkward Controls is a feature that involves game controls that are deliberately difficult to use. This can be a key part of many comedy and challenge-focused games, and often involves a focus on skill and adaptability."
  {:db/ident :steam/IntentionallyAwkwardControls,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Intentionally Awkward Controls is a feature that involves game controls that are deliberately difficult to use. This can be a key part of many comedy and challenge-focused games, and often involves a focus on skill and adaptability.",
   :rdfs/label "Intentionally Awkward Controls",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/QWOP"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Intentionally%20Awkward%20Controls/"}})

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

(def InventoryManagement
  "Inventory Management is a feature that involves managing a limited inventory of items. This can be a key part of many RPGs and survival games, and can involve strategic decision-making and planning."
  {:db/ident :steam/InventoryManagement,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Inventory Management is a feature that involves managing a limited inventory of items. This can be a key part of many RPGs and survival games, and can involve strategic decision-making and planning.",
   :rdfs/label "Inventory Management",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Inventory"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Inventory%20Management/"}})

(def Investigation
  "The Investigation tag is used for games that might involve solving mysteries, uncovering clues, or playing as a detective or investigator."
  {:db/ident :steam/Investigation,
   :rdf/type
   [:steam/ThemeAndMood :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Investigation tag is used for games that might involve solving mysteries, uncovering clues, or playing as a detective or investigator.",
   :rdfs/label "Investigation",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Detective_fiction"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Investigation/"}})

(def Isometric
  "Isometric refers to a method of drawing a three-dimensional object in two dimensions, where the three coordinate axes appear equally foreshortened."
  {:db/ident :steam/Isometric,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Isometric refers to a method of drawing a three-dimensional object in two dimensions, where the three coordinate axes appear equally foreshortened.",
   :rdfs/label "Isometric",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Isometric_video_game_graphics"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Isometric/"}})

(def JRPG
  "JRPG (Japanese Role-Playing Games) are a type of role-playing video game that originated in Japan and have a distinct art style and narrative structure."
  {:db/ident :steam/JRPG,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "JRPG (Japanese Role-Playing Games) are a type of role-playing video game that originated in Japan and have a distinct art style and narrative structure.",
   :rdfs/label "JRPG",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/History_of_Eastern_role-playing_video_games"},
   :rdfs/subClassOf :steam/RPG,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/JRPG/"}})

(def Jet
  "The Jet tag is used for games that feature jets or jet-powered vehicles. These games might involve flying jets, participating in jet combat, or exploring a world where jets play a significant role."
  {:db/ident :steam/Jet,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Jet tag is used for games that feature jets or jet-powered vehicles. These games might involve flying jets, participating in jet combat, or exploring a world where jets play a significant role.",
   :rdfs/label "Jet",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Jet_aircraft"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Jet/"}})

(def Kickstarter
  "A tag used to describe games that have been funded through the Kickstarter platform, a popular crowdfunding website."
  {:db/ident :steam/Kickstarter,
   :rdf/type [:steam/Funding :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that have been funded through the Kickstarter platform, a popular crowdfunding website.",
   :rdfs/label "Kickstarter",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Kickstarter/"}})

(def LEGO
  "LEGO represents games that are based on the LEGO brand. These games often feature LEGO-style graphics, building mechanics, and themes from various LEGO sets and franchises."
  {:db/ident :steam/LEGO,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "LEGO represents games that are based on the LEGO brand. These games often feature LEGO-style graphics, building mechanics, and themes from various LEGO sets and franchises.",
   :rdfs/label "LEGO",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Lego"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/LEGO/"}})

(def LGBTQPlus
  "The LGBTQ+ tag is used for games that feature LGBTQ+ themes or characters as a significant element. These games might involve exploring LGBTQ+ identities, relationships, or issues, or feature LGBTQ+ characters in prominent roles."
  {:db/ident :steam/LGBTQPlus,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The LGBTQ+ tag is used for games that feature LGBTQ+ themes or characters as a significant element. These games might involve exploring LGBTQ+ identities, relationships, or issues, or feature LGBTQ+ characters in prominent roles.",
   :rdfs/label "LGBTQ+",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/LGBT"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/LGBTQ%2B/"}})

(def LaraCroft
  "Lara Croft represents games that feature Lara Croft as the main character. These games are often part of the Tomb Raider franchise, involving themes of adventure, archaeology, and action."
  {:db/ident :steam/LaraCroft,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Lara Croft represents games that feature Lara Croft as the main character. These games are often part of the Tomb Raider franchise, involving themes of adventure, archaeology, and action.",
   :rdfs/label "Lara Croft",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Lara_Croft"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Lara%20Croft/"}})

(def Lemmings
  "The Lemmings tag is used for games that feature gameplay mechanics similar to the classic game Lemmings. These games often involve guiding a group of characters through a series of obstacles to reach a goal."
  {:db/ident :steam/Lemmings,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Lemmings tag is used for games that feature gameplay mechanics similar to the classic game Lemmings. These games often involve guiding a group of characters through a series of obstacles to reach a goal.",
   :rdfs/label "Lemmings",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Lemmings_(video_game)"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Lemmings/"}})

(def LevelEditor
  "Level Editor is a feature that allows players to create and share their own levels or maps. This can add a significant amount of replayability to a game, and allows for a high degree of player creativity."
  {:db/ident :steam/LevelEditor,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Level Editor is a feature that allows players to create and share their own levels or maps. This can add a significant amount of replayability to a game, and allows for a high degree of player creativity.",
   :rdfs/label "Level Editor",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Level_editor"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Level%20Editor/"}})

(def LifeSim
  "Life Sim games are a type of simulation game where players simulate living or controlling one or more artificial lives."
  {:db/ident :steam/LifeSim,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Life Sim games are a type of simulation game where players simulate living or controlling one or more artificial lives.",
   :rdfs/label "Life Sim",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Life_simulation_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Life%20Sim/"}})

(def Linear
  "Linear is a feature that involves a set, predetermined path through the game. This can be a key part of many narrative-driven games, and often involves a strong focus on storytelling."
  {:db/ident :steam/Linear,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Linear is a feature that involves a set, predetermined path through the game. This can be a key part of many narrative-driven games, and often involves a strong focus on storytelling.",
   :rdfs/label "Linear",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Linearity"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Linear/"}})

(def LocalCoop
  "Local Co-Op represents games that offer the option for players to play cooperatively on the same device. This feature is often found in action and party games, promoting cooperation and shared experiences."
  {:db/ident :steam/LocalCoop,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Local Co-Op represents games that offer the option for players to play cooperatively on the same device. This feature is often found in action and party games, promoting cooperation and shared experiences.",
   :rdfs/label "Local Co-Op",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cooperative_gameplay"},
   :rdfs/subClassOf [:steam/Coop :schema/CoOp],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Local%20Co-Op/"}})

(def LocalMultiplayer
  "Local Multiplayer represents games that offer the option for multiple players to play on the same device. This feature is often found in party and multiplayer games, fostering competition and shared experiences."
  {:db/ident :steam/LocalMultiplayer,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Local Multiplayer represents games that offer the option for multiple players to play on the same device. This feature is often found in party and multiplayer games, fostering competition and shared experiences.",
   :rdfs/label "Local Multiplayer",
   :rdfs/subClassOf [:steam/Multiplayer :schema/MultiPlayer],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Local%20Multiplayer/"}})

(def Logic
  "The Logic tag is used for games that involve logic puzzles. These games might involve solving puzzles, deducing solutions, or applying logical reasoning to overcome challenges."
  {:db/ident :steam/Logic,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Logic tag is used for games that involve logic puzzles. These games might involve solving puzzles, deducing solutions, or applying logical reasoning to overcome challenges.",
   :rdfs/label "Logic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Logic"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Logic/"}})

(def Loot
  "The Loot tag is used for games that feature loot or item collection as a significant element. These games might involve finding and collecting items and upgrading equipment."
  {:db/ident :steam/Loot,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Loot tag is used for games that feature loot or item collection as a significant element. These games might involve finding and collecting items and upgrading equipment.",
   :rdfs/label "Loot",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Loot"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Loot/"}})

(def LooterShooter
  "Looter Shooter games are a sub-genre of shooter games that include elements of looting, shooting, and often role-playing."
  {:db/ident :steam/LooterShooter,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Looter Shooter games are a sub-genre of shooter games that include elements of looting, shooting, and often role-playing.",
   :rdfs/label "Looter Shooter",
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Looter%20Shooter/"}})

(def LoreRich
  "A tag used to describe games that have a deep and intricate backstory or universe."
  {:db/ident :steam/LoreRich,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that have a deep and intricate backstory or universe.",
   :rdfs/label "Lore-Rich",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Lore-Rich/"}})

(def Lovecraftian
  "The Lovecraftian tag is used for games that feature themes, settings, or elements inspired by the works of H.P. Lovecraft. These games often involve cosmic horror, ancient gods, or a sense of dread and the unknown."
  {:db/ident :steam/Lovecraftian,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Lovecraftian tag is used for games that feature themes, settings, or elements inspired by the works of H.P. Lovecraft. These games often involve cosmic horror, ancient gods, or a sense of dread and the unknown.",
   :rdfs/label "Lovecraftian",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Lovecraftian_horror"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Lovecraftian/"}})

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

(def Magic
  "The Magic tag is used for games that feature magic or magical elements as a significant aspect. These games might involve casting spells, exploring magical worlds, or interacting with magical creatures."
  {:db/ident :steam/Magic,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Magic tag is used for games that feature magic or magical elements as a significant aspect. These games might involve casting spells, exploring magical worlds, or interacting with magical creatures.",
   :rdfs/label "Magic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Magic_(supernatural)"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Magic/"}})

(def Management
  "Management games involve managing resources and making strategic decisions. They often require players to manage businesses, cities, or other entities."
  {:db/ident :steam/Management,
   :rdf/type
   [:steam/ThemeAndMood :steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Management games involve managing resources and making strategic decisions. They often require players to manage businesses, cities, or other entities.",
   :rdfs/label "Management",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Construction_and_management_simulation"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Management/"}})

(def Mars
  "The Mars tag is used for games that feature Mars or Martian elements. These games might involve exploring Mars, interacting with Martian life, or surviving in a Martian environment."
  {:db/ident :steam/Mars,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Mars tag is used for games that feature Mars or Martian elements. These games might involve exploring Mars, interacting with Martian life, or surviving in a Martian environment.",
   :rdfs/label "Mars",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Mars"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mars/"}})

(def MartialArts
  "Martial Arts is a feature that involves combat techniques. This can be a key part of many action and fighting games, and often involves a focus on skill and timing."
  {:db/ident :steam/MartialArts,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Martial Arts is a feature that involves combat techniques. This can be a key part of many action and fighting games, and often involves a focus on skill and timing.",
   :rdfs/label "Martial Arts",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Martial_arts"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Martial%20Arts/"}})

(def MassivelyMultiplayer
  "Massively Multiplayer represents games that offer the option to support large numbers of players within the same game world. This feature is often found in online role-playing games, promoting social interaction and cooperation among a large number of players."
  {:db/ident :steam/MassivelyMultiplayer,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Massively Multiplayer represents games that offer the option to support large numbers of players within the same game world. This feature is often found in online role-playing games, promoting social interaction and cooperation among a large number of players.",
   :rdfs/label "Massively Multiplayer",
   :rdfs/seeAlso
   {:rdfa/uri "http://dbpedia.org/resource/Massively_multiplayer_online_game"},
   :rdfs/subClassOf [:steam/Multiplayer :schema/MultiPlayer],
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Massively%20Multiplayer/"}})

(def Masterpiece
  "A tag used to describe games that are considered to be outstanding or exceptionally good."
  {:db/ident :steam/Masterpiece,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that are considered to be outstanding or exceptionally good.",
   :rdfs/label "Masterpiece",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Masterpiece/"}})

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

(def Mature
  "A tag used to describe games that contain content suitable for mature audiences, such as explicit violence, sexual themes, or strong language."
  {:db/ident :steam/Mature,
   :rdf/type [:steam/Rating :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that contain content suitable for mature audiences, such as explicit violence, sexual themes, or strong language.",
   :rdfs/label "Mature",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mature/"}})

(def Mechs
  "The Mechs tag is used for games that feature mechs or mech combat. These games might involve piloting mechs, battling with mechs, or exploring a world where mechs play a significant role."
  {:db/ident :steam/Mechs,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Mechs tag is used for games that feature mechs or mech combat. These games might involve piloting mechs, battling with mechs, or exploring a world where mechs play a significant role.",
   :rdfs/label "Mechs",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Mecha"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mechs/"}})

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

(def Medieval
  "The Medieval tag is used for games that are set in or draw inspiration from the medieval period. These games often involve exploring medieval settings, interacting with medieval characters, or recreating medieval life."
  {:db/ident :steam/Medieval,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Medieval tag is used for games that are set in or draw inspiration from the medieval period. These games often involve exploring medieval settings, interacting with medieval characters, or recreating medieval life.",
   :rdfs/label "Medieval",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Medieval/"}})

(def Memes
  "The Memes tag is used for games that feature memes or meme culture."
  {:db/ident :steam/Memes,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Memes tag is used for games that feature memes or meme culture.",
   :rdfs/label "Memes",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Internet_meme"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Memes/"}})

(def Metroidvania
  "Metroidvania games are a sub-genre of action-adventure games that includes elements of exploration, backtracking, and item gathering."
  {:db/ident :steam/Metroidvania,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Metroidvania games are a sub-genre of action-adventure games that includes elements of exploration, backtracking, and item gathering.",
   :rdfs/label "Metroidvania",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Metroidvania"},
   :rdfs/subClassOf [:steam/Platformer :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Metroidvania/"}})

(def Military
  "The Military tag is used for games that may involve participating in military operations, exploring military history, or interacting with military equipment and personnel."
  {:db/ident :steam/Military,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Military tag is used for games that may involve participating in military operations, exploring military history, or interacting with military equipment and personnel.",
   :rdfs/label "Military",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Military"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Military/"}})

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

(def Minigames
  "Minigames is a feature that involves smaller games within the main game. This can be a key part of many games, and often involves a focus on variety and additional content."
  {:db/ident :steam/Minigames,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Minigames is a feature that involves smaller games within the main game. This can be a key part of many games, and often involves a focus on variety and additional content.",
   :rdfs/label "Minigames",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Minigame"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Minigames/"}})

(def Minimalist
  "Minimalist refers to a visual style that is stripped down to its essential elements, often characterized by simplicity and the use of minimal colors, shapes, and textures."
  {:db/ident :steam/Minimalist,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Minimalist refers to a visual style that is stripped down to its essential elements, often characterized by simplicity and the use of minimal colors, shapes, and textures.",
   :rdfs/label "Minimalist",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Minimalism"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Minimalist/"}})

(def Mining
  "Mining games involve the extraction of valuable minerals or other geological materials from the earth. They often require players to manage resources, explore environments, and develop mining operations."
  {:db/ident :steam/Mining,
   :rdf/type [:steam/Feature :steam/Genre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Mining games involve the extraction of valuable minerals or other geological materials from the earth. They often require players to manage resources, explore environments, and develop mining operations.",
   :rdfs/label "Mining",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mining/"}})

(def Mod
  "Mod represents games that support or are based on modifications (mods). Mods are player-created content that can alter or add to the original game, often enhancing replayability and community engagement."
  {:db/ident :steam/Mod,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Mod represents games that support or are based on modifications (mods). Mods are player-created content that can alter or add to the original game, often enhancing replayability and community engagement.",
   :rdfs/label "Mod",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Mod_(video_gaming)"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mod/"}})

(def Moddable
  "Moddable is a feature that allows players to modify the game. This can add a significant amount of replayability to a game, and allows for a high degree of player creativity."
  {:db/ident :steam/Moddable,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Moddable is a feature that allows players to modify the game. This can add a significant amount of replayability to a game, and allows for a high degree of player creativity.",
   :rdfs/label "Moddable",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Video_game_modding"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Moddable/"}})

(def Modern
  "The Modern tag is used for games that are set in or draw inspiration from the modern period or dealing with modern issues and themes."
  {:db/ident :steam/Modern,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Modern tag is used for games that are set in or draw inspiration from the modern period or dealing with modern issues and themes.",
   :rdfs/label "Modern",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Modern/"}})

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

(def Motorbike
  "The Motorbike tag is used for games that feature motorbikes or motorbike racing."
  {:db/ident :steam/Motorbike,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Motorbike tag is used for games that feature motorbikes or motorbike racing.",
   :rdfs/label "Motorbike",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Motorcycle"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Motorbike/"}})

(def MouseOnly
  "A tag used to describe games that are designed to be played with a mouse only."
  {:db/ident :steam/MouseOnly,
   :rdf/type [:steam/Input :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that are designed to be played with a mouse only.",
   :rdfs/label "Mouse only",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Mouse%20only/"}})

(def Movie
  "When games are tagged with movie they often adapted from and share the same characters, settings, and storylines as a movie, providing an interactive extension of the cinematic experience. Alternatively, this may also tag software that is used to play or produce movies."
  {:db/ident :steam/Movie,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "When games are tagged with movie they often adapted from and share the same characters, settings, and storylines as a movie, providing an interactive extension of the cinematic experience. Alternatively, this may also tag software that is used to play or produce movies.",
   :rdfs/label "Movie",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Movie/"}})

(def Multiplayer
  "Multiplayer represents games that offer the option for multiple players to play together. This feature is often found in action and strategy games, fostering competition and cooperation among players."
  {:db/ident :steam/Multiplayer,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Multiplayer represents games that offer the option for multiple players to play together. This feature is often found in action and strategy games, fostering competition and cooperation among players.",
   :rdfs/label "Multiplayer",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Multiplayer_video_game"},
   :rdfs/subClassOf :schema/MultiPlayer,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Multiplayer/"}})

(def MultipleEndings
  "Multiple Endings is a feature that involves different potential outcomes to the game's story. This can be a key part of many narrative-driven games, and often involves a focus on player choice and branching narratives."
  {:db/ident :steam/MultipleEndings,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Multiple Endings is a feature that involves different potential outcomes to the game's story. This can be a key part of many narrative-driven games, and often involves a focus on player choice and branching narratives.",
   :rdfs/label "Multiple Endings",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Types_of_fiction_with_multiple_endings"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Multiple%20Endings/"}})

(def Music
  "Music represents games that focus on music, either through gameplay mechanics, such as rhythm games, or through a notable musical score. These games often provide a rich auditory experience and may involve musical creativity."
  {:db/ident :steam/Music,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Music represents games that focus on music, either through gameplay mechanics, such as rhythm games, or through a notable musical score. These games often provide a rich auditory experience and may involve musical creativity.",
   :rdfs/label "Music",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Music_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Music/"}})

(def MusicBasedProceduralGeneration
  "Music-Based Procedural Generation is a feature that involves generating content based on music. This can be a key part of many rhythm and music games, and often involves a unique and dynamic gameplay experience."
  {:db/ident :steam/MusicBasedProceduralGeneration,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Music-Based Procedural Generation is a feature that involves generating content based on music. This can be a key part of many rhythm and music games, and often involves a unique and dynamic gameplay experience.",
   :rdfs/label "Music-Based Procedural Generation",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Procedural_generation"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Music-Based%20Procedural%20Generation/"}})

(def Mystery
  "The Mystery tag is used for games that feature mystery or suspense. These games might involve solving mysteries and uncovering secrets."
  {:db/ident :steam/Mystery,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Mystery tag is used for games that feature mystery or suspense. These games might involve solving mysteries and uncovering secrets.",
   :rdfs/label "Mystery",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Mystery_fiction"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mystery/"}})

(def MysteryDungeon
  "Mystery Dungeon games are a sub-genre of role-playing games that feature randomly generated dungeons and turn-based combat."
  {:db/ident :steam/MysteryDungeon,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Mystery Dungeon games are a sub-genre of role-playing games that feature randomly generated dungeons and turn-based combat.",
   :rdfs/label "Mystery Dungeon",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Mystery_Dungeon"},
   :rdfs/subClassOf {:owl/intersectionOf [:steam/RPG :steam/Roguelike],
                     :rdf/type :owl/Class},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Mystery%20Dungeon/"}})

(def Mythology
  "The Mythology tag is used for games that feature mythology and may involve exploring mythological worlds, interacting with mythological creatures, or delving into mythological lore."
  {:db/ident :steam/Mythology,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Mythology tag is used for games that feature mythology and may involve exploring mythological worlds, interacting with mythological creatures, or delving into mythological lore.",
   :rdfs/label "Mythology",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Mythology"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Mythology/"}})

(def NSFW
  "A tag used to describe games that contain content not suitable for viewing at work or in public spaces, often due to explicit sexual or violent content."
  {:db/ident :steam/NSFW,
   :rdf/type [:steam/Rating :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that contain content not suitable for viewing at work or in public spaces, often due to explicit sexual or violent content.",
   :rdfs/label "NSFW",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/NSFW/"}})

(def Narration
  "Narration is a feature that involves a narrator telling a story. This can be a key part of many narrative-driven games, and often involves a focus on storytelling and atmosphere."
  {:db/ident :steam/Narration,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Narration is a feature that involves a narrator telling a story. This can be a key part of many narrative-driven games, and often involves a focus on storytelling and atmosphere.",
   :rdfs/label "Narration",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Narration"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Narration/"}})

(def Nature
  "The Nature tag is used for games that feature nature or natural environments and may involve exploring natural landscapes and interacting with wildlife."
  {:db/ident :steam/Nature,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Nature tag is used for games that feature nature or natural environments and may involve exploring natural landscapes and interacting with wildlife.",
   :rdfs/label "Nature",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Nature"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Nature/"}})

(def Naval
  "The Naval tag is used for games that feature naval or maritime elements as a significant aspect. These games might involve commanding naval vessels, engaging in naval combat, or exploring maritime environments."
  {:db/ident :steam/Naval,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Naval tag is used for games that feature naval or maritime elements as a significant aspect. These games might involve commanding naval vessels, engaging in naval combat, or exploring maritime environments.",
   :rdfs/label "Naval",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Naval/"}})

(def NavalCombat
  "Naval Combat is a feature that involves combat between ships or naval vessels. This can be a key part of many strategy and simulation games, and often involves a focus on tactics and positioning."
  {:db/ident :steam/NavalCombat,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Naval Combat is a feature that involves combat between ships or naval vessels. This can be a key part of many strategy and simulation games, and often involves a focus on tactics and positioning.",
   :rdfs/label "Naval Combat",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Naval_warfare"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Naval%20Combat/"}})

(def Ninja
  "The Ninja tag is used for games that feature ninjas or ninja-themed elements as a significant aspect. These games might involve playing as a ninja, using ninja tactics, or exploring a world influenced by ninja culture."
  {:db/ident :steam/Ninja,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Ninja tag is used for games that feature ninjas or ninja-themed elements as a significant aspect. These games might involve playing as a ninja, using ninja tactics, or exploring a world influenced by ninja culture.",
   :rdfs/label "Ninja",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Ninja"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Ninja/"}})

(def Noir
  "Noir is a visual style that is characterized by cynicism, fatalism, and moral ambiguity. It often uses a black-and-white aesthetic with high contrast and dramatic shadows."
  {:db/ident :steam/Noir,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Noir is a visual style that is characterized by cynicism, fatalism, and moral ambiguity. It often uses a black-and-white aesthetic with high contrast and dramatic shadows.",
   :rdfs/label "Noir",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Film_noir"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Noir/"}})

(def Nonlinear
  "Nonlinear is a feature that involves a non-predetermined path through the game. This can be a key part of many open-world and adventure games, and often involves a focus on exploration and player choice."
  {:db/ident :steam/Nonlinear,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Nonlinear is a feature that involves a non-predetermined path through the game. This can be a key part of many open-world and adventure games, and often involves a focus on exploration and player choice.",
   :rdfs/label "Nonlinear",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Nonlinear_gameplay"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Nonlinear/"}})

(def Nudity
  "A tag used to describe games that feature nudity in their visual or thematic content."
  {:db/ident :steam/Nudity,
   :rdf/type [:steam/Rating :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that feature nudity in their visual or thematic content.",
   :rdfs/label "Nudity",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Nudity/"}})

(def Offroad
  "The Offroad tag is used for games that might involve driving offroad vehicles, navigating challenging terrains, or exploring remote environments."
  {:db/ident :steam/Offroad,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Offroad tag is used for games that might involve driving offroad vehicles, navigating challenging terrains, or exploring remote environments.",
   :rdfs/label "Offroad",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Off-roading"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Offroad/"}})

(def OldSchool
  "The Old School tag is used for games that feature old school or retro elements as a significant aspect. These games might involve classic gameplay mechanics, retro graphics, or nostalgic themes."
  {:db/ident :steam/OldSchool,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Old School tag is used for games that feature old school or retro elements as a significant aspect. These games might involve classic gameplay mechanics, retro graphics, or nostalgic themes.",
   :rdfs/label "Old School",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Retrogaming"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Old%20School/"}})

(def OnRailsShooter
  "On-Rails Shooter games are a type of shooter game where the player's movement is automatically guided along a fixed path, or 'on rails'."
  {:db/ident :steam/OnRailsShooter,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "On-Rails Shooter games are a type of shooter game where the player's movement is automatically guided along a fixed path, or 'on rails'.",
   :rdfs/label "On-Rails Shooter",
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/On-Rails%20Shooter/"}})

(def OnlineCoop
  "Online Co-Op represents games that offer the option for players to play cooperatively over the internet. This feature is often found in action and role-playing games, promoting teamwork and social interaction among players."
  {:db/ident :steam/OnlineCoop,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Online Co-Op represents games that offer the option for players to play cooperatively over the internet. This feature is often found in action and role-playing games, promoting teamwork and social interaction among players.",
   :rdfs/label "Online Co-Op",
   :rdfs/subClassOf [:steam/Coop :schema/CoOp],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Online%20Co-Op/"}})

(def OpenWorld
  "Open World games provide a large, open environment for players to explore and interact with. They often allow players to choose their own objectives and play at their own pace."
  {:db/ident :steam/OpenWorld,
   :rdf/type [:steam/Feature :steam/Genre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Open World games provide a large, open environment for players to explore and interact with. They often allow players to choose their own objectives and play at their own pace.",
   :rdfs/label "Open World",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Open_world"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Open%20World/"}})

(def OpenWorldSurvivalCraft
  "Open World Survival Craft games are a type of survival game where players must gather resources, build their own items, and manage their needs, all while exploring an open world."
  {:db/ident :steam/OpenWorldSurvivalCraft,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Open World Survival Craft games are a type of survival game where players must gather resources, build their own items, and manage their needs, all while exploring an open world.",
   :rdfs/label "Open World Survival Craft",
   :rdfs/subClassOf [:steam/OpenWorld :steam/Survival],
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Open%20World%20Survival%20Craft/"}})

(def Other
  "A tag used to categorize other aspects of something on Steam."
  {:db/ident :steam/Other,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to categorize other aspects of something on Steam.",
   :rdfs/label "Other",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Otome
  "The Otome tag is used for games that are designed with the typical preferences of women in mind, and one of the main goals, besides the plot goal, is to develop a romantic relationship between the female player character and one of several male or female characters. This genre is most established in Japan, and is mostly made up of visual novels and simulation games."
  {:db/ident :steam/Otome,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Otome tag is used for games that are designed with the typical preferences of women in mind, and one of the main goals, besides the plot goal, is to develop a romantic relationship between the female player character and one of several male or female characters. This genre is most established in Japan, and is mostly made up of visual novels and simulation games.",
   :rdfs/label "Otome",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Otome_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Otome/"}})

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

(def Parkour
  "The Parkour tag is used for games that feature parkour or free-running elements as a significant aspect."
  {:db/ident :steam/Parkour,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Parkour tag is used for games that feature parkour or free-running elements as a significant aspect.",
   :rdfs/label "Parkour",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Parkour"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Parkour/"}})

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

(def PermaDeath
  "Perma Death is a feature that involves permanent death for player characters. This can be a key part of many roguelike and survival games, and often involves a high level of challenge and tension."
  {:db/ident :steam/PermaDeath,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Perma Death is a feature that involves permanent death for player characters. This can be a key part of many roguelike and survival games, and often involves a high level of challenge and tension.",
   :rdfs/label "Perma Death",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Permadeath"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Perma%20Death/"}})

(def Philosophical
  "The Philosophical tag is used for games that feature philosophical themes or thought-provoking elements."
  {:db/ident :steam/Philosophical,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Philosophical tag is used for games that feature philosophical themes or thought-provoking elements.",
   :rdfs/label "Philosophical",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Philosophy"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Philosophical/"}})

(def PhotoEditing
  "Software that is used for photo editing. This can include image editors, photo manipulation software, and more."
  {:db/ident :steam/PhotoEditing,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for photo editing. This can include image editors, photo manipulation software, and more.",
   :rdfs/label "Photo Editing",
   :schema/applicationCategory "DesignApplication",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Photo%20Editing/"}})

(def Physics
  "Physics is a feature that involves the simulation of physical systems. This can be a key part of many simulation and puzzle games, and often involves a focus on realism and interactivity."
  {:db/ident :steam/Physics,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Physics is a feature that involves the simulation of physical systems. This can be a key part of many simulation and puzzle games, and often involves a focus on realism and interactivity.",
   :rdfs/label "Physics",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Physics_engine"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Physics/"}})

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

(def Pirates
  "The Pirates tag is used for games that feature pirates or piracy elements that might involve sailing pirate ships, engaging in pirate combat, or exploring a world influenced by pirate culture."
  {:db/ident :steam/Pirates,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Pirates tag is used for games that feature pirates or piracy elements that might involve sailing pirate ships, engaging in pirate combat, or exploring a world influenced by pirate culture.",
   :rdfs/label "Pirates",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Piracy"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Pirates/"}})

(def PixelGraphics
  "Pixel Graphics refers to a visual style that uses pixel art, where images are created on the pixel level. This style is often associated with early video games."
  {:db/ident :steam/PixelGraphics,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Pixel Graphics refers to a visual style that uses pixel art, where images are created on the pixel level. This style is often associated with early video games.",
   :rdfs/label "Pixel Graphics",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Pixel_art"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Pixel%20Graphics/"}})

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
  "A tag used to describe the game play modes supported by a game on Steam."
  {:db/ident :steam/Players,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to describe the game play modes supported by a game on Steam.",
   :rdfs/label "Players",
   :rdfs/subClassOf [:schema/GamePlayMode :steam/Tag :schema/Thing]})

(def PointAndClick
  "Point & Click games involve interacting with the environment and solving puzzles through a point-and-click interface."
  {:db/ident :steam/PointAndClick,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Point & Click games involve interacting with the environment and solving puzzles through a point-and-click interface.",
   :rdfs/label "Point & Click",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Point%20&%20Click/"}})

(def Political
  "The Political tag is often associated with games that deal with political science concepts. This could include the theoretical analysis of political systems, their origins, underlying values, and goals."
  {:db/ident :steam/Political,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Political tag is often associated with games that deal with political science concepts. This could include the theoretical analysis of political systems, their origins, underlying values, and goals.",
   :rdfs/label "Political",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Politics"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Political/"}})

(def PoliticalSim
  "Political Sim games are a type of simulation game where players simulate the politics and government of a nation or civilization."
  {:db/ident :steam/PoliticalSim,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Political Sim games are a type of simulation game where players simulate the politics and government of a nation or civilization.",
   :rdfs/label "Political Sim",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Government_simulation_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Political%20Sim/"}})

(def Politics
  "The Politics tag generally refers to games that involve activities related to governance or influencing the way a country or organization is governed. This could include decision-making processes, implementation of laws and norms within a game's universe, or strategies aimed at improving the lives of the game's characters."
  {:db/ident :steam/Politics,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Politics tag generally refers to games that involve activities related to governance or influencing the way a country or organization is governed. This could include decision-making processes, implementation of laws and norms within a game's universe, or strategies aimed at improving the lives of the game's characters.",
   :rdfs/label "Politics",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Politics"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Politics/"}})

(def Pool
  "The Pool tag is used for games that feature pool or billiards elements."
  {:db/ident :steam/Pool,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Pool tag is used for games that feature pool or billiards elements.",
   :rdfs/label "Pool",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Cue_sports"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Pool/"}})

(def PostApocalyptic
  "The Post-apocalyptic tag is used for games that feature post-apocalyptic themes."
  {:db/ident :steam/PostApocalyptic,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Post-apocalyptic tag is used for games that feature post-apocalyptic themes.",
   :rdfs/label "Post-apocalyptic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Post-apocalyptic"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Post-apocalyptic/"}})

(def PrecisionPlatformer
  "Precision Platformer games are a sub-genre of platformer games that require precise control and timing."
  {:db/ident :steam/PrecisionPlatformer,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Precision Platformer games are a sub-genre of platformer games that require precise control and timing.",
   :rdfs/label "Precision Platformer",
   :rdfs/subClassOf :steam/Platformer,
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Precision%20Platformer/"}})

(def ProceduralGeneration
  "Procedural Generation is a feature that involves generating game content algorithmically rather than manually. This can be a key part of many roguelike and sandbox games, and often involves a high level of replayability."
  {:db/ident :steam/ProceduralGeneration,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Procedural Generation is a feature that involves generating game content algorithmically rather than manually. This can be a key part of many roguelike and sandbox games, and often involves a high level of replayability.",
   :rdfs/label "Procedural Generation",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Procedural_generation"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Procedural%20Generation/"}})

(def Programming
  "Programming games are games where the player has limited direct control over the game characters, and completes levels or achieves goals by programming game elements."
  {:db/ident :steam/Programming,
   :rdf/type
   [:steam/ThemeAndMood :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Programming games are games where the player has limited direct control over the game characters, and completes levels or achieves goals by programming game elements.",
   :rdfs/label "Programming",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Programming_game"},
   :rdfs/subClassOf :steam/Simulation,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Programming/"}})

(def Psychedelic
  "Psychedelic is a visual style that is characterized by the distortion of reality, vibrant colors, and complex, often surreal imagery."
  {:db/ident :steam/Psychedelic,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Psychedelic is a visual style that is characterized by the distortion of reality, vibrant colors, and complex, often surreal imagery.",
   :rdfs/label "Psychedelic",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Psychedelia"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Psychedelic/"}})

(def Psychological
  "A tag used to describe games that explore psychological themes or have a psychological impact on the player."
  {:db/ident :steam/Psychological,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that explore psychological themes or have a psychological impact on the player.",
   :rdfs/label "Psychological",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Psychological/"}})

(def Puzzle
  "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience."
  {:db/ident :steam/Puzzle,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Puzzle games focus on problem solving and logical thinking. They challenge the player to solve head-scratching puzzles and often offer a slower paced, more relaxing gaming experience.",
   :rdfs/label "Puzzle",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Puzzle_video_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Puzzle/"}})

(def PvE
  "PvE (Player versus Environment) is a feature that involves players battling against computer-controlled enemies or challenges. This can be a key part of many role-playing and action games, and often involves a focus on cooperation and teamwork."
  {:db/ident :steam/PvE,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "PvE (Player versus Environment) is a feature that involves players battling against computer-controlled enemies or challenges. This can be a key part of many role-playing and action games, and often involves a focus on cooperation and teamwork.",
   :rdfs/label "PvE",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Player_versus_environment"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/PvE/"}})

(def PvP
  "PvP (Player versus Player) is a feature that involves players battling against each other. This can be a key part of many competitive and multiplayer games, and often involves a focus on skill and competition."
  {:db/ident :steam/PvP,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "PvP (Player versus Player) is a feature that involves players battling against each other. This can be a key part of many competitive and multiplayer games, and often involves a focus on skill and competition.",
   :rdfs/label "PvP",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Player_versus_player"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/PvP/"}})

(def QuickTimeEvents
  "Quick-Time Events is a feature that involves timed inputs during cinematic sequences. This can be a key part of many action and adventure games, and often involves a focus on timing and reflexes."
  {:db/ident :steam/QuickTimeEvents,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Quick-Time Events is a feature that involves timed inputs during cinematic sequences. This can be a key part of many action and adventure games, and often involves a focus on timing and reflexes.",
   :rdfs/label "Quick-Time Events",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Quick_time_event"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Quick-Time%20Events/"}})

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

(def RPGMaker
  "Software that is used to create role-playing games. RPGMaker is also a specific brand of game development software that allows users to create their own RPGs."
  {:db/ident :steam/RPGMaker,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used to create role-playing games. RPGMaker is also a specific brand of game development software that allows users to create their own RPGs.",
   :rdfs/label "RPGMaker",
   :schema/applicationCategory ["GameApplication" "DeveloperApplication"],
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/RPGMaker/"}})

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

(def Rating
  "A tag used to rate something on Steam."
  {:db/ident        :steam/Rating,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to rate something on Steam.",
   :rdfs/label      "Rating",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def RealTime
  "Real-Time represents games that occur in real-time, where game events progress continuously according to the game clock. This feature is often found in strategy and simulation games, requiring players to make decisions in the moment."
  {:db/ident :steam/RealTime,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Real-Time represents games that occur in real-time, where game events progress continuously according to the game clock. This feature is often found in strategy and simulation games, requiring players to make decisions in the moment.",
   :rdfs/label "Real-Time",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Turns,_rounds_and_time-keeping_systems_in_games"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Real-Time/"}})

(def RealTimeTactics
  "Real Time Tactics games are a type of strategy game that focuses on tactical and operational aspects of warfare, as opposed to strategic or grand strategy."
  {:db/ident :steam/RealTimeTactics,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Real Time Tactics games are a type of strategy game that focuses on tactical and operational aspects of warfare, as opposed to strategic or grand strategy.",
   :rdfs/label "Real Time Tactics",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Real-time_tactics"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Real%20Time%20Tactics/"}})

(def RealTimeWithPause
  "Real-Time with Pause represents games that occur in real-time but allow the player to pause the game. This feature is often found in strategy and role-playing games, allowing players to plan actions while the game is paused."
  {:db/ident :steam/RealTimeWithPause,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Real-Time with Pause represents games that occur in real-time but allow the player to pause the game. This feature is often found in strategy and role-playing games, allowing players to plan actions while the game is paused.",
   :rdfs/label "Real-Time with Pause",
   :rdfs/seeAlso
   {:rdfa/uri
    "http://dbpedia.org/resource/Turns,_rounds_and_time-keeping_systems_in_games"},
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Real-Time%20with%20Pause/"}})

(def Realistic
  "Realistic refers to a visual style that attempts to represent the physical world in a realistic manner. It often features detailed textures, accurate lighting, and complex models."
  {:db/ident :steam/Realistic,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Realistic refers to a visual style that attempts to represent the physical world in a realistic manner. It often features detailed textures, accurate lighting, and complex models.",
   :rdfs/label "Realistic",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Realistic/"}})

(def Relaxing
  "A tag used to describe games that have a calming or relaxing effect on the player."
  {:db/ident :steam/Relaxing,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that have a calming or relaxing effect on the player.",
   :rdfs/label "Relaxing",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Relaxing/"}})

(def Remake
  "Remake represents games that are remakes of previous games. These games often feature updated graphics, gameplay, and content, while preserving the original game's core experience."
  {:db/ident :steam/Remake,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Remake represents games that are remakes of previous games. These games often feature updated graphics, gameplay, and content, while preserving the original game's core experience.",
   :rdfs/label "Remake",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Video_game_remake"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Remake/"}})

(def ReplayValue
  "A tag used to describe games that offer a high level of replayability, often through branching narratives, procedural generation, or varied gameplay mechanics."
  {:db/ident :steam/ReplayValue,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that offer a high level of replayability, often through branching narratives, procedural generation, or varied gameplay mechanics.",
   :rdfs/label "Replay Value",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Replay%20Value/"}})

(def ResourceManagement
  "Resource Management is a feature that involves managing resources to achieve goals. This can be a key part of many strategy and simulation games, and often involves a focus on planning and strategy."
  {:db/ident :steam/ResourceManagement,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Resource Management is a feature that involves managing resources to achieve goals. This can be a key part of many strategy and simulation games, and often involves a focus on planning and strategy.",
   :rdfs/label "Resource Management",
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Resource%20Management/"}})

(def Retro
  "The Retro tag is used for games that feature retro or vintage elements as a significant aspect. These games might involve retro graphics, vintage soundtracks, or gameplay mechanics reminiscent of older games."
  {:db/ident :steam/Retro,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Retro tag is used for games that feature retro or vintage elements as a significant aspect. These games might involve retro graphics, vintage soundtracks, or gameplay mechanics reminiscent of older games.",
   :rdfs/label "Retro",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Retrogaming"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Retro/"}})

(def Rhythm
  "Rhythm games challenge players to follow the beat or rhythm of music tracks."
  {:db/ident :steam/Rhythm,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Rhythm games challenge players to follow the beat or rhythm of music tracks.",
   :rdfs/label "Rhythm",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Rhythm_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Rhythm/"}})

(def Robots
  "The Robots tag is used for games that feature robots or robotics elements."
  {:db/ident :steam/Robots,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Robots tag is used for games that feature robots or robotics elements.",
   :rdfs/label "Robots",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Robot"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Robots/"}})

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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Roguelite games feature procedurally generated levels, permadeath, and other elements of roguelikes. They are characterized by their difficulty and replayability.",
   :rdfs/label "Roguelite",
   :rdfs/subClassOf :steam/Roguelike,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Roguelite/"}})

(def Roguevania
  "Roguevania games are a sub-genre of action-adventure games that combine elements of roguelike and metroidvania games."
  {:db/ident :steam/Roguevania,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Roguevania games are a sub-genre of action-adventure games that combine elements of roguelike and metroidvania games.",
   :rdfs/label "Roguevania",
   :rdfs/subClassOf {:owl/intersectionOf [:steam/Roguelike :steam/Metroidvania],
                     :rdf/type :owl/Class},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Roguevania/"}})

(def Romance
  "The Romance tag is used for games that feature romance or romantic elements."
  {:db/ident :steam/Romance,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Romance tag is used for games that feature romance or romantic elements.",
   :rdfs/label "Romance",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Romance_(love)"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Romance/"}})

(def Rome
  "The Rome tag is used for games that feature Rome or Roman elements and may involve Roman history or Roman mythology."
  {:db/ident :steam/Rome,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Rome tag is used for games that feature Rome or Roman elements and may involve Roman history or Roman mythology.",
   :rdfs/label "Rome",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Ancient_Rome"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Rome/"}})

(def Runner
  "Runner games are a type of action game where the player character is continuously moving forward and the player must control their actions to avoid obstacles and collect items."
  {:db/ident :steam/Runner,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Runner games are a type of action game where the player character is continuously moving forward and the player must control their actions to avoid obstacles and collect items.",
   :rdfs/label "Runner",
   :rdfs/subClassOf :steam/Action,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Runner/"}})

(def Sailing
  "Sailing is a feature that involves the navigation of watercraft. This can be a key part of many adventure and simulation games, and often involves a focus on exploration and strategy."
  {:db/ident :steam/Sailing,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Sailing is a feature that involves the navigation of watercraft. This can be a key part of many adventure and simulation games, and often involves a focus on exploration and strategy.",
   :rdfs/label "Sailing",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sailing_(sport)"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sailing/"}})

(def Sandbox
  "Sandbox games allow players to explore, create, and manipulate their environment with few imposed goals or restrictions."
  {:db/ident :steam/Sandbox,
   :rdf/type [:steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Sandbox games allow players to explore, create, and manipulate their environment with few imposed goals or restrictions.",
   :rdfs/label "Sandbox",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sandbox_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sandbox/"}})

(def Satire
  "The Satire tag is used for games that feature satirical humor, satirical commentary, or satirical themes."
  {:db/ident :steam/Satire,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Satire tag is used for games that feature satirical humor, satirical commentary, or satirical themes.",
   :rdfs/label "Satire",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Satire"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Satire/"}})

(def SciFi
  "The Sci-fi tag is used for games that feature science fiction or sci-fi elements as a significant aspect. These games might involve futuristic technology, alien worlds, or themes common in science fiction."
  {:db/ident :steam/SciFi,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Sci-fi tag is used for games that feature science fiction or sci-fi elements as a significant aspect. These games might involve futuristic technology, alien worlds, or themes common in science fiction.",
   :rdfs/label "Sci-fi",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Science_fiction"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sci-fi/"}})

(def Science
  "The Science tag is used for games may involve scientific concepts, scientific exploration, or settings based on scientific theories."
  {:db/ident :steam/Science,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Science tag is used for games may involve scientific concepts, scientific exploration, or settings based on scientific theories.",
   :rdfs/label "Science",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Science"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Science/"}})

(def ScoreAttack
  "Score Attack is a feature that involves trying to achieve the highest score possible. This can be a key part of many arcade and action games, and often involves a focus on skill and competition."
  {:db/ident :steam/ScoreAttack,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Score Attack is a feature that involves trying to achieve the highest score possible. This can be a key part of many arcade and action games, and often involves a focus on skill and competition.",
   :rdfs/label "Score Attack",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Score_attack"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Score%20Attack/"}})

(def Sequel
  "Sequel represents games that are sequels to previous games. These games often continue the story, themes, and gameplay of the original game, while introducing new content and improvements."
  {:db/ident :steam/Sequel,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Sequel represents games that are sequels to previous games. These games often continue the story, themes, and gameplay of the original game, while introducing new content and improvements.",
   :rdfs/label "Sequel",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sequel"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sequel/"}})

(def SexualContent
  "A tag used to describe games that contain explicit sexual themes or content."
  {:db/ident :steam/SexualContent,
   :rdf/type [:steam/Rating :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that contain explicit sexual themes or content.",
   :rdfs/label "Sexual Content",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Sexual%20Content/"}})

(def ShootEmUp
  "Shoot 'Em Up games are a sub-genre of shooter games where the player controls a character or vehicle and fights large numbers of enemies using shooting."
  {:db/ident :steam/ShootEmUp,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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

(def ShortClass
  "A tag used to describe games that can be completed in a relatively short amount of time."
  {:db/ident :steam/Short,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that can be completed in a relatively short amount of time.",
   :rdfs/label "Short",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Short/"}})

(def SideScroller
  "Side Scroller games are a type of game in which gameplay is viewed from a side-view camera angle, and the characters move from the left side of the screen to the right (or vice versa)."
  {:db/ident :steam/SideScroller,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Side Scroller games are a type of game in which gameplay is viewed from a side-view camera angle, and the characters move from the left side of the screen to the right (or vice versa).",
   :rdfs/label "Side Scroller",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Side-scrolling_video_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Side%20Scroller/"}})

(def SilentProtagonist
  "Silent Protagonist is a feature that involves the main character of the game being silent. This can be a key part of many games, and often involves a focus on narrative and player immersion."
  {:db/ident :steam/SilentProtagonist,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Silent Protagonist is a feature that involves the main character of the game being silent. This can be a key part of many games, and often involves a focus on narrative and player immersion.",
   :rdfs/label "Silent Protagonist",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Silent_protagonist"},
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Silent%20Protagonist/"}})

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

(def Singleplayer
  "Singleplayer represents games that offer the option for a single player to play alone. This feature is often found in action, adventure, and role-playing games, fostering narrative and character development."
  {:db/ident :steam/Singleplayer,
   :rdf/type
   [:steam/Players :owl/Class :steam/Tag :schema/GamePlayMode :schema/Thing],
   :rdfs/comment
   "Singleplayer represents games that offer the option for a single player to play alone. This feature is often found in action, adventure, and role-playing games, fostering narrative and character development.",
   :rdfs/label "Singleplayer",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Single-player_video_game"},
   :rdfs/subClassOf :schema/SinglePlayer,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Singleplayer/"}})

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

(def Sniper
  "The Sniper tag is used for games that feature sniper or sniping elements. These games might involve sniper rifles, sniper missions, or gameplay mechanics focused on precision and patience."
  {:db/ident :steam/Sniper,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Sniper tag is used for games that feature sniper or sniping elements. These games might involve sniper rifles, sniper missions, or gameplay mechanics focused on precision and patience.",
   :rdfs/label "Sniper",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sniper"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sniper/"}})

(def Snow
  "The Snow tag is used for games that feature snow or snowy environments. These games might involve snow landscapes or snow sports."
  {:db/ident :steam/Snow,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Snow tag is used for games that feature snow or snowy environments. These games might involve snow landscapes or snow sports.",
   :rdfs/label "Snow",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Snow"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Snow/"}})

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
  "A tag used to categorize software on Steam."
  {:db/ident        :steam/Software,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A tag used to categorize software on Steam.",
   :rdfs/label      "Software",
   :rdfs/subClassOf [:schema/SoftwareApplication :steam/Tag :schema/Thing]})

(def SoftwareTag
  "General software that doesn't fit into any other category."
  {:db/ident     :steam/SoftwareTag,
   :rdf/type     [:steam/Software
                  :owl/Class
                  :schema/Thing
                  :steam/Tag
                  :schema/SoftwareApplication],
   :rdfs/comment "General software that doesn't fit into any other category.",
   :rdfs/label   "Software",
   :schema/applicationCategory "UtilitiesApplication",
   :schema/url   {:rdfa/uri
                  "https://store.steampowered.com/tags/en/Software/"}})

(def SoftwareTraining
  "Software that is used for training purposes. This can include tutorial software, educational software, and more."
  {:db/ident :steam/SoftwareTraining,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for training purposes. This can include tutorial software, educational software, and more.",
   :rdfs/label "Software Training",
   :schema/applicationCategory "EducationalApplication",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Software%20Training/"}})

(def Sokoban
  "Sokoban games are a type of puzzle game where the player pushes boxes or crates around in a warehouse, trying to get them to storage locations."
  {:db/ident :steam/Sokoban,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Sokoban games are a type of puzzle game where the player pushes boxes or crates around in a warehouse, trying to get them to storage locations.",
   :rdfs/label "Sokoban",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sokoban"},
   :rdfs/subClassOf :steam/Puzzle,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sokoban/"}})

(def Solitaire
  "Solitaire games are a type of card game that can be played by a single player."
  {:db/ident :steam/Solitaire,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Souls-like games are a sub-genre of action RPGs that include elements of challenging combat, exploration, and character development, inspired by the Dark Souls series.",
   :rdfs/label "Souls-like",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Souls_(series)"},
   :rdfs/subClassOf :steam/ActionRPG,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Souls-like/"}})

(def Soundtrack
  "Soundtrack represents games that are notable for their soundtrack. These games often feature original music that enhances the game's atmosphere, narrative, and emotional impact."
  {:db/ident :steam/Soundtrack,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Soundtrack represents games that are notable for their soundtrack. These games often feature original music that enhances the game's atmosphere, narrative, and emotional impact.",
   :rdfs/label "Soundtrack",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Soundtrack"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Soundtrack/"}})

(def Space
  "The Space tag is used for games that feature space or space exploration as a significant aspect. These games might involve space travel, alien planets, or settings in outer space."
  {:db/ident :steam/Space,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Space tag is used for games that feature space or space exploration as a significant aspect. These games might involve space travel, alien planets, or settings in outer space.",
   :rdfs/label "Space",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Outer_space"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Space/"}})

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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Spectacle Fighter games are a sub-genre of action games that feature fast-paced combat with flashy, over-the-top attacks and combos.",
   :rdfs/label "Spectacle Fighter",
   :rdfs/subClassOf [:steam/Fighting :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Spectacle%20Fighter/"}})

(def Spelling
  "Spelling games are a type of educational game that focuses on the correct spelling of words."
  {:db/ident :steam/Spelling,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Spelling games are a type of educational game that focuses on the correct spelling of words.",
   :rdfs/label "Spelling",
   :rdfs/subClassOf :steam/Education,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Spelling/"}})

(def SplitScreen
  "Split Screen refers to a display technique that divides the screen into two or more parts to show multiple perspectives or players simultaneously."
  {:db/ident :steam/SplitScreen,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Split Screen refers to a display technique that divides the screen into two or more parts to show multiple perspectives or players simultaneously.",
   :rdfs/label "Split Screen",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Split_screen_(computing)"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Split%20Screen/"}})

(def Sports
  "Sports games simulate the practice of traditional physical sports. This can be team sports such as soccer, basketball, or individual activities like golf, fishing, skateboarding."
  {:db/ident :steam/Sports,
   :rdf/type [:steam/TopLevelGenre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Sports games simulate the practice of traditional physical sports. This can be team sports such as soccer, basketball, or individual activities like golf, fishing, skateboarding.",
   :rdfs/label "Sports",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Sports_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Sports/"}})

(def StarWars
  "Star Wars represents games that are based on the Star Wars franchise. These games often feature elements of space opera, including epic battles, and themes of good versus evil."
  {:db/ident :steam/StarWars,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Star Wars represents games that are based on the Star Wars franchise. These games often feature elements of space opera, including epic battles, and themes of good versus evil.",
   :rdfs/label "Star Wars",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Star_Wars"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Star%20Wars/"}})

(def Stealth
  "Stealth games challenge players to avoid detection, often by sneaking past enemies or obstacles."
  {:db/ident :steam/Stealth,
   :rdf/type [:steam/Feature
              :steam/ThemeAndMood
              :steam/Genre
              :owl/Class
              :steam/Tag
              :schema/Thing],
   :rdfs/comment
   "Stealth games challenge players to avoid detection, often by sneaking past enemies or obstacles.",
   :rdfs/label "Stealth",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Stealth_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Stealth/"}})

(def SteamMachine
  "A tag used to describe games that are compatible with the Steam Machine, a gaming console developed by Valve Corporation."
  {:db/ident :steam/SteamMachine,
   :rdf/type [:steam/Input :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that are compatible with the Steam Machine, a gaming console developed by Valve Corporation.",
   :rdfs/label "Steam Machine",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Steam%20Machine/"}})

(def Steampunk
  "A subgenre of science fiction characterized by the setting of an alternate history—typically Victorian era or American 'Wild West'—where steam power remains a primary technology. It combines retro futuristic technology and aesthetics, often inspired by 19th-century industrial steam-powered machinery."
  {:db/ident :steam/Steampunk,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A subgenre of science fiction characterized by the setting of an alternate history—typically Victorian era or American 'Wild West'—where steam power remains a primary technology. It combines retro futuristic technology and aesthetics, often inspired by 19th-century industrial steam-powered machinery.",
   :rdfs/label "Steampunk",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Steampunk"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Steampunk/"}})

(def StoryRich
  "Story Rich is a feature that involves a strong emphasis on narrative. This can be a key part of many adventure and role-playing games, and often involves a focus on character development and world-building."
  {:db/ident :steam/StoryRich,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Story Rich is a feature that involves a strong emphasis on narrative. This can be a key part of many adventure and role-playing games, and often involves a focus on character development and world-building.",
   :rdfs/label "Story Rich",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Interactive_narrative"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Story%20Rich/"}})

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

(def Stylized
  "Stylized refers to a visual style that distorts or exaggerates certain elements for expressive or artistic effect."
  {:db/ident :steam/Stylized,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Stylized refers to a visual style that distorts or exaggerates certain elements for expressive or artistic effect.",
   :rdfs/label "Stylized",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Stylized/"}})

(def SubGenre
  "A sub-genre used to categorize a game on Steam."
  {:db/ident        :steam/SubGenre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A sub-genre used to categorize a game on Steam.",
   :rdfs/label      "Sub-Genre",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def Submarine
  "The Submarine tag is used for games that feature submarines or submarine-based gameplay."
  {:db/ident :steam/Submarine,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Submarine tag is used for games that feature submarines or submarine-based gameplay.",
   :rdfs/label "Submarine",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Submarine"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Submarine/"}})

(def Superhero
  "The Superhero tag is used for games that feature superhero themes."
  {:db/ident :steam/Superhero,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Superhero tag is used for games that feature superhero themes.",
   :rdfs/label "Superhero",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Superhero"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Superhero/"}})

(def Supernatural
  "The Supernatural tag is used for games that feature supernatural themes."
  {:db/ident :steam/Supernatural,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Supernatural tag is used for games that feature supernatural themes.",
   :rdfs/label "Supernatural",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Supernatural"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Supernatural/"}})

(def Surreal
  "The Surreal tag is used for games that feature surreal or surrealistic elements as a significant aspect. These games might involve dream-like landscapes, bizarre characters, or gameplay mechanics that defy reality."
  {:db/ident :steam/Surreal,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Surreal tag is used for games that feature surreal or surrealistic elements as a significant aspect. These games might involve dream-like landscapes, bizarre characters, or gameplay mechanics that defy reality.",
   :rdfs/label "Surreal",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Surrealism"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Surreal/"}})

(def Survival
  "Survival games challenge players to survive in a hostile environment, often by gathering resources, crafting tools, and building shelters."
  {:db/ident :steam/Survival,
   :rdf/type
   [:steam/ThemeAndMood :steam/Genre :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Survival games challenge players to survive in a hostile environment, often by gathering resources, crafting tools, and building shelters.",
   :rdfs/label "Survival",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Survival_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Survival/"}})

(def SurvivalHorror
  "Survival Horror games are a sub-genre of horror games that focus on survival of the character and the fear of the unknown."
  {:db/ident :steam/SurvivalHorror,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Survival Horror games are a sub-genre of horror games that focus on survival of the character and the fear of the unknown.",
   :rdfs/label "Survival Horror",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Survival_horror"},
   :rdfs/subClassOf {:owl/intersectionOf [:steam/Horror :steam/Survival],
                     :rdf/type :owl/Class},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Survival%20Horror/"}})

(def Swordplay
  "The Swordplay tag is used for games that feature sword fights, historical fencing, or gameplay mechanics focused on swordplay."
  {:db/ident :steam/Swordplay,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Swordplay tag is used for games that feature sword fights, historical fencing, or gameplay mechanics focused on swordplay.",
   :rdfs/label "Swordplay",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Swordsmanship"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Swordplay/"}})

(def Tabletop
  "Tabletop games are those that are normally played on a table or other flat surface, such as board games, card games, dice games, miniatures wargames, tile-based games and role-playing games. In the digital context, these games are often adaptations of traditional tabletop games."
  {:db/ident :steam/Tabletop,
   :rdf/type
   [:steam/Feature :steam/TopLevelGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Tabletop games are those that are normally played on a table or other flat surface, such as board games, card games, dice games, miniatures wargames, tile-based games and role-playing games. In the digital context, these games are often adaptations of traditional tabletop games.",
   :rdfs/label "Tabletop",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Tabletop_game"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Tabletop/"}})

(def Tactical
  "The Tactical tag is used for games that feature tactical or strategy-based gameplay as a significant aspect. These games might involve tactical combat, strategic planning, or gameplay mechanics focused on tactics."
  {:db/ident :steam/Tactical,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Tactical tag is used for games that feature tactical or strategy-based gameplay as a significant aspect. These games might involve tactical combat, strategic planning, or gameplay mechanics focused on tactics.",
   :rdfs/label "Tactical",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Tactical/"}})

(def TacticalRPG
  "Tactical RPG games are a sub-genre of role-playing games that focus on tactical and strategic battles, often using turn-based combat."
  {:db/ident :steam/TacticalRPG,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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

(def Tanks
  "The Tanks tag is used for games that feature tanks or tank-based combat."
  {:db/ident :steam/Tanks,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Tanks tag is used for games that feature tanks or tank-based combat.",
   :rdfs/label "Tanks",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Tank"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Tanks/"}})

(def TeamBased
  "Team-Based is a feature that involves cooperation with other players to achieve goals. This can be a key part of many multiplayer and competitive games, and often involves a focus on teamwork and communication."
  {:db/ident :steam/TeamBased,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Team-Based is a feature that involves cooperation with other players to achieve goals. This can be a key part of many multiplayer and competitive games, and often involves a focus on teamwork and communication.",
   :rdfs/label "Team-Based",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Team_sport"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Team-Based/"}})

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

(def TextBased
  "Text-Based refers to a style of game where the visuals are primarily composed of text. These games often rely heavily on narrative and allow for extensive player imagination."
  {:db/ident :steam/TextBased,
   :rdf/type [:steam/Feature
              :steam/VisualsAndViewpoint
              :owl/Class
              :steam/Tag
              :schema/Thing],
   :rdfs/comment
   "Text-Based refers to a style of game where the visuals are primarily composed of text. These games often rely heavily on narrative and allow for extensive player imagination.",
   :rdfs/label "Text-Based",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Text-based_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Text-Based/"}})

(def ThemeAndMood
  "A tag used to describe the themes and moods of something on Steam."
  {:db/ident :steam/ThemeAndMood,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to describe the themes and moods of something on Steam.",
   :rdfs/label "Theme and Mood",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def ThirdPerson
  "Third Person refers to a perspective in which the player views the game world from over the shoulder or behind the main character."
  {:db/ident :steam/ThirdPerson,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Third Person refers to a perspective in which the player views the game world from over the shoulder or behind the main character.",
   :rdfs/label "Third Person",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Third%20Person/"}})

(def ThirdPersonShooter
  "Third-Person Shooter games are a sub-genre of shooter games where the player views the game from a third-person perspective, usually behind the character they are controlling."
  {:db/ident :steam/ThirdPersonShooter,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Third-Person Shooter games are a sub-genre of shooter games where the player views the game from a third-person perspective, usually behind the character they are controlling.",
   :rdfs/label "Third-Person Shooter",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Third-person_shooter"},
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Third-Person%20Shooter/"}})

(def Thriller
  "The Thriller tag is used for games that feature suspenseful narratives, thrilling scenarios, or gameplay mechanics focused on creating tension."
  {:db/ident :steam/Thriller,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Thriller tag is used for games that feature suspenseful narratives, thrilling scenarios, or gameplay mechanics focused on creating tension.",
   :rdfs/label "Thriller",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Thriller_(genre)"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Thriller/"}})

(def TimeAttack
  "Time Attack represents games that feature a time attack mode, where players aim to complete a level or task in the shortest time possible. This feature is often found in racing and platformer games, promoting speed and skill."
  {:db/ident :steam/TimeAttack,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Time Attack represents games that feature a time attack mode, where players aim to complete a level or task in the shortest time possible. This feature is often found in racing and platformer games, promoting speed and skill.",
   :rdfs/label "Time Attack",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Time%20Attack/"}})

(def TimeManagement
  "Time Management games are a sub-genre of strategy games that require the player to complete specific tasks within a certain timeframe to succeed."
  {:db/ident :steam/TimeManagement,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Time Management games are a sub-genre of strategy games that require the player to complete specific tasks within a certain timeframe to succeed.",
   :rdfs/label "Time Management",
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Time%20Management/"}})

(def TimeManipulation
  "Time Manipulation is a feature that involves the control of time as a gameplay mechanic. This can be a key part of many action and puzzle games, and often involves a focus on strategy and problem-solving."
  {:db/ident :steam/TimeManipulation,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Time Manipulation is a feature that involves the control of time as a gameplay mechanic. This can be a key part of many action and puzzle games, and often involves a focus on strategy and problem-solving.",
   :rdfs/label "Time Manipulation",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Time_manipulation"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Time%20Manipulation/"}})

(def TimeTravel
  "The Time Travel tag is used for games that feature traveling through time, changing history, or gameplay mechanics focused on time manipulation."
  {:db/ident :steam/TimeTravel,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Time Travel tag is used for games that feature traveling through time, changing history, or gameplay mechanics focused on time manipulation.",
   :rdfs/label "Time Travel",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Time_travel"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Time%20Travel/"}})

(def TopDown
  "Top-Down refers to a perspective in which the player views the game world from above, often used in strategy and simulation games."
  {:db/ident :steam/TopDown,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Top-Down refers to a perspective in which the player views the game world from above, often used in strategy and simulation games.",
   :rdfs/label "Top-Down",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Top-down_perspective"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Top-Down/"}})

(def TopDownShooter
  "Top-Down Shooter games are a sub-genre of shooter games where the player views the game from a top-down perspective, shooting enemies and avoiding obstacles from this viewpoint."
  {:db/ident :steam/TopDownShooter,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Top-Down Shooter games are a sub-genre of shooter games where the player views the game from a top-down perspective, shooting enemies and avoiding obstacles from this viewpoint.",
   :rdfs/label "Top-Down Shooter",
   :rdfs/subClassOf [:steam/Shooter :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Top-Down%20Shooter/"}})

(def TopLevelGenre
  "A top level genre used to categorize a game on Steam."
  {:db/ident        :steam/TopLevelGenre,
   :rdf/type        :owl/Class,
   :rdfs/comment    "A top level genre used to categorize a game on Steam.",
   :rdfs/label      "Top Level Genre",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def TouchFriendly
  "A tag used to describe games that are designed to be played on touch screen devices."
  {:db/ident :steam/TouchFriendly,
   :rdf/type [:steam/Input :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that are designed to be played on touch screen devices.",
   :rdfs/label "Touch-Friendly",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Touch-Friendly/"}})

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

(def TrackIR
  "A tag used to describe games that support TrackIR, a motion tracking technology that allows players to control game view by moving their head."
  {:db/ident :steam/TrackIR,
   :rdf/type [:steam/Input :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that support TrackIR, a motion tracking technology that allows players to control game view by moving their head.",
   :rdfs/label "TrackIR",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/TrackIR/"}})

(def Trading
  "Trading games are a type of game that focuses on trading goods and services, often in an economic simulation context."
  {:db/ident :steam/Trading,
   :rdf/type
   [:steam/Feature :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Trading games are a type of game that focuses on trading goods and services, often in an economic simulation context.",
   :rdfs/label "Trading",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Trading/"}})

(def TradingCardGame
  "Trading Card Game games are a type of card game where players use collectible cards to strategize and defeat their opponents."
  {:db/ident :steam/TradingCardGame,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Traditional Roguelike games are a sub-genre of roguelike games that adhere closely to the original roguelike design, featuring turn-based combat, grid-based movement, and permadeath.",
   :rdfs/label "Traditional Roguelike",
   :rdfs/subClassOf :steam/Roguelike,
   :schema/url
   {:rdfa/uri
    "https://store.steampowered.com/tags/en/Traditional%20Roguelike/"}})

(def Trains
  "The Trains tag is used for games that feature trains and might involve controlling a train, managing a railway, etc."
  {:db/ident :steam/Trains,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Trains tag is used for games that feature trains and might involve controlling a train, managing a railway, etc.",
   :rdfs/label "Trains",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Train"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Trains/"}})

(def Transhumanism
  "The Transhumanism tag is used for games that feature transhumanism and might involve cybernetic enhancements, artificial intelligence, or themes related to the post-human condition."
  {:db/ident :steam/Transhumanism,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Transhumanism tag is used for games that feature transhumanism and might involve cybernetic enhancements, artificial intelligence, or themes related to the post-human condition.",
   :rdfs/label "Transhumanism",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Transhumanism"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Transhumanism/"}})

(def Transportation
  "The Transportation tag is used for games that feature managing a transport network, controlling various vehicles, or gameplay mechanics focused on transportation."
  {:db/ident :steam/Transportation,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Transportation tag is used for games that feature managing a transport network, controlling various vehicles, or gameplay mechanics focused on transportation.",
   :rdfs/label "Transportation",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Transport"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Transportation/"}})

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

(def TurnBased
  "Turn-Based represents games that are played in turns, where players take turns to perform actions. This feature is often found in strategy and role-playing games, allowing for thoughtful planning and strategy."
  {:db/ident :steam/TurnBased,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Turn-Based represents games that are played in turns, where players take turns to perform actions. This feature is often found in strategy and role-playing games, allowing for thoughtful planning and strategy.",
   :rdfs/label "Turn-Based",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Turn-Based/"}})

(def TurnBasedCombat
  "Turn-Based Combat is a feature that involves combat mechanics where players take turns. This can be a key part of many role-playing and strategy games, and often involves a focus on planning and strategy."
  {:db/ident :steam/TurnBasedCombat,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Turn-Based Combat is a feature that involves combat mechanics where players take turns. This can be a key part of many role-playing and strategy games, and often involves a focus on planning and strategy.",
   :rdfs/label "Turn-Based Combat",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Turn-based_strategy"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Turn-Based%20Combat/"}})

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
   :rdf/type
   [:steam/Feature :steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Turn-Based Tactics games are a type of strategy game that features tactical combat in which players take turns to command their units.",
   :rdfs/label "Turn-Based Tactics",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Turn-based_tactics"},
   :rdfs/subClassOf [:steam/TurnBasedStrategy :steam/Strategy],
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Turn-Based%20Tactics/"}})

(def Tutorial
  "Tutorial is a feature that involves guided instructions or lessons to teach players how to play the game. This can be a key part of many games, and often involves a focus on learning and skill development."
  {:db/ident :steam/Tutorial,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Tutorial is a feature that involves guided instructions or lessons to teach players how to play the game. This can be a key part of many games, and often involves a focus on learning and skill development.",
   :rdfs/label "Tutorial",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Tutorial"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Tutorial/"}})

(def TwinStickShooter
  "Twin Stick Shooter games are a sub-genre of shooter games that use a dual-stick control scheme, where one stick controls movement and the other controls the direction of shooting."
  {:db/ident :steam/TwinStickShooter,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
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
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Typing games are a type of educational game that focuses on typing skills. Players are often tasked with typing words or phrases correctly and quickly to achieve goals in the game.",
   :rdfs/label "Typing",
   :rdfs/subClassOf :steam/Education,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Typing/"}})

(def Underground
  "The Underground tag is used for games that feature underground environments and might involve exploration of caves, dungeons, or other subterranean settings."
  {:db/ident :steam/Underground,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Underground tag is used for games that feature underground environments and might involve exploration of caves, dungeons, or other subterranean settings.",
   :rdfs/label "Underground",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Underground/"}})

(def Underwater
  "The Underwater tag is used for games that involve underwater exploration, marine life, or gameplay mechanics focused on underwater navigation."
  {:db/ident :steam/Underwater,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Underwater tag is used for games that involve underwater exploration, marine life, or gameplay mechanics focused on underwater navigation.",
   :rdfs/label "Underwater",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Underwater"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Underwater/"}})

(def Unforgiving
  "A tag used to describe games that are particularly challenging and do not offer much leniency to the player."
  {:db/ident :steam/Unforgiving,
   :rdf/type [:steam/Assessment :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "A tag used to describe games that are particularly challenging and do not offer much leniency to the player.",
   :rdfs/label "Unforgiving",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Unforgiving/"}})

(def Utilities
  "Software that is used for utility purposes. This can include system utilities, optimization software, and more."
  {:db/ident :steam/Utilities,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for utility purposes. This can include system utilities, optimization software, and more.",
   :rdfs/label "Utilities",
   :schema/applicationCategory "UtilitiesApplication",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Utilities/"}})

(def VR
  "VR, or Virtual Reality, refers to a technology that allows players to experience a game in a three-dimensional, interactive environment."
  {:db/ident :steam/VR,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "VR, or Virtual Reality, refers to a technology that allows players to experience a game in a three-dimensional, interactive environment.",
   :rdfs/label "VR",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Virtual_reality"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/VR/"}})

(def Vampire
  "The Vampire tag is used for games that feature vampire characters, vampire lore, or gameplay mechanics focused on vampiric abilities."
  {:db/ident :steam/Vampire,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Vampire tag is used for games that feature vampire characters, vampire lore, or gameplay mechanics focused on vampiric abilities.",
   :rdfs/label "Vampire",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Vampire"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Vampire/"}})

(def VehicularCombat
  "Vehicular Combat is a feature that involves combat mechanics using vehicles. This can be a key part of many action and racing games, and often involves a focus on skill and competition."
  {:db/ident :steam/VehicularCombat,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Vehicular Combat is a feature that involves combat mechanics using vehicles. This can be a key part of many action and racing games, and often involves a focus on skill and competition.",
   :rdfs/label "Vehicular Combat",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Vehicular_combat_game"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Vehicular%20Combat/"}})

(def VideoProduction
  "Software that is used for video production. This can include video editors, video capture software, and more."
  {:db/ident :steam/VideoProduction,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for video production. This can include video editors, video capture software, and more.",
   :rdfs/label "Video Production",
   :schema/applicationCategory ["DesignApplication" "MultimediaApplication"],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Video%20Production/"}})

(def VillainProtagonist
  "Villain Protagonist is a feature that involves the main character of the game being a villain. This can be a key part of many games, and often involves a focus on character development and narrative."
  {:db/ident :steam/VillainProtagonist,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Villain Protagonist is a feature that involves the main character of the game being a villain. This can be a key part of many games, and often involves a focus on character development and narrative.",
   :rdfs/label "Villain Protagonist",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Villain_protagonist"},
   :schema/url
   {:rdfa/uri "https://store.steampowered.com/tags/en/Villain%20Protagonist/"}})

(def Violent
  "A tag used to describe games that feature explicit or graphic violence."
  {:db/ident :steam/Violent,
   :rdf/type [:steam/Rating :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that feature explicit or graphic violence.",
   :rdfs/label "Violent",
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Violent/"}})

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
  "A tag used to describe the visuals and viewpoint of something on Steam."
  {:db/ident :steam/VisualsAndViewpoint,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A tag used to describe the visuals and viewpoint of something on Steam.",
   :rdfs/label "Visuals and Viewpoint",
   :rdfs/subClassOf [:steam/Tag :schema/Thing]})

(def VoiceControl
  "A tag used to describe games that support voice commands as a method of control."
  {:db/ident :steam/VoiceControl,
   :rdf/type [:steam/Input :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "A tag used to describe games that support voice commands as a method of control.",
   :rdfs/label "Voice Control",
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Voice%20Control/"}})

(def Voxel
  "Voxel refers to a visual style that uses volumetric pixels (voxels) to create the game world. This style is often associated with 3D games that have a blocky or cubic aesthetic."
  {:db/ident :steam/Voxel,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Voxel refers to a visual style that uses volumetric pixels (voxels) to create the game world. This style is often associated with 3D games that have a blocky or cubic aesthetic.",
   :rdfs/label "Voxel",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Voxel"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Voxel/"}})

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

(def War
  "The War tag is used for games that feature war or war themes."
  {:db/ident :steam/War,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The War tag is used for games that feature war or war themes.",
   :rdfs/label "War",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/War"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/War/"}})

(def Wargame
  "Wargame games are a type of strategy game that simulates warfare. They often focus on realistic tactical and strategic battles, and can cover various periods of history."
  {:db/ident :steam/Wargame,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "Wargame games are a type of strategy game that simulates warfare. They often focus on realistic tactical and strategic battles, and can cover various periods of history.",
   :rdfs/label "Wargame",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Computer_wargame"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Wargame/"}})

(def Warhammer40K
  "Warhammer 40K represents games that are based on the Warhammer 40,000 franchise. These games often feature elements of science fantasy, including epic battles, complex lore, and a grimdark setting."
  {:db/ident :steam/Warhammer40K,
   :rdf/type [:steam/Other :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "Warhammer 40K represents games that are based on the Warhammer 40,000 franchise. These games often feature elements of science fantasy, including epic battles, complex lore, and a grimdark setting.",
   :rdfs/label "Warhammer 40K",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Warhammer_40,000"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Warhammer%2040K/"}})

(def WebPublishing
  "Software that is used for web publishing. This can include web design software, content management systems, and more."
  {:db/ident :steam/WebPublishing,
   :rdf/type [:steam/Software
              :owl/Class
              :schema/Thing
              :steam/Tag
              :schema/SoftwareApplication],
   :rdfs/comment
   "Software that is used for web publishing. This can include web design software, content management systems, and more.",
   :rdfs/label "Web Publishing",
   :schema/applicationCategory ["DeveloperApplication" "DesignApplication"],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Web%20Publishing/"}})

(def Werewolves
  "The Werewolves tag is used for games that feature werewolf characters, werewolf lore, or gameplay mechanics focused on lycanthropic abilities."
  {:db/ident :steam/Werewolves,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Werewolves tag is used for games that feature werewolf characters, werewolf lore, or gameplay mechanics focused on lycanthropic abilities.",
   :rdfs/label "Werewolves",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Werewolf"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/Werewolves/"}})

(def Western
  "The Western tag is used for games that feature Western or Wild West themes."
  {:db/ident :steam/Western,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The Western tag is used for games that feature Western or Wild West themes.",
   :rdfs/label "Western",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Western_(genre)"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/Western/"}})

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

(def WorldWarI
  "The World War I tag is used for games that feature World War I historical events, WWI era settings, or gameplay mechanics focused on the WWI period."
  {:db/ident :steam/WorldWarI,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The World War I tag is used for games that feature World War I historical events, WWI era settings, or gameplay mechanics focused on the WWI period.",
   :rdfs/label "World War I",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/World_War_I"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/World%20War%20I/"}})

(def WorldWarII
  "The World War II tag is used for games that feature World War II historical events, WWII era settings, or gameplay mechanics focused on the WWII period."
  {:db/ident :steam/WorldWarII,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The World War II tag is used for games that feature World War II historical events, WWII era settings, or gameplay mechanics focused on the WWII period.",
   :rdfs/label "World War II",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/World_War_II"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/World%20War%20II/"}})

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

(def |1980s|
  "The 1980s tag encapsulates the vibrant pop culture, technological optimism, and distinctive aesthetics of this decade. Games with this tag might feature neon colors, synth music, or references to iconic 80s events and personalities."
  {:db/ident :steam/|1980s|,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The 1980s tag encapsulates the vibrant pop culture, technological optimism, and distinctive aesthetics of this decade. Games with this tag might feature neon colors, synth music, or references to iconic 80s events and personalities.",
   :rdfs/label "1980s",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/1980s"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/1980s/"}})

(def |1990s|
  "The 1990s tag captures the spirit of this transformative decade, marked by the rise of the internet, grunge music, and a distinctive blend of optimism and cynicism. Games with this tag might feature early internet culture, iconic 90s fashion, or the decade's unique blend of music and art."
  {:db/ident :steam/|1990s|,
   :rdf/type [:steam/ThemeAndMood :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "The 1990s tag captures the spirit of this transformative decade, marked by the rise of the internet, grunge music, and a distinctive blend of optimism and cynicism. Games with this tag might feature early internet culture, iconic 90s fashion, or the decade's unique blend of music and art.",
   :rdfs/label "1990s",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/1990s"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/1990s/"}})

(def |2_5D|
  "2.5D is a visual style that combines 2D graphics with a 3D perspective. This is often done to create depth or to achieve certain visual effects."
  {:db/ident :steam/|2.5D|,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "2.5D is a visual style that combines 2D graphics with a 3D perspective. This is often done to create depth or to achieve certain visual effects.",
   :rdfs/label "2.5D",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/2.5D"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/2.5D/"}})

(def |2DFighter|
  "2D Fighter games are fighting games with a gameplay in a two-dimensional environment."
  {:db/ident :steam/|2DFighter|,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "2D Fighter games are fighting games with a gameplay in a two-dimensional environment.",
   :rdfs/label "2D Fighter",
   :rdfs/subClassOf [:steam/Fighting :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/2D%20Fighter/"}})

(def |2DPlatformer|
  "2D Platformer games are platform games with a gameplay in a two-dimensional environment."
  {:db/ident :steam/|2DPlatformer|,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "2D Platformer games are platform games with a gameplay in a two-dimensional environment.",
   :rdfs/label "2D Platformer",
   :rdfs/subClassOf :steam/Platformer,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/2D%20Platformer/"}})

(def |2D|
  "2D is a visual style that uses two-dimensional graphics. This often includes side-scrolling elements, platformers, and top-down perspectives."
  {:db/ident :steam/|2D|,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "2D is a visual style that uses two-dimensional graphics. This often includes side-scrolling elements, platformers, and top-down perspectives.",
   :rdfs/label "2D",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/2D_computer_graphics"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/2D/"}})

(def |360Video|
  "360 Video is a type of media that features 360-degree videos, allowing the viewer to look in any direction. This is often used in virtual reality experiences."
  {:db/ident :steam/|360Video|,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "360 Video is a type of media that features 360-degree videos, allowing the viewer to look in any direction. This is often used in virtual reality experiences.",
   :rdfs/label "360 Video",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/360-degree_video"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/360%20Video/"}})

(def |3DFighter|
  "3D Fighter games are fighting games with a gameplay in a three-dimensional environment."
  {:db/ident :steam/|3DFighter|,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "3D Fighter games are fighting games with a gameplay in a three-dimensional environment.",
   :rdfs/label "3D Fighter",
   :rdfs/subClassOf [:steam/Fighting :steam/Action],
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/3D%20Fighter/"}})

(def |3DPlatformer|
  "3D Platformer games are platform games with a gameplay in a three-dimensional environment."
  {:db/ident :steam/|3DPlatformer|,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "3D Platformer games are platform games with a gameplay in a three-dimensional environment.",
   :rdfs/label "3D Platformer",
   :rdfs/subClassOf :steam/Platformer,
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/3D%20Platformer/"}})

(def |3DVision|
  "3D Vision is a technology that supports Nvidia's 3D Vision technology, which allows for stereoscopic viewing on 3D monitors and TVs."
  {:db/ident :steam/|3DVision|,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "3D Vision is a technology that supports Nvidia's 3D Vision technology, which allows for stereoscopic viewing on 3D monitors and TVs.",
   :rdfs/label "3D Vision",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/Nvidia_3D_Vision"},
   :schema/url {:rdfa/uri
                "https://store.steampowered.com/tags/en/3D%20Vision/"}})

(def |3D|
  "3D is a visual style that uses three-dimensional graphics. This can include a wide variety of media, from games to movies, and is used to create a sense of depth and realism."
  {:db/ident :steam/|3D|,
   :rdf/type [:steam/VisualsAndViewpoint :owl/Class :schema/Thing :steam/Tag],
   :rdfs/comment
   "3D is a visual style that uses three-dimensional graphics. This can include a wide variety of media, from games to movies, and is used to create a sense of depth and realism.",
   :rdfs/label "3D",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/3D_computer_graphics"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/3D/"}})

(def |4X|
  "4X games are a genre of strategy video game in which players control an empire and 'eXplore, eXpand, eXploit, and eXterminate'."
  {:db/ident :steam/|4X|,
   :rdf/type [:steam/SubGenre :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "4X games are a genre of strategy video game in which players control an empire and 'eXplore, eXpand, eXploit, and eXterminate'.",
   :rdfs/label "4X",
   :rdfs/seeAlso {:rdfa/uri "http://dbpedia.org/resource/4X"},
   :rdfs/subClassOf :steam/Strategy,
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/4X/"}})

(def |6DOF|
  "6DOF (Six Degrees of Freedom) is a feature that allows full 3D spatial movement and rotation. This includes the ability to move forward/backward, up/down, left/right and to rotate along three perpendicular axes."
  {:db/ident :steam/|6DOF|,
   :rdf/type [:steam/Feature :owl/Class :steam/Tag :schema/Thing],
   :rdfs/comment
   "6DOF (Six Degrees of Freedom) is a feature that allows full 3D spatial movement and rotation. This includes the ability to move forward/backward, up/down, left/right and to rotate along three perpendicular axes.",
   :rdfs/label "6DOF",
   :rdfs/seeAlso {:rdfa/uri
                  "http://dbpedia.org/resource/Six_degrees_of_freedom"},
   :schema/url {:rdfa/uri "https://store.steampowered.com/tags/en/6DOF/"}})