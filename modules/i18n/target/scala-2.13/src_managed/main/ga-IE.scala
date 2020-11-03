package lila.i18n

import I18nQuantity._

// format: OFF
private object `ga-IE` {

  def load: java.util.HashMap[MessageKey, Translation] = {
    val m = new java.util.HashMap[MessageKey, Translation](456)
m.put("playWithAFriend",new Simple("""Imir le cara"""))
m.put("playWithTheMachine",new Simple("""Imir i gcoinne an mheaisín"""))
m.put("toInviteSomeoneToPlayGiveThisUrl",new Simple("""Chun cuireadh a thabhairt do dhuine, tabhair an URL seo"""))
m.put("gameOver",new Simple("""Cluiche Thar"""))
m.put("waitingForOpponent",new Simple("""Ag feitheamh le chéile comhraic"""))
m.put("waiting",new Simple("""Fanacht"""))
m.put("yourTurn",new Simple("""Do shealsa atá ann"""))
m.put("aiNameLevelAiLevel",new Simple("""%1$s leibhéal %2$s"""))
m.put("level",new Simple("""Leibhéal"""))
m.put("toggleTheChat",new Simple("""Scoránú comhrá"""))
m.put("toggleSound",new Simple("""Scoránú fuaime"""))
m.put("chat",new Simple("""Comhrá"""))
m.put("resign",new Simple("""Éirigh as"""))
m.put("checkmate",new Simple("""Marbhsháinn"""))
m.put("stalemate",new Simple("""Leamhsháinn"""))
m.put("white",new Simple("""Bán"""))
m.put("black",new Simple("""Dubh"""))
m.put("randomColor",new Simple("""Taobh randamach"""))
m.put("createAGame",new Simple("""Cruthaigh cluiche"""))
m.put("whiteIsVictorious",new Simple("""Bhuaigh Bán"""))
m.put("blackIsVictorious",new Simple("""Bhuaigh Dubh"""))
m.put("youPlayTheWhitePieces",new Simple("""Imir leis an bhfoireann bhán"""))
m.put("youPlayTheBlackPieces",new Simple("""Imir leis an bhfoireann dubh"""))
m.put("itsYourTurn",new Simple("""Is leatsa an imirt!"""))
m.put("kingInTheCenter",new Simple("""Rí sa lár"""))
m.put("threeChecks",new Simple("""Trí sháinn"""))
m.put("raceFinished",new Simple("""Tá an rás thart"""))
m.put("variantEnding",new Simple("""Deireadh athraitheach"""))
m.put("newOpponent",new Simple("""Céile imeartha nua"""))
m.put("yourOpponentWantsToPlayANewGameWithYou",new Simple("""Tá do chéile imeartha ag lorg cluiche eile leat"""))
m.put("joinTheGame",new Simple("""Glac páirt sa chluiche"""))
m.put("whitePlays",new Simple("""Is le Bán an imirt"""))
m.put("blackPlays",new Simple("""Is le Dubh an imirt"""))
m.put("opponentLeftChoices",new Escaped("""B'fhéidir go bhfuil an cluiche fágtha ag do chéile imeartha. Is féidir leat an bua a éileamh, comhscór a éileamh, nó fan.""","""B&#39;fhéidir go bhfuil an cluiche fágtha ag do chéile imeartha. Is féidir leat an bua a éileamh, comhscór a éileamh, nó fan."""))
m.put("makeYourOpponentResign",new Simple("""Cuir iallach ar do chéile imeartha éirí as"""))
m.put("forceResignation",new Simple("""Éiligh an bua"""))
m.put("forceDraw",new Simple("""Éiligh comhscór"""))
m.put("talkInChat",new Simple("""Bí dea-mhéasach sa chomhrá!"""))
m.put("theFirstPersonToComeOnThisUrlWillPlayWithYou",new Simple("""Imreoidh an chéad duine a thagann go dtí an URL seo leat"""))
m.put("whiteResigned",new Escaped("""D'éirigh Bán as""","""D&#39;éirigh Bán as"""))
m.put("blackResigned",new Escaped("""D'éirigh Dubh as""","""D&#39;éirigh Dubh as"""))
m.put("whiteLeftTheGame",new Escaped("""D'fhág Bán an cluiche""","""D&#39;fhág Bán an cluiche"""))
m.put("blackLeftTheGame",new Escaped("""D'fhág Dubh an cluiche""","""D&#39;fhág Dubh an cluiche"""))
m.put("shareThisUrlToLetSpectatorsSeeTheGame",new Simple("""Scaip an URL don lucht féachana"""))
m.put("theComputerAnalysisHasFailed",new Simple("""Theip ar anailís ar ríomhaire"""))
m.put("viewTheComputerAnalysis",new Simple("""Féach ar anailís ar ríomhaire"""))
m.put("requestAComputerAnalysis",new Simple("""Iarr anailís ar ríomhaire"""))
m.put("computerAnalysis",new Simple("""Anailís ar ríomhaire"""))
m.put("computerAnalysisAvailable",new Simple("""Anailís Ríomhaire ar fáil"""))
m.put("analysis",new Simple("""Bórd anailíse"""))
m.put("depthX",new Simple("""Doimhneacht %s"""))
m.put("usingServerAnalysis",new Simple("""Ag úsáid anailís freastalaí"""))
m.put("loadingEngine",new Simple("""Inneall ag lódáil..."""))
m.put("cloudAnalysis",new Simple("""Anailís scamaill"""))
m.put("goDeeper",new Simple("""Téigh níos doimhne"""))
m.put("showThreat",new Simple("""Taispeáin an bhagairt"""))
m.put("inLocalBrowser",new Simple("""sa bhrabhsálaí logánta"""))
m.put("toggleLocalEvaluation",new Simple("""Scóránú meastóireachta logánta"""))
m.put("promoteVariation",new Simple("""Cuir an líne seo chun tosaigh"""))
m.put("makeMainLine",new Simple("""Déan príomhlíne"""))
m.put("deleteFromHere",new Simple("""Scrios as seo amach"""))
m.put("forceVariation",new Simple("""Athrú fórsa"""))
m.put("move",new Simple("""Bog"""))
m.put("variantLoss",new Simple("""Teip malairte"""))
m.put("variantWin",new Simple("""Bua malartach"""))
m.put("insufficientMaterial",new Simple("""Easpa maoine"""))
m.put("pawnMove",new Simple("""Bogadh shaighdiúir"""))
m.put("capture",new Simple("""Gabh"""))
m.put("close",new Simple("""Dún"""))
m.put("winning",new Simple("""Buach"""))
m.put("losing",new Simple("""Caillteach"""))
m.put("drawn",new Simple("""Comhscór"""))
m.put("unknown",new Simple("""Ní fios"""))
m.put("database",new Simple("""Bunachar"""))
m.put("whiteDrawBlack",new Simple("""Bán / Comhscór / Dubh"""))
m.put("averageRatingX",new Simple("""Meán-rátáil: %s"""))
m.put("recentGames",new Simple("""Cluichí dheireanacha"""))
m.put("topGames",new Simple("""Cluichí is fearr"""))
m.put("masterDbExplanation",new Simple("""Dhá mhilliúin cluichí thar an mbord %1$s imreoirí le rátáil FIDE ó %2$s go %3$s"""))
m.put("noGameFound",new Simple("""Ní bhfuarathas aon cluichí"""))
m.put("allSet",new Simple("""Réidh le n-imeacht!"""))
m.put("importPgn",new Simple("""Iompórtaigh PGN"""))
m.put("delete",new Simple("""Scrios"""))
m.put("deleteThisImportedGame",new Simple("""Scrios an gluiche iompórtáilte?"""))
m.put("replayMode",new Simple("""Mód athimeartha"""))
m.put("realtimeReplay",new Simple("""Fíor-am"""))
m.put("bestMoveArrow",new Simple("""Saighead don chorraíl is fearr"""))
m.put("multipleLines",new Simple("""Línte ar leith"""))
m.put("cpus",new Simple("""LAPanna"""))
m.put("memory",new Simple("""Cuimhne"""))
m.put("infiniteAnalysis",new Simple("""Anailís neamhtheoranta"""))
m.put("removesTheDepthLimit",new Simple("""Faigheann sé réidh leis an teorainn doimhneacht, agus coiníonn sé do ríomhaire teolaí"""))
m.put("blunder",new Simple("""Meancóg"""))
m.put("blunders",new Simple("""Botúin mhóra"""))
m.put("mistake",new Simple("""Botún"""))
m.put("mistakes",new Simple("""Botúin"""))
m.put("inaccuracy",new Simple("""Míchruinneas"""))
m.put("inaccuracies",new Simple("""Bearta míchruinne"""))
m.put("moveTimes",new Simple("""Amanna na mbeart"""))
m.put("flipBoard",new Simple("""Cas an bord"""))
m.put("threefoldRepetition",new Simple("""Athshuíomh faoi thrí"""))
m.put("claimADraw",new Simple("""Éiligh comhscór"""))
m.put("offerDraw",new Simple("""Tairg Comhscór"""))
m.put("draw",new Simple("""Comhscór"""))
m.put("currentGames",new Simple("""Cluichí ar siúl"""))
m.put("viewInFullSize",new Simple("""Amharc lánmhéide"""))
m.put("logOut",new Simple("""Logáil amach"""))
m.put("signIn",new Simple("""Logáil isteach"""))
m.put("youNeedAnAccountToDoThat",new Simple("""Tá cuntas ag teastáil uait chun é sin a dhéanamh"""))
m.put("signUp",new Simple("""Cláraigh"""))
m.put("computersAreNotAllowedToPlay",new Simple("""Níl cead imeartha ag ríomhairí nó ag imreoirí le cabhair ó ríomhairí. Ná bí ag lorg cabhrach ó innill, bunachair sonraí nó imreoirí agus tú ag imirt. Moltar go láidir gan cuntais iolraí a chruthú agus is féidir cosc a chur ar úsáideoirí as an iomarca cuntais a chruthú."""))
m.put("games",new Simple("""Cluichí"""))
m.put("forum",new Simple("""Fóram"""))
m.put("players",new Simple("""Imreoirí"""))
m.put("friends",new Simple("""Cairde"""))
m.put("discussions",new Simple("""Comhráite"""))
m.put("today",new Simple("""Inniu"""))
m.put("yesterday",new Simple("""Inné"""))
m.put("minutesPerSide",new Simple("""Nóiméid an taobh"""))
m.put("realTime",new Simple("""Fíor-am"""))
m.put("oneDay",new Simple("""Lá amháin"""))
m.put("nbDays",new Plurals(Map(One->"""Lá amháin""",Other->"""%s lá""",Few->"""%s lá""",Many->"""%s lá""",Two->"""Dhá lá""")))
m.put("time",new Simple("""Am"""))
m.put("rating",new Simple("""Rátáil"""))
m.put("ratingStats",new Simple("""Staitisticí rátála"""))
m.put("username",new Simple("""Ainm úsáideora"""))
m.put("usernameOrEmail",new Simple("""Ainm úsáideora"""))
m.put("password",new Simple("""Focal faire"""))
m.put("changePassword",new Simple("""Athraigh pasfhocal"""))
m.put("changeEmail",new Simple("""Athraigh ríomhphost"""))
m.put("email",new Simple("""Ríomhphost"""))
m.put("passwordReset",new Simple("""Athshocraigh pasfhocal"""))
m.put("forgotPassword",new Simple("""Pasfhocal dearmadta"""))
m.put("rank",new Simple("""Céimíocht"""))
m.put("rankX",new Simple("""Áit: %s"""))
m.put("gamesPlayed",new Simple("""Cluichí imeartha"""))
m.put("cancel",new Simple("""Cealaigh"""))
m.put("whiteTimeOut",new Simple("""Am an Bháin istigh"""))
m.put("blackTimeOut",new Simple("""Am an Duibh istigh"""))
m.put("drawOfferSent",new Simple("""Tairiscint comhscóir seolta"""))
m.put("drawOfferDeclined",new Simple("""Diúltaíodh an tairiscint comhscóir"""))
m.put("drawOfferAccepted",new Simple("""Glacadh leis an tairiscint comhscóir"""))
m.put("drawOfferCanceled",new Simple("""Tairiscint comhscóir curtha ar ceal"""))
m.put("whiteOffersDraw",new Simple("""Tairgíonn Bán comhscór"""))
m.put("blackOffersDraw",new Simple("""Tairgíonn Dubh comhscór"""))
m.put("whiteDeclinesDraw",new Simple("""Diúltaíonn Bán do chomhscór"""))
m.put("blackDeclinesDraw",new Simple("""Diúltaíonn Dubh do chomhscór"""))
m.put("yourOpponentOffersADraw",new Simple("""Tá do chéile comhraic ag tairiscint comhscóir"""))
m.put("accept",new Simple("""Glac"""))
m.put("decline",new Simple("""Diúltaigh"""))
m.put("playingRightNow",new Simple("""Á imirt anois"""))
m.put("eventInProgress",new Simple("""Á imirt anois"""))
m.put("finished",new Simple("""Críochnaithe"""))
m.put("finishesX",new Simple("""ag críochnú %s"""))
m.put("standard",new Simple("""Caighdeán"""))
m.put("unlimited",new Simple("""Neamhtheoranta"""))
m.put("mode",new Simple("""Modh"""))
m.put("casual",new Simple("""Neamhfhoirmiúil"""))
m.put("rated",new Simple("""Rátáil"""))
m.put("rematch",new Simple("""Athimirt"""))
m.put("rematchOfferSent",new Simple("""Tairiscint athimeartha seolta"""))
m.put("rematchOfferSentWhite",new Simple("""Tairgíonn Bán athimirt"""))
m.put("rematchOfferSentBlack",new Simple("""Tairgíonn Dubh athimirt"""))
m.put("rematchOfferAccepted",new Simple("""Glacadh leis an tairiscint athimeartha"""))
m.put("rematchOfferCanceled",new Simple("""Cealaíodh an tairiscint athimeartha"""))
m.put("rematchOfferDeclined",new Simple("""Diúltaíodh an tairiscint athimeartha"""))
m.put("cancelRematchOffer",new Simple("""Cealaigh an tairiscint athimeartha"""))
m.put("viewRematch",new Simple("""Féach ar an athimirt"""))
m.put("play",new Simple("""Imir"""))
m.put("inbox",new Simple("""Bhosca"""))
m.put("chatRoom",new Simple("""Seomra comhrá"""))
m.put("youHaveBeenTimedOut",new Simple("""Tá tú curtha ar fionraí ar feadh tréimhse."""))
m.put("spectatorRoom",new Simple("""Seomra lucht féachana"""))
m.put("composeMessage",new Simple("""Cruthaigh teachtaireacht"""))
m.put("subject",new Simple("""Ábhar"""))
m.put("send",new Simple("""Seol"""))
m.put("freeOnlineChess",new Simple("""Ficheall Shaor in Aisce Ar Líne"""))
m.put("spectators",new Simple("""Lucht féachana:"""))
m.put("nbRated",new Plurals(Map(One->"""%s cluiche rátáilte""",Other->"""%s chluichí rátáilte""",Few->"""%s chluichí rátáilte""",Many->"""%s chluichí rátáilte""",Two->"""%s chluichí rátáilte""")))
m.put("nbPlaying",new Plurals(Map(One->"""%s á imirt""",Other->"""%s á imirt""",Few->"""%s á imirt""",Many->"""%s á imirt""",Two->"""%s á imirt""")))
m.put("exportGames",new Simple("""Easpórtálaigh cluichí"""))
m.put("ratingRange",new Simple("""Réimse rátála"""))
m.put("giveNbSeconds",new Plurals(Map(One->"""Tabhair %s soicind""",Other->"""Tabhair %s shoicind""",Few->"""Tabhair %s shoicind""",Many->"""Tabhair %s shoicind""",Two->"""Tabhair %s shoicind""")))
m.put("thisAccountViolatedTos",new Simple("""Chuaigh an chuntas seo in aghaidh téarmaí sheirbhíse Lichess"""))
m.put("thisPlayerArtificiallyIncreasesTheirRating",new Simple("""Ardaíonn/Íslíonn an imreoir seo a rátáil ar shlí bhréagach"""))
m.put("openingExplorerAndTablebase",new Escaped("""Taiscélaí thionscnaimh & bunachar dheireadh an chluiche""","""Taiscélaí thionscnaimh &amp; bunachar dheireadh an chluiche"""))
m.put("takeback",new Simple("""Aistógadh"""))
m.put("proposeATakeback",new Escaped("""Iarraidh d'aistógadh""","""Iarraidh d&#39;aistógadh"""))
m.put("takebackPropositionSent",new Escaped("""Iarraíodh d'aisthógadh""","""Iarraíodh d&#39;aisthógadh"""))
m.put("takebackPropositionDeclined",new Simple("""Aistógadh diúltaithe"""))
m.put("takebackPropositionAccepted",new Simple("""Aistógadh deimhnithe"""))
m.put("takebackPropositionCanceled",new Simple("""Cuireadh an iarratais aistógaithe ar ceal"""))
m.put("yourOpponentProposesATakeback",new Escaped("""Iarraíonn do chéile imeartha d'aistógadh""","""Iarraíonn do chéile imeartha d&#39;aistógadh"""))
m.put("bookmarkThisGame",new Simple("""Cuir leabharmhairc leis an gcluiche seo"""))
m.put("tournament",new Simple("""Comórtas"""))
m.put("tournaments",new Simple("""Comórtais"""))
m.put("tournamentPoints",new Simple("""Pointí ó chomórtais"""))
m.put("nbStudies",new Plurals(Map(One->"""%s staidéar""",Other->"""%s staidéir""",Few->"""%s staidéir""",Many->"""%s staidéir""",Two->"""%s staidéir""")))
m.put("viewTournament",new Simple("""Féach ar chomórtas"""))
m.put("backToTournament",new Simple("""Ar ais go dtí an comórtas"""))
m.put("thematic",new Simple("""Le téama"""))
m.put("moreThanNbRatedGames",new Plurals(Map(One->"""≥ %s cluiche rátáilte""",Other->"""≥ %s cluichí rátáilte""",Few->"""≥ %s cluichí rátáilte""",Many->"""≥ %s cluichí rátáilte""",Two->"""≥ %s cluichí rátáilte""")))
m.put("moreThanNbPerfRatedGames",new Plurals(Map(One->"""≥ %1$s cluiche rátáilte %2$s""",Other->"""≥ %1$s cluichí rátáilte %2$s""",Few->"""≥ %1$s cluichí rátáilte %2$s""",Many->"""≥ %1$s cluichí rátáilte %2$s""",Two->"""≥ %1$s cluichí rátáilte %2$s""")))
m.put("mustBeInTeam",new Simple("""Caithfidh tú a bheith i bhfoireann %s"""))
m.put("youAreNotInTeam",new Simple("""Níl tú sa bhfoireann %s"""))
m.put("backToGame",new Simple("""Ar ais don chluiche"""))
m.put("siteDescription",new Simple("""Ficheall saor in aisce. Imir ficheall i gcoimheadán ghlan. Níl aon fógraí agus ní chaithfear clárú nó plugin a úsáid. Imir ficheall leis an ríomhaire, le cairde nó céilí imeartha randamacha."""))
m.put("xJoinedTeamY",new Simple("""chuaigh %1$s istigh ar bhfoireann %2$s"""))
m.put("xCreatedTeamY",new Simple("""Bhunaigh %1$s an fhoireann %2$s"""))
m.put("xStartedStreaming",new Simple("""Thosaigh %s ag streamáil"""))
m.put("averageElo",new Simple("""Meánrátáil"""))
m.put("location",new Simple("""Láthair"""))
m.put("save",new Simple("""Sábháil"""))
m.put("toStudy",new Simple("""Staidéar"""))
m.put("importGame",new Simple("""Déan cluiche a iompórtáil"""))
m.put("thisIsAChessCaptcha",new Simple("""Seo CAPCHTA fichille."""))
m.put("retry",new Simple("""Bain triail as arís"""))
m.put("reconnecting",new Simple("""Ag athcheangal"""))
m.put("nbFriendsOnline",new Plurals(Map(One->"""cara amháin ar líne""",Other->"""%s cairde ar líne""",Few->"""%s chairde ar líne""",Many->"""%s cairde ar líne""",Two->"""%s chairde ar líne""")))
m.put("noFriendsOnline",new Simple("""Níl aon cara ar líne"""))
m.put("findFriends",new Simple("""Aimsigh cairde"""))
m.put("favoriteOpponents",new Simple("""Céilí comhraic is minicí"""))
m.put("follow",new Simple("""Lean"""))
m.put("following",new Simple("""Ag leanacht"""))
m.put("unfollow",new Simple("""Ná lean a thuilleadh"""))
m.put("block",new Simple("""Cur cosc ar"""))
m.put("blocked",new Simple("""Cosc ar"""))
m.put("unblock",new Simple("""Ná cosc a thuilleadh"""))
m.put("followsYou",new Simple("""Do leanacht"""))
m.put("xStartedFollowingY",new Simple("""Thosaigh %1$s ag leanacht %2$s"""))
m.put("nbFollowers",new Plurals(Map(One->"""leanúnaí amháin""",Other->"""%s leanúnaíthe""",Few->"""%s leanúnaí""",Many->"""%s leanúnaíthe""",Two->"""beirt leanúnaí""")))
m.put("nbFollowing",new Plurals(Map(One->"""duine amháin ag leanacht""",Other->"""%s ag leanacht""",Few->"""%s ag leanacht""",Many->"""%s ag leanacht""",Two->"""beirt ag leanacht""")))
m.put("more",new Simple("""Níos mó"""))
m.put("memberSince",new Simple("""Ball ó"""))
m.put("lastSeenActive",new Simple("""Gníomhach %s"""))
m.put("challengeToPlay",new Simple("""Seol dúshláin chun imirt"""))
m.put("player",new Simple("""Imreoir"""))
m.put("list",new Simple("""Liosta"""))
m.put("graph",new Simple("""Graf"""))
m.put("lessThanNbMinutes",new Plurals(Map(One->"""Níos lú ná nóiméad amháin""",Other->"""Níos lú ná %s nóiméad""",Few->"""Níos lú ná %s nóiméad""",Many->"""Níos lú ná %s nóiméad""",Two->"""Níos lú ná %s nóiméad""")))
m.put("required",new Simple("""Riachtanach."""))
m.put("duration",new Simple("""Fad"""))
m.put("winner",new Simple("""Buaiteoir"""))
m.put("standing",new Simple("""Seasamh"""))
m.put("createANewTournament",new Simple("""Cruthaigh comórtas nua"""))
m.put("tournamentCalendar",new Simple("""Féilire na gcomórtas"""))
m.put("advancedSettings",new Simple("""Socruithe níos casta"""))
m.put("safeTournamentName",new Simple("""Pioc ainm an-sábhailte don chomórtas."""))
m.put("inappropriateNameWarning",new Escaped("""D'fhéatfadh go bhfhaighidhfeá aon rud atá neamhoiriúineach in aon chaoi do chuntas dúnta.""","""D&#39;fhéatfadh go bhfhaighidhfeá aon rud atá neamhoiriúineach in aon chaoi do chuntas dúnta."""))
m.put("emptyTournamentName",new Escaped("""Fág folamh chun an chomórtas a ainmniú in ainneoin d'imreoir fichille cáiliúil.""","""Fág folamh chun an chomórtas a ainmniú in ainneoin d&#39;imreoir fichille cáiliúil."""))
m.put("recommendNotTouching",new Simple("""Molaimid iad seo a fhágáil mar atá."""))
m.put("fewerPlayers",new Simple("""Má shocraíonn tú rialacha a mbaineann le chuir isteach ar an gcomórtas, beidh níos lú imreoirí ag do chomórtas."""))
m.put("showAdvancedSettings",new Simple("""Taispeán na socruithe níos casta"""))
m.put("makePrivateTournament",new Simple("""Déan an chomórtas príobháideach chun nach féidir fáil isteach ar ach le pasfhocal"""))
m.put("join",new Simple("""Glac páirt"""))
m.put("withdraw",new Simple("""Éirigh as"""))
m.put("points",new Simple("""Pointí"""))
m.put("wins",new Simple("""Buanna"""))
m.put("losses",new Simple("""Cailliúintí"""))
m.put("winStreak",new Simple("""Stríoc bhuachana"""))
m.put("createdBy",new Simple("""Cruthaithe ag"""))
m.put("tournamentIsStarting",new Simple("""Tá an comórtas ag tosnú"""))
m.put("tournamentPairingsAreNowClosed",new Simple("""Níl cluichí á shocrú níos mó."""))
m.put("standByX",new Simple("""Fan ort %s, ag roinnt imreoirí ina bpéirí, bí réidh!"""))
m.put("youArePlaying",new Simple("""Tá tú ag imirt!"""))
m.put("winRate",new Simple("""Ráta bua"""))
m.put("berserkRate",new Simple("""Ráta berserk"""))
m.put("performance",new Simple("""Caighdeán imeartha"""))
m.put("tournamentComplete",new Simple("""Comórtas críochnaithe"""))
m.put("movesPlayed",new Simple("""Bogaidh imeartha"""))
m.put("whiteWins",new Simple("""Buanna ag bán"""))
m.put("blackWins",new Simple("""Buanna ag dubh"""))
m.put("draws",new Simple("""Comhscóir"""))
m.put("nextXTournament",new Simple("""An chéad chomórtas %s eile:"""))
m.put("averageOpponent",new Simple("""Meanghrádú na gcéilí imeartha"""))
m.put("membersOnly",new Simple("""Baill amháin"""))
m.put("isPrivate",new Simple("""Príobháideach"""))
m.put("ifNoneLeaveEmpty",new Simple("""Mura bhfuil ann do, fág an bosca folamh"""))
m.put("firstName",new Simple("""Céadainm"""))
m.put("lastName",new Simple("""Sloinne"""))
m.put("country",new Simple("""Tír"""))
m.put("watchLichessTV",new Simple("""Féach ar Lichess TV"""))
m.put("previouslyOnLichessTV",new Simple("""Níos luaithe ar Lichess TV"""))
m.put("onlinePlayers",new Simple("""Imreoirí ar-líne"""))
m.put("activeToday",new Simple("""Gniomhach inniu"""))
m.put("activePlayers",new Simple("""Imreoirí gníomhach"""))
m.put("bestMove",new Simple("""Bogadh is fearr!"""))
m.put("success",new Escaped("""D'éirigh leat""","""D&#39;éirigh leat"""))
m.put("thankYou",new Simple("""Go raibh maith agat!"""))
m.put("tournamentWinners",new Simple("""Buaiteoirí comórtais"""))
m.put("name",new Simple("""Ainm"""))
m.put("description",new Simple("""Cur síos"""))
m.put("no",new Simple("""Ná lig"""))
m.put("yes",new Simple("""Lig"""))
m.put("help",new Simple("""Cabhair:"""))
m.put("createANewTopic",new Simple("""Cruthaigh topaic nua"""))
m.put("topics",new Simple("""Topaicí"""))
m.put("replies",new Simple("""Freagraí"""))
m.put("replyToThisTopic",new Simple("""Tabhair freagra ar an dtopaic seo"""))
m.put("reply",new Simple("""Freagair"""))
m.put("message",new Simple("""Teachtaireacht"""))
m.put("createTheTopic",new Simple("""Cruthaigh an topaic"""))
m.put("reportAUser",new Simple("""Tuairiscigh úsáideoir"""))
m.put("user",new Simple("""Úsáideoir"""))
m.put("reason",new Simple("""Fáth"""))
m.put("whatIsIheMatter",new Simple("""Cad atá cearr?"""))
m.put("cheat",new Simple("""Caimiléir"""))
m.put("insult",new Simple("""Masla"""))
m.put("troll",new Simple("""Tochardán"""))
m.put("other",new Simple("""Eile"""))
m.put("reportDescriptionHelp",new Escaped("""Greamaigh nasc leis an cluiche/na cluichí agus mínigh cad atá cearr le iompar an úsáideoir seo. Ná habair díreach "caimiléireacht", ach inis dúinn mar a bheartaigh tú ar seo. Faraor, déanfar athbhreithniú níos tapúla ar do thuairisc más i mBéarla atá sé.""","""Greamaigh nasc leis an cluiche/na cluichí agus mínigh cad atá cearr le iompar an úsáideoir seo. Ná habair díreach &quot;caimiléireacht&quot;, ach inis dúinn mar a bheartaigh tú ar seo. Faraor, déanfar athbhreithniú níos tapúla ar do thuairisc más i mBéarla atá sé."""))
m.put("error.provideOneCheatedGameLink",new Simple("""Cur nasc le ar a laghad cluiche amháin ina ndéantar caimiléireacht le do thoil."""))
m.put("by",new Simple("""le %s"""))
m.put("thisTopicIsNowClosed",new Simple("""Tá an topaic seo dúnta anois."""))
m.put("questionsAndAnswers",new Escaped("""Ceisteanna & Freagraí""","""Ceisteanna &amp; Freagraí"""))
m.put("notes",new Simple("""Nótaí"""))
m.put("typePrivateNotesHere",new Simple("""Clóscríobh nótaí príobhaideach anseo"""))
m.put("invalidUsernameOrPassword",new Simple("""Ainm úsáideora nó pasfhocal mícheart"""))
m.put("incorrectPassword",new Simple("""Pasfhocal mícheart"""))
m.put("emailMeALink",new Simple("""Seol nasc chugam trí r-phost"""))
m.put("currentPassword",new Simple("""Pasfhocal reatha"""))
m.put("newPassword",new Simple("""Pasfhocal nua"""))
m.put("newPasswordAgain",new Simple("""Pasfhocal nua (arís)"""))
m.put("clockInitialTime",new Simple("""Am tosaithe ar an gclog"""))
m.put("clockIncrement",new Simple("""Am le cur leis an gclog"""))
m.put("privacy",new Simple("""Príobháideachas"""))
m.put("letOtherPlayersFollowYou",new Escaped("""Lig d'imreoirí eile thú a leanacht""","""Lig d&#39;imreoirí eile thú a leanacht"""))
m.put("letOtherPlayersChallengeYou",new Escaped("""Lig d'imreoirí eile dúshlán a sheoladh chugat""","""Lig d&#39;imreoirí eile dúshlán a sheoladh chugat"""))
m.put("letOtherPlayersInviteYouToStudy",new Escaped("""Lig d'imreoirí eile cuireadh staidéir a sheoladh chugat""","""Lig d&#39;imreoirí eile cuireadh staidéir a sheoladh chugat"""))
m.put("sound",new Simple("""Fuaim"""))
m.put("none",new Simple("""Tada"""))
m.put("fast",new Simple("""Tapa"""))
m.put("normal",new Simple("""Gnách"""))
m.put("slow",new Simple("""Mall"""))
m.put("insideTheBoard",new Simple("""Laistigh den chlár"""))
m.put("outsideTheBoard",new Simple("""Lasmuigh den chlár"""))
m.put("onSlowGames",new Simple("""I gcluichí mall"""))
m.put("always",new Simple("""I gcónaí"""))
m.put("never",new Simple("""Ná lig riamh"""))
m.put("difficultyEasy",new Simple("""Éasca"""))
m.put("difficultyNormal",new Simple("""Gnáth"""))
m.put("difficultyHard",new Simple("""Deacair"""))
m.put("xAskedY",new Escaped("""D'iarr %1$s %2$s""","""D&#39;iarr %1$s %2$s"""))
m.put("xAnsweredY",new Escaped("""D'fhreagair %1$s %2$s""","""D&#39;fhreagair %1$s %2$s"""))
m.put("xCommentedY",new Simple("""Dúirt %1$s %2$s"""))
m.put("victory",new Simple("""Bua"""))
m.put("defeat",new Simple("""Cailleadh"""))
m.put("victoryVsYInZ",new Simple("""%1$s i gcoinne %2$s i %3$s"""))
m.put("defeatVsYInZ",new Simple("""%1$s i gcoinne %2$s i %3$s"""))
m.put("yourCityRegionOrDepartment",new Simple("""Do chathair, réigiún nó cúige."""))
m.put("human",new Simple("""Duine"""))
m.put("computer",new Simple("""Ríomhaire"""))
m.put("side",new Simple("""Taobh"""))
m.put("clock",new Simple("""Clog"""))
m.put("playOfflineComputer",new Simple("""Ríomhaire"""))
m.put("learnMenu",new Simple("""Foghlaim"""))
m.put("community",new Simple("""Pobal"""))
m.put("tools",new Simple("""Uirlisí"""))
m.put("playOnline",new Simple("""Imir ar líne"""))
m.put("playOffline",new Simple("""Imir as líne"""))
m.put("castling",new Simple("""Caisleáil"""))
m.put("whiteCastlingKingside",new Simple("""Bán O-O"""))
m.put("blackCastlingKingside",new Simple("""Dubh O-O"""))
m.put("tpTimeSpentPlaying",new Simple("""Am caite ag imirt: %s"""))
m.put("watchGames",new Simple("""Féach ar chluichí"""))
m.put("tpTimeSpentOnTV",new Simple("""Am ar TV: %s"""))
m.put("watch",new Simple("""Féach"""))
m.put("about",new Simple("""Faoi"""))
m.put("aboutX",new Simple("""Faoi %s"""))
m.put("create",new Simple("""Cruthaigh"""))
m.put("lichessTournaments",new Simple("""Comórtais Lichess"""))
m.put("tournamentOfficial",new Simple("""Oifigiúil"""))
m.put("timeBeforeTournamentStarts",new Simple("""Am fágtha sula thosnaíonn an comórtas"""))
m.put("youHaveAlreadyRegisteredTheEmail",new Simple("""Chláraigh tú an ríomhphost cheana féin: %s"""))
m.put("asFreeAsLichess",new Simple("""Chomh saor le Lichess"""))
m.put("anonymous",new Simple("""Gan ainm"""))
m.put("language",new Simple("""Teanga"""))
m.put("challenges",new Simple("""Dushláin"""))
m.put("perfRatingX",new Simple("""Rátáil: %s"""))
m.put("computerThinking",new Simple("""An ríomhaire ag machnamh ..."""))
m.put("waitingForAnalysis",new Simple("""Ag fanacht ar anailís"""))
m.put("doItAgain",new Simple("""Déan arís é"""))
m.put("advantage",new Simple("""Buntáiste"""))
m.put("opening",new Simple("""Oscailt"""))
m.put("sorry",new Simple("""Tá brón orainn :("""))
m.put("weHadToTimeYouOutForAWhile",new Simple("""Bhí orainn thú a chur ar fionraí ar feadh tréimhse."""))
m.put("timeoutExpires",new Simple("""Beidh an tréimhse fionraithe thart %s."""))
m.put("why",new Simple("""Cén fáth?"""))
m.put("pleasantChessExperience",new Simple("""Is mian dúinn atmaisféar maith fichille a chur ar fáil do chách."""))
m.put("howToAvoidThis",new Simple("""Conas é seo a sheachaint?"""))
m.put("playEveryGame",new Simple("""Imir gach cluiche a chuireann tú tús leis."""))
m.put("tryToWin",new Simple("""Déan iarracht gach cluiche a imríonn tú a bhuachaint (nó comhscór a fháil ar a laghad)."""))
m.put("resignLostGames",new Simple("""Éirigh as cluichí caillte (ná lig don clog rith amach)."""))
m.put("classical",new Simple("""Clasaiceach"""))
m.put("ultraBulletDesc",new Simple("""Cluichí ar luas gan chiall; níos lú ná 30 soicind"""))
m.put("arena:arenaTournaments",new Simple("""Comórtais Airéine"""))
m.put("emails:emailConfirm_subject",new Simple("""Deimhnigh do chuntas Lichess.org, %s"""))
m.put("emails:emailConfirm_click",new Simple("""Cliceáil an nasc chun do chuntas Lichess a chumasú:"""))
m.put("emails:emailConfirm_ignore",new Simple("""Munar chláraigh tú le Lichess, is féidir neamhaird a thabhairt ar an teachtaireacht seo."""))
m.put("emails:passwordReset_subject",new Simple("""Athshocraigh do phasfhocal Lichess.org, %s"""))
m.put("emails:passwordReset_intro",new Simple("""Fuair muid iarratas chun do phasfhocal a athshocrú."""))
m.put("emails:passwordReset_clickOrIgnore",new Simple("""Más rud é go ndearna tú an iarratas seo, Déan an nasc faoi bhun a chliceáil. Muna ndearna, tabhair neamhaird ar an ríomhphost seo."""))
m.put("emails:emailChange_subject",new Simple("""Deimhnigh an seoladh ríomhphost nua, %s"""))
m.put("emails:emailChange_intro",new Escaped("""D'iarr tú do sheoladh ríomhphoist a athrú.""","""D&#39;iarr tú do sheoladh ríomhphoist a athrú."""))
m.put("emails:emailChange_click",new Simple("""Chun a dheimhniú go bhfuil rochtain agat ar an seoladh ríomhphoist seo, cliceáil ar an nasc thíos:"""))
m.put("emails:welcome_subject",new Simple("""Fáilte go Lichess.org %s"""))
m.put("emails:welcome_text",new Escaped("""Chruthaigh tú do chuntas go rathúil ar Https://Lichess.org.

Seo do leathanach próifíle:
%1$s. Féadtar é a chur in eagar ar %2$s

Bíodh spraoi agat, agus beidh do phíosaí teacht i gcónaí ar a mbealach chuig do opponents rí!""","""Chruthaigh tú do chuntas go rathúil ar Https://Lichess.org.<br /><br />Seo do leathanach próifíle:<br />%1$s. Féadtar é a chur in eagar ar %2$s<br /><br />Bíodh spraoi agat, agus beidh do phíosaí teacht i gcónaí ar a mbealach chuig do opponents rí!"""))
m.put("emails:logInToLichess",new Simple("""Logáil isteach go lichess.org %s"""))
m.put("emails:common_orPaste",new Simple("""(Cliceáil gan obair? Bain triail as é a chur isteach i do bhrabhsálaí!)"""))
m.put("emails:common_note",new Escaped("""Is ríomhphost seirbhíse é seo a bhaineann le d'úsáid %s.""","""Is ríomhphost seirbhíse é seo a bhaineann le d&#39;úsáid %s."""))
m.put("emails:common_contact",new Simple("""Chun teagmháil a dhéanamh linn, bain úsáid asChun teagmháil a dhéanamh linn, bain úsáid as %s."""))
m.put("learn:learnChess",new Simple("""Foghlaim ficheall"""))
m.put("learn:byPlaying",new Simple("""trí imirt!"""))
m.put("learn:menu",new Simple("""Roghchlár"""))
m.put("learn:progressX",new Simple("""Forás%s"""))
m.put("activity:activity",new Simple("""Gníomhaíocht"""))
m.put("study:private",new Simple("""Cé na daoine! Tá an leathanach seo príobháideach, ní féidir leat é a rochtain"""))
m.put("study:myStudies",new Simple("""Mo chuid staidéir"""))
m.put("study:studiesIContributeTo",new Simple("""Staidéir atá á n-iarraidh agam"""))
m.put("study:myPublicStudies",new Simple("""Mo chuid staidéir phoiblí"""))
m.put("study:myPrivateStudies",new Simple("""Mo chuid staidéir phríobháideacha"""))
m.put("study:myFavoriteStudies",new Simple("""Na staidéir is fearr liom"""))
m.put("study:whatAreStudies",new Simple("""Cad is staidéir ann?"""))
m.put("study:allStudies",new Simple("""Gach staidéar"""))
m.put("study:studiesCreatedByX",new Simple("""Staidéir a chruthaigh %s"""))
m.put("study:noneYet",new Simple("""Níl aon cheann fós."""))
m.put("study:open",new Simple("""Oscailte"""))
m.put("class:nbPendingInvitations",new Plurals(Map(One->"""Cuireadh amháin ar feitheamh""",Other->"""%s cuireadh ar feitheamh""",Few->"""%s chuireadh ar feitheamh""",Many->"""%s gcuireadh ar feitheamh""",Two->"""%s chuireadh ar feitheamh""")))
m.put("class:noPendingInvitations",new Simple("""Gan cuireadh ar feitheamh"""))
m.put("class:students",new Simple("""Mic léinn"""))
m.put("preferences:chessClock",new Simple("""Clog fichille"""))
m.put("team:teams",new Simple("""Foirne"""))
m.put("team:allTeams",new Simple("""Na foirne go léir"""))
m.put("team:newTeam",new Simple("""Foireann nua"""))
m.put("team:myTeams",new Escaped("""M'fhoirne""","""M&#39;fhoirne"""))
m.put("search:search",new Simple("""Cuardaigh"""))
m.put("search:advancedSearch",new Simple("""Cuardach casta"""))
m.put("search:searchInXGames",new Plurals(Map(One->"""Cuardaigh i gcluiche fichille amháin""",Other->"""Cuardaigh i %s chluiche fichille""",Few->"""Cuardaigh i %s chluiche fichille""",Many->"""Cuardaigh i %s chluiche fichille""",Two->"""Cuardaigh i %s chluiche fichille""")))
m.put("search:xGamesFound",new Plurals(Map(One->"""Cluiche amháin aimsithe""",Other->"""%s chluiche aimsithe""",Few->"""%s chluiche aimsithe""",Many->"""%s chluiche aimsithe""",Two->"""%s chluiche aimsithe""")))
m.put("search:opponentName",new Simple("""Ainm céile comhraic"""))
m.put("search:loser",new Simple("""Caillteoir"""))
m.put("search:from",new Simple("""Ó"""))
m.put("search:to",new Simple("""Go"""))
m.put("search:humanOrComputer",new Simple("""An ríomhaire nó duine a bhí sa chéile comhraic"""))
m.put("search:aiLevel",new Simple("""Leibhéal A.I."""))
m.put("search:source",new Simple("""Foinse"""))
m.put("search:result",new Simple("""Toradh"""))
m.put("search:winnerColor",new Simple("""Dath buaiteora"""))
m.put("search:date",new Simple("""Dáta"""))
m.put("search:sortBy",new Simple("""Sórtáil de réir"""))
m.put("search:analysis",new Simple("""Anailís"""))
m.put("search:onlyAnalysed",new Simple("""Cluichí le anailís ríomhaire ar fáil dóibh amháin"""))
m.put("faq:officialRulesPDF",new Simple("""rialacha oifigiúla (PDF)"""))
m.put("faq:aHourlyBulletTournament",new Simple("""comórtas Bullet gach uair an chloig"""))
m.put("swiss:swissTournaments",new Simple("""Comórtais chóras na hEilbhíse"""))
    m
  }
}