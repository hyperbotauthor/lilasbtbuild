// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/lila/conf/routes
// @DATE:Tue Nov 03 18:37:18 CET 2020

package router

import play.core.routing._

import play.api.mvc._



class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:2
  Lobby_54: controllers.Lobby,
  // @LINE:6
  Timeline_13: controllers.Timeline,
  // @LINE:10
  Search_42: controllers.Search,
  // @LINE:13
  Game_6: controllers.Game,
  // @LINE:17
  Tv_16: controllers.Tv,
  // @LINE:27
  Relation_60: controllers.Relation,
  // @LINE:36
  Insight_0: controllers.Insight,
  // @LINE:43
  UserTournament_45: controllers.UserTournament,
  // @LINE:46
  User_19: controllers.User,
  // @LINE:63
  Dasher_20: controllers.Dasher,
  // @LINE:66
  Blog_36: controllers.Blog,
  // @LINE:75
  Coordinate_4: controllers.Coordinate,
  // @LINE:80
  Puzzle_47: controllers.Puzzle,
  // @LINE:84
  Export_18: controllers.Export,
  // @LINE:98
  UserAnalysis_38: controllers.UserAnalysis,
  // @LINE:104
  Study_58: controllers.Study,
  // @LINE:136
  Relay_25: controllers.Relay,
  // @LINE:148
  Learn_39: controllers.Learn,
  // @LINE:153
  Plan_40: controllers.Plan,
  // @LINE:162
  Main_15: controllers.Main,
  // @LINE:165
  Practice_37: controllers.Practice,
  // @LINE:177
  Streamer_22: controllers.Streamer,
  // @LINE:189
  Round_30: controllers.Round,
  // @LINE:199
  Editor_9: controllers.Editor,
  // @LINE:205
  Analyse_23: controllers.Analyse,
  // @LINE:214
  Tournament_3: controllers.Tournament,
  // @LINE:240
  TournamentCrud_26: controllers.TournamentCrud,
  // @LINE:248
  Swiss_28: controllers.Swiss,
  // @LINE:264
  Simul_51: controllers.Simul,
  // @LINE:280
  Team_57: controllers.Team,
  // @LINE:328
  Fishnet_59: controllers.Fishnet,
  // @LINE:335
  Pref_1: controllers.Pref,
  // @LINE:341
  Setup_49: controllers.Setup,
  // @LINE:352
  Challenge_31: controllers.Challenge,
  // @LINE:361
  Notify_62: controllers.Notify,
  // @LINE:364
  Video_27: controllers.Video,
  // @LINE:370
  I18n_14: controllers.I18n,
  // @LINE:373
  Auth_11: controllers.Auth,
  // @LINE:396
  Mod_56: controllers.Mod,
  // @LINE:436
  Irwin_44: controllers.Irwin,
  // @LINE:441
  Bookmark_46: controllers.Bookmark,
  // @LINE:444
  ForumCateg_29: controllers.ForumCateg,
  // @LINE:445
  ForumPost_52: controllers.ForumPost,
  // @LINE:447
  ForumTopic_17: controllers.ForumTopic,
  // @LINE:461
  Msg_34: controllers.Msg,
  // @LINE:473
  Coach_55: controllers.Coach,
  // @LINE:486
  Clas_35: controllers.Clas,
  // @LINE:523
  Importer_12: controllers.Importer,
  // @LINE:533
  Report_41: controllers.Report,
  // @LINE:545
  Appeal_2: controllers.Appeal,
  // @LINE:553
  Stat_48: controllers.Stat,
  // @LINE:556
  Api_61: controllers.Api,
  // @LINE:583
  Account_8: controllers.Account,
  // @LINE:606
  PlayApi_10: controllers.PlayApi,
  // @LINE:647
  OAuthToken_50: controllers.OAuthToken,
  // @LINE:651
  OAuthApp_53: controllers.OAuthApp,
  // @LINE:660
  Event_24: controllers.Event,
  // @LINE:680
  Dev_32: controllers.Dev,
  // @LINE:687
  Push_21: controllers.Push,
  // @LINE:692
  Page_7: controllers.Page,
  // @LINE:713
  DgtCtrl_33: controllers.DgtCtrl,
  // @LINE:729
  ExternalAssets_43: controllers.ExternalAssets,
  // @LINE:736
  Options_5: controllers.Options,
  val prefix: String
) extends GeneratedRouter {

  def withPrefix(addPrefix: String): Routes = ???


  // @LINE:2
  private[this] val controllers_Lobby_home0_route = Route("GET",
    PathPattern(List())
  )

  // @LINE:3
  private[this] val controllers_Lobby_seeks1_route = Route("GET",
    PathPattern(List(StaticPart("lobby/seeks")))
  )

  // @LINE:6
  private[this] val controllers_Timeline_home2_route = Route("GET",
    PathPattern(List(StaticPart("timeline")))
  )

  // @LINE:7
  private[this] val controllers_Timeline_unsub3_route = Route("POST",
    PathPattern(List(StaticPart("timeline/unsub/"), DynamicPart("channel", """[^/]+""",true)))
  )

  // @LINE:10
  private[this] val controllers_Search_index4_route = Route("GET",
    PathPattern(List(StaticPart("games/search")))
  )

  // @LINE:13
  private[this] val controllers_Game_exportByIds5_route = Route("POST",
    PathPattern(List(StaticPart("games/export/_ids")))
  )

  // @LINE:14
  private[this] val controllers_Game_exportByUser6_route = Route("GET",
    PathPattern(List(StaticPart("games/export/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:17
  private[this] val controllers_Tv_index7_route = Route("GET",
    PathPattern(List(StaticPart("tv")))
  )

  // @LINE:18
  private[this] val controllers_Tv_frame8_route = Route("GET",
    PathPattern(List(StaticPart("tv/frame")))
  )

  // @LINE:19
  private[this] val controllers_Tv_feed9_route = Route("GET",
    PathPattern(List(StaticPart("tv/feed")))
  )

  // @LINE:20
  private[this] val controllers_Tv_channels10_route = Route("GET",
    PathPattern(List(StaticPart("tv/channels")))
  )

  // @LINE:21
  private[this] val controllers_Tv_onChannel11_route = Route("GET",
    PathPattern(List(StaticPart("tv/"), DynamicPart("chanKey", """[^/]+""",true)))
  )

  // @LINE:22
  private[this] val controllers_Tv_sides12_route = Route("GET",
    PathPattern(List(StaticPart("tv/"), DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false), StaticPart("/sides")))
  )

  // @LINE:23
  private[this] val controllers_Tv_games13_route = Route("GET",
    PathPattern(List(StaticPart("games")))
  )

  // @LINE:24
  private[this] val controllers_Tv_gamesChannel14_route = Route("GET",
    PathPattern(List(StaticPart("games/"), DynamicPart("chanKey", """[^/]+""",true)))
  )

  // @LINE:27
  private[this] val controllers_Relation_follow15_route = Route("POST",
    PathPattern(List(StaticPart("rel/follow/"), DynamicPart("userId", """[^/]+""",true)))
  )

  // @LINE:28
  private[this] val controllers_Relation_unfollow16_route = Route("POST",
    PathPattern(List(StaticPart("rel/unfollow/"), DynamicPart("userId", """[^/]+""",true)))
  )

  // @LINE:29
  private[this] val controllers_Relation_block17_route = Route("POST",
    PathPattern(List(StaticPart("rel/block/"), DynamicPart("userId", """[^/]+""",true)))
  )

  // @LINE:30
  private[this] val controllers_Relation_unblock18_route = Route("POST",
    PathPattern(List(StaticPart("rel/unblock/"), DynamicPart("userId", """[^/]+""",true)))
  )

  // @LINE:31
  private[this] val controllers_Relation_following19_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/following")))
  )

  // @LINE:32
  private[this] val controllers_Relation_followers20_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/followers")))
  )

  // @LINE:33
  private[this] val controllers_Relation_blocks21_route = Route("GET",
    PathPattern(List(StaticPart("rel/blocks")))
  )

  // @LINE:36
  private[this] val controllers_Insight_refresh22_route = Route("POST",
    PathPattern(List(StaticPart("insights/refresh/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:37
  private[this] val controllers_Insight_json23_route = Route("POST",
    PathPattern(List(StaticPart("insights/data/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:38
  private[this] val controllers_Insight_index24_route = Route("GET",
    PathPattern(List(StaticPart("insights/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:39
  private[this] val controllers_Insight_path25_route = Route("GET",
    PathPattern(List(StaticPart("insights/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("metric", """[^/]+""",true), StaticPart("/"), DynamicPart("dimension", """[^/]+""",true)))
  )

  // @LINE:40
  private[this] val controllers_Insight_path26_route = Route("GET",
    PathPattern(List(StaticPart("insights/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("metric", """[^/]+""",true), StaticPart("/"), DynamicPart("dimension", """[^/]+""",true), StaticPart("/"), DynamicPart("filters", """.+""",false)))
  )

  // @LINE:43
  private[this] val controllers_UserTournament_path27_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/tournaments/"), DynamicPart("path", """[^/]+""",true)))
  )

  // @LINE:46
  private[this] val controllers_User_mod28_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/"), DynamicPart("username", """[^/]+""",true), StaticPart("/mod")))
  )

  // @LINE:47
  private[this] val controllers_User_writeNote29_route = Route("POST",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/note")))
  )

  // @LINE:48
  private[this] val controllers_User_deleteNote30_route = Route("POST",
    PathPattern(List(StaticPart("note/delete/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:49
  private[this] val controllers_User_showMini31_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/mini")))
  )

  // @LINE:50
  private[this] val controllers_User_tv32_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/tv")))
  )

  // @LINE:51
  private[this] val controllers_User_perfStat33_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/perf/"), DynamicPart("perfKey", """[^/]+""",true)))
  )

  // @LINE:52
  private[this] val controllers_User_gamesAll34_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/all")))
  )

  // @LINE:53
  private[this] val controllers_User_games35_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("filterName", """[^/]+""",true)))
  )

  // @LINE:54
  private[this] val controllers_User_show36_route = Route("GET",
    PathPattern(List(StaticPart("@/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:55
  private[this] val controllers_User_myself37_route = Route("GET",
    PathPattern(List(StaticPart("player/myself")))
  )

  // @LINE:56
  private[this] val controllers_User_opponents38_route = Route("GET",
    PathPattern(List(StaticPart("player/opponents")))
  )

  // @LINE:57
  private[this] val controllers_User_list39_route = Route("GET",
    PathPattern(List(StaticPart("player")))
  )

  // @LINE:58
  private[this] val controllers_User_topNb40_route = Route("GET",
    PathPattern(List(StaticPart("player/top/"), DynamicPart("nb", """[^/]+""",true), StaticPart("/"), DynamicPart("perfKey", """[^/]+""",true)))
  )

  // @LINE:59
  private[this] val controllers_User_topWeek41_route = Route("GET",
    PathPattern(List(StaticPart("player/top/week")))
  )

  // @LINE:60
  private[this] val controllers_User_online42_route = Route("GET",
    PathPattern(List(StaticPart("player/online")))
  )

  // @LINE:61
  private[this] val controllers_User_autocomplete43_route = Route("GET",
    PathPattern(List(StaticPart("player/autocomplete")))
  )

  // @LINE:63
  private[this] val controllers_Dasher_get44_route = Route("GET",
    PathPattern(List(StaticPart("dasher")))
  )

  // @LINE:66
  private[this] val controllers_Blog_index45_route = Route("GET",
    PathPattern(List(StaticPart("blog")))
  )

  // @LINE:67
  private[this] val controllers_Blog_all46_route = Route("GET",
    PathPattern(List(StaticPart("blog/all")))
  )

  // @LINE:68
  private[this] val controllers_Blog_year47_route = Route("GET",
    PathPattern(List(StaticPart("blog/"), DynamicPart("year", """[^/]+""",true)))
  )

  // @LINE:69
  private[this] val controllers_Blog_discuss48_route = Route("GET",
    PathPattern(List(StaticPart("blog/discuss/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:70
  private[this] val controllers_Blog_show49_route = Route("GET",
    PathPattern(List(StaticPart("blog/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true)))
  )

  // @LINE:71
  private[this] val controllers_Blog_atom50_route = Route("GET",
    PathPattern(List(StaticPart("blog.atom")))
  )

  // @LINE:72
  private[this] val controllers_Blog_sitemapTxt51_route = Route("GET",
    PathPattern(List(StaticPart("blog.txt")))
  )

  // @LINE:75
  private[this] val controllers_Coordinate_home52_route = Route("GET",
    PathPattern(List(StaticPart("training/coordinate")))
  )

  // @LINE:76
  private[this] val controllers_Coordinate_score53_route = Route("POST",
    PathPattern(List(StaticPart("training/coordinate/score")))
  )

  // @LINE:77
  private[this] val controllers_Coordinate_color54_route = Route("POST",
    PathPattern(List(StaticPart("training/coordinate/color")))
  )

  // @LINE:80
  private[this] val controllers_Puzzle_home55_route = Route("GET",
    PathPattern(List(StaticPart("training")))
  )

  // @LINE:81
  private[this] val controllers_Puzzle_newPuzzle56_route = Route("GET",
    PathPattern(List(StaticPart("training/new")))
  )

  // @LINE:82
  private[this] val controllers_Puzzle_daily57_route = Route("GET",
    PathPattern(List(StaticPart("training/daily")))
  )

  // @LINE:83
  private[this] val controllers_Puzzle_frame58_route = Route("GET",
    PathPattern(List(StaticPart("training/frame")))
  )

  // @LINE:84
  private[this] val controllers_Export_legacyPuzzleThumbnail59_route = Route("GET",
    PathPattern(List(StaticPart("training/export/png/"), DynamicPart("id", """[^/]+""",true), StaticPart(".png")))
  )

  // @LINE:85
  private[this] val controllers_Export_puzzleThumbnail60_route = Route("GET",
    PathPattern(List(StaticPart("training/export/gif/thumbnail/"), DynamicPart("id", """[^/]+""",true), StaticPart(".gif")))
  )

  // @LINE:86
  private[this] val controllers_Puzzle_batchSelect61_route = Route("GET",
    PathPattern(List(StaticPart("training/batch")))
  )

  // @LINE:87
  private[this] val controllers_Puzzle_batchSolve62_route = Route("POST",
    PathPattern(List(StaticPart("training/batch")))
  )

  // @LINE:88
  private[this] val controllers_Puzzle_show63_route = Route("GET",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:89
  private[this] val controllers_Puzzle_load64_route = Route("GET",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """[^/]+""",true), StaticPart("/load")))
  )

  // @LINE:90
  private[this] val controllers_Puzzle_vote65_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """[^/]+""",true), StaticPart("/vote")))
  )

  // @LINE:91
  private[this] val controllers_Puzzle_round66_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """[^/]+""",true), StaticPart("/round")))
  )

  // @LINE:93
  private[this] val controllers_Puzzle_round267_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """[^/]+""",true), StaticPart("/round2")))
  )

  // @LINE:95
  private[this] val controllers_Puzzle_round68_route = Route("POST",
    PathPattern(List(StaticPart("training/"), DynamicPart("id", """[^/]+""",true), StaticPart("/attempt")))
  )

  // @LINE:98
  private[this] val controllers_UserAnalysis_help69_route = Route("GET",
    PathPattern(List(StaticPart("analysis/help")))
  )

  // @LINE:99
  private[this] val controllers_UserAnalysis_parseArg70_route = Route("GET",
    PathPattern(List(StaticPart("analysis/"), DynamicPart("something", """.+""",false)))
  )

  // @LINE:100
  private[this] val controllers_UserAnalysis_index71_route = Route("GET",
    PathPattern(List(StaticPart("analysis")))
  )

  // @LINE:101
  private[this] val controllers_UserAnalysis_pgn72_route = Route("POST",
    PathPattern(List(StaticPart("analysis/pgn")))
  )

  // @LINE:104
  private[this] val controllers_Study_allDefault73_route = Route("GET",
    PathPattern(List(StaticPart("study")))
  )

  // @LINE:105
  private[this] val controllers_Study_all74_route = Route("GET",
    PathPattern(List(StaticPart("study/all/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:106
  private[this] val controllers_Study_mine75_route = Route("GET",
    PathPattern(List(StaticPart("study/mine/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:107
  private[this] val controllers_Study_mineMember76_route = Route("GET",
    PathPattern(List(StaticPart("study/member/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:108
  private[this] val controllers_Study_minePublic77_route = Route("GET",
    PathPattern(List(StaticPart("study/public/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:109
  private[this] val controllers_Study_minePrivate78_route = Route("GET",
    PathPattern(List(StaticPart("study/private/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:110
  private[this] val controllers_Study_mineLikes79_route = Route("GET",
    PathPattern(List(StaticPart("study/likes/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:111
  private[this] val controllers_Study_byOwnerDefault80_route = Route("GET",
    PathPattern(List(StaticPart("study/by/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:112
  private[this] val controllers_Study_byOwner81_route = Route("GET",
    PathPattern(List(StaticPart("study/by/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:113
  private[this] val controllers_Study_search82_route = Route("GET",
    PathPattern(List(StaticPart("study/search")))
  )

  // @LINE:114
  private[this] val controllers_Study_show83_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:115
  private[this] val controllers_Study_create84_route = Route("POST",
    PathPattern(List(StaticPart("study")))
  )

  // @LINE:116
  private[this] val controllers_Study_createAs85_route = Route("POST",
    PathPattern(List(StaticPart("study/as")))
  )

  // @LINE:117
  private[this] val controllers_Study_pgn86_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:118
  private[this] val controllers_Study_chapterPgn87_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:119
  private[this] val controllers_Study_chapterGif88_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false), StaticPart(".gif")))
  )

  // @LINE:120
  private[this] val controllers_Study_delete89_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/delete")))
  )

  // @LINE:121
  private[this] val controllers_Study_cloneStudy90_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/clone")))
  )

  // @LINE:122
  private[this] val controllers_Study_cloneApply91_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/cloneAplly")))
  )

  // @LINE:123
  private[this] val controllers_Study_chapter92_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false)))
  )

  // @LINE:124
  private[this] val controllers_Study_chapterMeta93_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false), StaticPart("/meta")))
  )

  // @LINE:125
  private[this] val controllers_Study_embed94_route = Route("GET",
    PathPattern(List(StaticPart("study/embed/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false)))
  )

  // @LINE:126
  private[this] val controllers_Study_clearChat95_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/clear-chat")))
  )

  // @LINE:127
  private[this] val controllers_Study_importPgn96_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/import-pgn")))
  )

  // @LINE:128
  private[this] val controllers_Study_multiBoard97_route = Route("GET",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/multi-board")))
  )

  // @LINE:129
  private[this] val controllers_Study_admin98_route = Route("POST",
    PathPattern(List(StaticPart("study/"), DynamicPart("id", """\w{8}""",false), StaticPart("/admin")))
  )

  // @LINE:130
  private[this] val controllers_Study_topics99_route = Route("GET",
    PathPattern(List(StaticPart("study/topic")))
  )

  // @LINE:131
  private[this] val controllers_Study_setTopics100_route = Route("POST",
    PathPattern(List(StaticPart("study/topic")))
  )

  // @LINE:132
  private[this] val controllers_Study_byTopic101_route = Route("GET",
    PathPattern(List(StaticPart("study/topic/"), DynamicPart("topic", """[^/]+""",true), StaticPart("/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:133
  private[this] val controllers_Study_topicAutocomplete102_route = Route("GET",
    PathPattern(List(StaticPart("study/topic/autocomplete")))
  )

  // @LINE:136
  private[this] val controllers_Relay_index103_route = Route("GET",
    PathPattern(List(StaticPart("broadcast")))
  )

  // @LINE:137
  private[this] val controllers_Relay_form104_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/new")))
  )

  // @LINE:138
  private[this] val controllers_Relay_create105_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/new")))
  )

  // @LINE:139
  private[this] val controllers_Relay_show106_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:140
  private[this] val controllers_Relay_chapter107_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("chapterId", """\w{8}""",false)))
  )

  // @LINE:141
  private[this] val controllers_Relay_edit108_route = Route("GET",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:142
  private[this] val controllers_Relay_update109_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:143
  private[this] val controllers_Relay_reset110_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false), StaticPart("/reset")))
  )

  // @LINE:144
  private[this] val controllers_Relay_cloneRelay111_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false), StaticPart("/clone")))
  )

  // @LINE:145
  private[this] val controllers_Relay_push112_route = Route("POST",
    PathPattern(List(StaticPart("broadcast/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/"), DynamicPart("id", """\w{8}""",false), StaticPart("/push")))
  )

  // @LINE:148
  private[this] val controllers_Learn_index113_route = Route("GET",
    PathPattern(List(StaticPart("learn")))
  )

  // @LINE:149
  private[this] val controllers_Learn_score114_route = Route("POST",
    PathPattern(List(StaticPart("learn/score")))
  )

  // @LINE:150
  private[this] val controllers_Learn_reset115_route = Route("POST",
    PathPattern(List(StaticPart("learn/reset")))
  )

  // @LINE:153
  private[this] val controllers_Plan_index116_route = Route("GET",
    PathPattern(List(StaticPart("patron")))
  )

  // @LINE:154
  private[this] val controllers_Plan_thanks117_route = Route("GET",
    PathPattern(List(StaticPart("patron/thanks")))
  )

  // @LINE:155
  private[this] val controllers_Plan_list118_route = Route("GET",
    PathPattern(List(StaticPart("patron/list")))
  )

  // @LINE:156
  private[this] val controllers_Plan_switch119_route = Route("POST",
    PathPattern(List(StaticPart("patron/switch")))
  )

  // @LINE:157
  private[this] val controllers_Plan_cancel120_route = Route("POST",
    PathPattern(List(StaticPart("patron/cancel")))
  )

  // @LINE:158
  private[this] val controllers_Plan_webhook121_route = Route("POST",
    PathPattern(List(StaticPart("patron/webhook")))
  )

  // @LINE:159
  private[this] val controllers_Plan_stripeCheckout122_route = Route("POST",
    PathPattern(List(StaticPart("patron/stripe-checkout")))
  )

  // @LINE:160
  private[this] val controllers_Plan_payPalIpn123_route = Route("POST",
    PathPattern(List(StaticPart("patron/ipn")))
  )

  // @LINE:161
  private[this] val controllers_Plan_features124_route = Route("GET",
    PathPattern(List(StaticPart("features")))
  )

  // @LINE:162
  private[this] val controllers_Main_movedPermanently125_route = Route("GET",
    PathPattern(List(StaticPart("donate")))
  )

  // @LINE:165
  private[this] val controllers_Practice_index126_route = Route("GET",
    PathPattern(List(StaticPart("practice")))
  )

  // @LINE:166
  private[this] val controllers_Practice_chapter127_route = Route("GET",
    PathPattern(List(StaticPart("practice/load/"), DynamicPart("studyId", """[^/]+""",true), StaticPart("/"), DynamicPart("chapterId", """[^/]+""",true)))
  )

  // @LINE:167
  private[this] val controllers_Practice_config128_route = Route("GET",
    PathPattern(List(StaticPart("practice/config")))
  )

  // @LINE:168
  private[this] val controllers_Practice_configSave129_route = Route("POST",
    PathPattern(List(StaticPart("practice/config")))
  )

  // @LINE:169
  private[this] val controllers_Practice_reset130_route = Route("POST",
    PathPattern(List(StaticPart("practice/reset")))
  )

  // @LINE:170
  private[this] val controllers_Practice_showSection131_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true)))
  )

  // @LINE:171
  private[this] val controllers_Practice_showStudySlug132_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true), StaticPart("/"), DynamicPart("studySlug", """[^/]+""",true)))
  )

  // @LINE:172
  private[this] val controllers_Practice_show133_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true), StaticPart("/"), DynamicPart("studySlug", """[^/]+""",true), StaticPart("/"), DynamicPart("studyId", """[^/]+""",true)))
  )

  // @LINE:173
  private[this] val controllers_Practice_showChapter134_route = Route("GET",
    PathPattern(List(StaticPart("practice/"), DynamicPart("sectionId", """[^/]+""",true), StaticPart("/"), DynamicPart("studySlug", """[^/]+""",true), StaticPart("/"), DynamicPart("studyId", """[^/]+""",true), StaticPart("/"), DynamicPart("chapterId", """[^/]+""",true)))
  )

  // @LINE:174
  private[this] val controllers_Practice_complete135_route = Route("POST",
    PathPattern(List(StaticPart("practice/complete/"), DynamicPart("chapterId", """[^/]+""",true), StaticPart("/"), DynamicPart("moves", """[^/]+""",true)))
  )

  // @LINE:177
  private[this] val controllers_Streamer_index136_route = Route("GET",
    PathPattern(List(StaticPart("streamer")))
  )

  // @LINE:178
  private[this] val controllers_Streamer_live137_route = Route("GET",
    PathPattern(List(StaticPart("streamer/live")))
  )

  // @LINE:179
  private[this] val controllers_Streamer_edit138_route = Route("GET",
    PathPattern(List(StaticPart("streamer/edit")))
  )

  // @LINE:180
  private[this] val controllers_Streamer_create139_route = Route("POST",
    PathPattern(List(StaticPart("streamer/new")))
  )

  // @LINE:181
  private[this] val controllers_Streamer_editApply140_route = Route("POST",
    PathPattern(List(StaticPart("streamer/edit")))
  )

  // @LINE:182
  private[this] val controllers_Streamer_approvalRequest141_route = Route("POST",
    PathPattern(List(StaticPart("streamer/approval/request")))
  )

  // @LINE:183
  private[this] val controllers_Streamer_picture142_route = Route("GET",
    PathPattern(List(StaticPart("streamer/picture/edit")))
  )

  // @LINE:184
  private[this] val controllers_Streamer_pictureApply143_route = Route("POST",
    PathPattern(List(StaticPart("streamer/picture/upload")))
  )

  // @LINE:185
  private[this] val controllers_Streamer_pictureDelete144_route = Route("POST",
    PathPattern(List(StaticPart("streamer/picture/delete")))
  )

  // @LINE:186
  private[this] val controllers_Streamer_show145_route = Route("GET",
    PathPattern(List(StaticPart("streamer/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:189
  private[this] val controllers_Round_watcher146_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:190
  private[this] val controllers_Round_watcher147_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false)))
  )

  // @LINE:191
  private[this] val controllers_Round_player148_route = Route("GET",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false)))
  )

  // @LINE:192
  private[this] val controllers_Round_sides149_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false), StaticPart("/sides")))
  )

  // @LINE:193
  private[this] val controllers_Round_continue150_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/continue/"), DynamicPart("mode", """[^/]+""",true)))
  )

  // @LINE:194
  private[this] val controllers_Round_readNote151_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/note")))
  )

  // @LINE:195
  private[this] val controllers_Round_writeNote152_route = Route("POST",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/note")))
  )

  // @LINE:196
  private[this] val controllers_Round_mini153_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/mini")))
  )

  // @LINE:197
  private[this] val controllers_Round_mini154_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false), StaticPart("/mini")))
  )

  // @LINE:198
  private[this] val controllers_Round_miniFullId155_route = Route("GET",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/mini")))
  )

  // @LINE:199
  private[this] val controllers_Editor_game156_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:200
  private[this] val controllers_UserAnalysis_game157_route = Route("GET",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false), StaticPart("/analysis")))
  )

  // @LINE:201
  private[this] val controllers_UserAnalysis_forecasts158_route = Route("POST",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/forecasts")))
  )

  // @LINE:202
  private[this] val controllers_UserAnalysis_forecastsOnMyTurn159_route = Route("POST",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/forecasts/"), DynamicPart("uci", """[^/]+""",true)))
  )

  // @LINE:203
  private[this] val controllers_Round_resign160_route = Route("POST",
    PathPattern(List(DynamicPart("fullId", """\w{12}""",false), StaticPart("/resign")))
  )

  // @LINE:205
  private[this] val controllers_Analyse_embed161_route = Route("GET",
    PathPattern(List(StaticPart("embed/"), DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:206
  private[this] val controllers_Analyse_embed162_route = Route("GET",
    PathPattern(List(StaticPart("embed/"), DynamicPart("gameId", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """white|black""",false)))
  )

  // @LINE:208
  private[this] val controllers_Game_delete163_route = Route("POST",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/delete")))
  )

  // @LINE:210
  private[this] val controllers_Round_next164_route = Route("GET",
    PathPattern(List(StaticPart("round-next/"), DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:211
  private[this] val controllers_Round_whatsNext165_route = Route("GET",
    PathPattern(List(StaticPart("whats-next/"), DynamicPart("fullId", """\w{12}""",false)))
  )

  // @LINE:214
  private[this] val controllers_Tournament_home166_route = Route("GET",
    PathPattern(List(StaticPart("tournament")))
  )

  // @LINE:215
  private[this] val controllers_Tournament_featured167_route = Route("GET",
    PathPattern(List(StaticPart("tournament/featured")))
  )

  // @LINE:216
  private[this] val controllers_Tournament_form168_route = Route("GET",
    PathPattern(List(StaticPart("tournament/new")))
  )

  // @LINE:217
  private[this] val controllers_Tournament_create169_route = Route("POST",
    PathPattern(List(StaticPart("tournament/new")))
  )

  // @LINE:218
  private[this] val controllers_Tournament_teamBattleForm170_route = Route("GET",
    PathPattern(List(StaticPart("tournament/team-battle/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:219
  private[this] val controllers_Tournament_teamBattleEdit171_route = Route("GET",
    PathPattern(List(StaticPart("tournament/team-battle/edit/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:220
  private[this] val controllers_Tournament_teamBattleUpdate172_route = Route("POST",
    PathPattern(List(StaticPart("tournament/team-battle/edit/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:221
  private[this] val controllers_Tournament_calendar173_route = Route("GET",
    PathPattern(List(StaticPart("tournament/calendar")))
  )

  // @LINE:222
  private[this] val controllers_Tournament_history174_route = Route("GET",
    PathPattern(List(StaticPart("tournament/history")))
  )

  // @LINE:223
  private[this] val controllers_Tournament_history175_route = Route("GET",
    PathPattern(List(StaticPart("tournament/history/"), DynamicPart("freq", """[^/]+""",true)))
  )

  // @LINE:224
  private[this] val controllers_Tournament_show176_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:225
  private[this] val controllers_Tournament_standing177_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/standing/"), DynamicPart("page", """[^/]+""",true)))
  )

  // @LINE:226
  private[this] val controllers_Tournament_pageOf178_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/page-of/"), DynamicPart("userId", """[^/]+""",true)))
  )

  // @LINE:227
  private[this] val controllers_Tournament_join179_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/join")))
  )

  // @LINE:228
  private[this] val controllers_Tournament_pause180_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/withdraw")))
  )

  // @LINE:229
  private[this] val controllers_Tournament_player181_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/player/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:230
  private[this] val controllers_Tournament_teamInfo182_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/team/"), DynamicPart("team", """[^/]+""",true)))
  )

  // @LINE:231
  private[this] val controllers_Tournament_terminate183_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/terminate")))
  )

  // @LINE:232
  private[this] val controllers_Tournament_edit184_route = Route("GET",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:233
  private[this] val controllers_Tournament_update185_route = Route("POST",
    PathPattern(List(StaticPart("tournament/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:234
  private[this] val controllers_Tournament_help186_route = Route("GET",
    PathPattern(List(StaticPart("tournament/help")))
  )

  // @LINE:235
  private[this] val controllers_Tournament_leaderboard187_route = Route("GET",
    PathPattern(List(StaticPart("tournament/leaderboard")))
  )

  // @LINE:236
  private[this] val controllers_Tournament_shields188_route = Route("GET",
    PathPattern(List(StaticPart("tournament/shields")))
  )

  // @LINE:237
  private[this] val controllers_Tournament_categShields189_route = Route("GET",
    PathPattern(List(StaticPart("tournament/shields/"), DynamicPart("categ", """[^/]+""",true)))
  )

  // @LINE:240
  private[this] val controllers_TournamentCrud_index190_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager")))
  )

  // @LINE:241
  private[this] val controllers_TournamentCrud_cloneT191_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager/clone/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:242
  private[this] val controllers_TournamentCrud_edit192_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:243
  private[this] val controllers_TournamentCrud_update193_route = Route("POST",
    PathPattern(List(StaticPart("tournament/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:244
  private[this] val controllers_TournamentCrud_form194_route = Route("GET",
    PathPattern(List(StaticPart("tournament/manager/new")))
  )

  // @LINE:245
  private[this] val controllers_TournamentCrud_create195_route = Route("POST",
    PathPattern(List(StaticPart("tournament/manager")))
  )

  // @LINE:248
  private[this] val controllers_Swiss_home196_route = Route("GET",
    PathPattern(List(StaticPart("swiss")))
  )

  // @LINE:249
  private[this] val controllers_Swiss_form197_route = Route("GET",
    PathPattern(List(StaticPart("swiss/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:250
  private[this] val controllers_Swiss_create198_route = Route("POST",
    PathPattern(List(StaticPart("swiss/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:251
  private[this] val controllers_Swiss_show199_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:252
  private[this] val controllers_Swiss_exportTrf200_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart(".trf")))
  )

  // @LINE:253
  private[this] val controllers_Swiss_join201_route = Route("POST",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/join")))
  )

  // @LINE:254
  private[this] val controllers_Swiss_withdraw202_route = Route("POST",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/withdraw")))
  )

  // @LINE:255
  private[this] val controllers_Swiss_edit203_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:256
  private[this] val controllers_Swiss_update204_route = Route("POST",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:257
  private[this] val controllers_Swiss_terminate205_route = Route("POST",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/terminate")))
  )

  // @LINE:258
  private[this] val controllers_Swiss_standing206_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/standing/"), DynamicPart("page", """[^/]+""",true)))
  )

  // @LINE:259
  private[this] val controllers_Swiss_pageOf207_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/page-of/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:260
  private[this] val controllers_Swiss_player208_route = Route("GET",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/player/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:261
  private[this] val controllers_Swiss_scheduleNextRound209_route = Route("POST",
    PathPattern(List(StaticPart("swiss/"), DynamicPart("id", """\w{8}""",false), StaticPart("/schedule-next-round")))
  )

  // @LINE:264
  private[this] val controllers_Simul_home210_route = Route("GET",
    PathPattern(List(StaticPart("simul")))
  )

  // @LINE:265
  private[this] val controllers_Simul_form211_route = Route("GET",
    PathPattern(List(StaticPart("simul/new")))
  )

  // @LINE:266
  private[this] val controllers_Simul_create212_route = Route("POST",
    PathPattern(List(StaticPart("simul/new")))
  )

  // @LINE:267
  private[this] val controllers_Simul_homeReload213_route = Route("GET",
    PathPattern(List(StaticPart("simul/reload")))
  )

  // @LINE:268
  private[this] val controllers_Simul_show214_route = Route("GET",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:269
  private[this] val controllers_Simul_edit215_route = Route("GET",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:270
  private[this] val controllers_Simul_update216_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:271
  private[this] val controllers_Simul_hostPing217_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/host-ping")))
  )

  // @LINE:272
  private[this] val controllers_Simul_accept218_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/accept/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:273
  private[this] val controllers_Simul_reject219_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/reject/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:274
  private[this] val controllers_Simul_start220_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/start")))
  )

  // @LINE:275
  private[this] val controllers_Simul_abort221_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/abort")))
  )

  // @LINE:276
  private[this] val controllers_Simul_join222_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/join/"), DynamicPart("variant", """[^/]+""",true)))
  )

  // @LINE:277
  private[this] val controllers_Simul_withdraw223_route = Route("POST",
    PathPattern(List(StaticPart("simul/"), DynamicPart("id", """\w{8}""",false), StaticPart("/withdraw")))
  )

  // @LINE:280
  private[this] val controllers_Team_home224_route = Route("GET",
    PathPattern(List(StaticPart("team")))
  )

  // @LINE:281
  private[this] val controllers_Team_form225_route = Route("GET",
    PathPattern(List(StaticPart("team/new")))
  )

  // @LINE:282
  private[this] val controllers_Team_create226_route = Route("POST",
    PathPattern(List(StaticPart("team/new")))
  )

  // @LINE:283
  private[this] val controllers_Team_mine227_route = Route("GET",
    PathPattern(List(StaticPart("team/me")))
  )

  // @LINE:284
  private[this] val controllers_Team_leader228_route = Route("GET",
    PathPattern(List(StaticPart("team/leader")))
  )

  // @LINE:285
  private[this] val controllers_Team_all229_route = Route("GET",
    PathPattern(List(StaticPart("team/all")))
  )

  // @LINE:286
  private[this] val controllers_Team_requests230_route = Route("GET",
    PathPattern(List(StaticPart("team/requests")))
  )

  // @LINE:287
  private[this] val controllers_Team_search231_route = Route("GET",
    PathPattern(List(StaticPart("team/search")))
  )

  // @LINE:288
  private[this] val controllers_Team_autocomplete232_route = Route("GET",
    PathPattern(List(StaticPart("team/autocomplete")))
  )

  // @LINE:289
  private[this] val controllers_Team_show233_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:290
  private[this] val controllers_Team_join234_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/join")))
  )

  // @LINE:291
  private[this] val controllers_Team_quit235_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/quit")))
  )

  // @LINE:292
  private[this] val controllers_Team_requestForm236_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/request/new")))
  )

  // @LINE:293
  private[this] val controllers_Team_requestCreate237_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/request/new")))
  )

  // @LINE:294
  private[this] val controllers_Team_requestProcess238_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/request/process")))
  )

  // @LINE:295
  private[this] val controllers_Team_edit239_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:296
  private[this] val controllers_Team_update240_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:297
  private[this] val controllers_Team_kickForm241_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/kick")))
  )

  // @LINE:298
  private[this] val controllers_Team_kick242_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/kick")))
  )

  // @LINE:299
  private[this] val controllers_Team_kickUser243_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/kick/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:300
  private[this] val controllers_Team_leadersForm244_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/leaders")))
  )

  // @LINE:301
  private[this] val controllers_Team_leaders245_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/leaders")))
  )

  // @LINE:302
  private[this] val controllers_Team_close246_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:303
  private[this] val controllers_Team_disable247_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/disable")))
  )

  // @LINE:304
  private[this] val controllers_Team_tournaments248_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tournaments")))
  )

  // @LINE:305
  private[this] val controllers_Team_pmAll249_route = Route("GET",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/pm-all")))
  )

  // @LINE:306
  private[this] val controllers_Team_pmAllSubmit250_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/pm-all")))
  )

  // @LINE:307
  private[this] val controllers_Team_subscribe251_route = Route("POST",
    PathPattern(List(StaticPart("team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/subscribe")))
  )

  // @LINE:309
  private[this] val controllers_Team_apiAll252_route = Route("GET",
    PathPattern(List(StaticPart("api/team/all")))
  )

  // @LINE:310
  private[this] val controllers_Team_apiSearch253_route = Route("GET",
    PathPattern(List(StaticPart("api/team/search")))
  )

  // @LINE:311
  private[this] val controllers_Team_apiTeamsOf254_route = Route("GET",
    PathPattern(List(StaticPart("api/team/of/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:312
  private[this] val controllers_Team_apiShow255_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:313
  private[this] val controllers_Team_users256_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/users")))
  )

  // @LINE:314
  private[this] val controllers_Tournament_byTeam257_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/arena")))
  )

  // @LINE:315
  private[this] val controllers_Swiss_byTeam258_route = Route("GET",
    PathPattern(List(StaticPart("api/team/"), DynamicPart("id", """[^/]+""",true), StaticPart("/swiss")))
  )

  // @LINE:318
  private[this] val controllers_Analyse_requestAnalysis259_route = Route("POST",
    PathPattern(List(DynamicPart("gameId", """\w{8}""",false), StaticPart("/request-analysis")))
  )

  // @LINE:320
  private[this] val controllers_Game_exportOne260_route = Route("GET",
    PathPattern(List(StaticPart("game/export/"), DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:321
  private[this] val controllers_Game_exportOne261_route = Route("GET",
    PathPattern(List(StaticPart("game/export/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".pgn")))
  )

  // @LINE:322
  private[this] val controllers_Export_legacyGameThumbnail262_route = Route("GET",
    PathPattern(List(StaticPart("game/export/png/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".png")))
  )

  // @LINE:323
  private[this] val controllers_Export_gameThumbnail263_route = Route("GET",
    PathPattern(List(StaticPart("game/export/gif/thumbnail/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".gif")))
  )

  // @LINE:324
  private[this] val controllers_Export_gif264_route = Route("GET",
    PathPattern(List(StaticPart("game/export/gif/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".gif")))
  )

  // @LINE:325
  private[this] val controllers_Export_gif265_route = Route("GET",
    PathPattern(List(StaticPart("game/export/gif/"), DynamicPart("color", """white|black""",false), StaticPart("/"), DynamicPart("gameId", """\w{8}""",false), StaticPart(".gif")))
  )

  // @LINE:328
  private[this] val controllers_Fishnet_acquire266_route = Route("POST",
    PathPattern(List(StaticPart("fishnet/acquire")))
  )

  // @LINE:329
  private[this] val controllers_Fishnet_analysis267_route = Route("POST",
    PathPattern(List(StaticPart("fishnet/analysis/"), DynamicPart("workId", """\w{8}""",false)))
  )

  // @LINE:330
  private[this] val controllers_Fishnet_abort268_route = Route("POST",
    PathPattern(List(StaticPart("fishnet/abort/"), DynamicPart("workId", """\w{8}""",false)))
  )

  // @LINE:331
  private[this] val controllers_Fishnet_keyExists269_route = Route("GET",
    PathPattern(List(StaticPart("fishnet/key/"), DynamicPart("key", """\w{8}""",false)))
  )

  // @LINE:332
  private[this] val controllers_Fishnet_status270_route = Route("GET",
    PathPattern(List(StaticPart("fishnet/status")))
  )

  // @LINE:335
  private[this] val controllers_Pref_set271_route = Route("POST",
    PathPattern(List(StaticPart("pref/"), DynamicPart("name", """[^/]+""",true)))
  )

  // @LINE:336
  private[this] val controllers_Pref_form272_route = Route("GET",
    PathPattern(List(StaticPart("account/preferences/"), DynamicPart("categ", """[^/]+""",true)))
  )

  // @LINE:337
  private[this] val controllers_Pref_formApply273_route = Route("POST",
    PathPattern(List(StaticPart("account/preferences")))
  )

  // @LINE:338
  private[this] val controllers_Pref_verifyTitle274_route = Route("POST",
    PathPattern(List(StaticPart("account/preferences/verify-title")))
  )

  // @LINE:341
  private[this] val controllers_Setup_aiForm275_route = Route("GET",
    PathPattern(List(StaticPart("setup/ai")))
  )

  // @LINE:342
  private[this] val controllers_Setup_ai276_route = Route("POST",
    PathPattern(List(StaticPart("setup/ai")))
  )

  // @LINE:343
  private[this] val controllers_Setup_friendForm277_route = Route("GET",
    PathPattern(List(StaticPart("setup/friend")))
  )

  // @LINE:344
  private[this] val controllers_Setup_friend278_route = Route("POST",
    PathPattern(List(StaticPart("setup/friend")))
  )

  // @LINE:345
  private[this] val controllers_Setup_hookForm279_route = Route("GET",
    PathPattern(List(StaticPart("setup/hook")))
  )

  // @LINE:346
  private[this] val controllers_Setup_like280_route = Route("POST",
    PathPattern(List(StaticPart("setup/hook/"), DynamicPart("sri", """[^/]+""",true), StaticPart("/like/"), DynamicPart("gameId", """[^/]+""",true)))
  )

  // @LINE:347
  private[this] val controllers_Setup_hook281_route = Route("POST",
    PathPattern(List(StaticPart("setup/hook/"), DynamicPart("sri", """[^/]+""",true)))
  )

  // @LINE:348
  private[this] val controllers_Setup_filterForm282_route = Route("GET",
    PathPattern(List(StaticPart("setup/filter")))
  )

  // @LINE:349
  private[this] val controllers_Setup_validateFen283_route = Route("GET",
    PathPattern(List(StaticPart("setup/validate-fen")))
  )

  // @LINE:352
  private[this] val controllers_Challenge_all284_route = Route("GET",
    PathPattern(List(StaticPart("challenge")))
  )

  // @LINE:353
  private[this] val controllers_Challenge_show285_route = Route("GET",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:354
  private[this] val controllers_Challenge_accept286_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/accept")))
  )

  // @LINE:355
  private[this] val controllers_Challenge_decline287_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/decline")))
  )

  // @LINE:356
  private[this] val controllers_Challenge_cancel288_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/cancel")))
  )

  // @LINE:357
  private[this] val controllers_Challenge_toFriend289_route = Route("POST",
    PathPattern(List(StaticPart("challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/to-friend")))
  )

  // @LINE:358
  private[this] val controllers_Challenge_rematchOf290_route = Route("POST",
    PathPattern(List(StaticPart("challenge/rematch-of/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:361
  private[this] val controllers_Notify_recent291_route = Route("GET",
    PathPattern(List(StaticPart("notify")))
  )

  // @LINE:364
  private[this] val controllers_Video_index292_route = Route("GET",
    PathPattern(List(StaticPart("video")))
  )

  // @LINE:365
  private[this] val controllers_Video_tags293_route = Route("GET",
    PathPattern(List(StaticPart("video/tags")))
  )

  // @LINE:366
  private[this] val controllers_Video_author294_route = Route("GET",
    PathPattern(List(StaticPart("video/author/"), DynamicPart("author", """[^/]+""",true)))
  )

  // @LINE:367
  private[this] val controllers_Video_show295_route = Route("GET",
    PathPattern(List(StaticPart("video/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:370
  private[this] val controllers_I18n_select296_route = Route("POST",
    PathPattern(List(StaticPart("translation/select")))
  )

  // @LINE:373
  private[this] val controllers_Auth_login297_route = Route("GET",
    PathPattern(List(StaticPart("login")))
  )

  // @LINE:374
  private[this] val controllers_Auth_authenticate298_route = Route("POST",
    PathPattern(List(StaticPart("login")))
  )

  // @LINE:375
  private[this] val controllers_Auth_logoutGet299_route = Route("GET",
    PathPattern(List(StaticPart("logout")))
  )

  // @LINE:376
  private[this] val controllers_Auth_logout300_route = Route("POST",
    PathPattern(List(StaticPart("logout")))
  )

  // @LINE:377
  private[this] val controllers_Auth_signup301_route = Route("GET",
    PathPattern(List(StaticPart("signup")))
  )

  // @LINE:378
  private[this] val controllers_Auth_signupPost302_route = Route("POST",
    PathPattern(List(StaticPart("signup")))
  )

  // @LINE:379
  private[this] val controllers_Auth_checkYourEmail303_route = Route("GET",
    PathPattern(List(StaticPart("signup/check-your-email")))
  )

  // @LINE:380
  private[this] val controllers_Auth_fixEmail304_route = Route("POST",
    PathPattern(List(StaticPart("signup/fix-email")))
  )

  // @LINE:381
  private[this] val controllers_Auth_signupConfirmEmail305_route = Route("GET",
    PathPattern(List(StaticPart("signup/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:382
  private[this] val controllers_Auth_passwordReset306_route = Route("GET",
    PathPattern(List(StaticPart("password/reset")))
  )

  // @LINE:383
  private[this] val controllers_Auth_passwordResetApply307_route = Route("POST",
    PathPattern(List(StaticPart("password/reset/send")))
  )

  // @LINE:384
  private[this] val controllers_Auth_passwordResetSent308_route = Route("GET",
    PathPattern(List(StaticPart("password/reset/sent/"), DynamicPart("email", """[^/]+""",true)))
  )

  // @LINE:385
  private[this] val controllers_Auth_passwordResetConfirm309_route = Route("GET",
    PathPattern(List(StaticPart("password/reset/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:386
  private[this] val controllers_Auth_passwordResetConfirmApply310_route = Route("POST",
    PathPattern(List(StaticPart("password/reset/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:387
  private[this] val controllers_Auth_setFingerPrint311_route = Route("POST",
    PathPattern(List(StaticPart("auth/set-fp/"), DynamicPart("fp", """[^/]+""",true), StaticPart("/"), DynamicPart("ms", """[^/]+""",true)))
  )

  // @LINE:388
  private[this] val controllers_Auth_makeLoginToken312_route = Route("POST",
    PathPattern(List(StaticPart("auth/token")))
  )

  // @LINE:389
  private[this] val controllers_Auth_loginWithToken313_route = Route("GET",
    PathPattern(List(StaticPart("auth/token/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:390
  private[this] val controllers_Auth_magicLink314_route = Route("GET",
    PathPattern(List(StaticPart("auth/magic-link")))
  )

  // @LINE:391
  private[this] val controllers_Auth_magicLinkApply315_route = Route("POST",
    PathPattern(List(StaticPart("auth/magic-link/send")))
  )

  // @LINE:392
  private[this] val controllers_Auth_magicLinkSent316_route = Route("GET",
    PathPattern(List(StaticPart("auth/magic-link/sent/"), DynamicPart("email", """[^/]+""",true)))
  )

  // @LINE:393
  private[this] val controllers_Auth_magicLinkLogin317_route = Route("GET",
    PathPattern(List(StaticPart("auth/magic-link/login/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:396
  private[this] val controllers_Mod_alt318_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/alt/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:397
  private[this] val controllers_Mod_engine319_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/engine/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:398
  private[this] val controllers_Mod_booster320_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/booster/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:399
  private[this] val controllers_Mod_troll321_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/troll/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:400
  private[this] val controllers_Mod_deletePmsAndChats322_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/delete-pms-and-chats")))
  )

  // @LINE:401
  private[this] val controllers_Mod_warn323_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/warn")))
  )

  // @LINE:402
  private[this] val controllers_Mod_disableTwoFactor324_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/disable-2fa")))
  )

  // @LINE:403
  private[this] val controllers_Mod_closeAccount325_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:404
  private[this] val controllers_Mod_reopenAccount326_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/reopen")))
  )

  // @LINE:405
  private[this] val controllers_Mod_setTitle327_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/title")))
  )

  // @LINE:406
  private[this] val controllers_Mod_spontaneousInquiry328_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/inquiry")))
  )

  // @LINE:407
  private[this] val controllers_Mod_communicationPublic329_route = Route("GET",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/communication")))
  )

  // @LINE:408
  private[this] val controllers_Mod_communicationPrivate330_route = Route("GET",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/communication/private")))
  )

  // @LINE:409
  private[this] val controllers_Mod_rankban331_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/rankban/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:410
  private[this] val controllers_Mod_reportban332_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/reportban/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:411
  private[this] val controllers_Mod_impersonate333_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/impersonate")))
  )

  // @LINE:412
  private[this] val controllers_Mod_log334_route = Route("GET",
    PathPattern(List(StaticPart("mod/log")))
  )

  // @LINE:413
  private[this] val controllers_Mod_table335_route = Route("GET",
    PathPattern(List(StaticPart("mod/table")))
  )

  // @LINE:414
  private[this] val controllers_Mod_refreshUserAssess336_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/refreshUserAssess")))
  )

  // @LINE:415
  private[this] val controllers_Mod_setEmail337_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/email")))
  )

  // @LINE:416
  private[this] val controllers_Mod_notifySlack338_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/notify-slack")))
  )

  // @LINE:417
  private[this] val controllers_Mod_gamify339_route = Route("GET",
    PathPattern(List(StaticPart("mod/leaderboard")))
  )

  // @LINE:418
  private[this] val controllers_Mod_gamifyPeriod340_route = Route("GET",
    PathPattern(List(StaticPart("mod/leaderboard/"), DynamicPart("period", """[^/]+""",true)))
  )

  // @LINE:419
  private[this] val controllers_Mod_search341_route = Route("GET",
    PathPattern(List(StaticPart("mod/search")))
  )

  // @LINE:420
  private[this] val controllers_Mod_chatUser342_route = Route("GET",
    PathPattern(List(StaticPart("mod/chat-user/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:421
  private[this] val controllers_Mod_permissions343_route = Route("GET",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/permissions")))
  )

  // @LINE:422
  private[this] val controllers_Mod_savePermissions344_route = Route("POST",
    PathPattern(List(StaticPart("mod/"), DynamicPart("username", """[^/]+""",true), StaticPart("/permissions")))
  )

  // @LINE:423
  private[this] val controllers_Mod_publicChat345_route = Route("GET",
    PathPattern(List(StaticPart("mod/public-chat")))
  )

  // @LINE:424
  private[this] val controllers_Mod_emailConfirm346_route = Route("GET",
    PathPattern(List(StaticPart("mod/email-confirm")))
  )

  // @LINE:425
  private[this] val controllers_Mod_chatPanic347_route = Route("GET",
    PathPattern(List(StaticPart("mod/chat-panic")))
  )

  // @LINE:426
  private[this] val controllers_Mod_chatPanicPost348_route = Route("POST",
    PathPattern(List(StaticPart("mod/chat-panic")))
  )

  // @LINE:427
  private[this] val controllers_Mod_print349_route = Route("GET",
    PathPattern(List(StaticPart("mod/print/"), DynamicPart("fh", """[^/]+""",true)))
  )

  // @LINE:428
  private[this] val controllers_Mod_printBan350_route = Route("POST",
    PathPattern(List(StaticPart("mod/print/ban/"), DynamicPart("v", """[^/]+""",true), StaticPart("/"), DynamicPart("fh", """[^/]+""",true)))
  )

  // @LINE:429
  private[this] val controllers_Mod_singleIp351_route = Route("GET",
    PathPattern(List(StaticPart("mod/ip/"), DynamicPart("ip", """[^/]+""",true)))
  )

  // @LINE:430
  private[this] val controllers_Mod_singleIpBan352_route = Route("POST",
    PathPattern(List(StaticPart("mod/ip/ban/"), DynamicPart("v", """[^/]+""",true), StaticPart("/"), DynamicPart("ip", """[^/]+""",true)))
  )

  // @LINE:431
  private[this] val controllers_Mod_presets353_route = Route("GET",
    PathPattern(List(StaticPart("mod/presets/"), DynamicPart("group", """[^/]+""",true)))
  )

  // @LINE:432
  private[this] val controllers_Mod_presetsUpdate354_route = Route("POST",
    PathPattern(List(StaticPart("mod/presets/"), DynamicPart("group", """[^/]+""",true)))
  )

  // @LINE:433
  private[this] val controllers_Mod_eventStream355_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/mod")))
  )

  // @LINE:436
  private[this] val controllers_Irwin_dashboard356_route = Route("GET",
    PathPattern(List(StaticPart("irwin")))
  )

  // @LINE:437
  private[this] val controllers_Irwin_saveReport357_route = Route("POST",
    PathPattern(List(StaticPart("irwin/report")))
  )

  // @LINE:438
  private[this] val controllers_Irwin_eventStream358_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/irwin")))
  )

  // @LINE:441
  private[this] val controllers_Bookmark_toggle359_route = Route("POST",
    PathPattern(List(StaticPart("bookmark/"), DynamicPart("gameId", """\w{8}""",false)))
  )

  // @LINE:444
  private[this] val controllers_ForumCateg_index360_route = Route("GET",
    PathPattern(List(StaticPart("forum")))
  )

  // @LINE:445
  private[this] val controllers_ForumPost_search361_route = Route("GET",
    PathPattern(List(StaticPart("forum/search")))
  )

  // @LINE:446
  private[this] val controllers_ForumCateg_show362_route = Route("GET",
    PathPattern(List(StaticPart("forum/"), DynamicPart("slug", """[^/]+""",true)))
  )

  // @LINE:447
  private[this] val controllers_ForumTopic_form363_route = Route("GET",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/form")))
  )

  // @LINE:448
  private[this] val controllers_ForumTopic_create364_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/new")))
  )

  // @LINE:449
  private[this] val controllers_ForumTopic_participants365_route = Route("GET",
    PathPattern(List(StaticPart("forum/participants/"), DynamicPart("topicId", """[^/]+""",true)))
  )

  // @LINE:450
  private[this] val controllers_ForumTopic_show366_route = Route("GET",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true)))
  )

  // @LINE:451
  private[this] val controllers_ForumTopic_close367_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/close")))
  )

  // @LINE:452
  private[this] val controllers_ForumTopic_hide368_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/hide")))
  )

  // @LINE:453
  private[this] val controllers_ForumTopic_sticky369_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/sticky")))
  )

  // @LINE:454
  private[this] val controllers_ForumPost_create370_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true), StaticPart("/new")))
  )

  // @LINE:455
  private[this] val controllers_ForumPost_delete371_route = Route("POST",
    PathPattern(List(StaticPart("forum/"), DynamicPart("categSlug", """[^/]+""",true), StaticPart("/delete/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:456
  private[this] val controllers_ForumPost_edit372_route = Route("POST",
    PathPattern(List(StaticPart("forum/post/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:457
  private[this] val controllers_ForumPost_react373_route = Route("POST",
    PathPattern(List(StaticPart("forum/post/"), DynamicPart("id", """[^/]+""",true), StaticPart("/react/"), DynamicPart("reaction", """[^/]+""",true), StaticPart("/"), DynamicPart("v", """[^/]+""",true)))
  )

  // @LINE:458
  private[this] val controllers_ForumPost_redirect374_route = Route("GET",
    PathPattern(List(StaticPart("forum/redirect/post/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:461
  private[this] val controllers_Msg_compatCreate375_route = Route("POST",
    PathPattern(List(StaticPart("inbox/new")))
  )

  // @LINE:463
  private[this] val controllers_Msg_home376_route = Route("GET",
    PathPattern(List(StaticPart("inbox")))
  )

  // @LINE:464
  private[this] val controllers_Msg_search377_route = Route("GET",
    PathPattern(List(StaticPart("inbox/search")))
  )

  // @LINE:465
  private[this] val controllers_Msg_unreadCount378_route = Route("GET",
    PathPattern(List(StaticPart("inbox/unread-count")))
  )

  // @LINE:466
  private[this] val controllers_Msg_convo379_route = Route("GET",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:467
  private[this] val controllers_Msg_convoDelete380_route = Route("DELETE",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:469
  private[this] val controllers_Msg_apiPost381_route = Route("POST",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:470
  private[this] val controllers_Msg_convoDelete382_route = Route("POST",
    PathPattern(List(StaticPart("inbox/"), DynamicPart("username", """[^/]+""",true), StaticPart("/delete")))
  )

  // @LINE:473
  private[this] val controllers_Coach_all383_route = Route("GET",
    PathPattern(List(StaticPart("coach")))
  )

  // @LINE:474
  private[this] val controllers_Coach_edit384_route = Route("GET",
    PathPattern(List(StaticPart("coach/edit")))
  )

  // @LINE:475
  private[this] val controllers_Coach_editApply385_route = Route("POST",
    PathPattern(List(StaticPart("coach/edit")))
  )

  // @LINE:476
  private[this] val controllers_Coach_picture386_route = Route("GET",
    PathPattern(List(StaticPart("coach/picture/edit")))
  )

  // @LINE:477
  private[this] val controllers_Coach_pictureApply387_route = Route("POST",
    PathPattern(List(StaticPart("coach/picture/upload")))
  )

  // @LINE:478
  private[this] val controllers_Coach_pictureDelete388_route = Route("POST",
    PathPattern(List(StaticPart("coach/picture/delete")))
  )

  // @LINE:479
  private[this] val controllers_Coach_approveReview389_route = Route("POST",
    PathPattern(List(StaticPart("coach/approve-review/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:480
  private[this] val controllers_Coach_modReview390_route = Route("POST",
    PathPattern(List(StaticPart("coach/mod-review/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:481
  private[this] val controllers_Coach_show391_route = Route("GET",
    PathPattern(List(StaticPart("coach/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:482
  private[this] val controllers_Coach_review392_route = Route("POST",
    PathPattern(List(StaticPart("coach/"), DynamicPart("username", """[^/]+""",true), StaticPart("/review")))
  )

  // @LINE:483
  private[this] val controllers_Coach_search393_route = Route("GET",
    PathPattern(List(StaticPart("coach/"), DynamicPart("lang", """[^/]+""",true), StaticPart("/"), DynamicPart("order", """[^/]+""",true)))
  )

  // @LINE:486
  private[this] val controllers_Clas_index394_route = Route("GET",
    PathPattern(List(StaticPart("class")))
  )

  // @LINE:487
  private[this] val controllers_Clas_form395_route = Route("GET",
    PathPattern(List(StaticPart("class/new")))
  )

  // @LINE:488
  private[this] val controllers_Clas_becomeTeacher396_route = Route("POST",
    PathPattern(List(StaticPart("class/become-teacher")))
  )

  // @LINE:489
  private[this] val controllers_Clas_create397_route = Route("POST",
    PathPattern(List(StaticPart("class/new")))
  )

  // @LINE:490
  private[this] val controllers_Clas_invitation398_route = Route("GET",
    PathPattern(List(StaticPart("class/invitation/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:491
  private[this] val controllers_Clas_invitationAccept399_route = Route("POST",
    PathPattern(List(StaticPart("class/invitation/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:492
  private[this] val controllers_Clas_show400_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:493
  private[this] val controllers_Clas_edit401_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:494
  private[this] val controllers_Clas_update402_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/edit")))
  )

  // @LINE:495
  private[this] val controllers_Clas_wall403_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/news")))
  )

  // @LINE:496
  private[this] val controllers_Clas_wallEdit404_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/news/edit")))
  )

  // @LINE:497
  private[this] val controllers_Clas_wallUpdate405_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/news/edit")))
  )

  // @LINE:498
  private[this] val controllers_Clas_notifyStudents406_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/notify")))
  )

  // @LINE:499
  private[this] val controllers_Clas_notifyPost407_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/notifyPost")))
  )

  // @LINE:500
  private[this] val controllers_Clas_students408_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/students")))
  )

  // @LINE:501
  private[this] val controllers_Clas_archive409_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/archive")))
  )

  // @LINE:502
  private[this] val controllers_Clas_learn410_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/progress/learn")))
  )

  // @LINE:503
  private[this] val controllers_Clas_progress411_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/progress/"), DynamicPart("pt", """[^/]+""",true), StaticPart("/"), DynamicPart("days", """[^/]+""",true)))
  )

  // @LINE:504
  private[this] val controllers_Clas_studentForm412_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/add")))
  )

  // @LINE:505
  private[this] val controllers_Clas_studentCreate413_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/new")))
  )

  // @LINE:506
  private[this] val controllers_Clas_studentManyForm414_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/many")))
  )

  // @LINE:507
  private[this] val controllers_Clas_studentManyCreate415_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/many")))
  )

  // @LINE:508
  private[this] val controllers_Clas_studentInvite416_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/invite")))
  )

  // @LINE:509
  private[this] val controllers_Clas_studentShow417_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:510
  private[this] val controllers_Clas_studentArchive418_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/archive")))
  )

  // @LINE:511
  private[this] val controllers_Clas_studentResetPassword419_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/reset-password")))
  )

  // @LINE:512
  private[this] val controllers_Clas_studentSetKid420_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/set-kid")))
  )

  // @LINE:513
  private[this] val controllers_Clas_studentEdit421_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:514
  private[this] val controllers_Clas_studentUpdate422_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:515
  private[this] val controllers_Clas_studentRelease423_route = Route("GET",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/release")))
  )

  // @LINE:516
  private[this] val controllers_Clas_studentReleasePost424_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/student/"), DynamicPart("username", """[^/]+""",true), StaticPart("/release")))
  )

  // @LINE:517
  private[this] val controllers_Clas_invitationRevoke425_route = Route("POST",
    PathPattern(List(StaticPart("class/"), DynamicPart("id", """\w{8}""",false), StaticPart("/invitation/revoke")))
  )

  // @LINE:520
  private[this] val controllers_Main_image426_route = Route("GET",
    PathPattern(List(StaticPart("image/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("hash", """[^/]+""",true), StaticPart("/"), DynamicPart("name", """[^/]+""",true)))
  )

  // @LINE:523
  private[this] val controllers_Importer_importGame427_route = Route("GET",
    PathPattern(List(StaticPart("paste")))
  )

  // @LINE:524
  private[this] val controllers_Importer_sendGame428_route = Route("POST",
    PathPattern(List(StaticPart("import")))
  )

  // @LINE:525
  private[this] val controllers_Importer_masterGame429_route = Route("GET",
    PathPattern(List(StaticPart("import/master/"), DynamicPart("id", """\w{8}""",false), StaticPart("/"), DynamicPart("color", """[^/]+""",true)))
  )

  // @LINE:528
  private[this] val controllers_Editor_data430_route = Route("GET",
    PathPattern(List(StaticPart("editor.json")))
  )

  // @LINE:529
  private[this] val controllers_Editor_load431_route = Route("GET",
    PathPattern(List(StaticPart("editor/"), DynamicPart("urlFen", """.+""",false)))
  )

  // @LINE:530
  private[this] val controllers_Editor_index432_route = Route("GET",
    PathPattern(List(StaticPart("editor")))
  )

  // @LINE:533
  private[this] val controllers_Report_form433_route = Route("GET",
    PathPattern(List(StaticPart("report")))
  )

  // @LINE:534
  private[this] val controllers_Report_create434_route = Route("POST",
    PathPattern(List(StaticPart("report")))
  )

  // @LINE:535
  private[this] val controllers_Report_flag435_route = Route("POST",
    PathPattern(List(StaticPart("report/flag")))
  )

  // @LINE:536
  private[this] val controllers_Report_thanks436_route = Route("GET",
    PathPattern(List(StaticPart("report/thanks")))
  )

  // @LINE:537
  private[this] val controllers_Report_list437_route = Route("GET",
    PathPattern(List(StaticPart("report/list")))
  )

  // @LINE:538
  private[this] val controllers_Report_listWithFilter438_route = Route("GET",
    PathPattern(List(StaticPart("report/list/"), DynamicPart("room", """[^/]+""",true)))
  )

  // @LINE:539
  private[this] val controllers_Report_inquiry439_route = Route("POST",
    PathPattern(List(StaticPart("report/"), DynamicPart("id", """[^/]+""",true), StaticPart("/inquiry")))
  )

  // @LINE:540
  private[this] val controllers_Report_process440_route = Route("POST",
    PathPattern(List(StaticPart("report/"), DynamicPart("id", """[^/]+""",true), StaticPart("/process")))
  )

  // @LINE:541
  private[this] val controllers_Report_xfiles441_route = Route("POST",
    PathPattern(List(StaticPart("report/"), DynamicPart("id", """[^/]+""",true), StaticPart("/xfiles")))
  )

  // @LINE:542
  private[this] val controllers_Report_currentCheatInquiry442_route = Route("GET",
    PathPattern(List(StaticPart("report/"), DynamicPart("username", """[^/]+""",true), StaticPart("/cheat-inquiry")))
  )

  // @LINE:545
  private[this] val controllers_Appeal_home443_route = Route("GET",
    PathPattern(List(StaticPart("appeal")))
  )

  // @LINE:546
  private[this] val controllers_Appeal_post444_route = Route("POST",
    PathPattern(List(StaticPart("appeal")))
  )

  // @LINE:547
  private[this] val controllers_Appeal_queue445_route = Route("GET",
    PathPattern(List(StaticPart("appeal/queue")))
  )

  // @LINE:548
  private[this] val controllers_Appeal_show446_route = Route("GET",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:549
  private[this] val controllers_Appeal_reply447_route = Route("POST",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:550
  private[this] val controllers_Appeal_mute448_route = Route("POST",
    PathPattern(List(StaticPart("appeal/"), DynamicPart("username", """[^/]+""",true), StaticPart("/mute")))
  )

  // @LINE:553
  private[this] val controllers_Stat_ratingDistribution449_route = Route("GET",
    PathPattern(List(StaticPart("stat/rating/distribution/"), DynamicPart("perf", """[^/]+""",true)))
  )

  // @LINE:556
  private[this] val controllers_Api_index450_route = Route("GET",
    PathPattern(List(StaticPart("api")))
  )

  // @LINE:557
  private[this] val controllers_Api_usersByIds451_route = Route("POST",
    PathPattern(List(StaticPart("api/users")))
  )

  // @LINE:558
  private[this] val controllers_Puzzle_activity452_route = Route("GET",
    PathPattern(List(StaticPart("api/user/puzzle-activity")))
  )

  // @LINE:559
  private[this] val controllers_Api_tournamentsByOwner453_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/tournament/created")))
  )

  // @LINE:560
  private[this] val controllers_Api_user454_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true)))
  )

  // @LINE:561
  private[this] val controllers_Api_activity455_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/activity")))
  )

  // @LINE:562
  private[this] val controllers_Relation_apiFollowing456_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/following")))
  )

  // @LINE:563
  private[this] val controllers_Relation_apiFollowers457_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/followers")))
  )

  // @LINE:564
  private[this] val controllers_User_apiWriteNote458_route = Route("POST",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/note")))
  )

  // @LINE:565
  private[this] val controllers_User_ratingHistory459_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/rating-history")))
  )

  // @LINE:566
  private[this] val controllers_User_tvExport460_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/current-game")))
  )

  // @LINE:567
  private[this] val controllers_Api_game461_route = Route("GET",
    PathPattern(List(StaticPart("api/game/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:568
  private[this] val controllers_Api_currentTournaments462_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament")))
  )

  // @LINE:569
  private[this] val controllers_Api_tournament463_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:570
  private[this] val controllers_Api_tournamentGames464_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """[^/]+""",true), StaticPart("/games")))
  )

  // @LINE:571
  private[this] val controllers_Api_tournamentResults465_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """[^/]+""",true), StaticPart("/results")))
  )

  // @LINE:572
  private[this] val controllers_Api_tournamentTeams466_route = Route("GET",
    PathPattern(List(StaticPart("api/tournament/"), DynamicPart("id", """[^/]+""",true), StaticPart("/teams")))
  )

  // @LINE:573
  private[this] val controllers_Tournament_apiCreate467_route = Route("POST",
    PathPattern(List(StaticPart("api/tournament")))
  )

  // @LINE:574
  private[this] val controllers_Swiss_apiCreate468_route = Route("POST",
    PathPattern(List(StaticPart("api/swiss/new/"), DynamicPart("teamId", """[^/]+""",true)))
  )

  // @LINE:575
  private[this] val controllers_Api_swissGames469_route = Route("GET",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """[^/]+""",true), StaticPart("/games")))
  )

  // @LINE:576
  private[this] val controllers_Api_swissResults470_route = Route("GET",
    PathPattern(List(StaticPart("api/swiss/"), DynamicPart("id", """[^/]+""",true), StaticPart("/results")))
  )

  // @LINE:577
  private[this] val controllers_Simul_apiList471_route = Route("GET",
    PathPattern(List(StaticPart("api/simul")))
  )

  // @LINE:578
  private[this] val controllers_Api_status472_route = Route("GET",
    PathPattern(List(StaticPart("api/status")))
  )

  // @LINE:579
  private[this] val controllers_Api_usersStatus473_route = Route("GET",
    PathPattern(List(StaticPart("api/users/status")))
  )

  // @LINE:580
  private[this] val controllers_Api_crosstable474_route = Route("GET",
    PathPattern(List(StaticPart("api/crosstable/"), DynamicPart("u1", """[^/]+""",true), StaticPart("/"), DynamicPart("u2", """[^/]+""",true)))
  )

  // @LINE:581
  private[this] val controllers_Api_gamesByUsersStream475_route = Route("POST",
    PathPattern(List(StaticPart("api/stream/games-by-users")))
  )

  // @LINE:582
  private[this] val controllers_Api_eventStream476_route = Route("GET",
    PathPattern(List(StaticPart("api/stream/event")))
  )

  // @LINE:583
  private[this] val controllers_Account_apiMe477_route = Route("GET",
    PathPattern(List(StaticPart("api/account")))
  )

  // @LINE:584
  private[this] val controllers_Account_apiNowPlaying478_route = Route("GET",
    PathPattern(List(StaticPart("api/account/playing")))
  )

  // @LINE:585
  private[this] val controllers_Account_apiEmail479_route = Route("GET",
    PathPattern(List(StaticPart("api/account/email")))
  )

  // @LINE:586
  private[this] val controllers_Account_apiKid480_route = Route("GET",
    PathPattern(List(StaticPart("api/account/kid")))
  )

  // @LINE:587
  private[this] val controllers_Account_apiKidPost481_route = Route("POST",
    PathPattern(List(StaticPart("api/account/kid")))
  )

  // @LINE:588
  private[this] val controllers_Pref_apiGet482_route = Route("GET",
    PathPattern(List(StaticPart("api/account/preferences")))
  )

  // @LINE:589
  private[this] val controllers_Setup_apiAi483_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/ai")))
  )

  // @LINE:590
  private[this] val controllers_Challenge_openCreate484_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/open")))
  )

  // @LINE:591
  private[this] val controllers_Challenge_apiCreate485_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("user", """[^/]+""",true)))
  )

  // @LINE:592
  private[this] val controllers_Challenge_apiAccept486_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/accept")))
  )

  // @LINE:593
  private[this] val controllers_Challenge_apiDecline487_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/decline")))
  )

  // @LINE:594
  private[this] val controllers_Challenge_apiCancel488_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/cancel")))
  )

  // @LINE:595
  private[this] val controllers_Challenge_apiStartClocks489_route = Route("POST",
    PathPattern(List(StaticPart("api/challenge/"), DynamicPart("id", """\w{8}""",false), StaticPart("/start-clocks")))
  )

  // @LINE:596
  private[this] val controllers_Api_cloudEval490_route = Route("GET",
    PathPattern(List(StaticPart("api/cloud-eval")))
  )

  // @LINE:597
  private[this] val controllers_Relay_apiIndex491_route = Route("GET",
    PathPattern(List(StaticPart("api/broadcast")))
  )

  // @LINE:598
  private[this] val controllers_Importer_apiSendGame492_route = Route("POST",
    PathPattern(List(StaticPart("api/import")))
  )

  // @LINE:600
  private[this] val controllers_Game_apiExportByUser493_route = Route("GET",
    PathPattern(List(StaticPart("api/games/user/"), DynamicPart("username", """[^/]+""",true)))
  )

  // @LINE:603
  private[this] val controllers_Api_userGames494_route = Route("GET",
    PathPattern(List(StaticPart("api/user/"), DynamicPart("name", """[^/]+""",true), StaticPart("/games")))
  )

  // @LINE:606
  private[this] val controllers_PlayApi_botGameStream495_route = Route("GET",
    PathPattern(List(StaticPart("api/bot/game/stream/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:607
  private[this] val controllers_PlayApi_botMove496_route = Route("POST",
    PathPattern(List(StaticPart("api/bot/game/"), DynamicPart("id", """[^/]+""",true), StaticPart("/move/"), DynamicPart("uci", """[^/]+""",true)))
  )

  // @LINE:608
  private[this] val controllers_PlayApi_botCommand497_route = Route("POST",
    PathPattern(List(StaticPart("api/bot/"), DynamicPart("cmd", """.+""",false)))
  )

  // @LINE:609
  private[this] val controllers_PlayApi_botOnline498_route = Route("GET",
    PathPattern(List(StaticPart("player/bots")))
  )

  // @LINE:612
  private[this] val controllers_PlayApi_boardGameStream499_route = Route("GET",
    PathPattern(List(StaticPart("api/board/game/stream/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:613
  private[this] val controllers_PlayApi_boardMove500_route = Route("POST",
    PathPattern(List(StaticPart("api/board/game/"), DynamicPart("id", """[^/]+""",true), StaticPart("/move/"), DynamicPart("uci", """[^/]+""",true)))
  )

  // @LINE:614
  private[this] val controllers_Setup_boardApiHook501_route = Route("POST",
    PathPattern(List(StaticPart("api/board/seek")))
  )

  // @LINE:615
  private[this] val controllers_PlayApi_boardCommand502_route = Route("POST",
    PathPattern(List(StaticPart("api/board/"), DynamicPart("cmd", """.+""",false)))
  )

  // @LINE:618
  private[this] val controllers_Account_passwd503_route = Route("GET",
    PathPattern(List(StaticPart("account/passwd")))
  )

  // @LINE:619
  private[this] val controllers_Account_passwdApply504_route = Route("POST",
    PathPattern(List(StaticPart("account/passwd")))
  )

  // @LINE:620
  private[this] val controllers_Account_email505_route = Route("GET",
    PathPattern(List(StaticPart("account/email")))
  )

  // @LINE:621
  private[this] val controllers_Account_emailApply506_route = Route("POST",
    PathPattern(List(StaticPart("account/email")))
  )

  // @LINE:622
  private[this] val controllers_Account_emailConfirmHelp507_route = Route("GET",
    PathPattern(List(StaticPart("contact/email-confirm/help")))
  )

  // @LINE:623
  private[this] val controllers_Account_emailConfirm508_route = Route("GET",
    PathPattern(List(StaticPart("account/email/confirm/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:624
  private[this] val controllers_Account_close509_route = Route("GET",
    PathPattern(List(StaticPart("account/close")))
  )

  // @LINE:625
  private[this] val controllers_Account_closeConfirm510_route = Route("POST",
    PathPattern(List(StaticPart("account/closeConfirm")))
  )

  // @LINE:626
  private[this] val controllers_Account_profile511_route = Route("GET",
    PathPattern(List(StaticPart("account/profile")))
  )

  // @LINE:627
  private[this] val controllers_Account_profileApply512_route = Route("POST",
    PathPattern(List(StaticPart("account/profile")))
  )

  // @LINE:628
  private[this] val controllers_Account_username513_route = Route("GET",
    PathPattern(List(StaticPart("account/username")))
  )

  // @LINE:629
  private[this] val controllers_Account_usernameApply514_route = Route("POST",
    PathPattern(List(StaticPart("account/username")))
  )

  // @LINE:630
  private[this] val controllers_Account_kid515_route = Route("GET",
    PathPattern(List(StaticPart("account/kid")))
  )

  // @LINE:631
  private[this] val controllers_Account_kidPost516_route = Route("POST",
    PathPattern(List(StaticPart("account/kid")))
  )

  // @LINE:632
  private[this] val controllers_Account_twoFactor517_route = Route("GET",
    PathPattern(List(StaticPart("account/twofactor")))
  )

  // @LINE:633
  private[this] val controllers_Account_setupTwoFactor518_route = Route("POST",
    PathPattern(List(StaticPart("account/twofactor/setup")))
  )

  // @LINE:634
  private[this] val controllers_Account_disableTwoFactor519_route = Route("POST",
    PathPattern(List(StaticPart("account/twofactor/disable")))
  )

  // @LINE:635
  private[this] val controllers_Account_reopen520_route = Route("GET",
    PathPattern(List(StaticPart("account/reopen")))
  )

  // @LINE:636
  private[this] val controllers_Account_reopenApply521_route = Route("POST",
    PathPattern(List(StaticPart("account/reopen/send")))
  )

  // @LINE:637
  private[this] val controllers_Account_reopenSent522_route = Route("GET",
    PathPattern(List(StaticPart("account/reopen/sent/"), DynamicPart("email", """[^/]+""",true)))
  )

  // @LINE:638
  private[this] val controllers_Account_reopenLogin523_route = Route("GET",
    PathPattern(List(StaticPart("account/reopen/login/"), DynamicPart("token", """[^/]+""",true)))
  )

  // @LINE:639
  private[this] val controllers_Account_data524_route = Route("GET",
    PathPattern(List(StaticPart("account/personal-data")))
  )

  // @LINE:641
  private[this] val controllers_Account_security525_route = Route("GET",
    PathPattern(List(StaticPart("account/security")))
  )

  // @LINE:642
  private[this] val controllers_Account_signout526_route = Route("POST",
    PathPattern(List(StaticPart("account/signout/"), DynamicPart("sessionId", """[^/]+""",true)))
  )

  // @LINE:643
  private[this] val controllers_Account_info527_route = Route("GET",
    PathPattern(List(StaticPart("account/info")))
  )

  // @LINE:644
  private[this] val controllers_Account_nowPlaying528_route = Route("GET",
    PathPattern(List(StaticPart("account/now-playing")))
  )

  // @LINE:647
  private[this] val controllers_OAuthToken_index529_route = Route("GET",
    PathPattern(List(StaticPart("account/oauth/token")))
  )

  // @LINE:648
  private[this] val controllers_OAuthToken_create530_route = Route("GET",
    PathPattern(List(StaticPart("account/oauth/token/create")))
  )

  // @LINE:649
  private[this] val controllers_OAuthToken_createApply531_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/token/create")))
  )

  // @LINE:650
  private[this] val controllers_OAuthToken_delete532_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/token/"), DynamicPart("publicId", """[^/]+""",true), StaticPart("/delete")))
  )

  // @LINE:651
  private[this] val controllers_OAuthApp_index533_route = Route("GET",
    PathPattern(List(StaticPart("account/oauth/app")))
  )

  // @LINE:652
  private[this] val controllers_OAuthApp_create534_route = Route("GET",
    PathPattern(List(StaticPart("account/oauth/app/create")))
  )

  // @LINE:653
  private[this] val controllers_OAuthApp_createApply535_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/app/create")))
  )

  // @LINE:654
  private[this] val controllers_OAuthApp_edit536_route = Route("GET",
    PathPattern(List(StaticPart("account/oauth/app/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:655
  private[this] val controllers_OAuthApp_update537_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/app/"), DynamicPart("id", """[^/]+""",true), StaticPart("/edit")))
  )

  // @LINE:656
  private[this] val controllers_OAuthApp_delete538_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/app/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )

  // @LINE:657
  private[this] val controllers_OAuthApp_revoke539_route = Route("POST",
    PathPattern(List(StaticPart("account/oauth/app/"), DynamicPart("id", """[^/]+""",true), StaticPart("/revoke")))
  )

  // @LINE:660
  private[this] val controllers_Event_show540_route = Route("GET",
    PathPattern(List(StaticPart("event/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:661
  private[this] val controllers_Event_manager541_route = Route("GET",
    PathPattern(List(StaticPart("event/manager")))
  )

  // @LINE:662
  private[this] val controllers_Event_edit542_route = Route("GET",
    PathPattern(List(StaticPart("event/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:663
  private[this] val controllers_Event_update543_route = Route("POST",
    PathPattern(List(StaticPart("event/manager/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:664
  private[this] val controllers_Event_cloneE544_route = Route("GET",
    PathPattern(List(StaticPart("event/manager/clone/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:665
  private[this] val controllers_Event_form545_route = Route("GET",
    PathPattern(List(StaticPart("event/manager/new")))
  )

  // @LINE:666
  private[this] val controllers_Event_create546_route = Route("POST",
    PathPattern(List(StaticPart("event/manager")))
  )

  // @LINE:669
  private[this] val controllers_Main_captchaCheck547_route = Route("GET",
    PathPattern(List(StaticPart("captcha/"), DynamicPart("id", """\w{8}""",false)))
  )

  // @LINE:670
  private[this] val controllers_Main_webmasters548_route = Route("GET",
    PathPattern(List(StaticPart("developers")))
  )

  // @LINE:671
  private[this] val controllers_Main_mobile549_route = Route("GET",
    PathPattern(List(StaticPart("mobile")))
  )

  // @LINE:672
  private[this] val controllers_Main_lag550_route = Route("GET",
    PathPattern(List(StaticPart("lag")))
  )

  // @LINE:673
  private[this] val controllers_Main_getFishnet551_route = Route("GET",
    PathPattern(List(StaticPart("get-fishnet")))
  )

  // @LINE:674
  private[this] val controllers_Main_costs552_route = Route("GET",
    PathPattern(List(StaticPart("costs")))
  )

  // @LINE:675
  private[this] val controllers_Main_verifyTitle553_route = Route("GET",
    PathPattern(List(StaticPart("verify-title")))
  )

  // @LINE:676
  private[this] val controllers_Main_instantChess554_route = Route("GET",
    PathPattern(List(StaticPart("InstantChess.com")))
  )

  // @LINE:677
  private[this] val controllers_Main_dailyPuzzleSlackApp555_route = Route("GET",
    PathPattern(List(StaticPart("daily-puzzle-slack")))
  )

  // @LINE:680
  private[this] val controllers_Dev_cli556_route = Route("GET",
    PathPattern(List(StaticPart("dev/cli")))
  )

  // @LINE:681
  private[this] val controllers_Dev_cliPost557_route = Route("POST",
    PathPattern(List(StaticPart("dev/cli")))
  )

  // @LINE:682
  private[this] val controllers_Dev_command558_route = Route("POST",
    PathPattern(List(StaticPart("cli")))
  )

  // @LINE:683
  private[this] val controllers_Dev_settings559_route = Route("GET",
    PathPattern(List(StaticPart("dev/settings")))
  )

  // @LINE:684
  private[this] val controllers_Dev_settingsPost560_route = Route("POST",
    PathPattern(List(StaticPart("dev/settings/"), DynamicPart("id", """[^/]+""",true)))
  )

  // @LINE:687
  private[this] val controllers_Push_mobileRegister561_route = Route("POST",
    PathPattern(List(StaticPart("mobile/register/"), DynamicPart("platform", """[^/]+""",true), StaticPart("/"), DynamicPart("deviceId", """[^/]+""",true)))
  )

  // @LINE:688
  private[this] val controllers_Push_mobileUnregister562_route = Route("POST",
    PathPattern(List(StaticPart("mobile/unregister")))
  )

  // @LINE:689
  private[this] val controllers_Push_webSubscribe563_route = Route("POST",
    PathPattern(List(StaticPart("push/subscribe")))
  )

  // @LINE:692
  private[this] val controllers_Page_tos564_route = Route("GET",
    PathPattern(List(StaticPart("terms-of-service")))
  )

  // @LINE:693
  private[this] val controllers_Page_menuBookmark565_route = Route("GET",
    PathPattern(List(DynamicPart("bookmark", """privacy|thanks|about|ads""",false)))
  )

  // @LINE:694
  private[this] val controllers_Main_contact566_route = Route("GET",
    PathPattern(List(StaticPart("contact")))
  )

  // @LINE:695
  private[this] val controllers_Main_faq567_route = Route("GET",
    PathPattern(List(StaticPart("faq")))
  )

  // @LINE:696
  private[this] val controllers_Page_source568_route = Route("GET",
    PathPattern(List(StaticPart("source")))
  )

  // @LINE:697
  private[this] val controllers_Main_movedPermanently569_route = Route("GET",
    PathPattern(List(StaticPart("qa")))
  )

  // @LINE:698
  private[this] val controllers_Main_movedPermanently570_route = Route("GET",
    PathPattern(List(StaticPart("help")))
  )

  // @LINE:699
  private[this] val controllers_Main_movedPermanently571_route = Route("GET",
    PathPattern(List(StaticPart("support")))
  )

  // @LINE:700
  private[this] val controllers_Main_legacyQaQuestion572_route = Route("GET",
    PathPattern(List(StaticPart("qa/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("slug", """[^/]+""",true)))
  )

  // @LINE:701
  private[this] val controllers_Page_loneBookmark573_route = Route("GET",
    PathPattern(List(StaticPart("how-to-cheat")))
  )

  // @LINE:702
  private[this] val controllers_Page_loneBookmark574_route = Route("GET",
    PathPattern(List(StaticPart("page/"), DynamicPart("bookmark", """[^/]+""",true)))
  )

  // @LINE:705
  private[this] val controllers_Page_variantHome575_route = Route("GET",
    PathPattern(List(StaticPart("variant")))
  )

  // @LINE:706
  private[this] val controllers_Page_variant576_route = Route("GET",
    PathPattern(List(StaticPart("variant/"), DynamicPart("key", """[^/]+""",true)))
  )

  // @LINE:709
  private[this] val controllers_Page_help577_route = Route("GET",
    PathPattern(List(StaticPart("help/contribute")))
  )

  // @LINE:710
  private[this] val controllers_Page_master578_route = Route("GET",
    PathPattern(List(StaticPart("help/master")))
  )

  // @LINE:713
  private[this] val controllers_DgtCtrl_index579_route = Route("GET",
    PathPattern(List(StaticPart("dgt")))
  )

  // @LINE:714
  private[this] val controllers_DgtCtrl_play580_route = Route("GET",
    PathPattern(List(StaticPart("dgt/play")))
  )

  // @LINE:715
  private[this] val controllers_DgtCtrl_config581_route = Route("GET",
    PathPattern(List(StaticPart("dgt/config")))
  )

  // @LINE:716
  private[this] val controllers_DgtCtrl_generateToken582_route = Route("POST",
    PathPattern(List(StaticPart("dgt/config/token")))
  )

  // @LINE:719
  private[this] val controllers_Main_toggleBlindMode583_route = Route("POST",
    PathPattern(List(StaticPart("toggle-blind-mode")))
  )

  // @LINE:721
  private[this] val controllers_Blog_preview584_route = Route("GET",
    PathPattern(List(StaticPart("prismic-preview")))
  )

  // @LINE:722
  private[this] val controllers_Main_jslog585_route = Route("POST",
    PathPattern(List(StaticPart("jslog/"), DynamicPart("id", """\w{12}""",false)))
  )

  // @LINE:723
  private[this] val controllers_Main_jsmon586_route = Route("POST",
    PathPattern(List(StaticPart("jsmon/"), DynamicPart("event", """[^/]+""",true)))
  )

  // @LINE:725
  private[this] val controllers_Main_movedPermanently587_route = Route("GET",
    PathPattern(List(StaticPart("swag")))
  )

  // @LINE:726
  private[this] val controllers_Main_movedPermanently588_route = Route("GET",
    PathPattern(List(StaticPart("yt")))
  )

  // @LINE:728
  private[this] val controllers_Main_devAsset589_route = Route("GET",
    PathPattern(List(StaticPart("assets/_"), DynamicPart("v", """\w{6}""",false), StaticPart("/"), DynamicPart("file", """.+""",false)))
  )

  // @LINE:729
  private[this] val controllers_ExternalAssets_at590_route = Route("GET",
    PathPattern(List(StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )

  // @LINE:731
  private[this] val controllers_Main_manifest591_route = Route("GET",
    PathPattern(List(StaticPart("manifest.json")))
  )

  // @LINE:732
  private[this] val controllers_Main_robots592_route = Route("GET",
    PathPattern(List(StaticPart("robots.txt")))
  )

  // @LINE:734
  private[this] val controllers_User_redirect593_route = Route("GET",
    PathPattern(List(DynamicPart("username", """\w{2,30}""",false)))
  )

  // @LINE:736
  private[this] val controllers_Options_root594_route = Route("OPTIONS",
    PathPattern(List())
  )

  // @LINE:737
  private[this] val controllers_Options_all595_route = Route("OPTIONS",
    PathPattern(List(DynamicPart("url", """.+""",false)))
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:2
    case controllers_Lobby_home0_route(params@_) =>
    named("Lobby.home") {
      call { 
          Lobby_54.home
      }
    }
  
    // @LINE:3
    case controllers_Lobby_seeks1_route(params@_) =>
    named("Lobby.seeks") {
      call { 
          Lobby_54.seeks
      }
    }
  
    // @LINE:6
    case controllers_Timeline_home2_route(params@_) =>
    named("Timeline.home") {
      call { 
          Timeline_13.home
      }
    }
  
    // @LINE:7
    case controllers_Timeline_unsub3_route(params@_) =>
    named("Timeline.unsub") {
      call(params.fromPath[String]("channel", None)) { (channel) =>
          Timeline_13.unsub(channel)
      }
    }
  
    // @LINE:10
    case controllers_Search_index4_route(params@_) =>
    named("Search.index") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Search_42.index(page)
      }
    }
  
    // @LINE:13
    case controllers_Game_exportByIds5_route(params@_) =>
    named("Game.exportByIds") {
      call { 
          Game_6.exportByIds
      }
    }
  
    // @LINE:14
    case controllers_Game_exportByUser6_route(params@_) =>
    named("Game.exportByUser") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Game_6.exportByUser(username)
      }
    }
  
    // @LINE:17
    case controllers_Tv_index7_route(params@_) =>
    named("Tv.index") {
      call { 
          Tv_16.index
      }
    }
  
    // @LINE:18
    case controllers_Tv_frame8_route(params@_) =>
    named("Tv.frame") {
      call { 
          Tv_16.frame
      }
    }
  
    // @LINE:19
    case controllers_Tv_feed9_route(params@_) =>
    named("Tv.feed") {
      call { 
          Tv_16.feed
      }
    }
  
    // @LINE:20
    case controllers_Tv_channels10_route(params@_) =>
    named("Tv.channels") {
      call { 
          Tv_16.channels
      }
    }
  
    // @LINE:21
    case controllers_Tv_onChannel11_route(params@_) =>
    named("Tv.onChannel") {
      call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
          Tv_16.onChannel(chanKey)
      }
    }
  
    // @LINE:22
    case controllers_Tv_sides12_route(params@_) =>
    named("Tv.sides") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("color", None)) { (gameId, color) =>
          Tv_16.sides(gameId, color)
      }
    }
  
    // @LINE:23
    case controllers_Tv_games13_route(params@_) =>
    named("Tv.games") {
      call { 
          Tv_16.games
      }
    }
  
    // @LINE:24
    case controllers_Tv_gamesChannel14_route(params@_) =>
    named("Tv.gamesChannel") {
      call(params.fromPath[String]("chanKey", None)) { (chanKey) =>
          Tv_16.gamesChannel(chanKey)
      }
    }
  
    // @LINE:27
    case controllers_Relation_follow15_route(params@_) =>
    named("Relation.follow") {
      call(params.fromPath[String]("userId", None)) { (userId) =>
          Relation_60.follow(userId)
      }
    }
  
    // @LINE:28
    case controllers_Relation_unfollow16_route(params@_) =>
    named("Relation.unfollow") {
      call(params.fromPath[String]("userId", None)) { (userId) =>
          Relation_60.unfollow(userId)
      }
    }
  
    // @LINE:29
    case controllers_Relation_block17_route(params@_) =>
    named("Relation.block") {
      call(params.fromPath[String]("userId", None)) { (userId) =>
          Relation_60.block(userId)
      }
    }
  
    // @LINE:30
    case controllers_Relation_unblock18_route(params@_) =>
    named("Relation.unblock") {
      call(params.fromPath[String]("userId", None)) { (userId) =>
          Relation_60.unblock(userId)
      }
    }
  
    // @LINE:31
    case controllers_Relation_following19_route(params@_) =>
    named("Relation.following") {
      call(params.fromPath[String]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
          Relation_60.following(username, page)
      }
    }
  
    // @LINE:32
    case controllers_Relation_followers20_route(params@_) =>
    named("Relation.followers") {
      call(params.fromPath[String]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
          Relation_60.followers(username, page)
      }
    }
  
    // @LINE:33
    case controllers_Relation_blocks21_route(params@_) =>
    named("Relation.blocks") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Relation_60.blocks(page)
      }
    }
  
    // @LINE:36
    case controllers_Insight_refresh22_route(params@_) =>
    named("Insight.refresh") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Insight_0.refresh(username)
      }
    }
  
    // @LINE:37
    case controllers_Insight_json23_route(params@_) =>
    named("Insight.json") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Insight_0.json(username)
      }
    }
  
    // @LINE:38
    case controllers_Insight_index24_route(params@_) =>
    named("Insight.index") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Insight_0.index(username)
      }
    }
  
    // @LINE:39
    case controllers_Insight_path25_route(params@_) =>
    named("Insight.path") {
      call(params.fromPath[String]("username", None), params.fromPath[String]("metric", None), params.fromPath[String]("dimension", None), Param[String]("filters", Right(""))) { (username, metric, dimension, filters) =>
          Insight_0.path(username, metric, dimension, filters)
      }
    }
  
    // @LINE:40
    case controllers_Insight_path26_route(params@_) =>
    named("Insight.path") {
      call(params.fromPath[String]("username", None), params.fromPath[String]("metric", None), params.fromPath[String]("dimension", None), params.fromPath[String]("filters", None)) { (username, metric, dimension, filters) =>
          Insight_0.path(username, metric, dimension, filters)
      }
    }
  
    // @LINE:43
    case controllers_UserTournament_path27_route(params@_) =>
    named("UserTournament.path") {
      call(params.fromPath[String]("username", None), params.fromPath[String]("path", None), params.fromQuery[Int]("page", Some(1))) { (username, path, page) =>
          UserTournament_45.path(username, path, page)
      }
    }
  
    // @LINE:46
    case controllers_User_mod28_route(params@_) =>
    named("User.mod") {
      call(params.fromPath[String]("username", None)) { (username) =>
          User_19.mod(username)
      }
    }
  
    // @LINE:47
    case controllers_User_writeNote29_route(params@_) =>
    named("User.writeNote") {
      call(params.fromPath[String]("username", None)) { (username) =>
          User_19.writeNote(username)
      }
    }
  
    // @LINE:48
    case controllers_User_deleteNote30_route(params@_) =>
    named("User.deleteNote") {
      call(params.fromPath[String]("id", None)) { (id) =>
          User_19.deleteNote(id)
      }
    }
  
    // @LINE:49
    case controllers_User_showMini31_route(params@_) =>
    named("User.showMini") {
      call(params.fromPath[String]("username", None)) { (username) =>
          User_19.showMini(username)
      }
    }
  
    // @LINE:50
    case controllers_User_tv32_route(params@_) =>
    named("User.tv") {
      call(params.fromPath[String]("username", None)) { (username) =>
          User_19.tv(username)
      }
    }
  
    // @LINE:51
    case controllers_User_perfStat33_route(params@_) =>
    named("User.perfStat") {
      call(params.fromPath[String]("username", None), params.fromPath[String]("perfKey", None)) { (username, perfKey) =>
          User_19.perfStat(username, perfKey)
      }
    }
  
    // @LINE:52
    case controllers_User_gamesAll34_route(params@_) =>
    named("User.gamesAll") {
      call(params.fromPath[String]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
          User_19.gamesAll(username, page)
      }
    }
  
    // @LINE:53
    case controllers_User_games35_route(params@_) =>
    named("User.games") {
      call(params.fromPath[String]("username", None), params.fromPath[String]("filterName", None), params.fromQuery[Int]("page", Some(1))) { (username, filterName, page) =>
          User_19.games(username, filterName, page)
      }
    }
  
    // @LINE:54
    case controllers_User_show36_route(params@_) =>
    named("User.show") {
      call(params.fromPath[String]("username", None)) { (username) =>
          User_19.show(username)
      }
    }
  
    // @LINE:55
    case controllers_User_myself37_route(params@_) =>
    named("User.myself") {
      call { 
          User_19.myself
      }
    }
  
    // @LINE:56
    case controllers_User_opponents38_route(params@_) =>
    named("User.opponents") {
      call { 
          User_19.opponents
      }
    }
  
    // @LINE:57
    case controllers_User_list39_route(params@_) =>
    named("User.list") {
      call { 
          User_19.list
      }
    }
  
    // @LINE:58
    case controllers_User_topNb40_route(params@_) =>
    named("User.topNb") {
      call(params.fromPath[Int]("nb", None), params.fromPath[String]("perfKey", None)) { (nb, perfKey) =>
          User_19.topNb(nb, perfKey)
      }
    }
  
    // @LINE:59
    case controllers_User_topWeek41_route(params@_) =>
    named("User.topWeek") {
      call { 
          User_19.topWeek
      }
    }
  
    // @LINE:60
    case controllers_User_online42_route(params@_) =>
    named("User.online") {
      call { 
          User_19.online
      }
    }
  
    // @LINE:61
    case controllers_User_autocomplete43_route(params@_) =>
    named("User.autocomplete") {
      call { 
          User_19.autocomplete
      }
    }
  
    // @LINE:63
    case controllers_Dasher_get44_route(params@_) =>
    named("Dasher.get") {
      call { 
          Dasher_20.get
      }
    }
  
    // @LINE:66
    case controllers_Blog_index45_route(params@_) =>
    named("Blog.index") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Blog_36.index(page)
      }
    }
  
    // @LINE:67
    case controllers_Blog_all46_route(params@_) =>
    named("Blog.all") {
      call { 
          Blog_36.all
      }
    }
  
    // @LINE:68
    case controllers_Blog_year47_route(params@_) =>
    named("Blog.year") {
      call(params.fromPath[Int]("year", None)) { (year) =>
          Blog_36.year(year)
      }
    }
  
    // @LINE:69
    case controllers_Blog_discuss48_route(params@_) =>
    named("Blog.discuss") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Blog_36.discuss(id)
      }
    }
  
    // @LINE:70
    case controllers_Blog_show49_route(params@_) =>
    named("Blog.show") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("slug", None), params.fromQuery[Option[String]]("ref", Some(None))) { (id, slug, ref) =>
          Blog_36.show(id, slug, ref)
      }
    }
  
    // @LINE:71
    case controllers_Blog_atom50_route(params@_) =>
    named("Blog.atom") {
      call { 
          Blog_36.atom
      }
    }
  
    // @LINE:72
    case controllers_Blog_sitemapTxt51_route(params@_) =>
    named("Blog.sitemapTxt") {
      call { 
          Blog_36.sitemapTxt
      }
    }
  
    // @LINE:75
    case controllers_Coordinate_home52_route(params@_) =>
    named("Coordinate.home") {
      call { 
          Coordinate_4.home
      }
    }
  
    // @LINE:76
    case controllers_Coordinate_score53_route(params@_) =>
    named("Coordinate.score") {
      call { 
          Coordinate_4.score
      }
    }
  
    // @LINE:77
    case controllers_Coordinate_color54_route(params@_) =>
    named("Coordinate.color") {
      call { 
          Coordinate_4.color
      }
    }
  
    // @LINE:80
    case controllers_Puzzle_home55_route(params@_) =>
    named("Puzzle.home") {
      call { 
          Puzzle_47.home
      }
    }
  
    // @LINE:81
    case controllers_Puzzle_newPuzzle56_route(params@_) =>
    named("Puzzle.newPuzzle") {
      call { 
          Puzzle_47.newPuzzle
      }
    }
  
    // @LINE:82
    case controllers_Puzzle_daily57_route(params@_) =>
    named("Puzzle.daily") {
      call { 
          Puzzle_47.daily
      }
    }
  
    // @LINE:83
    case controllers_Puzzle_frame58_route(params@_) =>
    named("Puzzle.frame") {
      call { 
          Puzzle_47.frame
      }
    }
  
    // @LINE:84
    case controllers_Export_legacyPuzzleThumbnail59_route(params@_) =>
    named("Export.legacyPuzzleThumbnail") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Export_18.legacyPuzzleThumbnail(id)
      }
    }
  
    // @LINE:85
    case controllers_Export_puzzleThumbnail60_route(params@_) =>
    named("Export.puzzleThumbnail") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Export_18.puzzleThumbnail(id)
      }
    }
  
    // @LINE:86
    case controllers_Puzzle_batchSelect61_route(params@_) =>
    named("Puzzle.batchSelect") {
      call { 
          Puzzle_47.batchSelect
      }
    }
  
    // @LINE:87
    case controllers_Puzzle_batchSolve62_route(params@_) =>
    named("Puzzle.batchSolve") {
      call { 
          Puzzle_47.batchSolve
      }
    }
  
    // @LINE:88
    case controllers_Puzzle_show63_route(params@_) =>
    named("Puzzle.show") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Puzzle_47.show(id)
      }
    }
  
    // @LINE:89
    case controllers_Puzzle_load64_route(params@_) =>
    named("Puzzle.load") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Puzzle_47.load(id)
      }
    }
  
    // @LINE:90
    case controllers_Puzzle_vote65_route(params@_) =>
    named("Puzzle.vote") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Puzzle_47.vote(id)
      }
    }
  
    // @LINE:91
    case controllers_Puzzle_round66_route(params@_) =>
    named("Puzzle.round") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Puzzle_47.round(id)
      }
    }
  
    // @LINE:93
    case controllers_Puzzle_round267_route(params@_) =>
    named("Puzzle.round2") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Puzzle_47.round2(id)
      }
    }
  
    // @LINE:95
    case controllers_Puzzle_round68_route(params@_) =>
    named("Puzzle.round") {
      call(params.fromPath[Int]("id", None)) { (id) =>
          Puzzle_47.round(id)
      }
    }
  
    // @LINE:98
    case controllers_UserAnalysis_help69_route(params@_) =>
    named("UserAnalysis.help") {
      call { 
          UserAnalysis_38.help
      }
    }
  
    // @LINE:99
    case controllers_UserAnalysis_parseArg70_route(params@_) =>
    named("UserAnalysis.parseArg") {
      call(params.fromPath[String]("something", None)) { (something) =>
          UserAnalysis_38.parseArg(something)
      }
    }
  
    // @LINE:100
    case controllers_UserAnalysis_index71_route(params@_) =>
    named("UserAnalysis.index") {
      call { 
          UserAnalysis_38.index
      }
    }
  
    // @LINE:101
    case controllers_UserAnalysis_pgn72_route(params@_) =>
    named("UserAnalysis.pgn") {
      call { 
          UserAnalysis_38.pgn
      }
    }
  
    // @LINE:104
    case controllers_Study_allDefault73_route(params@_) =>
    named("Study.allDefault") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Study_58.allDefault(page)
      }
    }
  
    // @LINE:105
    case controllers_Study_all74_route(params@_) =>
    named("Study.all") {
      call(params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
          Study_58.all(order, page)
      }
    }
  
    // @LINE:106
    case controllers_Study_mine75_route(params@_) =>
    named("Study.mine") {
      call(params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
          Study_58.mine(order, page)
      }
    }
  
    // @LINE:107
    case controllers_Study_mineMember76_route(params@_) =>
    named("Study.mineMember") {
      call(params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
          Study_58.mineMember(order, page)
      }
    }
  
    // @LINE:108
    case controllers_Study_minePublic77_route(params@_) =>
    named("Study.minePublic") {
      call(params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
          Study_58.minePublic(order, page)
      }
    }
  
    // @LINE:109
    case controllers_Study_minePrivate78_route(params@_) =>
    named("Study.minePrivate") {
      call(params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
          Study_58.minePrivate(order, page)
      }
    }
  
    // @LINE:110
    case controllers_Study_mineLikes79_route(params@_) =>
    named("Study.mineLikes") {
      call(params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (order, page) =>
          Study_58.mineLikes(order, page)
      }
    }
  
    // @LINE:111
    case controllers_Study_byOwnerDefault80_route(params@_) =>
    named("Study.byOwnerDefault") {
      call(params.fromPath[String]("username", None), params.fromQuery[Int]("page", Some(1))) { (username, page) =>
          Study_58.byOwnerDefault(username, page)
      }
    }
  
    // @LINE:112
    case controllers_Study_byOwner81_route(params@_) =>
    named("Study.byOwner") {
      call(params.fromPath[String]("username", None), params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (username, order, page) =>
          Study_58.byOwner(username, order, page)
      }
    }
  
    // @LINE:113
    case controllers_Study_search82_route(params@_) =>
    named("Study.search") {
      call(params.fromQuery[String]("q", Some("")), params.fromQuery[Int]("page", Some(1))) { (q, page) =>
          Study_58.search(q, page)
      }
    }
  
    // @LINE:114
    case controllers_Study_show83_route(params@_) =>
    named("Study.show") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.show(id)
      }
    }
  
    // @LINE:115
    case controllers_Study_create84_route(params@_) =>
    named("Study.create") {
      call { 
          Study_58.create
      }
    }
  
    // @LINE:116
    case controllers_Study_createAs85_route(params@_) =>
    named("Study.createAs") {
      call { 
          Study_58.createAs
      }
    }
  
    // @LINE:117
    case controllers_Study_pgn86_route(params@_) =>
    named("Study.pgn") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.pgn(id)
      }
    }
  
    // @LINE:118
    case controllers_Study_chapterPgn87_route(params@_) =>
    named("Study.chapterPgn") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("chapterId", None)) { (id, chapterId) =>
          Study_58.chapterPgn(id, chapterId)
      }
    }
  
    // @LINE:119
    case controllers_Study_chapterGif88_route(params@_) =>
    named("Study.chapterGif") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("chapterId", None)) { (id, chapterId) =>
          Study_58.chapterGif(id, chapterId)
      }
    }
  
    // @LINE:120
    case controllers_Study_delete89_route(params@_) =>
    named("Study.delete") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.delete(id)
      }
    }
  
    // @LINE:121
    case controllers_Study_cloneStudy90_route(params@_) =>
    named("Study.cloneStudy") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.cloneStudy(id)
      }
    }
  
    // @LINE:122
    case controllers_Study_cloneApply91_route(params@_) =>
    named("Study.cloneApply") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.cloneApply(id)
      }
    }
  
    // @LINE:123
    case controllers_Study_chapter92_route(params@_) =>
    named("Study.chapter") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("chapterId", None)) { (id, chapterId) =>
          Study_58.chapter(id, chapterId)
      }
    }
  
    // @LINE:124
    case controllers_Study_chapterMeta93_route(params@_) =>
    named("Study.chapterMeta") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("chapterId", None)) { (id, chapterId) =>
          Study_58.chapterMeta(id, chapterId)
      }
    }
  
    // @LINE:125
    case controllers_Study_embed94_route(params@_) =>
    named("Study.embed") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("chapterId", None)) { (id, chapterId) =>
          Study_58.embed(id, chapterId)
      }
    }
  
    // @LINE:126
    case controllers_Study_clearChat95_route(params@_) =>
    named("Study.clearChat") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.clearChat(id)
      }
    }
  
    // @LINE:127
    case controllers_Study_importPgn96_route(params@_) =>
    named("Study.importPgn") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.importPgn(id)
      }
    }
  
    // @LINE:128
    case controllers_Study_multiBoard97_route(params@_) =>
    named("Study.multiBoard") {
      call(params.fromPath[String]("id", None), params.fromQuery[Int]("page", Some(1))) { (id, page) =>
          Study_58.multiBoard(id, page)
      }
    }
  
    // @LINE:129
    case controllers_Study_admin98_route(params@_) =>
    named("Study.admin") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Study_58.admin(id)
      }
    }
  
    // @LINE:130
    case controllers_Study_topics99_route(params@_) =>
    named("Study.topics") {
      call { 
          Study_58.topics
      }
    }
  
    // @LINE:131
    case controllers_Study_setTopics100_route(params@_) =>
    named("Study.setTopics") {
      call { 
          Study_58.setTopics
      }
    }
  
    // @LINE:132
    case controllers_Study_byTopic101_route(params@_) =>
    named("Study.byTopic") {
      call(params.fromPath[String]("topic", None), params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (topic, order, page) =>
          Study_58.byTopic(topic, order, page)
      }
    }
  
    // @LINE:133
    case controllers_Study_topicAutocomplete102_route(params@_) =>
    named("Study.topicAutocomplete") {
      call { 
          Study_58.topicAutocomplete
      }
    }
  
    // @LINE:136
    case controllers_Relay_index103_route(params@_) =>
    named("Relay.index") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Relay_25.index(page)
      }
    }
  
    // @LINE:137
    case controllers_Relay_form104_route(params@_) =>
    named("Relay.form") {
      call { 
          Relay_25.form
      }
    }
  
    // @LINE:138
    case controllers_Relay_create105_route(params@_) =>
    named("Relay.create") {
      call { 
          Relay_25.create
      }
    }
  
    // @LINE:139
    case controllers_Relay_show106_route(params@_) =>
    named("Relay.show") {
      call(params.fromPath[String]("slug", None), params.fromPath[String]("id", None)) { (slug, id) =>
          Relay_25.show(slug, id)
      }
    }
  
    // @LINE:140
    case controllers_Relay_chapter107_route(params@_) =>
    named("Relay.chapter") {
      call(params.fromPath[String]("slug", None), params.fromPath[String]("id", None), params.fromPath[String]("chapterId", None)) { (slug, id, chapterId) =>
          Relay_25.chapter(slug, id, chapterId)
      }
    }
  
    // @LINE:141
    case controllers_Relay_edit108_route(params@_) =>
    named("Relay.edit") {
      call(params.fromPath[String]("slug", None), params.fromPath[String]("id", None)) { (slug, id) =>
          Relay_25.edit(slug, id)
      }
    }
  
    // @LINE:142
    case controllers_Relay_update109_route(params@_) =>
    named("Relay.update") {
      call(params.fromPath[String]("slug", None), params.fromPath[String]("id", None)) { (slug, id) =>
          Relay_25.update(slug, id)
      }
    }
  
    // @LINE:143
    case controllers_Relay_reset110_route(params@_) =>
    named("Relay.reset") {
      call(params.fromPath[String]("slug", None), params.fromPath[String]("id", None)) { (slug, id) =>
          Relay_25.reset(slug, id)
      }
    }
  
    // @LINE:144
    case controllers_Relay_cloneRelay111_route(params@_) =>
    named("Relay.cloneRelay") {
      call(params.fromPath[String]("slug", None), params.fromPath[String]("id", None)) { (slug, id) =>
          Relay_25.cloneRelay(slug, id)
      }
    }
  
    // @LINE:145
    case controllers_Relay_push112_route(params@_) =>
    named("Relay.push") {
      call(params.fromPath[String]("slug", None), params.fromPath[String]("id", None)) { (slug, id) =>
          Relay_25.push(slug, id)
      }
    }
  
    // @LINE:148
    case controllers_Learn_index113_route(params@_) =>
    named("Learn.index") {
      call { 
          Learn_39.index
      }
    }
  
    // @LINE:149
    case controllers_Learn_score114_route(params@_) =>
    named("Learn.score") {
      call { 
          Learn_39.score
      }
    }
  
    // @LINE:150
    case controllers_Learn_reset115_route(params@_) =>
    named("Learn.reset") {
      call { 
          Learn_39.reset
      }
    }
  
    // @LINE:153
    case controllers_Plan_index116_route(params@_) =>
    named("Plan.index") {
      call { 
          Plan_40.index
      }
    }
  
    // @LINE:154
    case controllers_Plan_thanks117_route(params@_) =>
    named("Plan.thanks") {
      call { 
          Plan_40.thanks
      }
    }
  
    // @LINE:155
    case controllers_Plan_list118_route(params@_) =>
    named("Plan.list") {
      call { 
          Plan_40.list
      }
    }
  
    // @LINE:156
    case controllers_Plan_switch119_route(params@_) =>
    named("Plan.switch") {
      call { 
          Plan_40.switch
      }
    }
  
    // @LINE:157
    case controllers_Plan_cancel120_route(params@_) =>
    named("Plan.cancel") {
      call { 
          Plan_40.cancel
      }
    }
  
    // @LINE:158
    case controllers_Plan_webhook121_route(params@_) =>
    named("Plan.webhook") {
      call { 
          Plan_40.webhook
      }
    }
  
    // @LINE:159
    case controllers_Plan_stripeCheckout122_route(params@_) =>
    named("Plan.stripeCheckout") {
      call { 
          Plan_40.stripeCheckout
      }
    }
  
    // @LINE:160
    case controllers_Plan_payPalIpn123_route(params@_) =>
    named("Plan.payPalIpn") {
      call { 
          Plan_40.payPalIpn
      }
    }
  
    // @LINE:161
    case controllers_Plan_features124_route(params@_) =>
    named("Plan.features") {
      call { 
          Plan_40.features
      }
    }
  
    // @LINE:162
    case controllers_Main_movedPermanently125_route(params@_) =>
    named("Main.movedPermanently") {
      call(Param[String]("to", Right("/patron"))) { (to) =>
          Main_15.movedPermanently(to)
      }
    }
  
    // @LINE:165
    case controllers_Practice_index126_route(params@_) =>
    named("Practice.index") {
      call { 
          Practice_37.index
      }
    }
  
    // @LINE:166
    case controllers_Practice_chapter127_route(params@_) =>
    named("Practice.chapter") {
      call(params.fromPath[String]("studyId", None), params.fromPath[String]("chapterId", None)) { (studyId, chapterId) =>
          Practice_37.chapter(studyId, chapterId)
      }
    }
  
    // @LINE:167
    case controllers_Practice_config128_route(params@_) =>
    named("Practice.config") {
      call { 
          Practice_37.config
      }
    }
  
    // @LINE:168
    case controllers_Practice_configSave129_route(params@_) =>
    named("Practice.configSave") {
      call { 
          Practice_37.configSave
      }
    }
  
    // @LINE:169
    case controllers_Practice_reset130_route(params@_) =>
    named("Practice.reset") {
      call { 
          Practice_37.reset
      }
    }
  
    // @LINE:170
    case controllers_Practice_showSection131_route(params@_) =>
    named("Practice.showSection") {
      call(params.fromPath[String]("sectionId", None)) { (sectionId) =>
          Practice_37.showSection(sectionId)
      }
    }
  
    // @LINE:171
    case controllers_Practice_showStudySlug132_route(params@_) =>
    named("Practice.showStudySlug") {
      call(params.fromPath[String]("sectionId", None), params.fromPath[String]("studySlug", None)) { (sectionId, studySlug) =>
          Practice_37.showStudySlug(sectionId, studySlug)
      }
    }
  
    // @LINE:172
    case controllers_Practice_show133_route(params@_) =>
    named("Practice.show") {
      call(params.fromPath[String]("sectionId", None), params.fromPath[String]("studySlug", None), params.fromPath[String]("studyId", None)) { (sectionId, studySlug, studyId) =>
          Practice_37.show(sectionId, studySlug, studyId)
      }
    }
  
    // @LINE:173
    case controllers_Practice_showChapter134_route(params@_) =>
    named("Practice.showChapter") {
      call(params.fromPath[String]("sectionId", None), params.fromPath[String]("studySlug", None), params.fromPath[String]("studyId", None), params.fromPath[String]("chapterId", None)) { (sectionId, studySlug, studyId, chapterId) =>
          Practice_37.showChapter(sectionId, studySlug, studyId, chapterId)
      }
    }
  
    // @LINE:174
    case controllers_Practice_complete135_route(params@_) =>
    named("Practice.complete") {
      call(params.fromPath[String]("chapterId", None), params.fromPath[Int]("moves", None)) { (chapterId, moves) =>
          Practice_37.complete(chapterId, moves)
      }
    }
  
    // @LINE:177
    case controllers_Streamer_index136_route(params@_) =>
    named("Streamer.index") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Streamer_22.index(page)
      }
    }
  
    // @LINE:178
    case controllers_Streamer_live137_route(params@_) =>
    named("Streamer.live") {
      call { 
          Streamer_22.live
      }
    }
  
    // @LINE:179
    case controllers_Streamer_edit138_route(params@_) =>
    named("Streamer.edit") {
      call { 
          Streamer_22.edit
      }
    }
  
    // @LINE:180
    case controllers_Streamer_create139_route(params@_) =>
    named("Streamer.create") {
      call { 
          Streamer_22.create
      }
    }
  
    // @LINE:181
    case controllers_Streamer_editApply140_route(params@_) =>
    named("Streamer.editApply") {
      call { 
          Streamer_22.editApply
      }
    }
  
    // @LINE:182
    case controllers_Streamer_approvalRequest141_route(params@_) =>
    named("Streamer.approvalRequest") {
      call { 
          Streamer_22.approvalRequest
      }
    }
  
    // @LINE:183
    case controllers_Streamer_picture142_route(params@_) =>
    named("Streamer.picture") {
      call { 
          Streamer_22.picture
      }
    }
  
    // @LINE:184
    case controllers_Streamer_pictureApply143_route(params@_) =>
    named("Streamer.pictureApply") {
      call { 
          Streamer_22.pictureApply
      }
    }
  
    // @LINE:185
    case controllers_Streamer_pictureDelete144_route(params@_) =>
    named("Streamer.pictureDelete") {
      call { 
          Streamer_22.pictureDelete
      }
    }
  
    // @LINE:186
    case controllers_Streamer_show145_route(params@_) =>
    named("Streamer.show") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Streamer_22.show(username)
      }
    }
  
    // @LINE:189
    case controllers_Round_watcher146_route(params@_) =>
    named("Round.watcher") {
      call(params.fromPath[String]("gameId", None), Param[String]("color", Right("white"))) { (gameId, color) =>
          Round_30.watcher(gameId, color)
      }
    }
  
    // @LINE:190
    case controllers_Round_watcher147_route(params@_) =>
    named("Round.watcher") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("color", None)) { (gameId, color) =>
          Round_30.watcher(gameId, color)
      }
    }
  
    // @LINE:191
    case controllers_Round_player148_route(params@_) =>
    named("Round.player") {
      call(params.fromPath[String]("fullId", None)) { (fullId) =>
          Round_30.player(fullId)
      }
    }
  
    // @LINE:192
    case controllers_Round_sides149_route(params@_) =>
    named("Round.sides") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("color", None)) { (gameId, color) =>
          Round_30.sides(gameId, color)
      }
    }
  
    // @LINE:193
    case controllers_Round_continue150_route(params@_) =>
    named("Round.continue") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("mode", None)) { (gameId, mode) =>
          Round_30.continue(gameId, mode)
      }
    }
  
    // @LINE:194
    case controllers_Round_readNote151_route(params@_) =>
    named("Round.readNote") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Round_30.readNote(gameId)
      }
    }
  
    // @LINE:195
    case controllers_Round_writeNote152_route(params@_) =>
    named("Round.writeNote") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Round_30.writeNote(gameId)
      }
    }
  
    // @LINE:196
    case controllers_Round_mini153_route(params@_) =>
    named("Round.mini") {
      call(params.fromPath[String]("gameId", None), Param[String]("color", Right("white"))) { (gameId, color) =>
          Round_30.mini(gameId, color)
      }
    }
  
    // @LINE:197
    case controllers_Round_mini154_route(params@_) =>
    named("Round.mini") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("color", None)) { (gameId, color) =>
          Round_30.mini(gameId, color)
      }
    }
  
    // @LINE:198
    case controllers_Round_miniFullId155_route(params@_) =>
    named("Round.miniFullId") {
      call(params.fromPath[String]("fullId", None)) { (fullId) =>
          Round_30.miniFullId(fullId)
      }
    }
  
    // @LINE:199
    case controllers_Editor_game156_route(params@_) =>
    named("Editor.game") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Editor_9.game(gameId)
      }
    }
  
    // @LINE:200
    case controllers_UserAnalysis_game157_route(params@_) =>
    named("UserAnalysis.game") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("color", None)) { (gameId, color) =>
          UserAnalysis_38.game(gameId, color)
      }
    }
  
    // @LINE:201
    case controllers_UserAnalysis_forecasts158_route(params@_) =>
    named("UserAnalysis.forecasts") {
      call(params.fromPath[String]("fullId", None)) { (fullId) =>
          UserAnalysis_38.forecasts(fullId)
      }
    }
  
    // @LINE:202
    case controllers_UserAnalysis_forecastsOnMyTurn159_route(params@_) =>
    named("UserAnalysis.forecastsOnMyTurn") {
      call(params.fromPath[String]("fullId", None), params.fromPath[String]("uci", None)) { (fullId, uci) =>
          UserAnalysis_38.forecastsOnMyTurn(fullId, uci)
      }
    }
  
    // @LINE:203
    case controllers_Round_resign160_route(params@_) =>
    named("Round.resign") {
      call(params.fromPath[String]("fullId", None)) { (fullId) =>
          Round_30.resign(fullId)
      }
    }
  
    // @LINE:205
    case controllers_Analyse_embed161_route(params@_) =>
    named("Analyse.embed") {
      call(params.fromPath[String]("gameId", None), Param[String]("color", Right("white"))) { (gameId, color) =>
          Analyse_23.embed(gameId, color)
      }
    }
  
    // @LINE:206
    case controllers_Analyse_embed162_route(params@_) =>
    named("Analyse.embed") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("color", None)) { (gameId, color) =>
          Analyse_23.embed(gameId, color)
      }
    }
  
    // @LINE:208
    case controllers_Game_delete163_route(params@_) =>
    named("Game.delete") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Game_6.delete(gameId)
      }
    }
  
    // @LINE:210
    case controllers_Round_next164_route(params@_) =>
    named("Round.next") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Round_30.next(gameId)
      }
    }
  
    // @LINE:211
    case controllers_Round_whatsNext165_route(params@_) =>
    named("Round.whatsNext") {
      call(params.fromPath[String]("fullId", None)) { (fullId) =>
          Round_30.whatsNext(fullId)
      }
    }
  
    // @LINE:214
    case controllers_Tournament_home166_route(params@_) =>
    named("Tournament.home") {
      call { 
          Tournament_3.home
      }
    }
  
    // @LINE:215
    case controllers_Tournament_featured167_route(params@_) =>
    named("Tournament.featured") {
      call { 
          Tournament_3.featured
      }
    }
  
    // @LINE:216
    case controllers_Tournament_form168_route(params@_) =>
    named("Tournament.form") {
      call { 
          Tournament_3.form
      }
    }
  
    // @LINE:217
    case controllers_Tournament_create169_route(params@_) =>
    named("Tournament.create") {
      call { 
          Tournament_3.create
      }
    }
  
    // @LINE:218
    case controllers_Tournament_teamBattleForm170_route(params@_) =>
    named("Tournament.teamBattleForm") {
      call(params.fromPath[String]("teamId", None)) { (teamId) =>
          Tournament_3.teamBattleForm(teamId)
      }
    }
  
    // @LINE:219
    case controllers_Tournament_teamBattleEdit171_route(params@_) =>
    named("Tournament.teamBattleEdit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.teamBattleEdit(id)
      }
    }
  
    // @LINE:220
    case controllers_Tournament_teamBattleUpdate172_route(params@_) =>
    named("Tournament.teamBattleUpdate") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.teamBattleUpdate(id)
      }
    }
  
    // @LINE:221
    case controllers_Tournament_calendar173_route(params@_) =>
    named("Tournament.calendar") {
      call { 
          Tournament_3.calendar
      }
    }
  
    // @LINE:222
    case controllers_Tournament_history174_route(params@_) =>
    named("Tournament.history") {
      call(Param[String]("freq", Right("unique")), params.fromQuery[Int]("page", Some(1))) { (freq, page) =>
          Tournament_3.history(freq, page)
      }
    }
  
    // @LINE:223
    case controllers_Tournament_history175_route(params@_) =>
    named("Tournament.history") {
      call(params.fromPath[String]("freq", None), params.fromQuery[Int]("page", Some(1))) { (freq, page) =>
          Tournament_3.history(freq, page)
      }
    }
  
    // @LINE:224
    case controllers_Tournament_show176_route(params@_) =>
    named("Tournament.show") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.show(id)
      }
    }
  
    // @LINE:225
    case controllers_Tournament_standing177_route(params@_) =>
    named("Tournament.standing") {
      call(params.fromPath[String]("id", None), params.fromPath[Int]("page", None)) { (id, page) =>
          Tournament_3.standing(id, page)
      }
    }
  
    // @LINE:226
    case controllers_Tournament_pageOf178_route(params@_) =>
    named("Tournament.pageOf") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("userId", None)) { (id, userId) =>
          Tournament_3.pageOf(id, userId)
      }
    }
  
    // @LINE:227
    case controllers_Tournament_join179_route(params@_) =>
    named("Tournament.join") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.join(id)
      }
    }
  
    // @LINE:228
    case controllers_Tournament_pause180_route(params@_) =>
    named("Tournament.pause") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.pause(id)
      }
    }
  
    // @LINE:229
    case controllers_Tournament_player181_route(params@_) =>
    named("Tournament.player") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("user", None)) { (id, user) =>
          Tournament_3.player(id, user)
      }
    }
  
    // @LINE:230
    case controllers_Tournament_teamInfo182_route(params@_) =>
    named("Tournament.teamInfo") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("team", None)) { (id, team) =>
          Tournament_3.teamInfo(id, team)
      }
    }
  
    // @LINE:231
    case controllers_Tournament_terminate183_route(params@_) =>
    named("Tournament.terminate") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.terminate(id)
      }
    }
  
    // @LINE:232
    case controllers_Tournament_edit184_route(params@_) =>
    named("Tournament.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.edit(id)
      }
    }
  
    // @LINE:233
    case controllers_Tournament_update185_route(params@_) =>
    named("Tournament.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.update(id)
      }
    }
  
    // @LINE:234
    case controllers_Tournament_help186_route(params@_) =>
    named("Tournament.help") {
      call(params.fromQuery[Option[String]]("system", Some(None))) { (system) =>
          Tournament_3.help(system)
      }
    }
  
    // @LINE:235
    case controllers_Tournament_leaderboard187_route(params@_) =>
    named("Tournament.leaderboard") {
      call { 
          Tournament_3.leaderboard
      }
    }
  
    // @LINE:236
    case controllers_Tournament_shields188_route(params@_) =>
    named("Tournament.shields") {
      call { 
          Tournament_3.shields
      }
    }
  
    // @LINE:237
    case controllers_Tournament_categShields189_route(params@_) =>
    named("Tournament.categShields") {
      call(params.fromPath[String]("categ", None)) { (categ) =>
          Tournament_3.categShields(categ)
      }
    }
  
    // @LINE:240
    case controllers_TournamentCrud_index190_route(params@_) =>
    named("TournamentCrud.index") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          TournamentCrud_26.index(page)
      }
    }
  
    // @LINE:241
    case controllers_TournamentCrud_cloneT191_route(params@_) =>
    named("TournamentCrud.cloneT") {
      call(params.fromPath[String]("id", None)) { (id) =>
          TournamentCrud_26.cloneT(id)
      }
    }
  
    // @LINE:242
    case controllers_TournamentCrud_edit192_route(params@_) =>
    named("TournamentCrud.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          TournamentCrud_26.edit(id)
      }
    }
  
    // @LINE:243
    case controllers_TournamentCrud_update193_route(params@_) =>
    named("TournamentCrud.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          TournamentCrud_26.update(id)
      }
    }
  
    // @LINE:244
    case controllers_TournamentCrud_form194_route(params@_) =>
    named("TournamentCrud.form") {
      call { 
          TournamentCrud_26.form
      }
    }
  
    // @LINE:245
    case controllers_TournamentCrud_create195_route(params@_) =>
    named("TournamentCrud.create") {
      call { 
          TournamentCrud_26.create
      }
    }
  
    // @LINE:248
    case controllers_Swiss_home196_route(params@_) =>
    named("Swiss.home") {
      call { 
          Swiss_28.home
      }
    }
  
    // @LINE:249
    case controllers_Swiss_form197_route(params@_) =>
    named("Swiss.form") {
      call(params.fromPath[String]("teamId", None)) { (teamId) =>
          Swiss_28.form(teamId)
      }
    }
  
    // @LINE:250
    case controllers_Swiss_create198_route(params@_) =>
    named("Swiss.create") {
      call(params.fromPath[String]("teamId", None)) { (teamId) =>
          Swiss_28.create(teamId)
      }
    }
  
    // @LINE:251
    case controllers_Swiss_show199_route(params@_) =>
    named("Swiss.show") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.show(id)
      }
    }
  
    // @LINE:252
    case controllers_Swiss_exportTrf200_route(params@_) =>
    named("Swiss.exportTrf") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.exportTrf(id)
      }
    }
  
    // @LINE:253
    case controllers_Swiss_join201_route(params@_) =>
    named("Swiss.join") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.join(id)
      }
    }
  
    // @LINE:254
    case controllers_Swiss_withdraw202_route(params@_) =>
    named("Swiss.withdraw") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.withdraw(id)
      }
    }
  
    // @LINE:255
    case controllers_Swiss_edit203_route(params@_) =>
    named("Swiss.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.edit(id)
      }
    }
  
    // @LINE:256
    case controllers_Swiss_update204_route(params@_) =>
    named("Swiss.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.update(id)
      }
    }
  
    // @LINE:257
    case controllers_Swiss_terminate205_route(params@_) =>
    named("Swiss.terminate") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.terminate(id)
      }
    }
  
    // @LINE:258
    case controllers_Swiss_standing206_route(params@_) =>
    named("Swiss.standing") {
      call(params.fromPath[String]("id", None), params.fromPath[Int]("page", None)) { (id, page) =>
          Swiss_28.standing(id, page)
      }
    }
  
    // @LINE:259
    case controllers_Swiss_pageOf207_route(params@_) =>
    named("Swiss.pageOf") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("user", None)) { (id, user) =>
          Swiss_28.pageOf(id, user)
      }
    }
  
    // @LINE:260
    case controllers_Swiss_player208_route(params@_) =>
    named("Swiss.player") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("user", None)) { (id, user) =>
          Swiss_28.player(id, user)
      }
    }
  
    // @LINE:261
    case controllers_Swiss_scheduleNextRound209_route(params@_) =>
    named("Swiss.scheduleNextRound") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.scheduleNextRound(id)
      }
    }
  
    // @LINE:264
    case controllers_Simul_home210_route(params@_) =>
    named("Simul.home") {
      call { 
          Simul_51.home
      }
    }
  
    // @LINE:265
    case controllers_Simul_form211_route(params@_) =>
    named("Simul.form") {
      call { 
          Simul_51.form
      }
    }
  
    // @LINE:266
    case controllers_Simul_create212_route(params@_) =>
    named("Simul.create") {
      call { 
          Simul_51.create
      }
    }
  
    // @LINE:267
    case controllers_Simul_homeReload213_route(params@_) =>
    named("Simul.homeReload") {
      call { 
          Simul_51.homeReload
      }
    }
  
    // @LINE:268
    case controllers_Simul_show214_route(params@_) =>
    named("Simul.show") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Simul_51.show(id)
      }
    }
  
    // @LINE:269
    case controllers_Simul_edit215_route(params@_) =>
    named("Simul.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Simul_51.edit(id)
      }
    }
  
    // @LINE:270
    case controllers_Simul_update216_route(params@_) =>
    named("Simul.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Simul_51.update(id)
      }
    }
  
    // @LINE:271
    case controllers_Simul_hostPing217_route(params@_) =>
    named("Simul.hostPing") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Simul_51.hostPing(id)
      }
    }
  
    // @LINE:272
    case controllers_Simul_accept218_route(params@_) =>
    named("Simul.accept") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("user", None)) { (id, user) =>
          Simul_51.accept(id, user)
      }
    }
  
    // @LINE:273
    case controllers_Simul_reject219_route(params@_) =>
    named("Simul.reject") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("user", None)) { (id, user) =>
          Simul_51.reject(id, user)
      }
    }
  
    // @LINE:274
    case controllers_Simul_start220_route(params@_) =>
    named("Simul.start") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Simul_51.start(id)
      }
    }
  
    // @LINE:275
    case controllers_Simul_abort221_route(params@_) =>
    named("Simul.abort") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Simul_51.abort(id)
      }
    }
  
    // @LINE:276
    case controllers_Simul_join222_route(params@_) =>
    named("Simul.join") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("variant", None)) { (id, variant) =>
          Simul_51.join(id, variant)
      }
    }
  
    // @LINE:277
    case controllers_Simul_withdraw223_route(params@_) =>
    named("Simul.withdraw") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Simul_51.withdraw(id)
      }
    }
  
    // @LINE:280
    case controllers_Team_home224_route(params@_) =>
    named("Team.home") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Team_57.home(page)
      }
    }
  
    // @LINE:281
    case controllers_Team_form225_route(params@_) =>
    named("Team.form") {
      call { 
          Team_57.form
      }
    }
  
    // @LINE:282
    case controllers_Team_create226_route(params@_) =>
    named("Team.create") {
      call { 
          Team_57.create
      }
    }
  
    // @LINE:283
    case controllers_Team_mine227_route(params@_) =>
    named("Team.mine") {
      call { 
          Team_57.mine
      }
    }
  
    // @LINE:284
    case controllers_Team_leader228_route(params@_) =>
    named("Team.leader") {
      call { 
          Team_57.leader
      }
    }
  
    // @LINE:285
    case controllers_Team_all229_route(params@_) =>
    named("Team.all") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Team_57.all(page)
      }
    }
  
    // @LINE:286
    case controllers_Team_requests230_route(params@_) =>
    named("Team.requests") {
      call { 
          Team_57.requests
      }
    }
  
    // @LINE:287
    case controllers_Team_search231_route(params@_) =>
    named("Team.search") {
      call(params.fromQuery[String]("text", Some("")), params.fromQuery[Int]("page", Some(1))) { (text, page) =>
          Team_57.search(text, page)
      }
    }
  
    // @LINE:288
    case controllers_Team_autocomplete232_route(params@_) =>
    named("Team.autocomplete") {
      call { 
          Team_57.autocomplete
      }
    }
  
    // @LINE:289
    case controllers_Team_show233_route(params@_) =>
    named("Team.show") {
      call(params.fromPath[String]("id", None), params.fromQuery[Int]("page", Some(1))) { (id, page) =>
          Team_57.show(id, page)
      }
    }
  
    // @LINE:290
    case controllers_Team_join234_route(params@_) =>
    named("Team.join") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.join(id)
      }
    }
  
    // @LINE:291
    case controllers_Team_quit235_route(params@_) =>
    named("Team.quit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.quit(id)
      }
    }
  
    // @LINE:292
    case controllers_Team_requestForm236_route(params@_) =>
    named("Team.requestForm") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.requestForm(id)
      }
    }
  
    // @LINE:293
    case controllers_Team_requestCreate237_route(params@_) =>
    named("Team.requestCreate") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.requestCreate(id)
      }
    }
  
    // @LINE:294
    case controllers_Team_requestProcess238_route(params@_) =>
    named("Team.requestProcess") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.requestProcess(id)
      }
    }
  
    // @LINE:295
    case controllers_Team_edit239_route(params@_) =>
    named("Team.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.edit(id)
      }
    }
  
    // @LINE:296
    case controllers_Team_update240_route(params@_) =>
    named("Team.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.update(id)
      }
    }
  
    // @LINE:297
    case controllers_Team_kickForm241_route(params@_) =>
    named("Team.kickForm") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.kickForm(id)
      }
    }
  
    // @LINE:298
    case controllers_Team_kick242_route(params@_) =>
    named("Team.kick") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.kick(id)
      }
    }
  
    // @LINE:299
    case controllers_Team_kickUser243_route(params@_) =>
    named("Team.kickUser") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("user", None)) { (id, user) =>
          Team_57.kickUser(id, user)
      }
    }
  
    // @LINE:300
    case controllers_Team_leadersForm244_route(params@_) =>
    named("Team.leadersForm") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.leadersForm(id)
      }
    }
  
    // @LINE:301
    case controllers_Team_leaders245_route(params@_) =>
    named("Team.leaders") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.leaders(id)
      }
    }
  
    // @LINE:302
    case controllers_Team_close246_route(params@_) =>
    named("Team.close") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.close(id)
      }
    }
  
    // @LINE:303
    case controllers_Team_disable247_route(params@_) =>
    named("Team.disable") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.disable(id)
      }
    }
  
    // @LINE:304
    case controllers_Team_tournaments248_route(params@_) =>
    named("Team.tournaments") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.tournaments(id)
      }
    }
  
    // @LINE:305
    case controllers_Team_pmAll249_route(params@_) =>
    named("Team.pmAll") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.pmAll(id)
      }
    }
  
    // @LINE:306
    case controllers_Team_pmAllSubmit250_route(params@_) =>
    named("Team.pmAllSubmit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.pmAllSubmit(id)
      }
    }
  
    // @LINE:307
    case controllers_Team_subscribe251_route(params@_) =>
    named("Team.subscribe") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.subscribe(id)
      }
    }
  
    // @LINE:309
    case controllers_Team_apiAll252_route(params@_) =>
    named("Team.apiAll") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Team_57.apiAll(page)
      }
    }
  
    // @LINE:310
    case controllers_Team_apiSearch253_route(params@_) =>
    named("Team.apiSearch") {
      call(params.fromQuery[String]("text", Some("")), params.fromQuery[Int]("page", Some(1))) { (text, page) =>
          Team_57.apiSearch(text, page)
      }
    }
  
    // @LINE:311
    case controllers_Team_apiTeamsOf254_route(params@_) =>
    named("Team.apiTeamsOf") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Team_57.apiTeamsOf(username)
      }
    }
  
    // @LINE:312
    case controllers_Team_apiShow255_route(params@_) =>
    named("Team.apiShow") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.apiShow(id)
      }
    }
  
    // @LINE:313
    case controllers_Team_users256_route(params@_) =>
    named("Team.users") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Team_57.users(id)
      }
    }
  
    // @LINE:314
    case controllers_Tournament_byTeam257_route(params@_) =>
    named("Tournament.byTeam") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Tournament_3.byTeam(id)
      }
    }
  
    // @LINE:315
    case controllers_Swiss_byTeam258_route(params@_) =>
    named("Swiss.byTeam") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Swiss_28.byTeam(id)
      }
    }
  
    // @LINE:318
    case controllers_Analyse_requestAnalysis259_route(params@_) =>
    named("Analyse.requestAnalysis") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Analyse_23.requestAnalysis(gameId)
      }
    }
  
    // @LINE:320
    case controllers_Game_exportOne260_route(params@_) =>
    named("Game.exportOne") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Game_6.exportOne(gameId)
      }
    }
  
    // @LINE:321
    case controllers_Game_exportOne261_route(params@_) =>
    named("Game.exportOne") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Game_6.exportOne(gameId)
      }
    }
  
    // @LINE:322
    case controllers_Export_legacyGameThumbnail262_route(params@_) =>
    named("Export.legacyGameThumbnail") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Export_18.legacyGameThumbnail(gameId)
      }
    }
  
    // @LINE:323
    case controllers_Export_gameThumbnail263_route(params@_) =>
    named("Export.gameThumbnail") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Export_18.gameThumbnail(gameId)
      }
    }
  
    // @LINE:324
    case controllers_Export_gif264_route(params@_) =>
    named("Export.gif") {
      call(params.fromPath[String]("gameId", None), Param[String]("color", Right("white"))) { (gameId, color) =>
          Export_18.gif(gameId, color)
      }
    }
  
    // @LINE:325
    case controllers_Export_gif265_route(params@_) =>
    named("Export.gif") {
      call(params.fromPath[String]("gameId", None), params.fromPath[String]("color", None)) { (gameId, color) =>
          Export_18.gif(gameId, color)
      }
    }
  
    // @LINE:328
    case controllers_Fishnet_acquire266_route(params@_) =>
    named("Fishnet.acquire") {
      call(params.fromQuery[Boolean]("slow", Some(false))) { (slow) =>
          Fishnet_59.acquire(slow)
      }
    }
  
    // @LINE:329
    case controllers_Fishnet_analysis267_route(params@_) =>
    named("Fishnet.analysis") {
      call(params.fromPath[String]("workId", None), params.fromQuery[Boolean]("slow", Some(false)), params.fromQuery[Boolean]("stop", Some(false))) { (workId, slow, stop) =>
          Fishnet_59.analysis(workId, slow, stop)
      }
    }
  
    // @LINE:330
    case controllers_Fishnet_abort268_route(params@_) =>
    named("Fishnet.abort") {
      call(params.fromPath[String]("workId", None)) { (workId) =>
          Fishnet_59.abort(workId)
      }
    }
  
    // @LINE:331
    case controllers_Fishnet_keyExists269_route(params@_) =>
    named("Fishnet.keyExists") {
      call(params.fromPath[String]("key", None)) { (key) =>
          Fishnet_59.keyExists(key)
      }
    }
  
    // @LINE:332
    case controllers_Fishnet_status270_route(params@_) =>
    named("Fishnet.status") {
      call { 
          Fishnet_59.status
      }
    }
  
    // @LINE:335
    case controllers_Pref_set271_route(params@_) =>
    named("Pref.set") {
      call(params.fromPath[String]("name", None)) { (name) =>
          Pref_1.set(name)
      }
    }
  
    // @LINE:336
    case controllers_Pref_form272_route(params@_) =>
    named("Pref.form") {
      call(params.fromPath[String]("categ", None)) { (categ) =>
          Pref_1.form(categ)
      }
    }
  
    // @LINE:337
    case controllers_Pref_formApply273_route(params@_) =>
    named("Pref.formApply") {
      call { 
          Pref_1.formApply
      }
    }
  
    // @LINE:338
    case controllers_Pref_verifyTitle274_route(params@_) =>
    named("Pref.verifyTitle") {
      call { 
          Pref_1.verifyTitle
      }
    }
  
    // @LINE:341
    case controllers_Setup_aiForm275_route(params@_) =>
    named("Setup.aiForm") {
      call { 
          Setup_49.aiForm
      }
    }
  
    // @LINE:342
    case controllers_Setup_ai276_route(params@_) =>
    named("Setup.ai") {
      call { 
          Setup_49.ai
      }
    }
  
    // @LINE:343
    case controllers_Setup_friendForm277_route(params@_) =>
    named("Setup.friendForm") {
      call(params.fromQuery[Option[String]]("user", Some(None))) { (user) =>
          Setup_49.friendForm(user)
      }
    }
  
    // @LINE:344
    case controllers_Setup_friend278_route(params@_) =>
    named("Setup.friend") {
      call(params.fromQuery[Option[String]]("user", Some(None))) { (user) =>
          Setup_49.friend(user)
      }
    }
  
    // @LINE:345
    case controllers_Setup_hookForm279_route(params@_) =>
    named("Setup.hookForm") {
      call { 
          Setup_49.hookForm
      }
    }
  
    // @LINE:346
    case controllers_Setup_like280_route(params@_) =>
    named("Setup.like") {
      call(params.fromPath[String]("sri", None), params.fromPath[String]("gameId", None)) { (sri, gameId) =>
          Setup_49.like(sri, gameId)
      }
    }
  
    // @LINE:347
    case controllers_Setup_hook281_route(params@_) =>
    named("Setup.hook") {
      call(params.fromPath[String]("sri", None)) { (sri) =>
          Setup_49.hook(sri)
      }
    }
  
    // @LINE:348
    case controllers_Setup_filterForm282_route(params@_) =>
    named("Setup.filterForm") {
      call { 
          Setup_49.filterForm
      }
    }
  
    // @LINE:349
    case controllers_Setup_validateFen283_route(params@_) =>
    named("Setup.validateFen") {
      call { 
          Setup_49.validateFen
      }
    }
  
    // @LINE:352
    case controllers_Challenge_all284_route(params@_) =>
    named("Challenge.all") {
      call { 
          Challenge_31.all
      }
    }
  
    // @LINE:353
    case controllers_Challenge_show285_route(params@_) =>
    named("Challenge.show") {
      call(params.fromPath[String]("id", None), params.fromQuery[Option[String]]("color", Some(None))) { (id, color) =>
          Challenge_31.show(id, color)
      }
    }
  
    // @LINE:354
    case controllers_Challenge_accept286_route(params@_) =>
    named("Challenge.accept") {
      call(params.fromPath[String]("id", None), params.fromQuery[Option[String]]("color", Some(None))) { (id, color) =>
          Challenge_31.accept(id, color)
      }
    }
  
    // @LINE:355
    case controllers_Challenge_decline287_route(params@_) =>
    named("Challenge.decline") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.decline(id)
      }
    }
  
    // @LINE:356
    case controllers_Challenge_cancel288_route(params@_) =>
    named("Challenge.cancel") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.cancel(id)
      }
    }
  
    // @LINE:357
    case controllers_Challenge_toFriend289_route(params@_) =>
    named("Challenge.toFriend") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.toFriend(id)
      }
    }
  
    // @LINE:358
    case controllers_Challenge_rematchOf290_route(params@_) =>
    named("Challenge.rematchOf") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.rematchOf(id)
      }
    }
  
    // @LINE:361
    case controllers_Notify_recent291_route(params@_) =>
    named("Notify.recent") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Notify_62.recent(page)
      }
    }
  
    // @LINE:364
    case controllers_Video_index292_route(params@_) =>
    named("Video.index") {
      call { 
          Video_27.index
      }
    }
  
    // @LINE:365
    case controllers_Video_tags293_route(params@_) =>
    named("Video.tags") {
      call { 
          Video_27.tags
      }
    }
  
    // @LINE:366
    case controllers_Video_author294_route(params@_) =>
    named("Video.author") {
      call(params.fromPath[String]("author", None)) { (author) =>
          Video_27.author(author)
      }
    }
  
    // @LINE:367
    case controllers_Video_show295_route(params@_) =>
    named("Video.show") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Video_27.show(id)
      }
    }
  
    // @LINE:370
    case controllers_I18n_select296_route(params@_) =>
    named("I18n.select") {
      call { 
          I18n_14.select
      }
    }
  
    // @LINE:373
    case controllers_Auth_login297_route(params@_) =>
    named("Auth.login") {
      call { 
          Auth_11.login
      }
    }
  
    // @LINE:374
    case controllers_Auth_authenticate298_route(params@_) =>
    named("Auth.authenticate") {
      call { 
          Auth_11.authenticate
      }
    }
  
    // @LINE:375
    case controllers_Auth_logoutGet299_route(params@_) =>
    named("Auth.logoutGet") {
      call { 
          Auth_11.logoutGet
      }
    }
  
    // @LINE:376
    case controllers_Auth_logout300_route(params@_) =>
    named("Auth.logout") {
      call { 
          Auth_11.logout
      }
    }
  
    // @LINE:377
    case controllers_Auth_signup301_route(params@_) =>
    named("Auth.signup") {
      call { 
          Auth_11.signup
      }
    }
  
    // @LINE:378
    case controllers_Auth_signupPost302_route(params@_) =>
    named("Auth.signupPost") {
      call { 
          Auth_11.signupPost
      }
    }
  
    // @LINE:379
    case controllers_Auth_checkYourEmail303_route(params@_) =>
    named("Auth.checkYourEmail") {
      call { 
          Auth_11.checkYourEmail
      }
    }
  
    // @LINE:380
    case controllers_Auth_fixEmail304_route(params@_) =>
    named("Auth.fixEmail") {
      call { 
          Auth_11.fixEmail
      }
    }
  
    // @LINE:381
    case controllers_Auth_signupConfirmEmail305_route(params@_) =>
    named("Auth.signupConfirmEmail") {
      call(params.fromPath[String]("token", None)) { (token) =>
          Auth_11.signupConfirmEmail(token)
      }
    }
  
    // @LINE:382
    case controllers_Auth_passwordReset306_route(params@_) =>
    named("Auth.passwordReset") {
      call { 
          Auth_11.passwordReset
      }
    }
  
    // @LINE:383
    case controllers_Auth_passwordResetApply307_route(params@_) =>
    named("Auth.passwordResetApply") {
      call { 
          Auth_11.passwordResetApply
      }
    }
  
    // @LINE:384
    case controllers_Auth_passwordResetSent308_route(params@_) =>
    named("Auth.passwordResetSent") {
      call(params.fromPath[String]("email", None)) { (email) =>
          Auth_11.passwordResetSent(email)
      }
    }
  
    // @LINE:385
    case controllers_Auth_passwordResetConfirm309_route(params@_) =>
    named("Auth.passwordResetConfirm") {
      call(params.fromPath[String]("token", None)) { (token) =>
          Auth_11.passwordResetConfirm(token)
      }
    }
  
    // @LINE:386
    case controllers_Auth_passwordResetConfirmApply310_route(params@_) =>
    named("Auth.passwordResetConfirmApply") {
      call(params.fromPath[String]("token", None)) { (token) =>
          Auth_11.passwordResetConfirmApply(token)
      }
    }
  
    // @LINE:387
    case controllers_Auth_setFingerPrint311_route(params@_) =>
    named("Auth.setFingerPrint") {
      call(params.fromPath[String]("fp", None), params.fromPath[Int]("ms", None)) { (fp, ms) =>
          Auth_11.setFingerPrint(fp, ms)
      }
    }
  
    // @LINE:388
    case controllers_Auth_makeLoginToken312_route(params@_) =>
    named("Auth.makeLoginToken") {
      call { 
          Auth_11.makeLoginToken
      }
    }
  
    // @LINE:389
    case controllers_Auth_loginWithToken313_route(params@_) =>
    named("Auth.loginWithToken") {
      call(params.fromPath[String]("token", None)) { (token) =>
          Auth_11.loginWithToken(token)
      }
    }
  
    // @LINE:390
    case controllers_Auth_magicLink314_route(params@_) =>
    named("Auth.magicLink") {
      call { 
          Auth_11.magicLink
      }
    }
  
    // @LINE:391
    case controllers_Auth_magicLinkApply315_route(params@_) =>
    named("Auth.magicLinkApply") {
      call { 
          Auth_11.magicLinkApply
      }
    }
  
    // @LINE:392
    case controllers_Auth_magicLinkSent316_route(params@_) =>
    named("Auth.magicLinkSent") {
      call(params.fromPath[String]("email", None)) { (email) =>
          Auth_11.magicLinkSent(email)
      }
    }
  
    // @LINE:393
    case controllers_Auth_magicLinkLogin317_route(params@_) =>
    named("Auth.magicLinkLogin") {
      call(params.fromPath[String]("token", None)) { (token) =>
          Auth_11.magicLinkLogin(token)
      }
    }
  
    // @LINE:396
    case controllers_Mod_alt318_route(params@_) =>
    named("Mod.alt") {
      call(params.fromPath[String]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
          Mod_56.alt(username, v)
      }
    }
  
    // @LINE:397
    case controllers_Mod_engine319_route(params@_) =>
    named("Mod.engine") {
      call(params.fromPath[String]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
          Mod_56.engine(username, v)
      }
    }
  
    // @LINE:398
    case controllers_Mod_booster320_route(params@_) =>
    named("Mod.booster") {
      call(params.fromPath[String]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
          Mod_56.booster(username, v)
      }
    }
  
    // @LINE:399
    case controllers_Mod_troll321_route(params@_) =>
    named("Mod.troll") {
      call(params.fromPath[String]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
          Mod_56.troll(username, v)
      }
    }
  
    // @LINE:400
    case controllers_Mod_deletePmsAndChats322_route(params@_) =>
    named("Mod.deletePmsAndChats") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.deletePmsAndChats(username)
      }
    }
  
    // @LINE:401
    case controllers_Mod_warn323_route(params@_) =>
    named("Mod.warn") {
      call(params.fromPath[String]("username", None), params.fromQuery[String]("subject", None)) { (username, subject) =>
          Mod_56.warn(username, subject)
      }
    }
  
    // @LINE:402
    case controllers_Mod_disableTwoFactor324_route(params@_) =>
    named("Mod.disableTwoFactor") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.disableTwoFactor(username)
      }
    }
  
    // @LINE:403
    case controllers_Mod_closeAccount325_route(params@_) =>
    named("Mod.closeAccount") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.closeAccount(username)
      }
    }
  
    // @LINE:404
    case controllers_Mod_reopenAccount326_route(params@_) =>
    named("Mod.reopenAccount") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.reopenAccount(username)
      }
    }
  
    // @LINE:405
    case controllers_Mod_setTitle327_route(params@_) =>
    named("Mod.setTitle") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.setTitle(username)
      }
    }
  
    // @LINE:406
    case controllers_Mod_spontaneousInquiry328_route(params@_) =>
    named("Mod.spontaneousInquiry") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.spontaneousInquiry(username)
      }
    }
  
    // @LINE:407
    case controllers_Mod_communicationPublic329_route(params@_) =>
    named("Mod.communicationPublic") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.communicationPublic(username)
      }
    }
  
    // @LINE:408
    case controllers_Mod_communicationPrivate330_route(params@_) =>
    named("Mod.communicationPrivate") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.communicationPrivate(username)
      }
    }
  
    // @LINE:409
    case controllers_Mod_rankban331_route(params@_) =>
    named("Mod.rankban") {
      call(params.fromPath[String]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
          Mod_56.rankban(username, v)
      }
    }
  
    // @LINE:410
    case controllers_Mod_reportban332_route(params@_) =>
    named("Mod.reportban") {
      call(params.fromPath[String]("username", None), params.fromPath[Boolean]("v", None)) { (username, v) =>
          Mod_56.reportban(username, v)
      }
    }
  
    // @LINE:411
    case controllers_Mod_impersonate333_route(params@_) =>
    named("Mod.impersonate") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.impersonate(username)
      }
    }
  
    // @LINE:412
    case controllers_Mod_log334_route(params@_) =>
    named("Mod.log") {
      call { 
          Mod_56.log
      }
    }
  
    // @LINE:413
    case controllers_Mod_table335_route(params@_) =>
    named("Mod.table") {
      call { 
          Mod_56.table
      }
    }
  
    // @LINE:414
    case controllers_Mod_refreshUserAssess336_route(params@_) =>
    named("Mod.refreshUserAssess") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.refreshUserAssess(username)
      }
    }
  
    // @LINE:415
    case controllers_Mod_setEmail337_route(params@_) =>
    named("Mod.setEmail") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.setEmail(username)
      }
    }
  
    // @LINE:416
    case controllers_Mod_notifySlack338_route(params@_) =>
    named("Mod.notifySlack") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.notifySlack(username)
      }
    }
  
    // @LINE:417
    case controllers_Mod_gamify339_route(params@_) =>
    named("Mod.gamify") {
      call { 
          Mod_56.gamify
      }
    }
  
    // @LINE:418
    case controllers_Mod_gamifyPeriod340_route(params@_) =>
    named("Mod.gamifyPeriod") {
      call(params.fromPath[String]("period", None)) { (period) =>
          Mod_56.gamifyPeriod(period)
      }
    }
  
    // @LINE:419
    case controllers_Mod_search341_route(params@_) =>
    named("Mod.search") {
      call { 
          Mod_56.search
      }
    }
  
    // @LINE:420
    case controllers_Mod_chatUser342_route(params@_) =>
    named("Mod.chatUser") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.chatUser(username)
      }
    }
  
    // @LINE:421
    case controllers_Mod_permissions343_route(params@_) =>
    named("Mod.permissions") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.permissions(username)
      }
    }
  
    // @LINE:422
    case controllers_Mod_savePermissions344_route(params@_) =>
    named("Mod.savePermissions") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Mod_56.savePermissions(username)
      }
    }
  
    // @LINE:423
    case controllers_Mod_publicChat345_route(params@_) =>
    named("Mod.publicChat") {
      call { 
          Mod_56.publicChat
      }
    }
  
    // @LINE:424
    case controllers_Mod_emailConfirm346_route(params@_) =>
    named("Mod.emailConfirm") {
      call { 
          Mod_56.emailConfirm
      }
    }
  
    // @LINE:425
    case controllers_Mod_chatPanic347_route(params@_) =>
    named("Mod.chatPanic") {
      call { 
          Mod_56.chatPanic
      }
    }
  
    // @LINE:426
    case controllers_Mod_chatPanicPost348_route(params@_) =>
    named("Mod.chatPanicPost") {
      call { 
          Mod_56.chatPanicPost
      }
    }
  
    // @LINE:427
    case controllers_Mod_print349_route(params@_) =>
    named("Mod.print") {
      call(params.fromPath[String]("fh", None)) { (fh) =>
          Mod_56.print(fh)
      }
    }
  
    // @LINE:428
    case controllers_Mod_printBan350_route(params@_) =>
    named("Mod.printBan") {
      call(params.fromPath[Boolean]("v", None), params.fromPath[String]("fh", None)) { (v, fh) =>
          Mod_56.printBan(v, fh)
      }
    }
  
    // @LINE:429
    case controllers_Mod_singleIp351_route(params@_) =>
    named("Mod.singleIp") {
      call(params.fromPath[String]("ip", None)) { (ip) =>
          Mod_56.singleIp(ip)
      }
    }
  
    // @LINE:430
    case controllers_Mod_singleIpBan352_route(params@_) =>
    named("Mod.singleIpBan") {
      call(params.fromPath[Boolean]("v", None), params.fromPath[String]("ip", None)) { (v, ip) =>
          Mod_56.singleIpBan(v, ip)
      }
    }
  
    // @LINE:431
    case controllers_Mod_presets353_route(params@_) =>
    named("Mod.presets") {
      call(params.fromPath[String]("group", None)) { (group) =>
          Mod_56.presets(group)
      }
    }
  
    // @LINE:432
    case controllers_Mod_presetsUpdate354_route(params@_) =>
    named("Mod.presetsUpdate") {
      call(params.fromPath[String]("group", None)) { (group) =>
          Mod_56.presetsUpdate(group)
      }
    }
  
    // @LINE:433
    case controllers_Mod_eventStream355_route(params@_) =>
    named("Mod.eventStream") {
      call { 
          Mod_56.eventStream
      }
    }
  
    // @LINE:436
    case controllers_Irwin_dashboard356_route(params@_) =>
    named("Irwin.dashboard") {
      call { 
          Irwin_44.dashboard
      }
    }
  
    // @LINE:437
    case controllers_Irwin_saveReport357_route(params@_) =>
    named("Irwin.saveReport") {
      call { 
          Irwin_44.saveReport
      }
    }
  
    // @LINE:438
    case controllers_Irwin_eventStream358_route(params@_) =>
    named("Irwin.eventStream") {
      call { 
          Irwin_44.eventStream
      }
    }
  
    // @LINE:441
    case controllers_Bookmark_toggle359_route(params@_) =>
    named("Bookmark.toggle") {
      call(params.fromPath[String]("gameId", None)) { (gameId) =>
          Bookmark_46.toggle(gameId)
      }
    }
  
    // @LINE:444
    case controllers_ForumCateg_index360_route(params@_) =>
    named("ForumCateg.index") {
      call { 
          ForumCateg_29.index
      }
    }
  
    // @LINE:445
    case controllers_ForumPost_search361_route(params@_) =>
    named("ForumPost.search") {
      call(params.fromQuery[String]("text", Some("")), params.fromQuery[Int]("page", Some(1))) { (text, page) =>
          ForumPost_52.search(text, page)
      }
    }
  
    // @LINE:446
    case controllers_ForumCateg_show362_route(params@_) =>
    named("ForumCateg.show") {
      call(params.fromPath[String]("slug", None), params.fromQuery[Int]("page", Some(1))) { (slug, page) =>
          ForumCateg_29.show(slug, page)
      }
    }
  
    // @LINE:447
    case controllers_ForumTopic_form363_route(params@_) =>
    named("ForumTopic.form") {
      call(params.fromPath[String]("categSlug", None)) { (categSlug) =>
          ForumTopic_17.form(categSlug)
      }
    }
  
    // @LINE:448
    case controllers_ForumTopic_create364_route(params@_) =>
    named("ForumTopic.create") {
      call(params.fromPath[String]("categSlug", None)) { (categSlug) =>
          ForumTopic_17.create(categSlug)
      }
    }
  
    // @LINE:449
    case controllers_ForumTopic_participants365_route(params@_) =>
    named("ForumTopic.participants") {
      call(params.fromPath[String]("topicId", None)) { (topicId) =>
          ForumTopic_17.participants(topicId)
      }
    }
  
    // @LINE:450
    case controllers_ForumTopic_show366_route(params@_) =>
    named("ForumTopic.show") {
      call(params.fromPath[String]("categSlug", None), params.fromPath[String]("slug", None), params.fromQuery[Int]("page", Some(1))) { (categSlug, slug, page) =>
          ForumTopic_17.show(categSlug, slug, page)
      }
    }
  
    // @LINE:451
    case controllers_ForumTopic_close367_route(params@_) =>
    named("ForumTopic.close") {
      call(params.fromPath[String]("categSlug", None), params.fromPath[String]("slug", None)) { (categSlug, slug) =>
          ForumTopic_17.close(categSlug, slug)
      }
    }
  
    // @LINE:452
    case controllers_ForumTopic_hide368_route(params@_) =>
    named("ForumTopic.hide") {
      call(params.fromPath[String]("categSlug", None), params.fromPath[String]("slug", None)) { (categSlug, slug) =>
          ForumTopic_17.hide(categSlug, slug)
      }
    }
  
    // @LINE:453
    case controllers_ForumTopic_sticky369_route(params@_) =>
    named("ForumTopic.sticky") {
      call(params.fromPath[String]("categSlug", None), params.fromPath[String]("slug", None)) { (categSlug, slug) =>
          ForumTopic_17.sticky(categSlug, slug)
      }
    }
  
    // @LINE:454
    case controllers_ForumPost_create370_route(params@_) =>
    named("ForumPost.create") {
      call(params.fromPath[String]("categSlug", None), params.fromPath[String]("slug", None), params.fromQuery[Int]("page", Some(1))) { (categSlug, slug, page) =>
          ForumPost_52.create(categSlug, slug, page)
      }
    }
  
    // @LINE:455
    case controllers_ForumPost_delete371_route(params@_) =>
    named("ForumPost.delete") {
      call(params.fromPath[String]("categSlug", None), params.fromPath[String]("id", None)) { (categSlug, id) =>
          ForumPost_52.delete(categSlug, id)
      }
    }
  
    // @LINE:456
    case controllers_ForumPost_edit372_route(params@_) =>
    named("ForumPost.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          ForumPost_52.edit(id)
      }
    }
  
    // @LINE:457
    case controllers_ForumPost_react373_route(params@_) =>
    named("ForumPost.react") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("reaction", None), params.fromPath[Boolean]("v", None)) { (id, reaction, v) =>
          ForumPost_52.react(id, reaction, v)
      }
    }
  
    // @LINE:458
    case controllers_ForumPost_redirect374_route(params@_) =>
    named("ForumPost.redirect") {
      call(params.fromPath[String]("id", None)) { (id) =>
          ForumPost_52.redirect(id)
      }
    }
  
    // @LINE:461
    case controllers_Msg_compatCreate375_route(params@_) =>
    named("Msg.compatCreate") {
      call { 
          Msg_34.compatCreate
      }
    }
  
    // @LINE:463
    case controllers_Msg_home376_route(params@_) =>
    named("Msg.home") {
      call { 
          Msg_34.home
      }
    }
  
    // @LINE:464
    case controllers_Msg_search377_route(params@_) =>
    named("Msg.search") {
      call(params.fromQuery[String]("q", None)) { (q) =>
          Msg_34.search(q)
      }
    }
  
    // @LINE:465
    case controllers_Msg_unreadCount378_route(params@_) =>
    named("Msg.unreadCount") {
      call { 
          Msg_34.unreadCount
      }
    }
  
    // @LINE:466
    case controllers_Msg_convo379_route(params@_) =>
    named("Msg.convo") {
      call(params.fromPath[String]("username", None), params.fromQuery[Option[Long]]("before", Some(None))) { (username, before) =>
          Msg_34.convo(username, before)
      }
    }
  
    // @LINE:467
    case controllers_Msg_convoDelete380_route(params@_) =>
    named("Msg.convoDelete") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Msg_34.convoDelete(username)
      }
    }
  
    // @LINE:469
    case controllers_Msg_apiPost381_route(params@_) =>
    named("Msg.apiPost") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Msg_34.apiPost(username)
      }
    }
  
    // @LINE:470
    case controllers_Msg_convoDelete382_route(params@_) =>
    named("Msg.convoDelete") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Msg_34.convoDelete(username)
      }
    }
  
    // @LINE:473
    case controllers_Coach_all383_route(params@_) =>
    named("Coach.all") {
      call(params.fromQuery[Int]("page", Some(1))) { (page) =>
          Coach_55.all(page)
      }
    }
  
    // @LINE:474
    case controllers_Coach_edit384_route(params@_) =>
    named("Coach.edit") {
      call { 
          Coach_55.edit
      }
    }
  
    // @LINE:475
    case controllers_Coach_editApply385_route(params@_) =>
    named("Coach.editApply") {
      call { 
          Coach_55.editApply
      }
    }
  
    // @LINE:476
    case controllers_Coach_picture386_route(params@_) =>
    named("Coach.picture") {
      call { 
          Coach_55.picture
      }
    }
  
    // @LINE:477
    case controllers_Coach_pictureApply387_route(params@_) =>
    named("Coach.pictureApply") {
      call { 
          Coach_55.pictureApply
      }
    }
  
    // @LINE:478
    case controllers_Coach_pictureDelete388_route(params@_) =>
    named("Coach.pictureDelete") {
      call { 
          Coach_55.pictureDelete
      }
    }
  
    // @LINE:479
    case controllers_Coach_approveReview389_route(params@_) =>
    named("Coach.approveReview") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Coach_55.approveReview(id)
      }
    }
  
    // @LINE:480
    case controllers_Coach_modReview390_route(params@_) =>
    named("Coach.modReview") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Coach_55.modReview(id)
      }
    }
  
    // @LINE:481
    case controllers_Coach_show391_route(params@_) =>
    named("Coach.show") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Coach_55.show(username)
      }
    }
  
    // @LINE:482
    case controllers_Coach_review392_route(params@_) =>
    named("Coach.review") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Coach_55.review(username)
      }
    }
  
    // @LINE:483
    case controllers_Coach_search393_route(params@_) =>
    named("Coach.search") {
      call(params.fromPath[String]("lang", None), params.fromPath[String]("order", None), params.fromQuery[Int]("page", Some(1))) { (lang, order, page) =>
          Coach_55.search(lang, order, page)
      }
    }
  
    // @LINE:486
    case controllers_Clas_index394_route(params@_) =>
    named("Clas.index") {
      call { 
          Clas_35.index
      }
    }
  
    // @LINE:487
    case controllers_Clas_form395_route(params@_) =>
    named("Clas.form") {
      call { 
          Clas_35.form
      }
    }
  
    // @LINE:488
    case controllers_Clas_becomeTeacher396_route(params@_) =>
    named("Clas.becomeTeacher") {
      call { 
          Clas_35.becomeTeacher
      }
    }
  
    // @LINE:489
    case controllers_Clas_create397_route(params@_) =>
    named("Clas.create") {
      call { 
          Clas_35.create
      }
    }
  
    // @LINE:490
    case controllers_Clas_invitation398_route(params@_) =>
    named("Clas.invitation") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.invitation(id)
      }
    }
  
    // @LINE:491
    case controllers_Clas_invitationAccept399_route(params@_) =>
    named("Clas.invitationAccept") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.invitationAccept(id)
      }
    }
  
    // @LINE:492
    case controllers_Clas_show400_route(params@_) =>
    named("Clas.show") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.show(id)
      }
    }
  
    // @LINE:493
    case controllers_Clas_edit401_route(params@_) =>
    named("Clas.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.edit(id)
      }
    }
  
    // @LINE:494
    case controllers_Clas_update402_route(params@_) =>
    named("Clas.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.update(id)
      }
    }
  
    // @LINE:495
    case controllers_Clas_wall403_route(params@_) =>
    named("Clas.wall") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.wall(id)
      }
    }
  
    // @LINE:496
    case controllers_Clas_wallEdit404_route(params@_) =>
    named("Clas.wallEdit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.wallEdit(id)
      }
    }
  
    // @LINE:497
    case controllers_Clas_wallUpdate405_route(params@_) =>
    named("Clas.wallUpdate") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.wallUpdate(id)
      }
    }
  
    // @LINE:498
    case controllers_Clas_notifyStudents406_route(params@_) =>
    named("Clas.notifyStudents") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.notifyStudents(id)
      }
    }
  
    // @LINE:499
    case controllers_Clas_notifyPost407_route(params@_) =>
    named("Clas.notifyPost") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.notifyPost(id)
      }
    }
  
    // @LINE:500
    case controllers_Clas_students408_route(params@_) =>
    named("Clas.students") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.students(id)
      }
    }
  
    // @LINE:501
    case controllers_Clas_archive409_route(params@_) =>
    named("Clas.archive") {
      call(params.fromPath[String]("id", None), params.fromQuery[Boolean]("v", None)) { (id, v) =>
          Clas_35.archive(id, v)
      }
    }
  
    // @LINE:502
    case controllers_Clas_learn410_route(params@_) =>
    named("Clas.learn") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.learn(id)
      }
    }
  
    // @LINE:503
    case controllers_Clas_progress411_route(params@_) =>
    named("Clas.progress") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("pt", None), params.fromPath[Int]("days", None)) { (id, pt, days) =>
          Clas_35.progress(id, pt, days)
      }
    }
  
    // @LINE:504
    case controllers_Clas_studentForm412_route(params@_) =>
    named("Clas.studentForm") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.studentForm(id)
      }
    }
  
    // @LINE:505
    case controllers_Clas_studentCreate413_route(params@_) =>
    named("Clas.studentCreate") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.studentCreate(id)
      }
    }
  
    // @LINE:506
    case controllers_Clas_studentManyForm414_route(params@_) =>
    named("Clas.studentManyForm") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.studentManyForm(id)
      }
    }
  
    // @LINE:507
    case controllers_Clas_studentManyCreate415_route(params@_) =>
    named("Clas.studentManyCreate") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.studentManyCreate(id)
      }
    }
  
    // @LINE:508
    case controllers_Clas_studentInvite416_route(params@_) =>
    named("Clas.studentInvite") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.studentInvite(id)
      }
    }
  
    // @LINE:509
    case controllers_Clas_studentShow417_route(params@_) =>
    named("Clas.studentShow") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
          Clas_35.studentShow(id, username)
      }
    }
  
    // @LINE:510
    case controllers_Clas_studentArchive418_route(params@_) =>
    named("Clas.studentArchive") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None), params.fromQuery[Boolean]("v", None)) { (id, username, v) =>
          Clas_35.studentArchive(id, username, v)
      }
    }
  
    // @LINE:511
    case controllers_Clas_studentResetPassword419_route(params@_) =>
    named("Clas.studentResetPassword") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
          Clas_35.studentResetPassword(id, username)
      }
    }
  
    // @LINE:512
    case controllers_Clas_studentSetKid420_route(params@_) =>
    named("Clas.studentSetKid") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None), params.fromQuery[Boolean]("v", None)) { (id, username, v) =>
          Clas_35.studentSetKid(id, username, v)
      }
    }
  
    // @LINE:513
    case controllers_Clas_studentEdit421_route(params@_) =>
    named("Clas.studentEdit") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
          Clas_35.studentEdit(id, username)
      }
    }
  
    // @LINE:514
    case controllers_Clas_studentUpdate422_route(params@_) =>
    named("Clas.studentUpdate") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
          Clas_35.studentUpdate(id, username)
      }
    }
  
    // @LINE:515
    case controllers_Clas_studentRelease423_route(params@_) =>
    named("Clas.studentRelease") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
          Clas_35.studentRelease(id, username)
      }
    }
  
    // @LINE:516
    case controllers_Clas_studentReleasePost424_route(params@_) =>
    named("Clas.studentReleasePost") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("username", None)) { (id, username) =>
          Clas_35.studentReleasePost(id, username)
      }
    }
  
    // @LINE:517
    case controllers_Clas_invitationRevoke425_route(params@_) =>
    named("Clas.invitationRevoke") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Clas_35.invitationRevoke(id)
      }
    }
  
    // @LINE:520
    case controllers_Main_image426_route(params@_) =>
    named("Main.image") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("hash", None), params.fromPath[String]("name", None)) { (id, hash, name) =>
          Main_15.image(id, hash, name)
      }
    }
  
    // @LINE:523
    case controllers_Importer_importGame427_route(params@_) =>
    named("Importer.importGame") {
      call { 
          Importer_12.importGame
      }
    }
  
    // @LINE:524
    case controllers_Importer_sendGame428_route(params@_) =>
    named("Importer.sendGame") {
      call { 
          Importer_12.sendGame
      }
    }
  
    // @LINE:525
    case controllers_Importer_masterGame429_route(params@_) =>
    named("Importer.masterGame") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("color", None)) { (id, color) =>
          Importer_12.masterGame(id, color)
      }
    }
  
    // @LINE:528
    case controllers_Editor_data430_route(params@_) =>
    named("Editor.data") {
      call { 
          Editor_9.data
      }
    }
  
    // @LINE:529
    case controllers_Editor_load431_route(params@_) =>
    named("Editor.load") {
      call(params.fromPath[String]("urlFen", None)) { (urlFen) =>
          Editor_9.load(urlFen)
      }
    }
  
    // @LINE:530
    case controllers_Editor_index432_route(params@_) =>
    named("Editor.index") {
      call { 
          Editor_9.index
      }
    }
  
    // @LINE:533
    case controllers_Report_form433_route(params@_) =>
    named("Report.form") {
      call { 
          Report_41.form
      }
    }
  
    // @LINE:534
    case controllers_Report_create434_route(params@_) =>
    named("Report.create") {
      call { 
          Report_41.create
      }
    }
  
    // @LINE:535
    case controllers_Report_flag435_route(params@_) =>
    named("Report.flag") {
      call { 
          Report_41.flag
      }
    }
  
    // @LINE:536
    case controllers_Report_thanks436_route(params@_) =>
    named("Report.thanks") {
      call(params.fromQuery[String]("reported", None)) { (reported) =>
          Report_41.thanks(reported)
      }
    }
  
    // @LINE:537
    case controllers_Report_list437_route(params@_) =>
    named("Report.list") {
      call { 
          Report_41.list
      }
    }
  
    // @LINE:538
    case controllers_Report_listWithFilter438_route(params@_) =>
    named("Report.listWithFilter") {
      call(params.fromPath[String]("room", None)) { (room) =>
          Report_41.listWithFilter(room)
      }
    }
  
    // @LINE:539
    case controllers_Report_inquiry439_route(params@_) =>
    named("Report.inquiry") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Report_41.inquiry(id)
      }
    }
  
    // @LINE:540
    case controllers_Report_process440_route(params@_) =>
    named("Report.process") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Report_41.process(id)
      }
    }
  
    // @LINE:541
    case controllers_Report_xfiles441_route(params@_) =>
    named("Report.xfiles") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Report_41.xfiles(id)
      }
    }
  
    // @LINE:542
    case controllers_Report_currentCheatInquiry442_route(params@_) =>
    named("Report.currentCheatInquiry") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Report_41.currentCheatInquiry(username)
      }
    }
  
    // @LINE:545
    case controllers_Appeal_home443_route(params@_) =>
    named("Appeal.home") {
      call { 
          Appeal_2.home
      }
    }
  
    // @LINE:546
    case controllers_Appeal_post444_route(params@_) =>
    named("Appeal.post") {
      call { 
          Appeal_2.post
      }
    }
  
    // @LINE:547
    case controllers_Appeal_queue445_route(params@_) =>
    named("Appeal.queue") {
      call { 
          Appeal_2.queue
      }
    }
  
    // @LINE:548
    case controllers_Appeal_show446_route(params@_) =>
    named("Appeal.show") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Appeal_2.show(username)
      }
    }
  
    // @LINE:549
    case controllers_Appeal_reply447_route(params@_) =>
    named("Appeal.reply") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Appeal_2.reply(username)
      }
    }
  
    // @LINE:550
    case controllers_Appeal_mute448_route(params@_) =>
    named("Appeal.mute") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Appeal_2.mute(username)
      }
    }
  
    // @LINE:553
    case controllers_Stat_ratingDistribution449_route(params@_) =>
    named("Stat.ratingDistribution") {
      call(params.fromPath[String]("perf", None)) { (perf) =>
          Stat_48.ratingDistribution(perf)
      }
    }
  
    // @LINE:556
    case controllers_Api_index450_route(params@_) =>
    named("Api.index") {
      call { 
          Api_61.index
      }
    }
  
    // @LINE:557
    case controllers_Api_usersByIds451_route(params@_) =>
    named("Api.usersByIds") {
      call { 
          Api_61.usersByIds
      }
    }
  
    // @LINE:558
    case controllers_Puzzle_activity452_route(params@_) =>
    named("Puzzle.activity") {
      call { 
          Puzzle_47.activity
      }
    }
  
    // @LINE:559
    case controllers_Api_tournamentsByOwner453_route(params@_) =>
    named("Api.tournamentsByOwner") {
      call(params.fromPath[String]("name", None)) { (name) =>
          Api_61.tournamentsByOwner(name)
      }
    }
  
    // @LINE:560
    case controllers_Api_user454_route(params@_) =>
    named("Api.user") {
      call(params.fromPath[String]("name", None)) { (name) =>
          Api_61.user(name)
      }
    }
  
    // @LINE:561
    case controllers_Api_activity455_route(params@_) =>
    named("Api.activity") {
      call(params.fromPath[String]("name", None)) { (name) =>
          Api_61.activity(name)
      }
    }
  
    // @LINE:562
    case controllers_Relation_apiFollowing456_route(params@_) =>
    named("Relation.apiFollowing") {
      call(params.fromPath[String]("name", None)) { (name) =>
          Relation_60.apiFollowing(name)
      }
    }
  
    // @LINE:563
    case controllers_Relation_apiFollowers457_route(params@_) =>
    named("Relation.apiFollowers") {
      call(params.fromPath[String]("name", None)) { (name) =>
          Relation_60.apiFollowers(name)
      }
    }
  
    // @LINE:564
    case controllers_User_apiWriteNote458_route(params@_) =>
    named("User.apiWriteNote") {
      call(params.fromPath[String]("name", None)) { (name) =>
          User_19.apiWriteNote(name)
      }
    }
  
    // @LINE:565
    case controllers_User_ratingHistory459_route(params@_) =>
    named("User.ratingHistory") {
      call(params.fromPath[String]("name", None)) { (name) =>
          User_19.ratingHistory(name)
      }
    }
  
    // @LINE:566
    case controllers_User_tvExport460_route(params@_) =>
    named("User.tvExport") {
      call(params.fromPath[String]("name", None)) { (name) =>
          User_19.tvExport(name)
      }
    }
  
    // @LINE:567
    case controllers_Api_game461_route(params@_) =>
    named("Api.game") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Api_61.game(id)
      }
    }
  
    // @LINE:568
    case controllers_Api_currentTournaments462_route(params@_) =>
    named("Api.currentTournaments") {
      call { 
          Api_61.currentTournaments
      }
    }
  
    // @LINE:569
    case controllers_Api_tournament463_route(params@_) =>
    named("Api.tournament") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Api_61.tournament(id)
      }
    }
  
    // @LINE:570
    case controllers_Api_tournamentGames464_route(params@_) =>
    named("Api.tournamentGames") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Api_61.tournamentGames(id)
      }
    }
  
    // @LINE:571
    case controllers_Api_tournamentResults465_route(params@_) =>
    named("Api.tournamentResults") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Api_61.tournamentResults(id)
      }
    }
  
    // @LINE:572
    case controllers_Api_tournamentTeams466_route(params@_) =>
    named("Api.tournamentTeams") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Api_61.tournamentTeams(id)
      }
    }
  
    // @LINE:573
    case controllers_Tournament_apiCreate467_route(params@_) =>
    named("Tournament.apiCreate") {
      call { 
          Tournament_3.apiCreate
      }
    }
  
    // @LINE:574
    case controllers_Swiss_apiCreate468_route(params@_) =>
    named("Swiss.apiCreate") {
      call(params.fromPath[String]("teamId", None)) { (teamId) =>
          Swiss_28.apiCreate(teamId)
      }
    }
  
    // @LINE:575
    case controllers_Api_swissGames469_route(params@_) =>
    named("Api.swissGames") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Api_61.swissGames(id)
      }
    }
  
    // @LINE:576
    case controllers_Api_swissResults470_route(params@_) =>
    named("Api.swissResults") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Api_61.swissResults(id)
      }
    }
  
    // @LINE:577
    case controllers_Simul_apiList471_route(params@_) =>
    named("Simul.apiList") {
      call { 
          Simul_51.apiList
      }
    }
  
    // @LINE:578
    case controllers_Api_status472_route(params@_) =>
    named("Api.status") {
      call { 
          Api_61.status
      }
    }
  
    // @LINE:579
    case controllers_Api_usersStatus473_route(params@_) =>
    named("Api.usersStatus") {
      call { 
          Api_61.usersStatus
      }
    }
  
    // @LINE:580
    case controllers_Api_crosstable474_route(params@_) =>
    named("Api.crosstable") {
      call(params.fromPath[String]("u1", None), params.fromPath[String]("u2", None)) { (u1, u2) =>
          Api_61.crosstable(u1, u2)
      }
    }
  
    // @LINE:581
    case controllers_Api_gamesByUsersStream475_route(params@_) =>
    named("Api.gamesByUsersStream") {
      call { 
          Api_61.gamesByUsersStream
      }
    }
  
    // @LINE:582
    case controllers_Api_eventStream476_route(params@_) =>
    named("Api.eventStream") {
      call { 
          Api_61.eventStream
      }
    }
  
    // @LINE:583
    case controllers_Account_apiMe477_route(params@_) =>
    named("Account.apiMe") {
      call { 
          Account_8.apiMe
      }
    }
  
    // @LINE:584
    case controllers_Account_apiNowPlaying478_route(params@_) =>
    named("Account.apiNowPlaying") {
      call { 
          Account_8.apiNowPlaying
      }
    }
  
    // @LINE:585
    case controllers_Account_apiEmail479_route(params@_) =>
    named("Account.apiEmail") {
      call { 
          Account_8.apiEmail
      }
    }
  
    // @LINE:586
    case controllers_Account_apiKid480_route(params@_) =>
    named("Account.apiKid") {
      call { 
          Account_8.apiKid
      }
    }
  
    // @LINE:587
    case controllers_Account_apiKidPost481_route(params@_) =>
    named("Account.apiKidPost") {
      call { 
          Account_8.apiKidPost
      }
    }
  
    // @LINE:588
    case controllers_Pref_apiGet482_route(params@_) =>
    named("Pref.apiGet") {
      call { 
          Pref_1.apiGet
      }
    }
  
    // @LINE:589
    case controllers_Setup_apiAi483_route(params@_) =>
    named("Setup.apiAi") {
      call { 
          Setup_49.apiAi
      }
    }
  
    // @LINE:590
    case controllers_Challenge_openCreate484_route(params@_) =>
    named("Challenge.openCreate") {
      call { 
          Challenge_31.openCreate
      }
    }
  
    // @LINE:591
    case controllers_Challenge_apiCreate485_route(params@_) =>
    named("Challenge.apiCreate") {
      call(params.fromPath[String]("user", None)) { (user) =>
          Challenge_31.apiCreate(user)
      }
    }
  
    // @LINE:592
    case controllers_Challenge_apiAccept486_route(params@_) =>
    named("Challenge.apiAccept") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.apiAccept(id)
      }
    }
  
    // @LINE:593
    case controllers_Challenge_apiDecline487_route(params@_) =>
    named("Challenge.apiDecline") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.apiDecline(id)
      }
    }
  
    // @LINE:594
    case controllers_Challenge_apiCancel488_route(params@_) =>
    named("Challenge.apiCancel") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.apiCancel(id)
      }
    }
  
    // @LINE:595
    case controllers_Challenge_apiStartClocks489_route(params@_) =>
    named("Challenge.apiStartClocks") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Challenge_31.apiStartClocks(id)
      }
    }
  
    // @LINE:596
    case controllers_Api_cloudEval490_route(params@_) =>
    named("Api.cloudEval") {
      call { 
          Api_61.cloudEval
      }
    }
  
    // @LINE:597
    case controllers_Relay_apiIndex491_route(params@_) =>
    named("Relay.apiIndex") {
      call { 
          Relay_25.apiIndex
      }
    }
  
    // @LINE:598
    case controllers_Importer_apiSendGame492_route(params@_) =>
    named("Importer.apiSendGame") {
      call { 
          Importer_12.apiSendGame
      }
    }
  
    // @LINE:600
    case controllers_Game_apiExportByUser493_route(params@_) =>
    named("Game.apiExportByUser") {
      call(params.fromPath[String]("username", None)) { (username) =>
          Game_6.apiExportByUser(username)
      }
    }
  
    // @LINE:603
    case controllers_Api_userGames494_route(params@_) =>
    named("Api.userGames") {
      call(params.fromPath[String]("name", None)) { (name) =>
          Api_61.userGames(name)
      }
    }
  
    // @LINE:606
    case controllers_PlayApi_botGameStream495_route(params@_) =>
    named("PlayApi.botGameStream") {
      call(params.fromPath[String]("id", None)) { (id) =>
          PlayApi_10.botGameStream(id)
      }
    }
  
    // @LINE:607
    case controllers_PlayApi_botMove496_route(params@_) =>
    named("PlayApi.botMove") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("uci", None), params.fromQuery[Option[Boolean]]("offeringDraw", Some(None))) { (id, uci, offeringDraw) =>
          PlayApi_10.botMove(id, uci, offeringDraw)
      }
    }
  
    // @LINE:608
    case controllers_PlayApi_botCommand497_route(params@_) =>
    named("PlayApi.botCommand") {
      call(params.fromPath[String]("cmd", None)) { (cmd) =>
          PlayApi_10.botCommand(cmd)
      }
    }
  
    // @LINE:609
    case controllers_PlayApi_botOnline498_route(params@_) =>
    named("PlayApi.botOnline") {
      call { 
          PlayApi_10.botOnline
      }
    }
  
    // @LINE:612
    case controllers_PlayApi_boardGameStream499_route(params@_) =>
    named("PlayApi.boardGameStream") {
      call(params.fromPath[String]("id", None)) { (id) =>
          PlayApi_10.boardGameStream(id)
      }
    }
  
    // @LINE:613
    case controllers_PlayApi_boardMove500_route(params@_) =>
    named("PlayApi.boardMove") {
      call(params.fromPath[String]("id", None), params.fromPath[String]("uci", None), params.fromQuery[Option[Boolean]]("offeringDraw", Some(None))) { (id, uci, offeringDraw) =>
          PlayApi_10.boardMove(id, uci, offeringDraw)
      }
    }
  
    // @LINE:614
    case controllers_Setup_boardApiHook501_route(params@_) =>
    named("Setup.boardApiHook") {
      call { 
          Setup_49.boardApiHook
      }
    }
  
    // @LINE:615
    case controllers_PlayApi_boardCommand502_route(params@_) =>
    named("PlayApi.boardCommand") {
      call(params.fromPath[String]("cmd", None)) { (cmd) =>
          PlayApi_10.boardCommand(cmd)
      }
    }
  
    // @LINE:618
    case controllers_Account_passwd503_route(params@_) =>
    named("Account.passwd") {
      call { 
          Account_8.passwd
      }
    }
  
    // @LINE:619
    case controllers_Account_passwdApply504_route(params@_) =>
    named("Account.passwdApply") {
      call { 
          Account_8.passwdApply
      }
    }
  
    // @LINE:620
    case controllers_Account_email505_route(params@_) =>
    named("Account.email") {
      call { 
          Account_8.email
      }
    }
  
    // @LINE:621
    case controllers_Account_emailApply506_route(params@_) =>
    named("Account.emailApply") {
      call { 
          Account_8.emailApply
      }
    }
  
    // @LINE:622
    case controllers_Account_emailConfirmHelp507_route(params@_) =>
    named("Account.emailConfirmHelp") {
      call { 
          Account_8.emailConfirmHelp
      }
    }
  
    // @LINE:623
    case controllers_Account_emailConfirm508_route(params@_) =>
    named("Account.emailConfirm") {
      call(params.fromPath[String]("token", None)) { (token) =>
          Account_8.emailConfirm(token)
      }
    }
  
    // @LINE:624
    case controllers_Account_close509_route(params@_) =>
    named("Account.close") {
      call { 
          Account_8.close
      }
    }
  
    // @LINE:625
    case controllers_Account_closeConfirm510_route(params@_) =>
    named("Account.closeConfirm") {
      call { 
          Account_8.closeConfirm
      }
    }
  
    // @LINE:626
    case controllers_Account_profile511_route(params@_) =>
    named("Account.profile") {
      call { 
          Account_8.profile
      }
    }
  
    // @LINE:627
    case controllers_Account_profileApply512_route(params@_) =>
    named("Account.profileApply") {
      call { 
          Account_8.profileApply
      }
    }
  
    // @LINE:628
    case controllers_Account_username513_route(params@_) =>
    named("Account.username") {
      call { 
          Account_8.username
      }
    }
  
    // @LINE:629
    case controllers_Account_usernameApply514_route(params@_) =>
    named("Account.usernameApply") {
      call { 
          Account_8.usernameApply
      }
    }
  
    // @LINE:630
    case controllers_Account_kid515_route(params@_) =>
    named("Account.kid") {
      call { 
          Account_8.kid
      }
    }
  
    // @LINE:631
    case controllers_Account_kidPost516_route(params@_) =>
    named("Account.kidPost") {
      call { 
          Account_8.kidPost
      }
    }
  
    // @LINE:632
    case controllers_Account_twoFactor517_route(params@_) =>
    named("Account.twoFactor") {
      call { 
          Account_8.twoFactor
      }
    }
  
    // @LINE:633
    case controllers_Account_setupTwoFactor518_route(params@_) =>
    named("Account.setupTwoFactor") {
      call { 
          Account_8.setupTwoFactor
      }
    }
  
    // @LINE:634
    case controllers_Account_disableTwoFactor519_route(params@_) =>
    named("Account.disableTwoFactor") {
      call { 
          Account_8.disableTwoFactor
      }
    }
  
    // @LINE:635
    case controllers_Account_reopen520_route(params@_) =>
    named("Account.reopen") {
      call { 
          Account_8.reopen
      }
    }
  
    // @LINE:636
    case controllers_Account_reopenApply521_route(params@_) =>
    named("Account.reopenApply") {
      call { 
          Account_8.reopenApply
      }
    }
  
    // @LINE:637
    case controllers_Account_reopenSent522_route(params@_) =>
    named("Account.reopenSent") {
      call(params.fromPath[String]("email", None)) { (email) =>
          Account_8.reopenSent(email)
      }
    }
  
    // @LINE:638
    case controllers_Account_reopenLogin523_route(params@_) =>
    named("Account.reopenLogin") {
      call(params.fromPath[String]("token", None)) { (token) =>
          Account_8.reopenLogin(token)
      }
    }
  
    // @LINE:639
    case controllers_Account_data524_route(params@_) =>
    named("Account.data") {
      call { 
          Account_8.data
      }
    }
  
    // @LINE:641
    case controllers_Account_security525_route(params@_) =>
    named("Account.security") {
      call { 
          Account_8.security
      }
    }
  
    // @LINE:642
    case controllers_Account_signout526_route(params@_) =>
    named("Account.signout") {
      call(params.fromPath[String]("sessionId", None)) { (sessionId) =>
          Account_8.signout(sessionId)
      }
    }
  
    // @LINE:643
    case controllers_Account_info527_route(params@_) =>
    named("Account.info") {
      call { 
          Account_8.info
      }
    }
  
    // @LINE:644
    case controllers_Account_nowPlaying528_route(params@_) =>
    named("Account.nowPlaying") {
      call { 
          Account_8.nowPlaying
      }
    }
  
    // @LINE:647
    case controllers_OAuthToken_index529_route(params@_) =>
    named("OAuthToken.index") {
      call { 
          OAuthToken_50.index
      }
    }
  
    // @LINE:648
    case controllers_OAuthToken_create530_route(params@_) =>
    named("OAuthToken.create") {
      call { 
          OAuthToken_50.create
      }
    }
  
    // @LINE:649
    case controllers_OAuthToken_createApply531_route(params@_) =>
    named("OAuthToken.createApply") {
      call { 
          OAuthToken_50.createApply
      }
    }
  
    // @LINE:650
    case controllers_OAuthToken_delete532_route(params@_) =>
    named("OAuthToken.delete") {
      call(params.fromPath[String]("publicId", None)) { (publicId) =>
          OAuthToken_50.delete(publicId)
      }
    }
  
    // @LINE:651
    case controllers_OAuthApp_index533_route(params@_) =>
    named("OAuthApp.index") {
      call { 
          OAuthApp_53.index
      }
    }
  
    // @LINE:652
    case controllers_OAuthApp_create534_route(params@_) =>
    named("OAuthApp.create") {
      call { 
          OAuthApp_53.create
      }
    }
  
    // @LINE:653
    case controllers_OAuthApp_createApply535_route(params@_) =>
    named("OAuthApp.createApply") {
      call { 
          OAuthApp_53.createApply
      }
    }
  
    // @LINE:654
    case controllers_OAuthApp_edit536_route(params@_) =>
    named("OAuthApp.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          OAuthApp_53.edit(id)
      }
    }
  
    // @LINE:655
    case controllers_OAuthApp_update537_route(params@_) =>
    named("OAuthApp.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          OAuthApp_53.update(id)
      }
    }
  
    // @LINE:656
    case controllers_OAuthApp_delete538_route(params@_) =>
    named("OAuthApp.delete") {
      call(params.fromPath[String]("id", None)) { (id) =>
          OAuthApp_53.delete(id)
      }
    }
  
    // @LINE:657
    case controllers_OAuthApp_revoke539_route(params@_) =>
    named("OAuthApp.revoke") {
      call(params.fromPath[String]("id", None)) { (id) =>
          OAuthApp_53.revoke(id)
      }
    }
  
    // @LINE:660
    case controllers_Event_show540_route(params@_) =>
    named("Event.show") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Event_24.show(id)
      }
    }
  
    // @LINE:661
    case controllers_Event_manager541_route(params@_) =>
    named("Event.manager") {
      call { 
          Event_24.manager
      }
    }
  
    // @LINE:662
    case controllers_Event_edit542_route(params@_) =>
    named("Event.edit") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Event_24.edit(id)
      }
    }
  
    // @LINE:663
    case controllers_Event_update543_route(params@_) =>
    named("Event.update") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Event_24.update(id)
      }
    }
  
    // @LINE:664
    case controllers_Event_cloneE544_route(params@_) =>
    named("Event.cloneE") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Event_24.cloneE(id)
      }
    }
  
    // @LINE:665
    case controllers_Event_form545_route(params@_) =>
    named("Event.form") {
      call { 
          Event_24.form
      }
    }
  
    // @LINE:666
    case controllers_Event_create546_route(params@_) =>
    named("Event.create") {
      call { 
          Event_24.create
      }
    }
  
    // @LINE:669
    case controllers_Main_captchaCheck547_route(params@_) =>
    named("Main.captchaCheck") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Main_15.captchaCheck(id)
      }
    }
  
    // @LINE:670
    case controllers_Main_webmasters548_route(params@_) =>
    named("Main.webmasters") {
      call { 
          Main_15.webmasters
      }
    }
  
    // @LINE:671
    case controllers_Main_mobile549_route(params@_) =>
    named("Main.mobile") {
      call { 
          Main_15.mobile
      }
    }
  
    // @LINE:672
    case controllers_Main_lag550_route(params@_) =>
    named("Main.lag") {
      call { 
          Main_15.lag
      }
    }
  
    // @LINE:673
    case controllers_Main_getFishnet551_route(params@_) =>
    named("Main.getFishnet") {
      call { 
          Main_15.getFishnet
      }
    }
  
    // @LINE:674
    case controllers_Main_costs552_route(params@_) =>
    named("Main.costs") {
      call { 
          Main_15.costs
      }
    }
  
    // @LINE:675
    case controllers_Main_verifyTitle553_route(params@_) =>
    named("Main.verifyTitle") {
      call { 
          Main_15.verifyTitle
      }
    }
  
    // @LINE:676
    case controllers_Main_instantChess554_route(params@_) =>
    named("Main.instantChess") {
      call { 
          Main_15.instantChess
      }
    }
  
    // @LINE:677
    case controllers_Main_dailyPuzzleSlackApp555_route(params@_) =>
    named("Main.dailyPuzzleSlackApp") {
      call { 
          Main_15.dailyPuzzleSlackApp
      }
    }
  
    // @LINE:680
    case controllers_Dev_cli556_route(params@_) =>
    named("Dev.cli") {
      call { 
          Dev_32.cli
      }
    }
  
    // @LINE:681
    case controllers_Dev_cliPost557_route(params@_) =>
    named("Dev.cliPost") {
      call { 
          Dev_32.cliPost
      }
    }
  
    // @LINE:682
    case controllers_Dev_command558_route(params@_) =>
    named("Dev.command") {
      call { 
          Dev_32.command
      }
    }
  
    // @LINE:683
    case controllers_Dev_settings559_route(params@_) =>
    named("Dev.settings") {
      call { 
          Dev_32.settings
      }
    }
  
    // @LINE:684
    case controllers_Dev_settingsPost560_route(params@_) =>
    named("Dev.settingsPost") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Dev_32.settingsPost(id)
      }
    }
  
    // @LINE:687
    case controllers_Push_mobileRegister561_route(params@_) =>
    named("Push.mobileRegister") {
      call(params.fromPath[String]("platform", None), params.fromPath[String]("deviceId", None)) { (platform, deviceId) =>
          Push_21.mobileRegister(platform, deviceId)
      }
    }
  
    // @LINE:688
    case controllers_Push_mobileUnregister562_route(params@_) =>
    named("Push.mobileUnregister") {
      call { 
          Push_21.mobileUnregister
      }
    }
  
    // @LINE:689
    case controllers_Push_webSubscribe563_route(params@_) =>
    named("Push.webSubscribe") {
      call { 
          Push_21.webSubscribe
      }
    }
  
    // @LINE:692
    case controllers_Page_tos564_route(params@_) =>
    named("Page.tos") {
      call { 
          Page_7.tos
      }
    }
  
    // @LINE:693
    case controllers_Page_menuBookmark565_route(params@_) =>
    named("Page.menuBookmark") {
      call(params.fromPath[String]("bookmark", None)) { (bookmark) =>
          Page_7.menuBookmark(bookmark)
      }
    }
  
    // @LINE:694
    case controllers_Main_contact566_route(params@_) =>
    named("Main.contact") {
      call { 
          Main_15.contact
      }
    }
  
    // @LINE:695
    case controllers_Main_faq567_route(params@_) =>
    named("Main.faq") {
      call { 
          Main_15.faq
      }
    }
  
    // @LINE:696
    case controllers_Page_source568_route(params@_) =>
    named("Page.source") {
      call { 
          Page_7.source
      }
    }
  
    // @LINE:697
    case controllers_Main_movedPermanently569_route(params@_) =>
    named("Main.movedPermanently") {
      call(Param[String]("to", Right("/faq"))) { (to) =>
          Main_15.movedPermanently(to)
      }
    }
  
    // @LINE:698
    case controllers_Main_movedPermanently570_route(params@_) =>
    named("Main.movedPermanently") {
      call(Param[String]("to", Right("/contact"))) { (to) =>
          Main_15.movedPermanently(to)
      }
    }
  
    // @LINE:699
    case controllers_Main_movedPermanently571_route(params@_) =>
    named("Main.movedPermanently") {
      call(Param[String]("to", Right("/contact"))) { (to) =>
          Main_15.movedPermanently(to)
      }
    }
  
    // @LINE:700
    case controllers_Main_legacyQaQuestion572_route(params@_) =>
    named("Main.legacyQaQuestion") {
      call(params.fromPath[Int]("id", None), params.fromPath[String]("slug", None)) { (id, slug) =>
          Main_15.legacyQaQuestion(id, slug)
      }
    }
  
    // @LINE:701
    case controllers_Page_loneBookmark573_route(params@_) =>
    named("Page.loneBookmark") {
      call(Param[String]("bookmark", Right("how-to-cheat"))) { (bookmark) =>
          Page_7.loneBookmark(bookmark)
      }
    }
  
    // @LINE:702
    case controllers_Page_loneBookmark574_route(params@_) =>
    named("Page.loneBookmark") {
      call(params.fromPath[String]("bookmark", None)) { (bookmark) =>
          Page_7.loneBookmark(bookmark)
      }
    }
  
    // @LINE:705
    case controllers_Page_variantHome575_route(params@_) =>
    named("Page.variantHome") {
      call { 
          Page_7.variantHome
      }
    }
  
    // @LINE:706
    case controllers_Page_variant576_route(params@_) =>
    named("Page.variant") {
      call(params.fromPath[String]("key", None)) { (key) =>
          Page_7.variant(key)
      }
    }
  
    // @LINE:709
    case controllers_Page_help577_route(params@_) =>
    named("Page.help") {
      call { 
          Page_7.help
      }
    }
  
    // @LINE:710
    case controllers_Page_master578_route(params@_) =>
    named("Page.master") {
      call { 
          Page_7.master
      }
    }
  
    // @LINE:713
    case controllers_DgtCtrl_index579_route(params@_) =>
    named("DgtCtrl.index") {
      call { 
          DgtCtrl_33.index
      }
    }
  
    // @LINE:714
    case controllers_DgtCtrl_play580_route(params@_) =>
    named("DgtCtrl.play") {
      call { 
          DgtCtrl_33.play
      }
    }
  
    // @LINE:715
    case controllers_DgtCtrl_config581_route(params@_) =>
    named("DgtCtrl.config") {
      call { 
          DgtCtrl_33.config
      }
    }
  
    // @LINE:716
    case controllers_DgtCtrl_generateToken582_route(params@_) =>
    named("DgtCtrl.generateToken") {
      call { 
          DgtCtrl_33.generateToken
      }
    }
  
    // @LINE:719
    case controllers_Main_toggleBlindMode583_route(params@_) =>
    named("Main.toggleBlindMode") {
      call { 
          Main_15.toggleBlindMode
      }
    }
  
    // @LINE:721
    case controllers_Blog_preview584_route(params@_) =>
    named("Blog.preview") {
      call(params.fromQuery[String]("token", None)) { (token) =>
          Blog_36.preview(token)
      }
    }
  
    // @LINE:722
    case controllers_Main_jslog585_route(params@_) =>
    named("Main.jslog") {
      call(params.fromPath[String]("id", None)) { (id) =>
          Main_15.jslog(id)
      }
    }
  
    // @LINE:723
    case controllers_Main_jsmon586_route(params@_) =>
    named("Main.jsmon") {
      call(params.fromPath[String]("event", None)) { (event) =>
          Main_15.jsmon(event)
      }
    }
  
    // @LINE:725
    case controllers_Main_movedPermanently587_route(params@_) =>
    named("Main.movedPermanently") {
      call(Param[String]("to", Right("https://shop.spreadshirt.com/lichess-org"))) { (to) =>
          Main_15.movedPermanently(to)
      }
    }
  
    // @LINE:726
    case controllers_Main_movedPermanently588_route(params@_) =>
    named("Main.movedPermanently") {
      call(Param[String]("to", Right("https://www.youtube.com/channel/UCr6RfQga70yMM9-nuzAYTsA"))) { (to) =>
          Main_15.movedPermanently(to)
      }
    }
  
    // @LINE:728
    case controllers_Main_devAsset589_route(params@_) =>
    named("Main.devAsset") {
      call(params.fromPath[String]("v", None), Param[String]("path", Right("public")), params.fromPath[String]("file", None)) { (v, path, file) =>
          Main_15.devAsset(v, path, file)
      }
    }
  
    // @LINE:729
    case controllers_ExternalAssets_at590_route(params@_) =>
    named("ExternalAssets.at") {
      call(Param[String]("path", Right("public")), params.fromPath[String]("file", None)) { (path, file) =>
          ExternalAssets_43.at(path, file)
      }
    }
  
    // @LINE:731
    case controllers_Main_manifest591_route(params@_) =>
    named("Main.manifest") {
      call { 
          Main_15.manifest
      }
    }
  
    // @LINE:732
    case controllers_Main_robots592_route(params@_) =>
    named("Main.robots") {
      call { 
          Main_15.robots
      }
    }
  
    // @LINE:734
    case controllers_User_redirect593_route(params@_) =>
    named("User.redirect") {
      call(params.fromPath[String]("username", None)) { (username) =>
          User_19.redirect(username)
      }
    }
  
    // @LINE:736
    case controllers_Options_root594_route(params@_) =>
    named("Options.root") {
      call { 
          Options_5.root
      }
    }
  
    // @LINE:737
    case controllers_Options_all595_route(params@_) =>
    named("Options.all") {
      call(params.fromPath[String]("url", None)) { (url) =>
          Options_5.all(url)
      }
    }
  }
}
