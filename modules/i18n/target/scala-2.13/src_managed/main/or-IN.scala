package lila.i18n

import I18nQuantity._

// format: OFF
private object `or-IN` {

  def load: java.util.HashMap[MessageKey, Translation] = {
    val m = new java.util.HashMap[MessageKey, Translation](170)
m.put("playWithAFriend",new Simple("""ସାଙ୍ଗଙ୍କ ସହ ଖେଳନ୍ତୁ"""))
m.put("playWithTheMachine",new Simple("""କମ୍ପ୍ୟୁଟର ସହ ଖେଳନ୍ତୁ"""))
m.put("toInviteSomeoneToPlayGiveThisUrl",new Simple("""କାହାକୁ ଖେଳିବାକୁ ଆମନ୍ତ୍ରଣ କରିବାକୁ, ଏହି URL ଦିଅ |"""))
m.put("gameOver",new Simple("""ଖେଳ ସମାପ୍ତ"""))
m.put("waitingForOpponent",new Simple("""ପ୍ରତିପକ୍ଷକୁ ଅପେକ୍ଷା"""))
m.put("waiting",new Simple("""ଅପେକ୍ଷା"""))
m.put("yourTurn",new Simple("""ତୁମର ପାଳି"""))
m.put("aiNameLevelAiLevel",new Simple("""%1$s ସ୍ତର %2$s"""))
m.put("level",new Simple("""ସ୍ତର"""))
m.put("toggleTheChat",new Simple("""ଚାଟ ପରିବର୍ତ୍ତନ କରନ୍ତୁ"""))
m.put("toggleSound",new Simple("""ଶବ୍ଦ ପରିବର୍ତ୍ତନ କରନ୍ତୁ"""))
m.put("chat",new Simple("""ଚାଟ୍"""))
m.put("resign",new Simple("""ଇସ୍ତଫା ଦିଅନ୍ତୁ"""))
m.put("checkmate",new Simple("""ଚେକମେଟ"""))
m.put("stalemate",new Simple("""ଷ୍ଟାଲେମେଟ୍"""))
m.put("white",new Simple("""ଧଳା"""))
m.put("black",new Simple("""କଳା"""))
m.put("randomColor",new Simple("""ଅନିୟମିତ ପାର୍ଶ୍ୱ"""))
m.put("createAGame",new Simple("""ଏକ ଖେଳ ସୃଷ୍ଟି କରନ୍ତୁ"""))
m.put("whiteIsVictorious",new Simple("""ଧଳା ବିଜୟୀ ଅଟେ"""))
m.put("blackIsVictorious",new Simple("""କଳା ବିଜୟୀ ଅଟେ"""))
m.put("youPlayTheWhitePieces",new Simple("""ତୁମେ ଧଳା ଖଣ୍ଡଗୁଡ଼ିକ ଖେଳୁଛ"""))
m.put("youPlayTheBlackPieces",new Simple("""ତୁମେ କଳା ଖଣ୍ଡଗୁଡ଼ିକ ଖେଳୁଛ"""))
m.put("itsYourTurn",new Simple("""ଏହା ତୁମର ପାଳି!"""))
m.put("kingInTheCenter",new Simple("""କେନ୍ଦ୍ରରେ ରାଜା |"""))
m.put("threeChecks",new Simple("""ତିନି ଚେକ୍"""))
m.put("raceFinished",new Simple("""ରେସ୍ ସମାପ୍ତ"""))
m.put("variantEnding",new Simple("""ବିଭିନ୍ନ ପ୍ରକାର ସମାପ୍ତ"""))
m.put("newOpponent",new Simple("""ନୂତନ ପ୍ରତିଦ୍ୱନ୍ଦ୍ୱୀ |"""))
m.put("yourOpponentWantsToPlayANewGameWithYou",new Simple("""ତୁମର ପ୍ରତିଦ୍ୱନ୍ଦୀ ତୁମ ସହିତ ଏକ ନୂତନ ଖେଳ ଖେଳିବାକୁ ଚାହାଁନ୍ତି"""))
m.put("joinTheGame",new Simple("""ଖେଳରେ ଯୋଗ ଦିଅନ୍ତୁ"""))
m.put("whitePlays",new Simple("""ଧଳାର ପାଳି"""))
m.put("blackPlays",new Simple("""କଳାର ପାଳି"""))
m.put("opponentLeftChoices",new Simple("""ତୁମର ପ୍ରତିଦ୍ୱନ୍ଦୀ ଖେଳ ଛାଡିଥିଲେ | ଆପଣ ବିଜୟ ଦାବି କରିପାରିବେ, ଖେଳକୁ ଡ୍ର ବୋଲି କହିପାରିବେ କିମ୍ବା ଅପେକ୍ଷା କରିପାରିବେ |"""))
m.put("makeYourOpponentResign",new Simple("""ତୁମର ପ୍ରତିଦ୍ୱନ୍ଦୀଙ୍କୁ ଇସ୍ତଫା ଦିଅ"""))
m.put("forceResignation",new Simple("""ବିଜୟ ଦାବି କରନ୍ତୁ"""))
m.put("forceDraw",new Simple("""କଲ୍ ଡ୍ର"""))
m.put("talkInChat",new Simple("""ଦୟାକରି ଚାଟରେ ଭଲ ହୁଅନ୍ତୁ!"""))
m.put("theFirstPersonToComeOnThisUrlWillPlayWithYou",new Simple("""ଏହି URL କୁ ଆସିଥିବା ପ୍ରଥମ ବ୍ୟକ୍ତି ଆପଣଙ୍କ ସହିତ ଖେଳିବେ |"""))
m.put("whiteResigned",new Simple("""ଧଳା ଇସ୍ତଫା ଦେଇଛନ୍ତି"""))
m.put("blackResigned",new Simple("""କଳା ଇସ୍ତଫା ଦେଇଛନ୍ତି"""))
m.put("whiteLeftTheGame",new Simple("""ଧଳା ଖେଳ ଛାଡିଥିଲେ"""))
m.put("blackLeftTheGame",new Simple("""କଳା ଖେଳ ଛାଡିଥିଲେ"""))
m.put("shareThisUrlToLetSpectatorsSeeTheGame",new Simple("""ଦର୍ଶକଙ୍କୁ ଖେଳ ଦେଖିବାକୁ ଏହି URL ଅଂଶୀଦାର କରନ୍ତୁ |"""))
m.put("theComputerAnalysisHasFailed",new Simple("""କମ୍ପ୍ୟୁଟର ବିଶ୍ଳେଷଣ ବିଫଳ ହୋଇଛି"""))
m.put("viewTheComputerAnalysis",new Simple("""କମ୍ପ୍ୟୁଟର ବିଶ୍ଳେଷଣ ଦେଖନ୍ତୁ"""))
m.put("requestAComputerAnalysis",new Simple("""କମ୍ପ୍ୟୁଟର ବିଶ୍ଳେଷଣ ପାଇଁ ଅନୁରୋଧ"""))
m.put("computerAnalysis",new Simple("""କମ୍ପ୍ୟୁଟର ବିଶ୍ଳେଷଣ"""))
m.put("computerAnalysisAvailable",new Simple("""କମ୍ପ୍ୟୁଟର ବିଶ୍ଳେଷଣ ଉପଲବ୍ଧ"""))
m.put("analysis",new Simple("""ବୋର୍ଡର ବିଶ୍ଳେଷଣ"""))
m.put("deleteFromHere",new Simple("""ଏଠାରୁ ବିଲୋପ କରନ୍ତୁ"""))
m.put("move",new Simple("""ସ୍ଥାନାନ୍ତରିତ କରନ୍ତୁ"""))
m.put("close",new Simple("""ବନ୍ଦ"""))
m.put("winning",new Simple("""ଜିତିବା"""))
m.put("losing",new Simple("""ହାରିବା"""))
m.put("database",new Simple("""ଡାଟାବେସ୍"""))
m.put("recentGames",new Simple("""ସାମ୍ପ୍ରତିକ ଖେଳଗୁଡିକ"""))
m.put("delete",new Simple("""ବିଲୋପ କରନ୍ତୁ"""))
m.put("realtimeReplay",new Simple("""ପ୍ରକୃତ ସମୟ"""))
m.put("enable",new Simple("""ସକ୍ଷମ କରନ୍ତୁ"""))
m.put("evaluationGauge",new Simple("""ମୂଲ୍ୟାଙ୍କନ ଗେଜ୍"""))
m.put("multipleLines",new Simple("""ଏକାଧିକ ରେଖା"""))
m.put("cpus",new Simple("""CPU ଗୁଡିକ"""))
m.put("memory",new Simple("""ମେମୋରି"""))
m.put("infiniteAnalysis",new Simple("""ଅସୀମ ବିଶ୍ଳେଷଣ"""))
m.put("removesTheDepthLimit",new Simple("""ଗଭୀରତା ସୀମା ଅପସାରଣ କରେ, ଏବଂ ଆପଣଙ୍କ କମ୍ପ୍ୟୁଟରକୁ ଗରମ ରଖେ"""))
m.put("blunder",new Simple("""ଗମ୍ଭୀର ଭୁଲ"""))
m.put("blunders",new Simple("""ଗମ୍ଭୀର ତ୍ରୁଟି ଗୁଡିକ"""))
m.put("mistake",new Simple("""ଭୁଲ"""))
m.put("mistakes",new Simple("""ଭୁଲ ଗୁଡିକ"""))
m.put("threefoldRepetition",new Simple("""ତିନିଥର ପୁନରାବୃତ୍ତି"""))
m.put("claimADraw",new Simple("""ଡ୍ର ଦାବି କରନ୍ତୁ"""))
m.put("offerDraw",new Simple("""ଡ୍ର ଅଫର୍ କରନ୍ତୁ"""))
m.put("draw",new Simple("""ଡ୍ର"""))
m.put("nbPlayers",new Plurals(new Map.Map2(One,"""%s ଖେଳାଳି""",Other,"""%s ଖେଳାଳି ମାନେ""")))
m.put("currentGames",new Simple("""ସାମ୍ପ୍ରତିକ ଖେଳଗୁଡିକ"""))
m.put("nbGames",new Plurals(new Map.Map2(One,"""%s ଖେଳ""",Other,"""%s ଖେଳଗୁଡିକ""")))
m.put("nbBookmarks",new Plurals(new Map.Map2(One,"""%s ବୁକମାର୍କ""",Other,"""%s ବୁକମାର୍କଗୁଡିକ""")))
m.put("viewInFullSize",new Simple("""ପୂର୍ଣ୍ଣ ଆକାରରେ ଦେଖନ୍ତୁ"""))
m.put("logOut",new Simple("""ବାହାରି ଯାନ୍ତୁ"""))
m.put("signIn",new Simple("""ସା‌ଇନ୍ କରିବା"""))
m.put("youNeedAnAccountToDoThat",new Simple("""ତାହା କରିବା ପାଇଁ ତୁମର ଏକ ଆକାଉଣ୍ଟ୍ ଦରକାର"""))
m.put("signUp",new Simple("""ପଞ୍ଜିକରଣ କର"""))
m.put("computersAreNotAllowedToPlay",new Simple("""କମ୍ପ୍ୟୁଟର ଏବଂ କମ୍ପ୍ୟୁଟର ସାହାଯ୍ୟକାରୀ ଖେଳାଳିଙ୍କୁ ଖେଳିବାକୁ ଅନୁମତି ନାହିଁ | ଖେଳିବା ସମୟରେ ଦୟାକରି ଚେସ ଇଞ୍ଜିନ୍, ଡାଟାବେସ୍ କିମ୍ବା ଅନ୍ୟ ଖେଳାଳିଙ୍କଠାରୁ ସାହାଯ୍ୟ ନିଅନ୍ତୁ ନାହିଁ | ଏହା ମଧ୍ୟ ଧ୍ୟାନ ଦିଅନ୍ତୁ ଯେ ଏକାଧିକ ଆକାଉଣ୍ଟ୍ କରିବା ସଂପୂଣ ନିରୁତ୍ସାହିତ ହୋଇଛି ଏବଂ ଅତ୍ୟଧିକ ମଲ୍ଟି ଆକାଉଣ୍ଟିଂ ନିଷେଧ ହେବ |"""))
m.put("games",new Simple("""ଖେଳଗୁଡିକ"""))
m.put("forum",new Simple("""ଫୋରମ୍"""))
m.put("xPostedInForumY",new Simple("""%1$s %2$s ପ୍ରସଙ୍ଗରେ ପୋଷ୍ଟ କରୀଚନ୍ତୀ"""))
m.put("latestForumPosts",new Simple("""ନୂଆ ଫୋରମ୍ ପୋଷ୍ଟଗୁଡିକ"""))
m.put("players",new Simple("""ଖେଳାଳିମାନେ"""))
m.put("friends",new Simple("""ବନ୍ଧୁଗଣ"""))
m.put("discussions",new Simple("""ବାର୍ତ୍ତାଳାପ ଗୁଡିକ"""))
m.put("today",new Simple("""ଆଜି"""))
m.put("yesterday",new Simple("""ଗତକାଲି"""))
m.put("minutesPerSide",new Simple("""ପ୍ରତୀ ପାର୍ଶ୍ୱର ମିନିଟ୍"""))
m.put("variant",new Simple("""ପ୍ରକାର"""))
m.put("variants",new Simple("""ପ୍ରକାର ଗୁଡିକ"""))
m.put("timeControl",new Simple("""ସମୟ ନିୟନ୍ତ୍ରଣ"""))
m.put("realTime",new Simple("""ପ୍ରକୃତ ସମୟ"""))
m.put("oneDay",new Simple("""ଦିନେ"""))
m.put("time",new Simple("""ସମୟ"""))
m.put("rating",new Simple("""ମୂଲ୍ୟାୟନ"""))
m.put("ratingStats",new Simple("""ମୂଲ୍ୟାୟନ ପରିସଂଖ୍ୟାନ"""))
m.put("study:private",new Simple("""ବ୍ୟକ୍ତିଗତ"""))
m.put("study:myStudies",new Simple("""ମୋର ଅଧ୍ୟୟନ"""))
m.put("tfa:twoFactorAuth",new Simple("""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣ"""))
m.put("tfa:twoFactorHelp",new Simple("""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକରଣ ଆପଣଙ୍କ ଆକାଉଣ୍ଟରେ ସୁରକ୍ଷାର ଅନ୍ୟ ଏକ ସ୍ତର ଯୋଗ କରେ |"""))
m.put("tfa:twoFactorApp",new Simple("""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣ ପାଇଁ ଏକ ଆପ୍ ପାଆନ୍ତୁ, ଉଦାହରଣ ସ୍ୱରୂପ% %1$s ଗୁଗୁଲ୍ ପ୍ରାମାଣିକିକରଣକାରୀ କିମ୍ବା  %2$s"""))
m.put("tfa:scanTheCode",new Simple("""QR କୋଡ୍ରେ ଆପ୍ ରେ ସ୍କାନ୍ କରନ୍ତୁ"""))
m.put("tfa:enterPassword",new Simple("""ସେଟଅପ୍ ସଂପୂର୍ଣ୍ଣ କରିବାକୁ ଆପ୍ ଦ୍ୱାରା ଉତ୍ପାଦିତ ପ୍ରାମାଣିକିକରଣ କୋଡ୍ ପ୍ରବେଶ କରନ୍ତୁ | ଆପଣ ପ୍ରତ୍ୟେକ ଥର ଲଗ୍ ଇନ୍ କରିବାବେଳେ ଆପଣଙ୍କୁ ଏକ ପ୍ରାମାଣିକିକରଣ କୋଡ୍ ଦରକାର"""))
m.put("tfa:authenticationCode",new Simple("""ପ୍ରାମାଣିକିକରଣ କୋଡ୍"""))
m.put("tfa:ifYouLoseAccess",new Simple("""ଟିପନ୍ତୁ: ଯଦି ଆପଣ ଆପଣଙ୍କର ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣ ସଂକେତକୁ ପ୍ରବେଶ ହରାନ୍ତି, ତେବେ ଆପଣ ଇମେଲ୍ ମାଧ୍ୟମରେ ଏକ ପାସୱାର୍ଡ ପୁନ ସେଟ୍ କରିପାରିବେ"""))
m.put("tfa:enableTwoFactor",new Simple("""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣ ସକ୍ଷମ କରନ୍ତୁ"""))
m.put("tfa:disableTwoFactor",new Simple("""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣ ଅକ୍ଷମ କରନ୍ତୁ"""))
m.put("tfa:twoFactorEnabled",new Simple("""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣ ସକ୍ଷମ"""))
m.put("tfa:twoFactorDisable",new Escaped("""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣକୁ ଅକ୍ଷମ କରିବାକୁ ତୁମର ପ୍ରାମାଣିକିକରଣ ଆପରୁ ତୁମର ପାସୱାର୍ଡ ଏବଂ ଏକ ପ୍ରାମାଣିକିକରଣ କୋଡ୍ ଦରକାର |
ଯଦି ତୁମେ ତୁମର ପ୍ରାମାଣିକିକରଣ ସଂକେତକୁ ପ୍ରବେଶ ହରାଇଛ, ତୁମେ ଇମେଲ ମାଧ୍ୟମରେ ଏକ ପାସୱାର୍ଡ ପୁନ ସେଟ୍ ମଧ୍ୟ କରିପାରିବ""","""ଦୁଇ-ଫ୍ୟାକ୍ଟର୍ ପ୍ରାମାଣିକିକରଣକୁ ଅକ୍ଷମ କରିବାକୁ ତୁମର ପ୍ରାମାଣିକିକରଣ ଆପରୁ ତୁମର ପାସୱାର୍ଡ ଏବଂ ଏକ ପ୍ରାମାଣିକିକରଣ କୋଡ୍ ଦରକାର |<br />ଯଦି ତୁମେ ତୁମର ପ୍ରାମାଣିକିକରଣ ସଂକେତକୁ ପ୍ରବେଶ ହରାଇଛ, ତୁମେ ଇମେଲ ମାଧ୍ୟମରେ ଏକ ପାସୱାର୍ଡ ପୁନ ସେଟ୍ ମଧ୍ୟ କରିପାରିବ"""))
m.put("settings:settings",new Simple("""ସେଟିଂସମୂହ"""))
m.put("settings:closeAccount",new Simple("""ଆକାଉଣ୍ଟ ବନ୍ଦ କରନ୍ତୁ"""))
m.put("settings:closingIsDefinitive",new Simple("""ବନ୍ଦ କରିବା ନିଶ୍ଚିତ ଅଟେ | ପଛକୁ ଫେରିବା ନାହିଁ | ଆପଣ ନିଶ୍ଚିତ କି?"""))
m.put("settings:cantOpenSimilarAccount",new Simple("""ସମାନ ନାମ ସହିତ ଏକ ନୂତନ ଖାତା ଖୋଲିବାକୁ ଆପଣଙ୍କୁ ଅନୁମତି ଦିଆଯିବ ନାହିଁ, ଯଦିଓ ମାମଲା ଭିନ୍ନ ଅଟେ"""))
m.put("settings:changedMindDoNotCloseAccount",new Simple("""ମୁଁ ମୋର ମତ ବଦଳାଇଲି, ମୋ ଆକାଉଣ୍ଟ ବନ୍ଦ କର ନାହିଁ"""))
m.put("settings:closeAccountExplanation",new Simple("""ଆପଣ ନିଶ୍ଚିତ କି ଆପଣ ଆପଣଙ୍କର ଆକାଉଣ୍ଟ ବନ୍ଦ କରିବାକୁ ଚାହୁଁଛନ୍ତି? ତୁମର ଆକାଉଣ୍ଟ ବନ୍ଦ କରିବା ଏକ ସ୍ଥାୟୀ ନିଷ୍ପତ୍ତି | ଆପଣ କଦାପି ଆଉଥରେ ଲଗ୍ ଇନ୍ କରିବାକୁ ସମର୍ଥ ହେବେ ନାହିଁ |"""))
m.put("settings:thisAccountIsClosed",new Simple("""ଏହି ଖାତା ବନ୍ଦ ଅଛି"""))
m.put("team:team",new Simple("""Team"""))
m.put("team:teams",new Simple("""ଦଳଗୁଡ଼ିକ"""))
m.put("team:allTeams",new Simple("""ସମସ୍ତ ଦଳ"""))
m.put("team:newTeam",new Simple("""ନୂତନ ଦଳ"""))
m.put("team:myTeams",new Simple("""ମୋର ଦଳଗୁଡିକ"""))
m.put("team:noTeamFound",new Simple("""କୋଣସି ଦଳ ମିଳିଲା ନାହିଁ"""))
m.put("team:joinTeam",new Simple("""ଦଳରେ ଯୋଗ ଦିଅନ୍ତୁ"""))
m.put("team:quitTeam",new Simple("""ଦଳ ଛାଡନ୍ତୁ"""))
m.put("team:anyoneCanJoin",new Simple("""ସମସ୍ତଙ୍କ ପାଇଁ ମାଗଣା"""))
m.put("team:aConfirmationIsRequiredToJoin",new Simple("""ଯୋଗଦେବା ପାଇଁ ଏକ ନିଶ୍ଚିତକରଣ ଆବଶ୍ୟକ"""))
m.put("team:joiningPolicy",new Simple("""ଯୋଗଦେବାର ନୀତି"""))
m.put("team:teamLeaders",new Plurals(new Map.Map2(One,"""ଦଳ ନାୟକ""",Other,"""ଦଳର ନେତାମାନେ""")))
m.put("team:teamBestPlayers",new Simple("""ସର୍ବୋତ୍ତମ ଖେଳାଳି"""))
m.put("team:teamRecentMembers",new Simple("""ସମ୍ପ୍ରତି ସଦସ୍ୟମାନେ"""))
m.put("team:kickSomeone",new Simple("""କାହାକୁ ଦଳରୁ ବାହାର କରିଦିଅ"""))
m.put("team:whoToKick",new Simple("""ଆପଣ କାହାକୁ ଦଳରୁ ବାହାର କରିବାକୁ ଚାହୁଁଛନ୍ତି?"""))
m.put("team:willBeReviewed",new Simple("""ଆପଣଙ୍କର ଯୋଗଦାନ ଅନୁରୋଧ, ଦଳର ନେତାଙ୍କ ଦ୍ୱାରା ସମୀକ୍ଷା କରାଯିବ"""))
m.put("team:beingReviewed",new Simple("""ଆପଣଙ୍କର ଯୋଗଦାନ ଅନୁରୋଧ, ଦଳର ନେତାଙ୍କ ଦ୍ୱାରା ସମୀକ୍ଷା କରାଯାଉଛି"""))
m.put("team:teamBattle",new Simple("""ଦଳ ଯୁଦ୍ଧ"""))
m.put("team:teamBattleOverview",new Simple("""ଏକାଧିକ ଦଳର ଯୁଦ୍ଧରେ, ପ୍ରତ୍ୟେକ ଖେଳାଳି ନିଜ ଦଳ ପାଇଁ ପଏଣ୍ଟ ସ୍କୋର କରନ୍ତି"""))
m.put("team:teamTournament",new Simple("""ଦଳ ଟୁର୍ନାମେଣ୍ଟ"""))
m.put("team:usersWhoCanManageThisTeam",new Simple("""ଉପଭୋକ୍ତା ଯେଉଁମାନେ ଏହି ଦଳ ପରିଚାଳନା କରିପାରିବେ"""))
m.put("team:leadersChat",new Simple("""ନେତାଙ୍କ ଚାଟ୍"""))
m.put("search:search",new Simple("""ସନ୍ଧାନ କର"""))
m.put("search:advancedSearch",new Simple("""ଉନ୍ନତ ସନ୍ଧାନ"""))
m.put("search:xGamesFound",new Plurals(new Map.Map2(One,"""ଖେଳ ଟିଏ ମିଳିଲା""",Other,"""%s ଖେଳଗୁଡିକ ମିଳିଲା""")))
m.put("search:opponentName",new Simple("""ବିରୋଧୀ ନାମ"""))
m.put("search:loser",new Simple("""ପରାଜିତ"""))
m.put("search:from",new Simple("""ଠାରୁ"""))
m.put("search:to",new Simple("""କୁ"""))
m.put("search:humanOrComputer",new Simple("""ଖେଳାଳିଙ୍କ ପ୍ରତିଦ୍ୱନ୍ଦ୍ୱୀ ମଣିଷ ହେଉ କି କମ୍ପ୍ୟୁଟର"""))
m.put("search:aiLevel",new Simple("""A.I. ସ୍ତର"""))
m.put("search:source",new Simple("""ଉତ୍ସ"""))
m.put("search:nbTurns",new Simple("""ଟର୍ନର ସଂଖ୍ୟା"""))
m.put("search:result",new Simple("""ଫଳାଫଳ"""))
m.put("search:winnerColor",new Simple("""ବିଜେତା ରଙ୍ଗ"""))
m.put("search:date",new Simple("""ତାରିଖ"""))
m.put("search:sortBy",new Simple("""ଦ୍ୱାରା ସର୍ଟ କରନ୍ତୁ"""))
m.put("search:analysis",new Simple("""ବିଶ୍ଳେଷଣ"""))
m.put("search:onlyAnalysed",new Simple("""କେବଳ ଖେଳ ଗୁଡିକ ଜାହାର ଏକ କମ୍ପ୍ୟୁଟର ବିଶ୍ଳେଷଣ ଉପଲବ୍ଧ"""))
m.put("lag:isLichessLagging",new Simple("""ଲିଚେସ୍ ଲାଗ୍ ଅଛି କି?"""))
m.put("lag:measurementInProgressThreeDot",new Simple("""ମାପ ଚାଲିଛି ..."""))
m.put("lag:noAndYourNetworkIsGood",new Simple("""ନା, ଏବଂ ଆପଣଙ୍କର ନେଟୱାର୍କ ଭଲ ଅଟେ"""))
m.put("lag:noAndYourNetworkIsBad",new Simple("""ନା, ଏବଂ ଆପଣଙ୍କର ନେଟୱାର୍କ ଖରାପ ଅଟେ"""))
m.put("lag:yesItWillBeFixedSoon",new Simple("""ହଁ ଏହା ଶୀଘ୍ର ସମାଧାନ ହେବ"""))
m.put("lag:lichessServerLatency",new Simple("""ଲିଚେସ୍ ସର୍ଭର ବିଳମ୍ବତା"""))
m.put("swiss:swissTournaments",new Simple("""ସ୍ୱିସ୍ ଟୁର୍ନାମେଣ୍ଟ ଗୁଡିକ"""))
    m
  }
}
