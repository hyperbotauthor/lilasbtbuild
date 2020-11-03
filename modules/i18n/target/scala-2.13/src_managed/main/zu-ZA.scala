package lila.i18n



// format: OFF
private object `zu-ZA` {

  def load: java.util.HashMap[MessageKey, Translation] = {
    val m = new java.util.HashMap[MessageKey, Translation](228)
m.put("playWithAFriend",new Simple("""Ukudlala nomngane"""))
m.put("playWithTheMachine",new Simple("""Ukudlala emshinini"""))
m.put("toInviteSomeoneToPlayGiveThisUrl",new Simple("""Ukuze umeme othile ukudlala, unike lolu kheli"""))
m.put("gameOver",new Simple("""Game Over"""))
m.put("waitingForOpponent",new Simple("""Elinde isitha"""))
m.put("waiting",new Simple("""Ukulinda"""))
m.put("yourTurn",new Simple("""Ithuba lakho"""))
m.put("aiNameLevelAiLevel",new Simple("""%1$s Izinga %2$s"""))
m.put("level",new Simple("""Izinga"""))
m.put("toggleTheChat",new Simple("""Guqula ingxoxo"""))
m.put("toggleSound",new Simple("""Shintsha umsindo"""))
m.put("chat",new Simple("""Ingxoxo"""))
m.put("resign",new Simple("""Yeka"""))
m.put("checkmate",new Simple("""Mui_season_name_76"""))
m.put("stalemate",new Simple("""I-Stalemate"""))
m.put("white",new Simple("""Okumhlophe"""))
m.put("black",new Simple("""Mnyama"""))
m.put("randomColor",new Simple("""Okungahleliwe"""))
m.put("createAGame",new Simple("""Dala umdlalo"""))
m.put("whiteIsVictorious",new Simple("""Umhlophe unqobile"""))
m.put("blackIsVictorious",new Simple("""Omnyama unqobile"""))
m.put("youPlayTheWhitePieces",new Simple("""Udlala izingcezu ezimhlophe"""))
m.put("youPlayTheBlackPieces",new Simple("""Udlala izingcezu ezimnyama"""))
m.put("itsYourTurn",new Simple("""Yithuba lakho!"""))
m.put("kingInTheCenter",new Simple("""Inkosi phakathi"""))
m.put("threeChecks",new Simple("""Ukuhlola ezintathu"""))
m.put("raceFinished",new Simple("""Umjaho uqedile"""))
m.put("variantEnding",new Simple("""Ukuphela okuhlukile"""))
m.put("newOpponent",new Simple("""Umphikisi omusha"""))
m.put("yourOpponentWantsToPlayANewGameWithYou",new Simple("""Umphikisi wakho ufuna ukudlala umdlalo omusha nawe"""))
m.put("joinTheGame",new Simple("""Joyina umdlalo"""))
m.put("whitePlays",new Simple("""Mhlophe ukuze udlale"""))
m.put("blackPlays",new Simple("""Okumnyama ukudlala"""))
m.put("opponentLeftChoices",new Simple("""Omunye umdlali kungenzeka ukuthi ushiye lo mdlalo. Ungacela ukunqoba, shayela umdlalo umdwebo, noma ulinde."""))
m.put("makeYourOpponentResign",new Simple("""Yenza umphikisi wakho ashiye"""))
m.put("forceResignation",new Simple("""Imangalo yokunqoba"""))
m.put("forceDraw",new Simple("""Dweba ucingo"""))
m.put("talkInChat",new Simple("""Sicela ujabule engxoxweni!"""))
m.put("theFirstPersonToComeOnThisUrlWillPlayWithYou",new Simple("""Umuntu wokuqala oza kule URL uzodlala nawe."""))
m.put("whiteResigned",new Simple("""Ukumiswa okumhlophe"""))
m.put("blackResigned",new Simple("""Okumnyama kususwe"""))
m.put("whiteLeftTheGame",new Simple("""Umhlophe ushiye umdlalo"""))
m.put("blackLeftTheGame",new Simple("""Omnyama ushiye umdlalo"""))
m.put("shareThisUrlToLetSpectatorsSeeTheGame",new Simple("""Yabelana ngale URL ukuze ababukeli babone umdlalo"""))
m.put("theComputerAnalysisHasFailed",new Simple("""Ukuhlaziywa kwekhompuyutha kuhlulekile"""))
m.put("viewTheComputerAnalysis",new Simple("""Buka ukuhlaziywa kwekhompyutha"""))
m.put("requestAComputerAnalysis",new Simple("""Cela ukuhlaziywa kwekhompyutha"""))
m.put("computerAnalysis",new Simple("""Ukuhlaziywa kwekhompyutha"""))
m.put("computerAnalysisAvailable",new Simple("""Ukuhlaziywa kwekhompyutha kuyatholakala"""))
m.put("analysis",new Simple("""Ibhodi Yokuhlola"""))
m.put("depthX",new Simple("""Ukujula %s"""))
m.put("usingServerAnalysis",new Simple("""Ukusebenzisa ukuhlaziywa kweseva"""))
m.put("loadingEngine",new Simple("""Ilayisha injini ..."""))
m.put("cloudAnalysis",new Simple("""Ukuhlaziywa kwamafu"""))
m.put("goDeeper",new Simple("""Hamba ngokujulile"""))
m.put("showThreat",new Simple("""Bonisa usongo"""))
m.put("inLocalBrowser",new Simple("""kusiphequluli sendawo"""))
m.put("toggleLocalEvaluation",new Simple("""Guqula ukuhlola kwendawo"""))
m.put("promoteVariation",new Simple("""Khuthaza ukushintshashintsha"""))
m.put("makeMainLine",new Simple("""Yenza umugqa owodwav"""))
m.put("deleteFromHere",new Simple("""Susa kusukela lapha"""))
m.put("forceVariation",new Simple("""Phoqelela ukuhlukahluka"""))
m.put("move",new Simple("""Hambisa"""))
m.put("variantLoss",new Simple("""Ukulahlekelwa okuhlukile"""))
m.put("variantWin",new Simple("""Ukuhluka okuhlukile"""))
m.put("insufficientMaterial",new Simple("""Izinto ezinganele"""))
m.put("pawnMove",new Simple("""Ukuhamba kwenduku"""))
m.put("capture",new Simple("""Impango"""))
m.put("close",new Simple("""Vala"""))
m.put("winning",new Simple("""Ukunqoba"""))
m.put("losing",new Simple("""Ukulahleka"""))
m.put("drawn",new Simple("""Ashayekile"""))
m.put("unknown",new Simple("""Akwaziwa"""))
m.put("database",new Simple("""Database"""))
m.put("whiteDrawBlack",new Simple("""Mhlophe / Dweba / Mnyama"""))
m.put("recentGames",new Simple("""Imidlalo yakamuva"""))
m.put("topGames",new Simple("""Best imidlalo"""))
m.put("noGameFound",new Simple("""Awukho umdlalo otholakele"""))
m.put("maybeIncludeMoreGamesFromThePreferencesMenu",new Simple("""Mhlawumbe faka eminye imidlalo kusuka kumenyu yokuncamelayo?"""))
m.put("openingExplorer",new Simple("""Umhloli wokuvula"""))
m.put("winPreventedBy50MoveRule",new Simple("""Ukunqoba kuvinjelwe umthetho wokuhamba wama-50"""))
m.put("lossSavedBy50MoveRule",new Simple("""Ukulahlekelwa kuvinjelwe umthetho wokuhamba ongu-50"""))
m.put("allSet",new Simple("""Konke kusethiwe!"""))
m.put("importPgn",new Simple("""Ngenisa PGN"""))
m.put("delete",new Simple("""Susa"""))
m.put("deleteThisImportedGame",new Simple("""Susa lo mdlalo ongenisiwe?"""))
m.put("replayMode",new Simple("""Phinda wenze imodi"""))
m.put("realtimeReplay",new Simple("""Isikhathi sangempela"""))
m.put("byCPL",new Simple("""Ngu-CPL"""))
m.put("openStudy",new Simple("""Vula isifundo"""))
m.put("enable",new Simple("""Nika amandla"""))
m.put("bestMoveArrow",new Simple("""Umcibisholo wokuhambisa ohamba phambili"""))
m.put("evaluationGauge",new Simple("""Igeji yokuhlola"""))
m.put("multipleLines",new Simple("""Imigqa eminingi"""))
m.put("cpus",new Simple("""Ama-CPU"""))
m.put("memory",new Simple("""Inkumbulo"""))
m.put("infiniteAnalysis",new Simple("""Ukuhlaziywa okungenamkhawulo"""))
m.put("removesTheDepthLimit",new Simple("""Isusa umkhawulo wokujula, futhi igcina ikhompyutha yakho ifudumele"""))
m.put("blunder",new Simple("""Ukuphaphalaza"""))
m.put("blunders",new Simple("""Amaphutha"""))
m.put("mistake",new Simple("""Iphutha"""))
m.put("mistakes",new Simple("""Isiphosiso"""))
m.put("inaccuracy",new Simple("""Ukunemba"""))
m.put("inaccuracies",new Simple("""Ukungafanele"""))
m.put("moveTimes",new Simple("""Izikhathi ze-Movie"""))
m.put("flipBoard",new Simple("""Ibhodi le-Flip"""))
m.put("threefoldRepetition",new Simple("""Ukuphindaphinda kathathu"""))
m.put("claimADraw",new Simple("""Funa umdwebo"""))
m.put("offerDraw",new Simple("""Umdwebo Wokunikeza"""))
m.put("draw",new Simple("""Dweba"""))
m.put("currentGames",new Simple("""Imidlalo yamanje"""))
m.put("viewInFullSize",new Simple("""Buka ngosayizi ogcwele"""))
m.put("logOut",new Simple("""Phuma ngemvume"""))
m.put("signIn",new Simple("""Ngena ngemvume"""))
m.put("youNeedAnAccountToDoThat",new Simple("""Udinga i-akhawunti ukukwenza lokho"""))
m.put("signUp",new Simple("""Bhalisa"""))
m.put("computersAreNotAllowedToPlay",new Simple("""Amakhompyutha nabadlali abasizwa ngamakhompyutha abavunyelwe ukuthi badlale. Uyacelwa ukuthi ungatholi lusizo kwizinjini ze-chess, imininingwane yolwazi, noma kwabanye abadlali ngenkathi udlala. Futhi qaphela ukuthi ukwenza ama-akhawunti amaningi kudikibile kakhulu futhi ama-accounting amaningi ngokweqile angaholela ekuvinjelweni."""))
m.put("games",new Simple("""Imidlalo"""))
m.put("forum",new Simple("""Iforamu"""))
m.put("latestForumPosts",new Simple("""Okuthunyelwe okusha kwenkundla"""))
m.put("players",new Simple("""Abadlali"""))
m.put("friends",new Simple("""Bangani"""))
m.put("discussions",new Simple("""Izingxoxo"""))
m.put("today",new Simple("""Namuhla"""))
m.put("yesterday",new Simple("""Izolo"""))
m.put("minutesPerSide",new Simple("""Amaminithi ohlangothini"""))
m.put("variant",new Simple("""Okuhlukile"""))
m.put("variants",new Simple("""Okuhlukile"""))
m.put("timeControl",new Simple("""Ukulawulwa kwesikhathi"""))
m.put("realTime",new Simple("""Isikhathi sangempela"""))
m.put("correspondence",new Simple("""Ukuxhumana"""))
m.put("daysPerTurn",new Simple("""Izinsuku ngakunye"""))
m.put("oneDay",new Simple("""Usuku olulodwa"""))
m.put("time",new Simple("""Isikhathi"""))
m.put("rating",new Simple("""Isilinganiso"""))
m.put("ratingStats",new Simple("""Izibalo zesilinganiso"""))
m.put("username",new Simple("""Igama lomsebenzisi"""))
m.put("usernameOrEmail",new Simple("""Igama lomsebenzisi noma i-imeyili"""))
m.put("changeUsername",new Simple("""Shintsha igama lomsebenzisi"""))
m.put("changeUsernameNotSame",new Escaped("""Icala lezinhlamvu kuphela elingashintsha. Isibonelo "johndoe" kuya ku- "JohnDoe".""","""Icala lezinhlamvu kuphela elingashintsha. Isibonelo &quot;johndoe&quot; kuya ku- &quot;JohnDoe&quot;."""))
m.put("changeUsernameDescription",new Simple("""Shintsha igama lakho lomsebenzisi. Lokhu kungenziwa kanye kuphela futhi uvunyelwe kuphela ukushintsha imeko yezinhlamvu ezisegama lakho lomsebenzisi."""))
m.put("password",new Simple("""Iphasiwedi"""))
m.put("changePassword",new Simple("""Shintsha iphasiwedi"""))
m.put("changeEmail",new Simple("""Shintsha i-imeyili"""))
m.put("email",new Simple("""I-imeyili"""))
m.put("passwordReset",new Simple("""Ukusetha kabusha kwephasiwedi"""))
m.put("forgotPassword",new Simple("""Ukhohlwe iphasiwedi?"""))
m.put("rank",new Simple("""Isikhundla"""))
m.put("gamesPlayed",new Simple("""Imidlalo edlaliwe"""))
m.put("cancel",new Simple("""Khansela"""))
m.put("drawOfferSent",new Simple("""Dweba okunikezwayo kuthunyelwe"""))
m.put("drawOfferDeclined",new Simple("""Ukunikezwa komdwebo kunqatshiwe"""))
m.put("drawOfferAccepted",new Simple("""Dweba okunikezwayo okwamukelwe"""))
m.put("drawOfferCanceled",new Simple("""Dweba ukunikezwa kukhanseliwe"""))
m.put("whiteOffersDraw",new Simple("""White unikeza ukudweba"""))
m.put("blackOffersDraw",new Simple("""Okumnyama okunikezwayo"""))
m.put("whiteDeclinesDraw",new Simple("""Imidwebo emhlophe yenqaba"""))
m.put("blackDeclinesDraw",new Simple("""Imnyama iyenqaba ukudweba"""))
m.put("yourOpponentOffersADraw",new Simple("""Umphikisi wakho unikeza umdwebo"""))
m.put("accept",new Simple("""Vuma"""))
m.put("decline",new Simple("""Ehla"""))
m.put("playingRightNow",new Simple("""Iyadlala manje"""))
m.put("eventInProgress",new Simple("""Iyadlala manje"""))
m.put("finished",new Simple("""Kuqediwe"""))
m.put("abortGame",new Simple("""Lahla umdlalo"""))
m.put("gameAborted",new Simple("""Umdlalo uhoxisiwe"""))
m.put("standard",new Simple("""Okujwayelekile"""))
m.put("unlimited",new Simple("""Akunamkhawulo"""))
m.put("mode",new Simple("""Imodi"""))
m.put("casual",new Simple("""Okuvamile"""))
m.put("rated",new Simple("""Kukalwe"""))
m.put("casualTournament",new Simple("""Okuvamile"""))
m.put("ratedTournament",new Simple("""Kukalwe"""))
m.put("thisGameIsRated",new Simple("""Kukalwe lo mdlalo"""))
m.put("rematch",new Simple("""Phinda ubuke"""))
m.put("rematchOfferSent",new Simple("""Ukuphinda kunikezwe kuthunyelwe"""))
m.put("rematchOfferSentWhite",new Simple("""I-White inikeza ukuphinda uyiqonde"""))
m.put("rematchOfferSentBlack",new Simple("""Okumnyama kunikeza ukuphinda uphinde"""))
m.put("rematchOfferAccepted",new Simple("""Ukuphinda kunikezwe kwamukelwe"""))
m.put("rematchOfferCanceled",new Simple("""Ukuphinda okunikezwayo kukhanseliwe"""))
m.put("rematchOfferDeclined",new Simple("""Ukunikezwa okuphindwayo kunqatshiwe"""))
m.put("cancelRematchOffer",new Simple("""Khansela ukunikezwa kokuphindwayo"""))
m.put("viewRematch",new Simple("""Bheka ukuphinda unikeze"""))
m.put("confirmMove",new Simple("""Qinisekisa ukunyakaza"""))
m.put("play",new Simple("""Dlala"""))
m.put("inbox",new Simple("""Ibhokisi lokungenayo"""))
m.put("chatRoom",new Simple("""Igumbi lokuxoxa"""))
m.put("loginToChat",new Simple("""Ngena ngemvume ukuze uxoxe"""))
m.put("youHaveBeenTimedOut",new Simple("""Uphelelwe isikhathi."""))
m.put("spectatorRoom",new Simple("""Igumbi lokubuka"""))
m.put("composeMessage",new Simple("""Qamba umyalezo"""))
m.put("noNewMessages",new Simple("""Ayikho imilayezo emisha"""))
m.put("emails:emailConfirm_click",new Simple("""Chofoza isixhumanisi ukuze unike amandla i-akhawunti yakho Lichess:"""))
m.put("emails:emailConfirm_ignore",new Simple("""Uma ungazange ubhalise namaLayisense ungawunaka lo mlayezo ngokuphepha."""))
m.put("emails:passwordReset_intro",new Simple("""Sithole isicelo sokusetha kabusha iphasiwedi ye-akhawunti yakho."""))
m.put("emails:passwordReset_clickOrIgnore",new Simple("""Uma wenze lesi sicelo, chofoza kusixhumanisi esingezansi. Uma kungenjalo, ungayinaka le imeyili."""))
m.put("emails:emailChange_intro",new Simple("""Ucele ukuguqula ikheli lakho le-imeyili."""))
m.put("emails:emailChange_click",new Simple("""Ukuqinisekisa ukuthi uyakwazi ukufinyelela le imeyili, sicela uchofoze isixhumanisi esingezansi:"""))
m.put("emails:logInToLichess",new Simple("""Ngena ngemvume ku-lichess.org, %s"""))
m.put("emails:common_orPaste",new Simple("""(Ukuchofoza kungasebenzi? Zama ukunamathisela kusiphequluli sakho!)"""))
m.put("emails:common_note",new Simple("""Le yi-imeyili yesevisi ehlobene nokusebenzisa kwakho %s."""))
m.put("emails:common_contact",new Simple("""Ukuxhumana nathi, sicela usebenzise %s."""))
m.put("settings:settings",new Simple("""Izilungiselelo"""))
m.put("settings:closeAccount",new Simple("""Vala i-akhawunti"""))
m.put("settings:closingIsDefinitive",new Simple("""Ukuvala kucacile. Akukho ukubuyela emuva. Uqinisekile?"""))
m.put("settings:cantOpenSimilarAccount",new Simple("""Ngeke uvunyelwe ukuvula i-akhawunti entsha enegama elifanayo, noma ngabe icala lihlukile."""))
m.put("settings:changedMindDoNotCloseAccount",new Simple("""Ngishintshe umqondo wami, ungavali i-akhawunti yami"""))
m.put("settings:closeAccountExplanation",new Simple("""Uqinisekile ukuthi ufuna ukuvala i-akhawunti yakho? Ukuvala i-akhawunti yakho kuyisinqumo saphakade. AKUFANELE ukwazi ukungena ku-NJALO YONKE."""))
m.put("settings:thisAccountIsClosed",new Simple("""Le akhawunti ivaliwe."""))
m.put("search:search",new Simple("""Sesha"""))
m.put("search:advancedSearch",new Simple("""Ucwaningo Olujulile"""))
m.put("search:opponentName",new Simple("""Igama eliphikisayo"""))
m.put("search:loser",new Simple("""Isahluleki"""))
m.put("search:from",new Simple("""Kusuka"""))
m.put("search:to",new Simple("""To"""))
m.put("search:humanOrComputer",new Simple("""Ukuthi ophikisana naye womdlali wayengumuntu noma eyikhompyutha"""))
m.put("search:aiLevel",new Simple("""A.I. izinga"""))
m.put("search:source",new Simple("""Umthombo"""))
m.put("search:nbTurns",new Simple("""Inani lokushintshana"""))
m.put("search:result",new Simple("""Umphumela"""))
m.put("search:winnerColor",new Simple("""Umbala wokuwina"""))
m.put("search:date",new Simple("""Usuku"""))
m.put("search:sortBy",new Simple("""Hlunga nge"""))
m.put("search:analysis",new Simple("""Ukuhlaziywa"""))
m.put("search:onlyAnalysed",new Simple("""Imidlalo kuphela lapho ukuhlaziywa kwekhompyutha kutholakala khona"""))
m.put("tourname:hourlyRapidArena",new Simple("""Ihora Lokwakha Ngehora"""))
m.put("tourname:hourlyRapid",new Simple("""Ngokushesha Ngehora"""))
    m
  }
}
