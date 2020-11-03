package lila.i18n



// format: OFF
private object `co-FR` {

  def load: java.util.HashMap[MessageKey, Translation] = {
    val m = new java.util.HashMap[MessageKey, Translation](23)
m.put("playWithAFriend",new Simple("""Ghjucà cun un amicu"""))
m.put("playWithTheMachine",new Escaped("""Ghjucà cù l'urdinatore""","""Ghjucà cù l&#39;urdinatore"""))
m.put("toInviteSomeoneToPlayGiveThisUrl",new Simple("""Per invità à qualchissia à ghjucà, dà questu URL"""))
m.put("gameOver",new Simple("""Persu"""))
m.put("waitingForOpponent",new Simple("""Aspittendu avversariu"""))
m.put("waiting",new Simple("""Aspittendu"""))
m.put("yourTurn",new Simple("""U to turnu"""))
m.put("level",new Simple("""Livellu"""))
m.put("toggleTheChat",new Simple("""Commutà u chat"""))
m.put("toggleSound",new Simple("""Sonore toggle"""))
m.put("chat",new Simple("""Chattare"""))
m.put("resign",new Simple("""Dimissioni"""))
m.put("checkmate",new Simple("""Checkmate"""))
m.put("stalemate",new Simple("""Stazzu"""))
m.put("white",new Simple("""Biancu"""))
m.put("black",new Simple("""Neru"""))
m.put("randomColor",new Simple("""U latu aleatoriu"""))
m.put("createAGame",new Simple("""Crea un ghjocu"""))
m.put("whiteIsVictorious",new Simple("""U biancu hè vittore"""))
m.put("blackIsVictorious",new Simple("""U neru hè vittore"""))
m.put("youPlayTheWhitePieces",new Simple("""Ghjucassi à i pezzi bianchi"""))
m.put("youPlayTheBlackPieces",new Simple("""Ghjucassi à i pezzi neri"""))
    m
  }
}
