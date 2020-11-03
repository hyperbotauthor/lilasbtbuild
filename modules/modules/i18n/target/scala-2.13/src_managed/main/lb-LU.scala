package lila.i18n



// format: OFF
private object `lb-LU` {

  def load: java.util.HashMap[MessageKey, Translation] = {
    val m = new java.util.HashMap[MessageKey, Translation](45)
m.put("playWithAFriend",new Simple("""Spill géint e Kolleg"""))
m.put("playWithTheMachine",new Simple("""Spill géint de Computer"""))
m.put("toInviteSomeoneToPlayGiveThisUrl",new Escaped("""Fir een an dës Partie z'invitéieren, gëff ëm dëse Link""","""Fir een an dës Partie z&#39;invitéieren, gëff ëm dëse Link"""))
m.put("gameOver",new Simple("""Game Over"""))
m.put("waitingForOpponent",new Simple("""Waarden op de Géigner"""))
m.put("waiting",new Simple("""Waarden"""))
m.put("yourTurn",new Simple("""Du bass drun"""))
m.put("aiNameLevelAiLevel",new Simple("""%1$s Level %2$s"""))
m.put("level",new Simple("""Level"""))
m.put("toggleTheChat",new Simple("""Chat uweisen/ausblenden"""))
m.put("toggleSound",new Simple("""Toun umaachen/ausmaachen"""))
m.put("chat",new Simple("""So eppes"""))
m.put("resign",new Simple("""Opginn"""))
m.put("checkmate",new Simple("""Schachmatt"""))
m.put("stalemate",new Simple("""Remis"""))
m.put("white",new Simple("""Wäiss"""))
m.put("black",new Simple("""Schwaarz"""))
m.put("randomColor",new Simple("""Zoufälleg Säit"""))
m.put("createAGame",new Simple("""Erstell eng Partie"""))
m.put("whiteIsVictorious",new Simple("""Wäiss gewënnt"""))
m.put("blackIsVictorious",new Simple("""Schwaarz gewënnt"""))
m.put("youPlayTheWhitePieces",new Simple("""Du spills déi wäiss Figuren"""))
m.put("youPlayTheBlackPieces",new Simple("""Du spills déi schwaarz Figuren"""))
m.put("itsYourTurn",new Simple("""Et ass un dir!"""))
m.put("kingInTheCenter",new Simple("""Kinnek am Zentrum"""))
m.put("threeChecks",new Simple("""Drëtt Kéier Schach"""))
m.put("raceFinished",new Simple("""Course eriwwer"""))
m.put("variantEnding",new Simple("""Enn vun der Variant"""))
m.put("newOpponent",new Simple("""Neie Géigner"""))
m.put("emails:emailConfirm_subject",new Simple("""Bestäteg däi lichess.org-Kont,%s"""))
m.put("emails:emailConfirm_click",new Escaped("""Klick op de Link, fir däi Kont z'aktivéieren:""","""Klick op de Link, fir däi Kont z&#39;aktivéieren:"""))
m.put("emails:emailConfirm_ignore",new Simple("""Wann s du dech net bei Lichess ugemellt hues, kanns de dëse Message ignoréieren."""))
m.put("emails:passwordReset_subject",new Simple("""Setz däi lichess.org-Passwuert zréck, %s"""))
m.put("emails:passwordReset_intro",new Simple("""Mir hunn eng Ufro kritt, fir däi Passwuert zréckzesetzen."""))
m.put("emails:passwordReset_clickOrIgnore",new Simple("""Wann s du déi Ufro gemaach hues, dréck op de Link ënnen. Wann net, kanns de dëse Mail ignoréieren."""))
m.put("emails:emailChange_subject",new Simple("""Bestäteg déi nei E-Mail-Adress, %s"""))
m.put("emails:emailChange_intro",new Escaped("""Du hues eng Ufro gemaach, fir deng E-Mail-Adress z'änneren.""","""Du hues eng Ufro gemaach, fir deng E-Mail-Adress z&#39;änneren."""))
m.put("emails:emailChange_click",new Simple("""Fir ze bestätegen, dass du Zougang op dës E-Mail hues, dréck op de Link ënnen:"""))
m.put("emails:welcome_subject",new Simple("""Wëllkomm op lichess.org, %s"""))
m.put("emails:welcome_text",new Escaped("""D'Erstelle vun dengem Kont op https://lichess.org war erfollegräich.

Hei ass deng Profilsäit: %1$s. Du kanns se hei personaliséieren: %2$s.

Vill Spaass an Erfolleg!""","""D&#39;Erstelle vun dengem Kont op https://lichess.org war erfollegräich.<br /><br />Hei ass deng Profilsäit: %1$s. Du kanns se hei personaliséieren: %2$s.<br /><br />Vill Spaass an Erfolleg!"""))
m.put("emails:logInToLichess",new Simple("""Logg dech op lichess.org an, %s"""))
m.put("emails:common_orPaste",new Simple("""(Klicke funktionnéiert net? Probéier de Link an däi Browser ze kopéieren!)"""))
m.put("emails:common_note",new Simple("""Dëst ass e Service-Mail a Bezuch op däi Kont bei %s."""))
m.put("emails:common_contact",new Simple("""Fir Kontakt mat eis opzehuelen, besich %s."""))
    m
  }
}
