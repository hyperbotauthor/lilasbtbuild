package lila.i18n

import I18nQuantity._

// format: OFF
private object `te-IN` {

  def load: java.util.HashMap[MessageKey, Translation] = {
    val m = new java.util.HashMap[MessageKey, Translation](218)
m.put("playWithAFriend",new Simple("""మిత్రులతో ఆడండి"""))
m.put("playWithTheMachine",new Simple("""కంప్యూటర్ తో ఆడండి"""))
m.put("toInviteSomeoneToPlayGiveThisUrl",new Simple("""ఆటకు ఆహ్వానించడానికి ఈ లింక్ ఇవ్వండి"""))
m.put("gameOver",new Simple("""ఆట సమాప్తం"""))
m.put("waitingForOpponent",new Simple("""ప్రత్యర్థి కోసం ఎదురుచూస్తున్నాం"""))
m.put("waiting",new Simple("""కాచుకొని ఉన్నాం"""))
m.put("yourTurn",new Simple("""మీ వంతు"""))
m.put("aiNameLevelAiLevel",new Simple("""%1$s స్థాయి %2$s"""))
m.put("level",new Simple("""స్థాయి"""))
m.put("toggleTheChat",new Simple("""బాతాఖానీ చెయ్యండి లేదా ఆపండి"""))
m.put("toggleSound",new Simple("""శ్రవణం (వినడం) ఆరంభించండి లేదా ఆపండి"""))
m.put("chat",new Simple("""మాట్లాడండి"""))
m.put("resign",new Simple("""రాజీనామా"""))
m.put("checkmate",new Simple("""ఆటకట్టు"""))
m.put("stalemate",new Simple("""దిగ్బంధం (ఎటు పోవడానికి దారి లేదు)"""))
m.put("white",new Simple("""తెలుపు రంగు"""))
m.put("black",new Simple("""నలుపు రంగు"""))
m.put("randomColor",new Simple("""ఏ రంగైనా సరే"""))
m.put("createAGame",new Simple("""ఒక ఆట మొదలుపెడదాం"""))
m.put("whiteIsVictorious",new Simple("""తెలుపు పక్షం గెలిచింది"""))
m.put("blackIsVictorious",new Simple("""నలుపు పక్షం గెలిచింది"""))
m.put("youPlayTheWhitePieces",new Simple("""మీరు తెలుపు రంగు లాగా ఆడాలి"""))
m.put("youPlayTheBlackPieces",new Simple("""మీరు నలుపు రంగు లాగా ఆడాలి"""))
m.put("itsYourTurn",new Simple("""ఇప్పుడు మీ వంతు!"""))
m.put("kingInTheCenter",new Simple("""రాజు రంగమధ్యం చేరారు"""))
m.put("threeChecks",new Simple("""మూడువైపుల నుంచి కత్తులు దూస్తున్నాయి"""))
m.put("raceFinished",new Simple("""పరుగు ముగిసింది"""))
m.put("variantEnding",new Simple("""మరొక ముగింపు"""))
m.put("newOpponent",new Simple("""కొత్త ప్రత్యర్థి"""))
m.put("yourOpponentWantsToPlayANewGameWithYou",new Simple("""మీ ప్రత్యర్థి మరొక ఆట ఆడాలనుకుంటున్నారు"""))
m.put("joinTheGame",new Simple("""ఆటలో పాల్గొనండి"""))
m.put("whitePlays",new Simple("""ఇప్పుడు తెల్లసైన్యం వంతు"""))
m.put("blackPlays",new Simple("""ఇప్పుడు నలుపుసైన్యం వంతు"""))
m.put("opponentLeftChoices",new Simple("""మీ ప్రత్యర్థి బహుశా ఆట విడిచి వెళ్లిపోయారేమో. మీరు కాసేపు ఆగి చూడవచ్చు, లేదా గెలుపోటములు సమానంగా పంచుకోవచ్చు, లేదా విజయం ప్రకటించుకోవచ్చు."""))
m.put("makeYourOpponentResign",new Simple("""మీ ప్రత్యర్థిని ఓడించండి"""))
m.put("forceResignation",new Simple("""గెలుపు పొందడం"""))
m.put("forceDraw",new Simple("""సంధి కోరండి"""))
m.put("talkInChat",new Simple("""దయచేసి బాతాఖానీ లో మర్యాదగా మసలుకోండి!"""))
m.put("theFirstPersonToComeOnThisUrlWillPlayWithYou",new Simple("""ఈ లింకుకు మొదట వచ్చిన వారు మీతో ఆడతారు."""))
m.put("whiteResigned",new Simple("""తెలుపు రాజు రాజీనామా చేసేశారు"""))
m.put("blackResigned",new Simple("""నలుపు రాజు రాజీనామా చేసేశారు"""))
m.put("whiteLeftTheGame",new Simple("""తెలుపు రాజు ఆట వదిలి వెళ్లిపోయారు"""))
m.put("blackLeftTheGame",new Simple("""నలుపు రాజు ఆట వదిలి వెళ్లిపోయారు"""))
m.put("shareThisUrlToLetSpectatorsSeeTheGame",new Simple("""ప్రేక్షకులు చూసేందుకు వీలుగా ఈ లింకును వారికి తెలియజెయ్యండి"""))
m.put("theComputerAnalysisHasFailed",new Simple("""కంప్యూటర్ విశ్లేషణ విఫలమయ్యింది"""))
m.put("viewTheComputerAnalysis",new Simple("""కంప్యూటర్ విశ్లేషణ చూడండి"""))
m.put("requestAComputerAnalysis",new Simple("""కంప్యూటర్ విశ్లేషణను అభ్యర్థించండి"""))
m.put("computerAnalysis",new Simple("""కంప్యూటర్ విశ్లేషణ"""))
m.put("computerAnalysisAvailable",new Simple("""కంప్యూటర్ విశ్లేషణ ఉంది"""))
m.put("analysis",new Simple("""విశ్లేషణా పటము"""))
m.put("depthX",new Simple("""లోతు %s"""))
m.put("usingServerAnalysis",new Simple("""సర్వర్ విశ్లేషణ వాడుతున్నాం"""))
m.put("loadingEngine",new Simple("""చదరంగయంత్రం సిద్ధమవుతోంది..."""))
m.put("cloudAnalysis",new Simple("""విశ్లషణ జరుగుతుంది"""))
m.put("goDeeper",new Simple("""ఇంకా లోతుగా వెళ్ళండి"""))
m.put("showThreat",new Simple("""పొంచి ఉన్న ప్రమాదం చూపించండి"""))
m.put("inLocalBrowser",new Simple("""స్థానిక బ్రౌజర్లో"""))
m.put("toggleLocalEvaluation",new Simple("""స్థానిక అంచనాపధ్ధతికి మార్చండి"""))
m.put("promoteVariation",new Simple("""మీ శాఖను ప్రచారం చెయ్యండి"""))
m.put("makeMainLine",new Simple("""దీనినే ప్రధాన శాఖగా మార్చండి"""))
m.put("deleteFromHere",new Simple("""ఇక్కడినుంచి తీసివెయ్యండి"""))
m.put("forceVariation",new Simple("""మీ శాఖను ప్రచారం చెయ్యండి"""))
m.put("move",new Simple("""జరుపు లేదా ఎత్తు వెయ్యండి"""))
m.put("variantLoss",new Simple("""శాఖ ఓటమి"""))
m.put("variantWin",new Simple("""శాఖ గెలుపు"""))
m.put("insufficientMaterial",new Simple("""సైన్యం సరిపోదు"""))
m.put("pawnMove",new Simple("""పావు కదలాలి"""))
m.put("capture",new Simple("""బంధించండి"""))
m.put("close",new Simple("""మూసెయ్యండి"""))
m.put("winning",new Simple("""గెలిచే ఎత్తు"""))
m.put("losing",new Simple("""ఓడిపోయే ఎత్తు"""))
m.put("drawn",new Simple("""గెలుపోటములు సమానము"""))
m.put("unknown",new Simple("""తెలియదు"""))
m.put("database",new Simple("""క్రీడా భాన్డాగారము"""))
m.put("whiteDrawBlack",new Simple("""తెలుపు / సమము / నలుపు"""))
m.put("averageRatingX",new Simple("""సగటు స్థానము: %s"""))
m.put("recentGames",new Simple("""ఇటీవలి ఆటలు"""))
m.put("topGames",new Simple("""అగ్రశ్రేణి ఆటలు"""))
m.put("masterDbExplanation",new Simple("""%2$s నుంచి %3$s దాకా %1$s+ FIDE అర్హత కలిగిన ఆటగాళ్ల 20 లక్షల ఆటలు"""))
m.put("mateInXHalfMoves",new Plurals(new Map.Map2(One,"""%s సగం-ఎత్తుతో ఆట కట్టు""",Other,"""%s సగం-ఎత్తులలో ఆట కట్టు""")))
m.put("noGameFound",new Simple("""ఆట దొరకలేదు"""))
m.put("maybeIncludeMoreGamesFromThePreferencesMenu",new Simple("""ఇష్టాయిష్టాల పట్టిక నుంచి మరిన్ని ఆటలను కలుపుకోవచ్చునేమో?"""))
m.put("openingExplorer",new Simple("""మొదటి ఎత్తుగడల పరిశీలన"""))
m.put("xOpeningExplorer",new Simple("""%s రకపు మొదటి ఎత్తుగడల పరిశీలన"""))
m.put("winPreventedBy50MoveRule",new Simple("""50 ఎత్తుగడల నియమం చేత గెలుపు భంగం"""))
m.put("lossSavedBy50MoveRule",new Simple("""50 ఎత్తుగడల నియమం చేత ఓటమి నుంచి రక్షణ"""))
m.put("allSet",new Simple("""అంతా సిద్ధం!"""))
m.put("importPgn",new Simple("""PGN ఆట దిగుమతి"""))
m.put("delete",new Simple("""తీసివెయ్యండి"""))
m.put("deleteThisImportedGame",new Simple("""ఈ దిగుమతి చేసుకున్న ఆటను తీసివెయ్యాలా?"""))
m.put("replayMode",new Simple("""మళ్ళీ ఆడదాం"""))
m.put("realtimeReplay",new Simple("""ఏకకాలంలో"""))
m.put("byCPL",new Simple("""భటులనష్టం ప్రకారం"""))
m.put("openStudy",new Simple("""అధ్యయనం లోకి వెళదాం"""))
m.put("enable",new Simple("""కావాలి"""))
m.put("bestMoveArrow",new Simple("""మంచి ఎత్తుగడకు దారి"""))
m.put("evaluationGauge",new Simple("""అంచనా సూచిక"""))
m.put("multipleLines",new Simple("""పలు శాఖలు"""))
m.put("cpus",new Simple("""కేంద్రగణకయంత్రాలు"""))
m.put("memory",new Simple("""జ్ఞాపకనిధి"""))
m.put("infiniteAnalysis",new Simple("""అనంతమైన విశ్లేషణ"""))
m.put("removesTheDepthLimit",new Simple("""లోతు నియతిని తీసివేసి, కంప్యూటర్ ను వెచ్చగా ఉంచుతుంది"""))
m.put("blunder",new Simple("""మహా తప్పు"""))
m.put("blunders",new Simple("""మహా తప్పులు"""))
m.put("mistake",new Simple("""తప్పు"""))
m.put("mistakes",new Simple("""తప్పులు"""))
m.put("inaccuracy",new Simple("""సరికాదు"""))
m.put("inaccuracies",new Simple("""సరికావు"""))
m.put("moveTimes",new Simple("""ఎత్తుగడకు పట్టిన సమయం"""))
m.put("flipBoard",new Simple("""పటమును బోర్లించు"""))
m.put("threefoldRepetition",new Simple("""మూడు రెట్లు పునరావృతం"""))
m.put("claimADraw",new Simple("""అనిశ్చిత ఫలితం అని ప్రకటించుకోండి"""))
m.put("offerDraw",new Simple("""అనిశ్చిత ఫలితం అని ప్రతిపాదించండి"""))
m.put("draw",new Simple("""అనిశ్చిత ఫలితం"""))
m.put("nbPlayers",new Plurals(new Map.Map2(One,"""%s ఆటగాడు""",Other,"""%s ఆటగాళ్ళు""")))
m.put("currentGames",new Simple("""ఇప్పటి ఆటలు"""))
m.put("viewInFullSize",new Simple("""పూర్తి పరిమాణంలో చూడండి"""))
m.put("logOut",new Simple("""నిష్క్రమించండి"""))
m.put("signIn",new Simple("""ప్రవేశించండి"""))
m.put("youNeedAnAccountToDoThat",new Simple("""అది చెయ్యడానికి ఒక ఖాతా అవసరం"""))
m.put("signUp",new Simple("""దరఖాస్తు"""))
m.put("computersAreNotAllowedToPlay",new Simple("""కంప్యూటర్ గానీ కంప్యూటర్ ఆధారిత ఆటగాళలను కానీ మేము అనుమతించం. దయచేసి చేస్ ఎంజన్ల, డేటా బేసుల లేక ఇతర ఆటగాళల సహకారం పొందకండి. ఒకటి కంటె ఎక్కువ అకౌంట్లు వాడటం నిషేదం. ఎక్కువ అకౌంట్లు సృష్టించడం లేక వాడటం వంటి మరియు పైనా చెప్పిన పనులు చేస్తే తమ అకౌంట్ నిషేదించబడగలదని గమనించవలసిందిగా కోరుతున్నాం."""))
m.put("games",new Simple("""ఆటలు"""))
m.put("forum",new Simple("""సమావేశ ప్రదేశం"""))
m.put("xPostedInForumY",new Simple("""%2$s అనే టాపికు పై %1$s పోస్టు చేశారు"""))
m.put("latestForumPosts",new Simple("""తాజా సమావేశ ప్రదేశ అంశాలు"""))
m.put("players",new Simple("""ఆటగాళ్లు"""))
m.put("friends",new Simple("""స్నేహితులు"""))
m.put("discussions",new Simple("""సంభాషణలు"""))
m.put("today",new Simple("""ఈరోజు"""))
m.put("yesterday",new Simple("""నిన్న"""))
m.put("minutesPerSide",new Simple("""గడువు"""))
m.put("variant",new Simple("""రకం"""))
m.put("variants",new Simple("""రకాలు"""))
m.put("timeControl",new Simple("""సమయ పాలన"""))
m.put("realTime",new Simple("""ప్రస్తుతం"""))
m.put("correspondence",new Simple("""సుదూర"""))
m.put("daysPerTurn",new Simple("""రోజుకి కదలికలు"""))
m.put("oneDay",new Simple("""ఒక రోజు"""))
m.put("nbDays",new Plurals(new Map.Map2(One,"""%s రోజు""",Other,"""%s రోజులు""")))
m.put("nbHours",new Plurals(new Map.Map2(One,"""%s hour""",Other,"""%s hours""")))
m.put("time",new Simple("""సమయం"""))
m.put("rating",new Simple("""నైపుణ్యం"""))
m.put("ratingStats",new Simple("""నైపుణ్య గణాంకాలు"""))
m.put("username",new Simple("""ఆటగాడి పేరు"""))
m.put("usernameOrEmail",new Simple("""ఆటగాడి పేరు లేదా ఈమెయిలు"""))
m.put("changeUsername",new Simple("""ఆటగాడి పేరు మార్చు"""))
m.put("changeUsernameNotSame",new Escaped("""అక్షరాల పరిమాణం మాత్రమే మారొచ్చు. ఉదాహరణకి "johndoe" నుంచి "JohnDoe".""","""అక్షరాల పరిమాణం మాత్రమే మారొచ్చు. ఉదాహరణకి &quot;johndoe&quot; నుంచి &quot;JohnDoe&quot;."""))
m.put("changeUsernameDescription",new Simple("""ఆటగాడి పేరు మార్చండి. దీనిని ఒకేసారి చెయ్యగలరు తర్వాత అక్షరాల పరిమాణం మాత్రమే మారొచ్చు."""))
m.put("password",new Simple("""పాస్వర్డ్"""))
m.put("changePassword",new Simple("""పాస్వర్డ్ మార్చండి"""))
m.put("changeEmail",new Simple("""ఇమెయిల్మా ర్చండి"""))
m.put("email",new Simple("""ఇమెయిల్"""))
m.put("passwordReset",new Simple("""కొత్త పాస్వర్డ్ కోసం"""))
m.put("forgotPassword",new Simple("""పాస్వర్డ్ మర్చిపోయారా?"""))
m.put("rank",new Simple("""స్థానం"""))
m.put("rankX",new Simple("""స్థానం: %s"""))
m.put("rankIsUpdatedEveryNbMinutes",new Plurals(new Map.Map2(One,"""ప్రతి నిమిషం స్థానం నవీకరణ చెందుతుంది""",Other,"""ప్రతి %s నిమిషాలకు స్థానం నవీకరణ చెందుతుంది""")))
m.put("nbPuzzles",new Plurals(new Map.Map2(One,"""%sవ చిక్కు ప్రశ్న""",Other,"""%s చిక్కు ప్రశ్నలు""")))
m.put("gamesPlayed",new Simple("""ఆడిన ఆటలు"""))
m.put("nbGamesWithYou",new Plurals(new Map.Map2(One,"""నీతో ఆడిన %sవ ఆట""",Other,"""నీతో ఆడిన మొత్తం %s ఆటలు""")))
m.put("cancel",new Simple("""రద్దు చేయండి"""))
m.put("drawOfferSent",new Simple("""సంధి ప్రతిపాదన పంపబడింది"""))
m.put("drawOfferDeclined",new Simple("""సంధి ప్రతిపాదన తిరస్కరించబడింది"""))
m.put("drawOfferAccepted",new Simple("""సంధి ప్రతిపాదన ఆమోదించబడింది"""))
m.put("drawOfferCanceled",new Simple("""సంధి ప్రతిపాదన రద్దుచేయబడింది"""))
m.put("whiteOffersDraw",new Simple("""తెల్ల పావులు సంధి కోరుకుంటున్నాయి"""))
m.put("blackOffersDraw",new Simple("""నల్ల పావులు సంధి కోరుకుంటున్నాయి"""))
m.put("whiteDeclinesDraw",new Simple("""తెల్ల పావులు సంధి నిరాకరించాయి"""))
m.put("blackDeclinesDraw",new Simple("""నల్ల పావులు సంధి నిరాకరించాయి"""))
m.put("yourOpponentOffersADraw",new Simple("""ప్రత్యర్థి సంధి కోరుకొంటున్నారు"""))
m.put("accept",new Simple("""అంగీకరించు"""))
m.put("decline",new Simple("""నిరాకరించు"""))
m.put("playingRightNow",new Simple("""ఆట ఆడుతున్నారు"""))
m.put("eventInProgress",new Simple("""ఆట ఆడుతున్నారు"""))
m.put("finished",new Simple("""పూర్తయింది"""))
m.put("finishesX",new Simple("""మిగిలిన సమయం %s"""))
m.put("abortGame",new Simple("""ఆట ఆగిపోయింది"""))
m.put("gameAborted",new Simple("""గేమ్ ఆగిపోయినది"""))
m.put("standard",new Simple("""ప్రామాణికం"""))
m.put("unlimited",new Simple("""అపరిమితం"""))
m.put("casual",new Simple("""సాధారణం"""))
m.put("casualTournament",new Simple("""సాధారణం"""))
m.put("rematch",new Simple("""తిరిగి పోటీ"""))
m.put("emails:emailConfirm_subject",new Simple("""మీ lichess.org ఖాతా %s, ధ్రువపరచండి"""))
m.put("emails:emailConfirm_click",new Simple("""మీ Lichess ఖాతాను నిద్రలేపి, వాడడం మొదలుపెట్టడానికి ఈ లంకెను నొక్కండి:"""))
m.put("emails:emailConfirm_ignore",new Simple("""ఒకవేళ మీరు lichess లో చేరియుండక పొతే ఈ సందేశాన్ని పట్టించుకోనవసరం లేదు."""))
m.put("emails:passwordReset_subject",new Simple("""మీ lichess రహస్యపదాన్ని మార్చండి, %s"""))
m.put("emails:passwordReset_intro",new Simple("""మీ ఖాతాకు ప్రస్తుతమున్న రహస్యపదాన్ని తుడిచిపెట్టి, కొత్త రహస్యపదాన్ని సృష్టించమని అభ్యర్థన వచ్చింది."""))
m.put("emails:passwordReset_clickOrIgnore",new Simple("""మీరు ఈ అభ్యర్థన చేసియున్నట్లయితే, కింది లంకె ను నొక్కండి. లేదంటే, ఈ ఈమెయిల్ ను పట్టించుకోనవసరం లేదు."""))
m.put("emails:emailChange_subject",new Simple("""కొత్త ఈమెయిల్ చిరునామా ను ధ్రువపరచండి, %s"""))
m.put("emails:emailChange_intro",new Simple("""మీరు మీ ఈమెయిల్ చిరునామాను మార్చమని అభ్యర్థించారు."""))
m.put("emails:emailChange_click",new Simple("""మీరు ఈ ఈమెయిల్ ఖాతాను చదవగలరని ధ్రువపరించేందుకుగాను, దయయుంచి కింది లంకె పైన నొక్కండి:"""))
m.put("emails:welcome_subject",new Simple("""%s, lichess.org కి స్వాగతము"""))
m.put("emails:welcome_text",new Escaped("""ఇక దీనితో https://lichess.org లో మీరు ఖాతాను తెరవటం విజయవంతంగా పూర్తయ్యింది. 

మీ పూర్తి సమాచారం %1$s లో ఉంది. దానిని %2$s లో చూసి మీకు కావలసిన విధంగా మార్పులు చేసుకోండి.

విజయీభవ, మీ రాచసైన్యం ప్రత్యర్థి రాజును బందీగా పట్టుగొను గాక!""","""ఇక దీనితో https://lichess.org లో మీరు ఖాతాను తెరవటం విజయవంతంగా పూర్తయ్యింది. <br /><br />మీ పూర్తి సమాచారం %1$s లో ఉంది. దానిని %2$s లో చూసి మీకు కావలసిన విధంగా మార్పులు చేసుకోండి.<br /><br />విజయీభవ, మీ రాచసైన్యం ప్రత్యర్థి రాజును బందీగా పట్టుగొను గాక!"""))
m.put("emails:common_orPaste",new Simple("""(ఏంటి? నొక్కితే పనిచేయటం లేదా? అయితే, బ్రౌసర్ లో పూసి - అంటే అదేనండీ paste చేసి - చూడండి!)"""))
m.put("emails:common_note",new Simple("""ఇది చిన్న పరామర్శండీ, మీరు %s ఈమెయిల్ ఎలా వాడుతున్నారో తెలపడానికి."""))
m.put("emails:common_contact",new Simple("""మమ్మల్ని సంప్రదించడానికి దయచేసి %s వాడండి."""))
m.put("activity:activity",new Simple("""కార్యకలాపములు"""))
m.put("activity:hostedALiveStream",new Simple("""ప్రత్యక్ష ప్రసారం మొదలయింది"""))
m.put("activity:supportedNbMonths",new Plurals(new Map.Map2(One,"""%2$s గా lichess.org ను %1$s నెల పోషించాను""",Other,"""%2$s గా lichess.org ను %1$s నెలలు పోషించాను""")))
m.put("activity:practicedNbPositions",new Plurals(new Map.Map2(One,"""%2$s విభాగములో %1$s వ వ్యూహాము సాధన చేశారు""",Other,"""%2$s విభాగములోని %1$s వ్యూహాలను సాధన చేశారు""")))
m.put("activity:solvedNbPuzzles",new Plurals(new Map.Map2(One,"""%s వ సమస్యను పరిష్కరించారు""",Other,"""%s సమస్యలను పరిష్కరించారు""")))
m.put("activity:playedNbGames",new Plurals(new Map.Map2(One,"""మీరు %2$s వంటిది %1$s ఆట ఆడారు""",Other,"""మీరు %2$s వంటి ఆటలు %1$s ఆడారు""")))
m.put("activity:postedNbMessages",new Plurals(new Map.Map2(One,"""%2$s లో %1$s సందేశం రాశారు""",Other,"""%2$s లో %1$s సందేశాలను రాశారు""")))
m.put("activity:playedNbMoves",new Plurals(new Map.Map2(One,"""%1$s ఎత్తు వేశారు""",Other,"""%1$s ఎత్తులు వేశారు""")))
m.put("activity:inNbCorrespondenceGames",new Plurals(new Map.Map2(One,"""ఉత్తరప్రత్యుత్తరాల ద్వారా %1$s లో""",Other,"""ఉత్తరప్రత్యుత్తరాల ద్వారా %1$s లో""")))
m.put("activity:completedNbGames",new Plurals(new Map.Map2(One,"""ఉత్తరప్రత్యుత్తర పద్ధతిలో %s ఆటను పూర్తి చేశారు""",Other,"""ఉత్తరప్రత్యుత్తర పద్ధతిలో %s ఆటలు పూర్తి చేశారు""")))
m.put("activity:followedNbPlayers",new Plurals(new Map.Map2(One,"""%s ఆడేవారిని అనుసరించడం మొదలుపెట్టారు""",Other,"""%s ఆడేవారిని అనుసరించడం మొదలుపెట్టారు""")))
m.put("activity:gainedNbFollowers",new Plurals(new Map.Map2(One,"""%s మంది కొత్త అనుయాయులను కూడగట్టుకున్నారు""",Other,"""%s మంది కొత్త అనుయాయులను కూడగట్టుకున్నారు""")))
m.put("activity:hostedNbSimuls",new Plurals(new Map.Map2(One,"""ఏకకాలంలో %s ప్రదర్శనను నిర్వహించారు""",Other,"""ఏకకాలంలో %s ప్రదర్శలను నిర్వహించారు""")))
m.put("activity:joinedNbSimuls",new Plurals(new Map.Map2(One,"""ఏకకాలంలో %s ప్రదర్శనలో పాల్గొన్నారు""",Other,"""ఏకకాలంలో %s ప్రదర్శనలలో పాల్గొన్నారు""")))
m.put("activity:createdNbStudies",new Plurals(new Map.Map2(One,"""%s కొత్త అధ్యయనం సృష్టించారు""",Other,"""%s కొత్త అధ్యయనాలు సృష్టించారు""")))
m.put("activity:competedInNbTournaments",new Plurals(new Map.Map2(One,"""%s పోటీలో పోటీచేశారు""",Other,"""%s పోటీలలో పోటీచేశారు""")))
m.put("activity:rankedInTournament",new Plurals(new Map.Map2(One,"""%4$s పోటీలో %3$s ఆటల తరువాత మీరు %1$s స్థానంలో (అంటే %2$s%% శాతం ఉన్నత స్థానంలో) ఉన్నారు""",Other,"""%4$s పోటీలో %3$s ఆట తరువాత మీరు %1$s స్థానంలో (అంటే %2$s%% శాతం ఉన్నత స్థానంలో) ఉన్నారు""")))
m.put("activity:signedUp",new Simple("""Lichess.org లో ఆడటానికి సంతకం చేశారు"""))
m.put("activity:joinedNbTeams",new Plurals(new Map.Map2(One,"""%s జట్టులో చేరారు""",Other,"""%s జట్లలో చేరారు""")))
    m
  }
}
