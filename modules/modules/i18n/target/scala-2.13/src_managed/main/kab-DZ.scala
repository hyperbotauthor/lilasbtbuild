package lila.i18n

import I18nQuantity._

// format: OFF
private object `kab-DZ` {

  def load: java.util.HashMap[MessageKey, Translation] = {
    val m = new java.util.HashMap[MessageKey, Translation](294)
m.put("playWithAFriend",new Simple("""Urar yed umddakul"""))
m.put("playWithTheMachine",new Simple("""Urar mgal aselkim"""))
m.put("toInviteSomeoneToPlayGiveThisUrl",new Simple("""Blik ad-snnefteghed yiwen ad urar, fka-s tuqqna agi"""))
m.put("gameOver",new Simple("""Tekfa tiremt"""))
m.put("waitingForOpponent",new Simple("""S taganit sɣuṛ afna"""))
m.put("waiting",new Simple("""S taganit"""))
m.put("yourTurn",new Simple("""D nnuva-k"""))
m.put("aiNameLevelAiLevel",new Simple("""%1$s aswir %2$s"""))
m.put("level",new Simple("""Aswir"""))
m.put("toggleTheChat",new Simple("""Rmed/Ḥves aqeṣṣeṛ"""))
m.put("toggleSound",new Simple("""Rmed/Ḥves imesli"""))
m.put("chat",new Simple("""Aqeṣṣeṛ"""))
m.put("resign",new Simple("""Eǧǧ"""))
m.put("checkmate",new Simple("""Caqmat"""))
m.put("stalemate",new Simple("""Pat"""))
m.put("white",new Simple("""Amellal"""))
m.put("black",new Simple("""Averkan"""))
m.put("randomColor",new Simple("""Ini agacuran"""))
m.put("createAGame",new Simple("""Slal timlilit"""))
m.put("whiteIsVictorious",new Simple("""Imellalen ulken"""))
m.put("blackIsVictorious",new Simple("""Iverkanen ulken"""))
m.put("kingInTheCenter",new Simple("""Agellid deg tlemmast"""))
m.put("threeChecks",new Simple("""kraḍ n yiciken"""))
m.put("raceFinished",new Simple("""Tekfa tamzizla"""))
m.put("variantEnding",new Simple("""Taggara n talmest"""))
m.put("newOpponent",new Simple("""Afna amaynu"""))
m.put("yourOpponentWantsToPlayANewGameWithYou",new Simple("""Afna inek ibɣa a d‑yurar slal amaynu akk yidek"""))
m.put("joinTheGame",new Simple("""Sdukel aslal"""))
m.put("whitePlays",new Simple("""Imellalen t-uraren"""))
m.put("blackPlays",new Simple("""Iverkanen t-uraren"""))
m.put("opponentLeftChoices",new Simple("""Afna inek iǧǧa aḥric. Zemrer a ttraǧuɣ ad yuɣal, naɣ ḥettem tiǧǧit"""))
m.put("makeYourOpponentResign",new Simple("""Ḥettem tiǧǧit n afna"""))
m.put("forceResignation",new Simple("""Ḥettem tiǧǧit"""))
m.put("forceDraw",new Simple("""Ḥettem tagada"""))
m.put("talkInChat",new Simple("""Hder di chat"""))
m.put("theFirstPersonToComeOnThisUrlWillPlayWithYou",new Simple("""Win ar-aytekkin ghef tuqqna agi ad-yurar yide-k"""))
m.put("whiteResigned",new Simple("""Imellalen ǧǧan"""))
m.put("blackResigned",new Simple("""Iverkanen ǧǧan"""))
m.put("whiteLeftTheGame",new Simple("""Imellalen ǧǧan timlilit"""))
m.put("blackLeftTheGame",new Simple("""Iverkanen ǧǧan timlilit"""))
m.put("shareThisUrlToLetSpectatorsSeeTheGame",new Simple("""hed yiwen adS taganit sɣuṛ (afna Rmed/Ḥves) aqeṣṣeṛ"""))
m.put("theComputerAnalysisHasFailed",new Simple("""Tasleḍt awurman texṣer"""))
m.put("viewTheComputerAnalysis",new Simple("""Walli tasleṭ tawurmant"""))
m.put("requestAComputerAnalysis",new Simple("""Setter tasleḍt taymanit"""))
m.put("computerAnalysis",new Simple("""Tasleṭ n uselkim"""))
m.put("computerAnalysisAvailable",new Simple("""Tasleṭ n uselkim tehga"""))
m.put("analysis",new Simple("""Tafelwit n tesleḍt"""))
m.put("depthX",new Simple("""Tadrut %s"""))
m.put("usingServerAnalysis",new Simple("""Tasleḍt iteddun n useqdac"""))
m.put("loadingEngine",new Simple("""Iteddu usali..."""))
m.put("inLocalBrowser",new Simple("""deg iminig andigan"""))
m.put("move",new Simple("""Asembiwel"""))
m.put("capture",new Simple("""Tuṭfa"""))
m.put("close",new Simple("""Mdel"""))
m.put("delete",new Simple("""Kkes"""))
m.put("blunders",new Escaped("""Tuccd'iwin""","""Tuccd&#39;iwin"""))
m.put("mistakes",new Simple("""Tiguliwin"""))
m.put("inaccuracies",new Simple("""War tiseddi"""))
m.put("moveTimes",new Simple("""Akud ger tiyita"""))
m.put("flipBoard",new Simple("""Dwer talweḥt n yicahen"""))
m.put("threefoldRepetition",new Simple("""Kraḍt n tikkal"""))
m.put("claimADraw",new Simple("""Sseɣret timlilit ilem"""))
m.put("offerDraw",new Simple("""Sumer ilem"""))
m.put("draw",new Simple("""Timlilit ilem"""))
m.put("nbPlayers",new Plurals(new Map.Map2(One,"""%s umariren""",Other,"""%s umariren""")))
m.put("currentGames",new Simple("""Temliliyin ituraren tura"""))
m.put("nbGames",new Plurals(new Map.Map2(One,"""Walli %s iḥricen""",Other,"""Walli %s iḥricen""")))
m.put("nbBookmarks",new Plurals(new Map.Map2(One,"""%s Inurifen""",Other,"""%s Inurifen""")))
m.put("viewInFullSize",new Simple("""Ssemɣweṛ"""))
m.put("logOut",new Simple("""Asenser"""))
m.put("signIn",new Simple("""Tuqqna"""))
m.put("youNeedAnAccountToDoThat",new Simple("""Ḥwajeḍ amidan n umseqdac"""))
m.put("signUp",new Simple("""Tiggezt"""))
m.put("games",new Simple("""Temliliyin"""))
m.put("forum",new Simple("""Anmager"""))
m.put("xPostedInForumY",new Simple("""%1$s yura deg anmagar %2$s"""))
m.put("latestForumPosts",new Simple("""Izen aneggaru deg anmagar"""))
m.put("players",new Simple("""Imariren"""))
m.put("minutesPerSide",new Simple("""Tisdidin deg umarir"""))
m.put("variant",new Simple("""Tamzarayt"""))
m.put("variants",new Simple("""Tamzarayt"""))
m.put("timeControl",new Simple("""Asenqed n akud"""))
m.put("correspondence",new Simple("""Amyaru"""))
m.put("daysPerTurn",new Simple("""Ussan s nnuba"""))
m.put("oneDay",new Simple("""Yiwen n wass"""))
m.put("nbDays",new Plurals(new Map.Map2(One,"""%s n wussan""",Other,"""%s n wussan""")))
m.put("nbHours",new Plurals(new Map.Map2(One,"""%s n yisragen""",Other,"""%s n yisragen""")))
m.put("time",new Simple("""Ukkud"""))
m.put("rating",new Simple("""Asismel"""))
m.put("username",new Simple("""Isem n useqdac"""))
m.put("usernameOrEmail",new Simple("""Isem useqdac"""))
m.put("password",new Simple("""Awal ukeččum"""))
m.put("changePassword",new Simple("""Ḥwaǧeḍ kan isem n useqdac d awal ukeččum"""))
m.put("changeEmail",new Simple("""Beddel amayel"""))
m.put("email",new Simple("""Amayel"""))
m.put("rank",new Simple("""Abellez"""))
m.put("gamesPlayed",new Simple("""Temliliyin ituraren tura"""))
m.put("nbGamesWithYou",new Plurals(new Map.Map2(One,"""%s timlilit akk kec""",Other,"""%s timlilit akk kec""")))
m.put("cancel",new Simple("""Semmet"""))
m.put("drawOfferSent",new Simple("""Asumer n ilem yuzen"""))
m.put("drawOfferDeclined",new Simple("""Asumer n ilem"""))
m.put("drawOfferAccepted",new Simple("""Asumer n ilem iqbel"""))
m.put("drawOfferCanceled",new Simple("""Asumer n ilem isemmet"""))
m.put("yourOpponentOffersADraw",new Simple("""Afna inek yetsummer ilem"""))
m.put("accept",new Simple("""Qbel"""))
m.put("decline",new Simple("""Agwi"""))
m.put("playingRightNow",new Simple("""Tturar tura"""))
m.put("finished",new Simple("""Ifuk"""))
m.put("abortGame",new Simple("""Semmet timlilit"""))
m.put("gameAborted",new Simple("""Timlilit ttusemmet"""))
m.put("standard",new Simple("""Alugen"""))
m.put("unlimited",new Simple("""War talast"""))
m.put("mode",new Simple("""Asekkir"""))
m.put("casual",new Simple("""S timidwa"""))
m.put("rated",new Simple("""Ibellzen"""))
m.put("casualTournament",new Simple("""S timidwa"""))
m.put("ratedTournament",new Simple("""Ibellzen"""))
m.put("thisGameIsRated",new Simple("""Timlilit agi t-bellez"""))
m.put("rematch",new Simple("""Ttaṛ"""))
m.put("rematchOfferSent",new Simple("""Asumer n ttaṛ"""))
m.put("rematchOfferAccepted",new Simple("""Asumer iqbel"""))
m.put("rematchOfferCanceled",new Simple("""Asumer n ttaṛ semmet"""))
m.put("rematchOfferDeclined",new Simple("""Asumer n ttaṛ y agi"""))
m.put("cancelRematchOffer",new Simple("""Semmet asumer n ttaṛ"""))
m.put("viewRematch",new Simple("""Wali ṭṭar"""))
m.put("play",new Simple("""Urar"""))
m.put("inbox",new Simple("""Tanaka n tebratin"""))
m.put("chatRoom",new Simple("""Akkam n uqeṣṣeṛ"""))
m.put("spectatorRoom",new Simple("""Akkam n imehanayen"""))
m.put("composeMessage",new Simple("""Aru izen"""))
m.put("noNewMessages",new Simple("""Ulac izen amaynut"""))
m.put("subject",new Simple("""Ahil"""))
m.put("recipient",new Simple("""Anermas"""))
m.put("send",new Simple("""Ceyyeε"""))
m.put("incrementInSeconds",new Simple("""Tifest s tisinin"""))
m.put("freeOnlineChess",new Simple("""Icahen baṭel askar uqqin"""))
m.put("spectators",new Simple("""Imeshanayen:"""))
m.put("nbWins",new Plurals(new Map.Map2(One,"""%s tarennawt""",Other,"""%s tarennawt""")))
m.put("nbLosses",new Plurals(new Map.Map2(One,"""%s  tiṛẓinen""",Other,"""%s  tiṛẓinen""")))
m.put("nbDraws",new Plurals(new Map.Map2(One,"""%s ilmawen""",Other,"""%s ilmawen""")))
m.put("exportGames",new Simple("""Ssifeḍ temliliyin"""))
m.put("ratingRange",new Simple("""Abellez"""))
m.put("giveNbSeconds",new Plurals(new Map.Map2(One,"""Efk %s tisinin""",Other,"""Efk %s tisinin""")))
m.put("takeback",new Simple("""Semmet tiyita"""))
m.put("proposeATakeback",new Simple("""Sumer usemmet n tiyita"""))
m.put("takebackPropositionSent",new Simple("""Asemmet n tiyita isumer"""))
m.put("takebackPropositionDeclined",new Simple("""Asemmet n tiyita yugwi"""))
m.put("takebackPropositionAccepted",new Simple("""Asemmet n tiyita iqbel"""))
m.put("takebackPropositionCanceled",new Simple("""Asemmet n tiyita isemet"""))
m.put("yourOpponentProposesATakeback",new Simple("""Afna inek i t‑summer"""))
m.put("bookmarkThisGame",new Simple("""Err timlilit agi di amenyaf"""))
m.put("tournament",new Simple("""Timzizelt"""))
m.put("tournaments",new Simple("""Timzizelten"""))
m.put("tournamentPoints",new Simple("""Agemmuḍ n timenyugert"""))
m.put("viewTournament",new Simple("""Wali timenyugert"""))
m.put("backToTournament",new Simple("""Uɣal ɣer timenyugert"""))
m.put("siteDescription",new Simple("""Urar n yicahen baṭel s weskar uqqin. Urar yicahen dindin s agrudem aḥerfi. War assiggez bessif, war assussen, war plugin. Urar icahen mgal aselkim, imeddukkal neɣ afnaten s weskar uqqin."""))
m.put("xJoinedTeamY",new Simple("""%1$s i sdukel taɣlamt %2$s"""))
m.put("xCreatedTeamY",new Simple("""%1$s i slal taɣlamt %2$s"""))
m.put("averageElo",new Simple("""Abellez alemmas"""))
m.put("location",new Simple("""Amkan"""))
m.put("filterGames",new Simple("""Ṣeffi temliliyin"""))
m.put("reset",new Simple("""Awennez tikkelt nniḍen"""))
m.put("apply",new Simple("""Snes"""))
m.put("leaderboard",new Simple("""Abellez"""))
m.put("pasteTheFenStringHere",new Simple("""Senteḍ  tangalt FEN dagi"""))
m.put("pasteThePgnStringHere",new Simple("""Senteḍ aḍris PGN dagi"""))
m.put("fromPosition",new Simple("""Ɣer amkan"""))
m.put("continueFromHere",new Simple("""Kemmel si ideg agi"""))
m.put("importGame",new Simple("""Kter timlilit"""))
m.put("nbImportedGames",new Plurals(new Map.Map2(One,"""%s timlilit tiktiren""",Other,"""%s timlilit tiktiren""")))
m.put("thisIsAChessCaptcha",new Simple("""Ayagi d CAPTCHA n caq"""))
m.put("clickOnTheBoardToMakeYourMove",new Simple("""Senned g talwaḥt akken a t-urared tiyita, d a t-sekneḍ imanik d amedan"""))
m.put("notACheckmate",new Simple("""Macci d caqmat"""))
m.put("retry",new Simple("""Ɛawed tikkelt niḍen"""))
m.put("reconnecting",new Simple("""Alstuqqna anazzal"""))
m.put("noFriendsOnline",new Simple("""Ulac Imdukal askar uqqin"""))
m.put("findFriends",new Simple("""Af imeddukal"""))
m.put("follow",new Simple("""Dfer"""))
m.put("following",new Simple("""Yidfer"""))
m.put("unfollow",new Simple("""Ur ḍfer ara"""))
m.put("block",new Simple("""Kyef"""))
m.put("blocked",new Simple("""Ikyaf"""))
m.put("unblock",new Simple("""Eks asewḥel"""))
m.put("followsYou",new Simple("""I Dferek"""))
m.put("xStartedFollowingY",new Simple("""%1$s i ḍfeṛ %2$s"""))
m.put("nbFollowers",new Plurals(new Map.Map2(One,"""%s iḍefṛen""",Other,"""%s iḍefṛen""")))
m.put("nbFollowing",new Plurals(new Map.Map2(One,"""%s idfren""",Other,"""%s idfren""")))
m.put("more",new Simple("""Ugar"""))
m.put("memberSince",new Simple("""Amaslaḍ seg"""))
m.put("lastSeenActive",new Simple("""Tuqqna taneggarut %s"""))
m.put("challengeToPlay",new Simple("""Cqer amyurar agi"""))
m.put("player",new Simple("""Amarir"""))
m.put("list",new Simple("""Umuɣ"""))
m.put("graph",new Simple("""Udlif"""))
m.put("lessThanNbMinutes",new Plurals(new Map.Map2(One,"""Ddaw n %s tisdidin""",Other,"""Ddaw n %s tisdidin""")))
m.put("required",new Simple("""Usuter"""))
m.put("openTournaments",new Simple("""Timzizelten ilden"""))
m.put("duration",new Simple("""Tanzagt"""))
m.put("winner",new Simple("""Amernay"""))
m.put("standing",new Simple("""Abellez"""))
m.put("createANewTournament",new Simple("""Slal timenyugert"""))
m.put("join",new Simple("""Ddukkel ed"""))
m.put("withdraw",new Simple("""Eǧǧ"""))
m.put("points",new Simple("""Tenqiḍin"""))
m.put("wins",new Simple("""Tarennawt"""))
m.put("losses",new Simple("""Tirẓiwin"""))
m.put("winStreak",new Simple("""Imazraren n tirennawin"""))
m.put("createdBy",new Simple("""Islal ɣef"""))
m.put("tournamentIsStarting",new Simple("""Timenyugert t bdu"""))
m.put("membersOnly",new Simple("""Imaslaḍen kan"""))
m.put("boardEditor",new Simple("""Amaẓrag n uḥric"""))
m.put("startPosition",new Simple("""Addud n tgellawt"""))
m.put("clearBoard",new Simple("""Wennez talweḥt n yicahen"""))
m.put("savePosition",new Simple("""Kles waddud"""))
m.put("loadPosition",new Simple("""Zdem ideg"""))
m.put("isPrivate",new Simple("""Uslig"""))
m.put("reportXToModerators",new Simple("""Ɛeyyen %s ɣer anebdal"""))
m.put("profile",new Simple("""Alegdis"""))
m.put("editProfile",new Simple("""Zreg alegdis"""))
m.put("firstName",new Simple("""Issem"""))
m.put("lastName",new Simple("""Isem n twacult"""))
m.put("biography",new Simple("""Tameddurt"""))
m.put("country",new Simple("""Tamurt"""))
m.put("watchLichessTV",new Simple("""Wali kan Lichess TV"""))
m.put("previouslyOnLichessTV",new Simple("""Yakan seg Lichess TV"""))
m.put("onlinePlayers",new Simple("""Imariren s weskar uqqin"""))
m.put("activeToday",new Simple("""Urmid ass-a"""))
m.put("activePlayers",new Simple("""Imariren urmiden"""))
m.put("bewareTheGameIsRatedButHasNoClock",new Simple("""Ɣuṛ-ek, timlilit t-serkem, acku mbla tallast n wakud"""))
m.put("yourPuzzleRatingX",new Simple("""Abellez inek d usluɣmu : %s"""))
m.put("toTrackYourProgress",new Simple("""Akken a t‑klised tiddit nekk"""))
m.put("puzzleId",new Simple("""Aεewwiq %s"""))
m.put("puzzleOfTheDay",new Simple("""Aεewwiq n ass-a"""))
m.put("clickToSolve",new Simple("""Hacer clic i wakken a ttefrud"""))
m.put("goodMove",new Simple("""Tyita ilhan"""))
m.put("butYouCanDoBetter",new Simple("""Maca tzemred  xer"""))
m.put("bestMove",new Simple("""Tiyita Tamawayt"""))
m.put("keepGoing",new Simple("""Kemmel..."""))
m.put("puzzleFailed",new Simple("""Aεewwiq ixeṣren"""))
m.put("butYouCanKeepTrying",new Simple("""Maca tzemṛed ad tɛawdeḍ tikkelt niḍen."""))
m.put("wasThisPuzzleAnyGood",new Simple("""I sɣa azal ugur agi"""))
m.put("pleaseVotePuzzle",new Simple("""All Lichess a d-i sileɣ s dɣeṛ s innecaben"""))
m.put("thankYou",new Simple("""Tanemmirt!"""))
m.put("ratingX",new Simple("""Abellez : %s"""))
m.put("playedXTimes",new Plurals(new Map.Map2(One,"""Urared %s n tikkelt""",Other,"""Urared %s n tikkelt""")))
m.put("fromGameLink",new Simple("""S timlilit %s"""))
m.put("continueTraining",new Simple("""Kemmel asluɣmu"""))
m.put("retryThisPuzzle",new Simple("""Ɛawed tikkelt niḍen aεewwiq agi"""))
m.put("thisPuzzleIsCorrect",new Simple("""Ugur agi d ameggaz daɣen i sɣa azal"""))
m.put("thisPuzzleIsWrong",new Simple("""Ugur agi inezri neɣ d amessas"""))
m.put("victory",new Simple("""Tarennawt!"""))
m.put("host",new Simple("""Asenneftaɣ"""))
m.put("hostColorX",new Simple("""Ini n usenneftaɣ: %s"""))
m.put("emails:emailConfirm_subject",new Simple("""Sentem amiḍan-inek lichess.org,%s"""))
m.put("emails:emailConfirm_click",new Simple("""Sit ɣef useɣwen i urmad n umiḍan-inek Lichess account:"""))
m.put("emails:emailConfirm_ignore",new Simple("""Ma yella ur tettwaskelseḍ ara ɣer Lichess, tzemreḍ ad tanfeḍ s teɣlist izen-agi."""))
m.put("emails:passwordReset_subject",new Simple("""Wennez awal uffir-inek lichess.org,%s"""))
m.put("emails:passwordReset_intro",new Simple("""Yettwazen-aɣ-d usuter n uwennez n wawal uffir n umiḍan-inek."""))
m.put("emails:passwordReset_clickOrIgnore",new Simple("""Ma yella d kečč id yessutren, sit ɣef useɣwen-a n wadda.Ma ulac, tzemreḍ ad stanfeḍ."""))
m.put("emails:emailChange_subject",new Simple("""Sentem tansa n yimayl tamaynut,%s"""))
m.put("emails:emailChange_intro",new Simple("""Tessutreḍ abeddel n tansa n yimayl-inek."""))
m.put("learn:menu",new Simple("""Umuɣ"""))
m.put("learn:progressX",new Simple("""Asfari: %s"""))
m.put("learn:play",new Simple("""urar!"""))
m.put("activity:activity",new Simple("""Armud"""))
m.put("coordinates:coordinates",new Simple("""Tisidag"""))
m.put("coordinates:coordinateTraining",new Simple("""Kemmel asileɣ"""))
m.put("coordinates:averageScoreAsWhiteX",new Simple("""Agemmuḍ alemmas d amellal:%s"""))
m.put("coordinates:averageScoreAsBlackX",new Simple("""Agemmuḍ alemmas d aberkan:%s"""))
m.put("class:features",new Simple("""Timahilin"""))
m.put("class:removedStudents",new Simple("""Ittwakkes"""))
m.put("class:realName",new Simple("""Isem n tidet"""))
m.put("class:lastActiveDate",new Simple("""Urmid"""))
m.put("class:teachers",new Simple("""Iselmaden"""))
m.put("settings:settings",new Simple("""Imsektayen"""))
m.put("settings:closeAccount",new Simple("""Mdel amiḍan"""))
m.put("preferences:preferences",new Simple("""Isemnyafen"""))
m.put("team:teams",new Simple("""Igrawen"""))
m.put("team:nbMembers",new Plurals(new Map.Map2(One,"""%s imedrawen""",Other,"""%s imedrawen""")))
m.put("team:allTeams",new Simple("""Yal tiɣlamin"""))
m.put("team:newTeam",new Simple("""Taɣlamt tamaynut"""))
m.put("team:myTeams",new Simple("""Tiɣlamin-iw"""))
m.put("team:noTeamFound",new Simple("""Ulac taɣlamt"""))
m.put("team:joinTeam",new Simple("""Ddukkel ed taɣlamt"""))
m.put("team:quitTeam",new Simple("""Eǧǧ taɣlamt"""))
m.put("team:anyoneCanJoin",new Simple("""Yal yiwen izmer ad ikki"""))
m.put("team:aConfirmationIsRequiredToJoin",new Simple("""Teḥwajed aragag i wakken a-tddukkeled"""))
m.put("team:joiningPolicy",new Simple("""Alugen n ussekcam"""))
m.put("team:teamBestPlayers",new Simple("""Aqaru n taɣlamt"""))
m.put("team:teamRecentMembers",new Simple("""Imaslaḍen imaynuten"""))
m.put("search:search",new Simple("""Nadi"""))
m.put("search:advancedSearch",new Simple("""Nadi tasurift"""))
    m
  }
}
