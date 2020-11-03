// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/lila/conf/routes
// @DATE:Tue Nov 03 18:37:18 CET 2020

import play.api.mvc.Call




// @LINE:2
package controllers {

  // @LINE:445
  final class ReverseForumPost {

  
    // @LINE:457
    def react(id:String, reaction:String, v:Boolean): Call = {
      
      Call("POST", "/" + "forum/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/react/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("reaction", reaction)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:445
    def search(text:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "forum/search" + play.core.routing.queryString(List(if(text == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:456
    def edit(id:String): Call = {
      
      Call("POST", "/" + "forum/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:455
    def delete(categSlug:String, id:String): Call = {
      
      Call("POST", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:458
    def redirect(id:String): Call = {
      
      Call("GET", "/" + "forum/redirect/post/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:454
    def create(categSlug:String, slug:String, page:Int = 1): Call = {
      
      Call("POST", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/new" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:486
  final class ReverseClas {

  
    // @LINE:514
    def studentUpdate(id:String, username:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/edit")
    }
  
    // @LINE:488
    def becomeTeacher(): Call = {
      
      Call("POST", "/" + "class/become-teacher")
    }
  
    // @LINE:492
    def show(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:517
    def invitationRevoke(id:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/invitation/revoke")
    }
  
    // @LINE:505
    def studentCreate(id:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/new")
    }
  
    // @LINE:493
    def edit(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:510
    def studentArchive(id:String, username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/archive" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("v", v)))))
    }
  
    // @LINE:489
    def create(): Call = {
      
      Call("POST", "/" + "class/new")
    }
  
    // @LINE:502
    def learn(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/progress/learn")
    }
  
    // @LINE:506
    def studentManyForm(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/many")
    }
  
    // @LINE:496
    def wallEdit(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/news/edit")
    }
  
    // @LINE:507
    def studentManyCreate(id:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/many")
    }
  
    // @LINE:509
    def studentShow(id:String, username:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:508
    def studentInvite(id:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/invite")
    }
  
    // @LINE:499
    def notifyPost(id:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/notifyPost")
    }
  
    // @LINE:513
    def studentEdit(id:String, username:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/edit")
    }
  
    // @LINE:490
    def invitation(id:String): Call = {
      
      Call("GET", "/" + "class/invitation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:487
    def form(): Call = {
      
      Call("GET", "/" + "class/new")
    }
  
    // @LINE:512
    def studentSetKid(id:String, username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/set-kid" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("v", v)))))
    }
  
    // @LINE:511
    def studentResetPassword(id:String, username:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/reset-password")
    }
  
    // @LINE:491
    def invitationAccept(id:String): Call = {
      
      Call("POST", "/" + "class/invitation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:497
    def wallUpdate(id:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/news/edit")
    }
  
    // @LINE:515
    def studentRelease(id:String, username:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/release")
    }
  
    // @LINE:504
    def studentForm(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/add")
    }
  
    // @LINE:501
    def archive(id:String, v:Boolean): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/archive" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("v", v)))))
    }
  
    // @LINE:494
    def update(id:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:495
    def wall(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/news")
    }
  
    // @LINE:500
    def students(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/students")
    }
  
    // @LINE:503
    def progress(id:String, pt:String, days:Int): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/progress/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("pt", pt)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("days", days)))
    }
  
    // @LINE:486
    def index(): Call = {
      
      Call("GET", "/" + "class")
    }
  
    // @LINE:516
    def studentReleasePost(id:String, username:String): Call = {
      
      Call("POST", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/student/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/release")
    }
  
    // @LINE:498
    def notifyStudents(id:String): Call = {
      
      Call("GET", "/" + "class/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/notify")
    }
  
  }

  // @LINE:647
  final class ReverseOAuthToken {

  
    // @LINE:650
    def delete(publicId:String): Call = {
      
      Call("POST", "/" + "account/oauth/token/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("publicId", publicId)) + "/delete")
    }
  
    // @LINE:648
    def create(): Call = {
      
      Call("GET", "/" + "account/oauth/token/create")
    }
  
    // @LINE:649
    def createApply(): Call = {
      
      Call("POST", "/" + "account/oauth/token/create")
    }
  
    // @LINE:647
    def index(): Call = {
      
      Call("GET", "/" + "account/oauth/token")
    }
  
  }

  // @LINE:165
  final class ReversePractice {

  
    // @LINE:173
    def showChapter(sectionId:String, studySlug:String, studyId:String, chapterId:String): Call = {
      
      Call("GET", "/" + "practice/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sectionId", sectionId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("studySlug", studySlug)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("studyId", studyId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId)))
    }
  
    // @LINE:172
    def show(sectionId:String, studySlug:String, studyId:String): Call = {
      
      Call("GET", "/" + "practice/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sectionId", sectionId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("studySlug", studySlug)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("studyId", studyId)))
    }
  
    // @LINE:167
    def config(): Call = {
      
      Call("GET", "/" + "practice/config")
    }
  
    // @LINE:168
    def configSave(): Call = {
      
      Call("POST", "/" + "practice/config")
    }
  
    // @LINE:174
    def complete(chapterId:String, moves:Int): Call = {
      
      Call("POST", "/" + "practice/complete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("moves", moves)))
    }
  
    // @LINE:166
    def chapter(studyId:String, chapterId:String): Call = {
      
      Call("GET", "/" + "practice/load/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("studyId", studyId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId)))
    }
  
    // @LINE:170
    def showSection(sectionId:String): Call = {
      
      Call("GET", "/" + "practice/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sectionId", sectionId)))
    }
  
    // @LINE:169
    def reset(): Call = {
      
      Call("POST", "/" + "practice/reset")
    }
  
    // @LINE:171
    def showStudySlug(sectionId:String, studySlug:String): Call = {
      
      Call("GET", "/" + "practice/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sectionId", sectionId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("studySlug", studySlug)))
    }
  
    // @LINE:165
    def index(): Call = {
      
      Call("GET", "/" + "practice")
    }
  
  }

  // @LINE:153
  final class ReversePlan {

  
    // @LINE:157
    def cancel(): Call = {
      
      Call("POST", "/" + "patron/cancel")
    }
  
    // @LINE:158
    def webhook(): Call = {
      
      Call("POST", "/" + "patron/webhook")
    }
  
    // @LINE:159
    def stripeCheckout(): Call = {
      
      Call("POST", "/" + "patron/stripe-checkout")
    }
  
    // @LINE:155
    def list(): Call = {
      
      Call("GET", "/" + "patron/list")
    }
  
    // @LINE:154
    def thanks(): Call = {
      
      Call("GET", "/" + "patron/thanks")
    }
  
    // @LINE:156
    def switch(): Call = {
      
      Call("POST", "/" + "patron/switch")
    }
  
    // @LINE:153
    def index(): Call = {
      
      Call("GET", "/" + "patron")
    }
  
    // @LINE:161
    def features(): Call = {
      
      Call("GET", "/" + "features")
    }
  
    // @LINE:160
    def payPalIpn(): Call = {
      
      Call("POST", "/" + "patron/ipn")
    }
  
  }

  // @LINE:523
  final class ReverseImporter {

  
    // @LINE:525
    def masterGame(id:String, color:String): Call = {
      
      Call("GET", "/" + "import/master/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("color", color)))
    }
  
    // @LINE:523
    def importGame(): Call = {
      
      Call("GET", "/" + "paste")
    }
  
    // @LINE:524
    def sendGame(): Call = {
      
      Call("POST", "/" + "import")
    }
  
    // @LINE:598
    def apiSendGame(): Call = {
      
      Call("POST", "/" + "api/import")
    }
  
  }

  // @LINE:370
  final class ReverseI18n {

  
    // @LINE:370
    def select(): Call = {
      
      Call("POST", "/" + "translation/select")
    }
  
  }

  // @LINE:660
  final class ReverseEvent {

  
    // @LINE:660
    def show(id:String): Call = {
      
      Call("GET", "/" + "event/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:664
    def cloneE(id:String): Call = {
      
      Call("GET", "/" + "event/manager/clone/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:662
    def edit(id:String): Call = {
      
      Call("GET", "/" + "event/manager/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:666
    def create(): Call = {
      
      Call("POST", "/" + "event/manager")
    }
  
    // @LINE:661
    def manager(): Call = {
      
      Call("GET", "/" + "event/manager")
    }
  
    // @LINE:665
    def form(): Call = {
      
      Call("GET", "/" + "event/manager/new")
    }
  
    // @LINE:663
    def update(id:String): Call = {
      
      Call("POST", "/" + "event/manager/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
  }

  // @LINE:43
  final class ReverseUserTournament {

  
    // @LINE:43
    def path(username:String, path:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/tournaments/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("path", path)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:177
  final class ReverseStreamer {

  
    // @LINE:177
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "streamer" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:185
    def pictureDelete(): Call = {
      
      Call("POST", "/" + "streamer/picture/delete")
    }
  
    // @LINE:186
    def show(username:String): Call = {
      
      Call("GET", "/" + "streamer/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:179
    def edit(): Call = {
      
      Call("GET", "/" + "streamer/edit")
    }
  
    // @LINE:183
    def picture(): Call = {
      
      Call("GET", "/" + "streamer/picture/edit")
    }
  
    // @LINE:180
    def create(): Call = {
      
      Call("POST", "/" + "streamer/new")
    }
  
    // @LINE:182
    def approvalRequest(): Call = {
      
      Call("POST", "/" + "streamer/approval/request")
    }
  
    // @LINE:178
    def live(): Call = {
      
      Call("GET", "/" + "streamer/live")
    }
  
    // @LINE:184
    def pictureApply(): Call = {
      
      Call("POST", "/" + "streamer/picture/upload")
    }
  
    // @LINE:181
    def editApply(): Call = {
      
      Call("POST", "/" + "streamer/edit")
    }
  
  }

  // @LINE:6
  final class ReverseTimeline {

  
    // @LINE:7
    def unsub(channel:String): Call = {
      
      Call("POST", "/" + "timeline/unsub/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("channel", channel)))
    }
  
    // @LINE:6
    def home(): Call = {
      
      Call("GET", "/" + "timeline")
    }
  
  }

  // @LINE:36
  final class ReverseInsight {

  
    // @LINE:39
    def path(username:String, metric:String, dimension:String, filters:String): Call = {
    
      (username: @unchecked, metric: @unchecked, dimension: @unchecked, filters: @unchecked) match {
      
        // @LINE:39
        case (username, metric, dimension, filters) if filters == "" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("filters", ""))); _rrc
          Call("GET", "/" + "insights/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("metric", metric)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("dimension", dimension)))
      
        // @LINE:40
        case (username, metric, dimension, filters)  =>
          
          Call("GET", "/" + "insights/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("metric", metric)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("dimension", dimension)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("filters", filters))
      
      }
    
    }
  
    // @LINE:38
    def index(username:String): Call = {
      
      Call("GET", "/" + "insights/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:36
    def refresh(username:String): Call = {
      
      Call("POST", "/" + "insights/refresh/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:37
    def json(username:String): Call = {
      
      Call("POST", "/" + "insights/data/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
  }

  // @LINE:104
  final class ReverseStudy {

  
    // @LINE:114
    def show(id:String): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:128
    def multiBoard(id:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/multi-board" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:133
    def topicAutocomplete(): Call = {
      
      Call("GET", "/" + "study/topic/autocomplete")
    }
  
    // @LINE:105
    def all(order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/all/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:124
    def chapterMeta(id:String, chapterId:String): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId) + "/meta")
    }
  
    // @LINE:113
    def search(q:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "study/search" + play.core.routing.queryString(List(if(q == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:119
    def chapterGif(id:String, chapterId:String): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId) + ".gif")
    }
  
    // @LINE:118
    def chapterPgn(id:String, chapterId:String): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId) + ".pgn")
    }
  
    // @LINE:115
    def create(): Call = {
      
      Call("POST", "/" + "study")
    }
  
    // @LINE:132
    def byTopic(topic:String, order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/topic/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("topic", topic)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:129
    def admin(id:String): Call = {
      
      Call("POST", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/admin")
    }
  
    // @LINE:116
    def createAs(): Call = {
      
      Call("POST", "/" + "study/as")
    }
  
    // @LINE:106
    def mine(order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/mine/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:127
    def importPgn(id:String): Call = {
      
      Call("POST", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/import-pgn")
    }
  
    // @LINE:126
    def clearChat(id:String): Call = {
      
      Call("POST", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/clear-chat")
    }
  
    // @LINE:109
    def minePrivate(order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/private/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:112
    def byOwner(username:String, order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/by/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:117
    def pgn(id:String): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + ".pgn")
    }
  
    // @LINE:107
    def mineMember(order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/member/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:123
    def chapter(id:String, chapterId:String): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId))
    }
  
    // @LINE:120
    def delete(id:String): Call = {
      
      Call("POST", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/delete")
    }
  
    // @LINE:108
    def minePublic(order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/public/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:121
    def cloneStudy(id:String): Call = {
      
      Call("GET", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/clone")
    }
  
    // @LINE:104
    def allDefault(page:Int = 1): Call = {
      
      Call("GET", "/" + "study" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:122
    def cloneApply(id:String): Call = {
      
      Call("POST", "/" + "study/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/cloneAplly")
    }
  
    // @LINE:125
    def embed(id:String, chapterId:String): Call = {
      
      Call("GET", "/" + "study/embed/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId))
    }
  
    // @LINE:130
    def topics(): Call = {
      
      Call("GET", "/" + "study/topic")
    }
  
    // @LINE:110
    def mineLikes(order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/likes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:111
    def byOwnerDefault(username:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "study/by/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:131
    def setTopics(): Call = {
      
      Call("POST", "/" + "study/topic")
    }
  
  }

  // @LINE:341
  final class ReverseSetup {

  
    // @LINE:347
    def hook(sri:String): Call = {
      
      Call("POST", "/" + "setup/hook/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sri", sri)))
    }
  
    // @LINE:345
    def hookForm(): Call = {
      
      Call("GET", "/" + "setup/hook")
    }
  
    // @LINE:349
    def validateFen(): Call = {
      
      Call("GET", "/" + "setup/validate-fen")
    }
  
    // @LINE:614
    def boardApiHook(): Call = {
      
      Call("POST", "/" + "api/board/seek")
    }
  
    // @LINE:589
    def apiAi(): Call = {
      
      Call("POST", "/" + "api/challenge/ai")
    }
  
    // @LINE:344
    def friend(user:Option[String] = None): Call = {
      
      Call("POST", "/" + "setup/friend" + play.core.routing.queryString(List(if(user == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("user", user)))))
    }
  
    // @LINE:346
    def like(sri:String, gameId:String): Call = {
      
      Call("POST", "/" + "setup/hook/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sri", sri)) + "/like/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId)))
    }
  
    // @LINE:348
    def filterForm(): Call = {
      
      Call("GET", "/" + "setup/filter")
    }
  
    // @LINE:342
    def ai(): Call = {
      
      Call("POST", "/" + "setup/ai")
    }
  
    // @LINE:343
    def friendForm(user:Option[String] = None): Call = {
      
      Call("GET", "/" + "setup/friend" + play.core.routing.queryString(List(if(user == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("user", user)))))
    }
  
    // @LINE:341
    def aiForm(): Call = {
      
      Call("GET", "/" + "setup/ai")
    }
  
  }

  // @LINE:84
  final class ReverseExport {

  
    // @LINE:323
    def gameThumbnail(gameId:String): Call = {
      
      Call("GET", "/" + "game/export/gif/thumbnail/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + ".gif")
    }
  
    // @LINE:84
    def legacyPuzzleThumbnail(id:Int): Call = {
      
      Call("GET", "/" + "training/export/png/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + ".png")
    }
  
    // @LINE:322
    def legacyGameThumbnail(gameId:String): Call = {
      
      Call("GET", "/" + "game/export/png/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + ".png")
    }
  
    // @LINE:85
    def puzzleThumbnail(id:Int): Call = {
      
      Call("GET", "/" + "training/export/gif/thumbnail/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + ".gif")
    }
  
    // @LINE:324
    def gif(gameId:String, color:String): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:324
        case (gameId, color) if color == "white" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", "white"))); _rrc
          Call("GET", "/" + "game/export/gif/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + ".gif")
      
        // @LINE:325
        case (gameId, color)  =>
          
          Call("GET", "/" + "game/export/gif/" + implicitly[play.api.mvc.PathBindable[String]].unbind("color", color) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + ".gif")
      
      }
    
    }
  
  }

  // @LINE:75
  final class ReverseCoordinate {

  
    // @LINE:76
    def score(): Call = {
      
      Call("POST", "/" + "training/coordinate/score")
    }
  
    // @LINE:75
    def home(): Call = {
      
      Call("GET", "/" + "training/coordinate")
    }
  
    // @LINE:77
    def color(): Call = {
      
      Call("POST", "/" + "training/coordinate/color")
    }
  
  }

  // @LINE:66
  final class ReverseBlog {

  
    // @LINE:66
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "blog" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:70
    def show(id:String, slug:String, ref:Option[String] = None): Call = {
      
      Call("GET", "/" + "blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + play.core.routing.queryString(List(if(ref == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("ref", ref)))))
    }
  
    // @LINE:72
    def sitemapTxt(): Call = {
      
      Call("GET", "/" + "blog.txt")
    }
  
    // @LINE:721
    def preview(token:String): Call = {
      
      Call("GET", "/" + "prismic-preview" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("token", token)))))
    }
  
    // @LINE:67
    def all(): Call = {
      
      Call("GET", "/" + "blog/all")
    }
  
    // @LINE:71
    def atom(): Call = {
      
      Call("GET", "/" + "blog.atom")
    }
  
    // @LINE:69
    def discuss(id:String): Call = {
      
      Call("GET", "/" + "blog/discuss/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:68
    def year(year:Int): Call = {
      
      Call("GET", "/" + "blog/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("year", year)))
    }
  
  }

  // @LINE:473
  final class ReverseCoach {

  
    // @LINE:478
    def pictureDelete(): Call = {
      
      Call("POST", "/" + "coach/picture/delete")
    }
  
    // @LINE:481
    def show(username:String): Call = {
      
      Call("GET", "/" + "coach/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:483
    def search(lang:String, order:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "coach/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("lang", lang)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("order", order)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:474
    def edit(): Call = {
      
      Call("GET", "/" + "coach/edit")
    }
  
    // @LINE:479
    def approveReview(id:String): Call = {
      
      Call("POST", "/" + "coach/approve-review/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:476
    def picture(): Call = {
      
      Call("GET", "/" + "coach/picture/edit")
    }
  
    // @LINE:482
    def review(username:String): Call = {
      
      Call("POST", "/" + "coach/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/review")
    }
  
    // @LINE:473
    def all(page:Int = 1): Call = {
      
      Call("GET", "/" + "coach" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:480
    def modReview(id:String): Call = {
      
      Call("POST", "/" + "coach/mod-review/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:477
    def pictureApply(): Call = {
      
      Call("POST", "/" + "coach/picture/upload")
    }
  
    // @LINE:475
    def editApply(): Call = {
      
      Call("POST", "/" + "coach/edit")
    }
  
  }

  // @LINE:441
  final class ReverseBookmark {

  
    // @LINE:441
    def toggle(gameId:String): Call = {
      
      Call("POST", "/" + "bookmark/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId))
    }
  
  }

  // @LINE:373
  final class ReverseAuth {

  
    // @LINE:380
    def fixEmail(): Call = {
      
      Call("POST", "/" + "signup/fix-email")
    }
  
    // @LINE:384
    def passwordResetSent(email:String): Call = {
      
      Call("GET", "/" + "password/reset/sent/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:391
    def magicLinkApply(): Call = {
      
      Call("POST", "/" + "auth/magic-link/send")
    }
  
    // @LINE:382
    def passwordReset(): Call = {
      
      Call("GET", "/" + "password/reset")
    }
  
    // @LINE:392
    def magicLinkSent(email:String): Call = {
      
      Call("GET", "/" + "auth/magic-link/sent/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:385
    def passwordResetConfirm(token:String): Call = {
      
      Call("GET", "/" + "password/reset/confirm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:393
    def magicLinkLogin(token:String): Call = {
      
      Call("GET", "/" + "auth/magic-link/login/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:389
    def loginWithToken(token:String): Call = {
      
      Call("GET", "/" + "auth/token/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:377
    def signup(): Call = {
      
      Call("GET", "/" + "signup")
    }
  
    // @LINE:379
    def checkYourEmail(): Call = {
      
      Call("GET", "/" + "signup/check-your-email")
    }
  
    // @LINE:383
    def passwordResetApply(): Call = {
      
      Call("POST", "/" + "password/reset/send")
    }
  
    // @LINE:376
    def logout(): Call = {
      
      Call("POST", "/" + "logout")
    }
  
    // @LINE:390
    def magicLink(): Call = {
      
      Call("GET", "/" + "auth/magic-link")
    }
  
    // @LINE:386
    def passwordResetConfirmApply(token:String): Call = {
      
      Call("POST", "/" + "password/reset/confirm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:378
    def signupPost(): Call = {
      
      Call("POST", "/" + "signup")
    }
  
    // @LINE:381
    def signupConfirmEmail(token:String): Call = {
      
      Call("GET", "/" + "signup/confirm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:374
    def authenticate(): Call = {
      
      Call("POST", "/" + "login")
    }
  
    // @LINE:387
    def setFingerPrint(fp:String, ms:Int): Call = {
      
      Call("POST", "/" + "auth/set-fp/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fp", fp)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("ms", ms)))
    }
  
    // @LINE:375
    def logoutGet(): Call = {
      
      Call("GET", "/" + "logout")
    }
  
    // @LINE:373
    def login(): Call = {
      
      Call("GET", "/" + "login")
    }
  
    // @LINE:388
    def makeLoginToken(): Call = {
      
      Call("POST", "/" + "auth/token")
    }
  
  }

  // @LINE:98
  final class ReverseUserAnalysis {

  
    // @LINE:98
    def help(): Call = {
      
      Call("GET", "/" + "analysis/help")
    }
  
    // @LINE:201
    def forecasts(fullId:String): Call = {
      
      Call("POST", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("fullId", fullId) + "/forecasts")
    }
  
    // @LINE:200
    def game(gameId:String, color:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("color", color) + "/analysis")
    }
  
    // @LINE:202
    def forecastsOnMyTurn(fullId:String, uci:String): Call = {
      
      Call("POST", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("fullId", fullId) + "/forecasts/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uci", uci)))
    }
  
    // @LINE:99
    def parseArg(something:String): Call = {
      
      Call("GET", "/" + "analysis/" + implicitly[play.api.mvc.PathBindable[String]].unbind("something", something))
    }
  
    // @LINE:101
    def pgn(): Call = {
      
      Call("POST", "/" + "analysis/pgn")
    }
  
    // @LINE:100
    def index(): Call = {
      
      Call("GET", "/" + "analysis")
    }
  
  }

  // @LINE:199
  final class ReverseEditor {

  
    // @LINE:529
    def load(urlFen:String): Call = {
      
      Call("GET", "/" + "editor/" + implicitly[play.api.mvc.PathBindable[String]].unbind("urlFen", urlFen))
    }
  
    // @LINE:528
    def data(): Call = {
      
      Call("GET", "/" + "editor.json")
    }
  
    // @LINE:530
    def index(): Call = {
      
      Call("GET", "/" + "editor")
    }
  
    // @LINE:199
    def game(gameId:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/edit")
    }
  
  }

  // @LINE:352
  final class ReverseChallenge {

  
    // @LINE:354
    def accept(id:String, color:Option[String] = None): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/accept" + play.core.routing.queryString(List(if(color == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("color", color)))))
    }
  
    // @LINE:590
    def openCreate(): Call = {
      
      Call("POST", "/" + "api/challenge/open")
    }
  
    // @LINE:353
    def show(id:String, color:Option[String] = None): Call = {
      
      Call("GET", "/" + "challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + play.core.routing.queryString(List(if(color == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("color", color)))))
    }
  
    // @LINE:595
    def apiStartClocks(id:String): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/start-clocks")
    }
  
    // @LINE:592
    def apiAccept(id:String): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/accept")
    }
  
    // @LINE:356
    def cancel(id:String): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/cancel")
    }
  
    // @LINE:357
    def toFriend(id:String): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/to-friend")
    }
  
    // @LINE:591
    def apiCreate(user:String): Call = {
      
      Call("POST", "/" + "api/challenge/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:355
    def decline(id:String): Call = {
      
      Call("POST", "/" + "challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/decline")
    }
  
    // @LINE:352
    def all(): Call = {
      
      Call("GET", "/" + "challenge")
    }
  
    // @LINE:358
    def rematchOf(id:String): Call = {
      
      Call("POST", "/" + "challenge/rematch-of/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:593
    def apiDecline(id:String): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/decline")
    }
  
    // @LINE:594
    def apiCancel(id:String): Call = {
      
      Call("POST", "/" + "api/challenge/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/cancel")
    }
  
  }

  // @LINE:248
  final class ReverseSwiss {

  
    // @LINE:252
    def exportTrf(id:String): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + ".trf")
    }
  
    // @LINE:251
    def show(id:String): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:255
    def edit(id:String): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:258
    def standing(id:String, page:Int): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/standing/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("page", page)))
    }
  
    // @LINE:257
    def terminate(id:String): Call = {
      
      Call("POST", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/terminate")
    }
  
    // @LINE:261
    def scheduleNextRound(id:String): Call = {
      
      Call("POST", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/schedule-next-round")
    }
  
    // @LINE:574
    def apiCreate(teamId:String): Call = {
      
      Call("POST", "/" + "api/swiss/new/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("teamId", teamId)))
    }
  
    // @LINE:250
    def create(teamId:String): Call = {
      
      Call("POST", "/" + "swiss/new/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("teamId", teamId)))
    }
  
    // @LINE:315
    def byTeam(id:String): Call = {
      
      Call("GET", "/" + "api/team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/swiss")
    }
  
    // @LINE:253
    def join(id:String): Call = {
      
      Call("POST", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/join")
    }
  
    // @LINE:248
    def home(): Call = {
      
      Call("GET", "/" + "swiss")
    }
  
    // @LINE:256
    def update(id:String): Call = {
      
      Call("POST", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:259
    def pageOf(id:String, user:String): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/page-of/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:260
    def player(id:String, user:String): Call = {
      
      Call("GET", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/player/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:254
    def withdraw(id:String): Call = {
      
      Call("POST", "/" + "swiss/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/withdraw")
    }
  
    // @LINE:249
    def form(teamId:String): Call = {
      
      Call("GET", "/" + "swiss/new/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("teamId", teamId)))
    }
  
  }

  // @LINE:27
  final class ReverseRelation {

  
    // @LINE:31
    def following(username:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/following" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:33
    def blocks(page:Int = 1): Call = {
      
      Call("GET", "/" + "rel/blocks" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:30
    def unblock(userId:String): Call = {
      
      Call("POST", "/" + "rel/unblock/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:29
    def block(userId:String): Call = {
      
      Call("POST", "/" + "rel/block/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:563
    def apiFollowers(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/followers")
    }
  
    // @LINE:562
    def apiFollowing(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/following")
    }
  
    // @LINE:28
    def unfollow(userId:String): Call = {
      
      Call("POST", "/" + "rel/unfollow/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:32
    def followers(username:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/followers" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:27
    def follow(userId:String): Call = {
      
      Call("POST", "/" + "rel/follow/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
  }

  // @LINE:545
  final class ReverseAppeal {

  
    // @LINE:548
    def show(username:String): Call = {
      
      Call("GET", "/" + "appeal/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:547
    def queue(): Call = {
      
      Call("GET", "/" + "appeal/queue")
    }
  
    // @LINE:546
    def post(): Call = {
      
      Call("POST", "/" + "appeal")
    }
  
    // @LINE:549
    def reply(username:String): Call = {
      
      Call("POST", "/" + "appeal/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:550
    def mute(username:String): Call = {
      
      Call("POST", "/" + "appeal/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/mute")
    }
  
    // @LINE:545
    def home(): Call = {
      
      Call("GET", "/" + "appeal")
    }
  
  }

  // @LINE:63
  final class ReverseDasher {

  
    // @LINE:63
    def get(): Call = {
      
      Call("GET", "/" + "dasher")
    }
  
  }

  // @LINE:189
  final class ReverseRound {

  
    // @LINE:203
    def resign(fullId:String): Call = {
      
      Call("POST", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("fullId", fullId) + "/resign")
    }
  
    // @LINE:192
    def sides(gameId:String, color:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("color", color) + "/sides")
    }
  
    // @LINE:198
    def miniFullId(fullId:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("fullId", fullId) + "/mini")
    }
  
    // @LINE:195
    def writeNote(gameId:String): Call = {
      
      Call("POST", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/note")
    }
  
    // @LINE:210
    def next(gameId:String): Call = {
      
      Call("GET", "/" + "round-next/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId))
    }
  
    // @LINE:193
    def continue(gameId:String, mode:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/continue/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("mode", mode)))
    }
  
    // @LINE:194
    def readNote(gameId:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/note")
    }
  
    // @LINE:211
    def whatsNext(fullId:String): Call = {
      
      Call("GET", "/" + "whats-next/" + implicitly[play.api.mvc.PathBindable[String]].unbind("fullId", fullId))
    }
  
    // @LINE:189
    def watcher(gameId:String, color:String): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:189
        case (gameId, color) if color == "white" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", "white"))); _rrc
          Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId))
      
        // @LINE:190
        case (gameId, color)  =>
          
          Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("color", color))
      
      }
    
    }
  
    // @LINE:191
    def player(fullId:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("fullId", fullId))
    }
  
    // @LINE:196
    def mini(gameId:String, color:String): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:196
        case (gameId, color) if color == "white" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", "white"))); _rrc
          Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/mini")
      
        // @LINE:197
        case (gameId, color)  =>
          
          Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("color", color) + "/mini")
      
      }
    
    }
  
  }

  // @LINE:687
  final class ReversePush {

  
    // @LINE:689
    def webSubscribe(): Call = {
      
      Call("POST", "/" + "push/subscribe")
    }
  
    // @LINE:688
    def mobileUnregister(): Call = {
      
      Call("POST", "/" + "mobile/unregister")
    }
  
    // @LINE:687
    def mobileRegister(platform:String, deviceId:String): Call = {
      
      Call("POST", "/" + "mobile/register/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("platform", platform)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("deviceId", deviceId)))
    }
  
  }

  // @LINE:328
  final class ReverseFishnet {

  
    // @LINE:330
    def abort(workId:String): Call = {
      
      Call("POST", "/" + "fishnet/abort/" + implicitly[play.api.mvc.PathBindable[String]].unbind("workId", workId))
    }
  
    // @LINE:328
    def acquire(slow:Boolean = false): Call = {
      
      Call("POST", "/" + "fishnet/acquire" + play.core.routing.queryString(List(if(slow == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("slow", slow)))))
    }
  
    // @LINE:331
    def keyExists(key:String): Call = {
      
      Call("GET", "/" + "fishnet/key/" + implicitly[play.api.mvc.PathBindable[String]].unbind("key", key))
    }
  
    // @LINE:329
    def analysis(workId:String, slow:Boolean = false, stop:Boolean = false): Call = {
      
      Call("POST", "/" + "fishnet/analysis/" + implicitly[play.api.mvc.PathBindable[String]].unbind("workId", workId) + play.core.routing.queryString(List(if(slow == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("slow", slow)), if(stop == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("stop", stop)))))
    }
  
    // @LINE:332
    def status(): Call = {
      
      Call("GET", "/" + "fishnet/status")
    }
  
  }

  // @LINE:461
  final class ReverseMsg {

  
    // @LINE:467
    def convoDelete(username:String): Call = {
    
      (username: @unchecked) match {
      
        // @LINE:467
        case (username)  =>
          
          Call("DELETE", "/" + "inbox/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
      
      }
    
    }
  
    // @LINE:469
    def apiPost(username:String): Call = {
      
      Call("POST", "/" + "inbox/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:464
    def search(q:String): Call = {
      
      Call("GET", "/" + "inbox/search" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)))))
    }
  
    // @LINE:465
    def unreadCount(): Call = {
      
      Call("GET", "/" + "inbox/unread-count")
    }
  
    // @LINE:461
    def compatCreate(): Call = {
      
      Call("POST", "/" + "inbox/new")
    }
  
    // @LINE:463
    def home(): Call = {
      
      Call("GET", "/" + "inbox")
    }
  
    // @LINE:466
    def convo(username:String, before:Option[Long] = None): Call = {
      
      Call("GET", "/" + "inbox/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + play.core.routing.queryString(List(if(before == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Long]]].unbind("before", before)))))
    }
  
  }

  // @LINE:2
  final class ReverseLobby {

  
    // @LINE:2
    def home(): Call = {
      
      Call("GET", "/")
    }
  
    // @LINE:3
    def seeks(): Call = {
      
      Call("GET", "/" + "lobby/seeks")
    }
  
  }

  // @LINE:280
  final class ReverseTeam {

  
    // @LINE:298
    def kick(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/kick")
    }
  
    // @LINE:303
    def disable(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/disable")
    }
  
    // @LINE:300
    def leadersForm(id:String): Call = {
      
      Call("GET", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/leaders")
    }
  
    // @LINE:287
    def search(text:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "team/search" + play.core.routing.queryString(List(if(text == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:309
    def apiAll(page:Int = 1): Call = {
      
      Call("GET", "/" + "api/team/all" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:291
    def quit(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/quit")
    }
  
    // @LINE:304
    def tournaments(id:String): Call = {
      
      Call("GET", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/tournaments")
    }
  
    // @LINE:299
    def kickUser(id:String, user:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/kick/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:295
    def edit(id:String): Call = {
      
      Call("GET", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:301
    def leaders(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/leaders")
    }
  
    // @LINE:282
    def create(): Call = {
      
      Call("POST", "/" + "team/new")
    }
  
    // @LINE:294
    def requestProcess(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/request/process")
    }
  
    // @LINE:283
    def mine(): Call = {
      
      Call("GET", "/" + "team/me")
    }
  
    // @LINE:284
    def leader(): Call = {
      
      Call("GET", "/" + "team/leader")
    }
  
    // @LINE:313
    def users(id:String): Call = {
      
      Call("GET", "/" + "api/team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/users")
    }
  
    // @LINE:293
    def requestCreate(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/request/new")
    }
  
    // @LINE:280
    def home(page:Int = 1): Call = {
      
      Call("GET", "/" + "team" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:302
    def close(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/close")
    }
  
    // @LINE:311
    def apiTeamsOf(username:String): Call = {
      
      Call("GET", "/" + "api/team/of/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:297
    def kickForm(id:String): Call = {
      
      Call("GET", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/kick")
    }
  
    // @LINE:312
    def apiShow(id:String): Call = {
      
      Call("GET", "/" + "api/team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:281
    def form(): Call = {
      
      Call("GET", "/" + "team/new")
    }
  
    // @LINE:292
    def requestForm(id:String): Call = {
      
      Call("GET", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/request/new")
    }
  
    // @LINE:306
    def pmAllSubmit(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/pm-all")
    }
  
    // @LINE:290
    def join(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/join")
    }
  
    // @LINE:310
    def apiSearch(text:String = "", page:Int = 1): Call = {
      
      Call("GET", "/" + "api/team/search" + play.core.routing.queryString(List(if(text == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:286
    def requests(): Call = {
      
      Call("GET", "/" + "team/requests")
    }
  
    // @LINE:285
    def all(page:Int = 1): Call = {
      
      Call("GET", "/" + "team/all" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:296
    def update(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:288
    def autocomplete(): Call = {
      
      Call("GET", "/" + "team/autocomplete")
    }
  
    // @LINE:307
    def subscribe(id:String): Call = {
      
      Call("POST", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/subscribe")
    }
  
    // @LINE:289
    def show(id:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:305
    def pmAll(id:String): Call = {
      
      Call("GET", "/" + "team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/pm-all")
    }
  
  }

  // @LINE:606
  final class ReversePlayApi {

  
    // @LINE:607
    def botMove(id:String, uci:String, offeringDraw:Option[Boolean] = None): Call = {
      
      Call("POST", "/" + "api/bot/game/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/move/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uci", uci)) + play.core.routing.queryString(List(if(offeringDraw == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Boolean]]].unbind("offeringDraw", offeringDraw)))))
    }
  
    // @LINE:609
    def botOnline(): Call = {
      
      Call("GET", "/" + "player/bots")
    }
  
    // @LINE:606
    def botGameStream(id:String): Call = {
      
      Call("GET", "/" + "api/bot/game/stream/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:608
    def botCommand(cmd:String): Call = {
      
      Call("POST", "/" + "api/bot/" + implicitly[play.api.mvc.PathBindable[String]].unbind("cmd", cmd))
    }
  
    // @LINE:615
    def boardCommand(cmd:String): Call = {
      
      Call("POST", "/" + "api/board/" + implicitly[play.api.mvc.PathBindable[String]].unbind("cmd", cmd))
    }
  
    // @LINE:613
    def boardMove(id:String, uci:String, offeringDraw:Option[Boolean] = None): Call = {
      
      Call("POST", "/" + "api/board/game/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/move/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("uci", uci)) + play.core.routing.queryString(List(if(offeringDraw == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[Boolean]]].unbind("offeringDraw", offeringDraw)))))
    }
  
    // @LINE:612
    def boardGameStream(id:String): Call = {
      
      Call("GET", "/" + "api/board/game/stream/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:729
  final class ReverseExternalAssets {

  
    // @LINE:729
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "public"))); _rrc
      Call("GET", "/" + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:692
  final class ReversePage {

  
    // @LINE:706
    def variant(key:String): Call = {
      
      Call("GET", "/" + "variant/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("key", key)))
    }
  
    // @LINE:709
    def help(): Call = {
      
      Call("GET", "/" + "help/contribute")
    }
  
    // @LINE:710
    def master(): Call = {
      
      Call("GET", "/" + "help/master")
    }
  
    // @LINE:693
    def menuBookmark(bookmark:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("bookmark", bookmark))
    }
  
    // @LINE:701
    def loneBookmark(bookmark:String): Call = {
    
      (bookmark: @unchecked) match {
      
        // @LINE:701
        case (bookmark) if bookmark == "how-to-cheat" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("bookmark", "how-to-cheat"))); _rrc
          Call("GET", "/" + "how-to-cheat")
      
        // @LINE:702
        case (bookmark)  =>
          
          Call("GET", "/" + "page/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("bookmark", bookmark)))
      
      }
    
    }
  
    // @LINE:705
    def variantHome(): Call = {
      
      Call("GET", "/" + "variant")
    }
  
    // @LINE:692
    def tos(): Call = {
      
      Call("GET", "/" + "terms-of-service")
    }
  
    // @LINE:696
    def source(): Call = {
      
      Call("GET", "/" + "source")
    }
  
  }

  // @LINE:13
  final class ReverseGame {

  
    // @LINE:600
    def apiExportByUser(username:String): Call = {
      
      Call("GET", "/" + "api/games/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:14
    def exportByUser(username:String): Call = {
      
      Call("GET", "/" + "games/export/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:320
    def exportOne(gameId:String): Call = {
    
      (gameId: @unchecked) match {
      
        // @LINE:320
        case (gameId)  =>
          
          Call("GET", "/" + "game/export/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId))
      
      }
    
    }
  
    // @LINE:208
    def delete(gameId:String): Call = {
      
      Call("POST", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/delete")
    }
  
    // @LINE:13
    def exportByIds(): Call = {
      
      Call("POST", "/" + "games/export/_ids")
    }
  
  }

  // @LINE:214
  final class ReverseTournament {

  
    // @LINE:236
    def shields(): Call = {
      
      Call("GET", "/" + "tournament/shields")
    }
  
    // @LINE:220
    def teamBattleUpdate(id:String): Call = {
      
      Call("POST", "/" + "tournament/team-battle/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:222
    def history(freq:String, page:Int = 1): Call = {
    
      (freq: @unchecked, page: @unchecked) match {
      
        // @LINE:222
        case (freq, page) if freq == "unique" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("freq", "unique"))); _rrc
          Call("GET", "/" + "tournament/history" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
      
        // @LINE:223
        case (freq, page)  =>
          
          Call("GET", "/" + "tournament/history/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("freq", freq)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
      
      }
    
    }
  
    // @LINE:224
    def show(id:String): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:235
    def leaderboard(): Call = {
      
      Call("GET", "/" + "tournament/leaderboard")
    }
  
    // @LINE:232
    def edit(id:String): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:225
    def standing(id:String, page:Int): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/standing/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("page", page)))
    }
  
    // @LINE:217
    def create(): Call = {
      
      Call("POST", "/" + "tournament/new")
    }
  
    // @LINE:231
    def terminate(id:String): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/terminate")
    }
  
    // @LINE:215
    def featured(): Call = {
      
      Call("GET", "/" + "tournament/featured")
    }
  
    // @LINE:237
    def categShields(categ:String): Call = {
      
      Call("GET", "/" + "tournament/shields/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categ", categ)))
    }
  
    // @LINE:219
    def teamBattleEdit(id:String): Call = {
      
      Call("GET", "/" + "tournament/team-battle/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:228
    def pause(id:String): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/withdraw")
    }
  
    // @LINE:216
    def form(): Call = {
      
      Call("GET", "/" + "tournament/new")
    }
  
    // @LINE:314
    def byTeam(id:String): Call = {
      
      Call("GET", "/" + "api/team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/arena")
    }
  
    // @LINE:234
    def help(system:Option[String] = None): Call = {
      
      Call("GET", "/" + "tournament/help" + play.core.routing.queryString(List(if(system == None) None else Some(implicitly[play.api.mvc.QueryStringBindable[Option[String]]].unbind("system", system)))))
    }
  
    // @LINE:227
    def join(id:String): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/join")
    }
  
    // @LINE:230
    def teamInfo(id:String, team:String): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/team/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("team", team)))
    }
  
    // @LINE:214
    def home(): Call = {
      
      Call("GET", "/" + "tournament")
    }
  
    // @LINE:233
    def update(id:String): Call = {
      
      Call("POST", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:226
    def pageOf(id:String, userId:String): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/page-of/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userId", userId)))
    }
  
    // @LINE:573
    def apiCreate(): Call = {
      
      Call("POST", "/" + "api/tournament")
    }
  
    // @LINE:229
    def player(id:String, user:String): Call = {
      
      Call("GET", "/" + "tournament/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/player/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:218
    def teamBattleForm(teamId:String): Call = {
      
      Call("GET", "/" + "tournament/team-battle/new/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("teamId", teamId)))
    }
  
    // @LINE:221
    def calendar(): Call = {
      
      Call("GET", "/" + "tournament/calendar")
    }
  
  }

  // @LINE:335
  final class ReversePref {

  
    // @LINE:337
    def formApply(): Call = {
      
      Call("POST", "/" + "account/preferences")
    }
  
    // @LINE:338
    def verifyTitle(): Call = {
      
      Call("POST", "/" + "account/preferences/verify-title")
    }
  
    // @LINE:335
    def set(name:String): Call = {
      
      Call("POST", "/" + "pref/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:588
    def apiGet(): Call = {
      
      Call("GET", "/" + "api/account/preferences")
    }
  
    // @LINE:336
    def form(categ:String): Call = {
      
      Call("GET", "/" + "account/preferences/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categ", categ)))
    }
  
  }

  // @LINE:136
  final class ReverseRelay {

  
    // @LINE:136
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "broadcast" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:138
    def create(): Call = {
      
      Call("POST", "/" + "broadcast/new")
    }
  
    // @LINE:142
    def update(slug:String, id:String): Call = {
      
      Call("POST", "/" + "broadcast/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:145
    def push(slug:String, id:String): Call = {
      
      Call("POST", "/" + "broadcast/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/push")
    }
  
    // @LINE:137
    def form(): Call = {
      
      Call("GET", "/" + "broadcast/new")
    }
  
    // @LINE:140
    def chapter(slug:String, id:String, chapterId:String): Call = {
      
      Call("GET", "/" + "broadcast/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("chapterId", chapterId))
    }
  
    // @LINE:141
    def edit(slug:String, id:String): Call = {
      
      Call("GET", "/" + "broadcast/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:139
    def show(slug:String, id:String): Call = {
      
      Call("GET", "/" + "broadcast/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:597
    def apiIndex(): Call = {
      
      Call("GET", "/" + "api/broadcast")
    }
  
    // @LINE:144
    def cloneRelay(slug:String, id:String): Call = {
      
      Call("POST", "/" + "broadcast/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/clone")
    }
  
    // @LINE:143
    def reset(slug:String, id:String): Call = {
      
      Call("POST", "/" + "broadcast/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/reset")
    }
  
  }

  // @LINE:447
  final class ReverseForumTopic {

  
    // @LINE:451
    def close(categSlug:String, slug:String): Call = {
      
      Call("POST", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/close")
    }
  
    // @LINE:452
    def hide(categSlug:String, slug:String): Call = {
      
      Call("POST", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/hide")
    }
  
    // @LINE:449
    def participants(topicId:String): Call = {
      
      Call("GET", "/" + "forum/participants/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("topicId", topicId)))
    }
  
    // @LINE:453
    def sticky(categSlug:String, slug:String): Call = {
      
      Call("POST", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + "/sticky")
    }
  
    // @LINE:448
    def create(categSlug:String): Call = {
      
      Call("POST", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/new")
    }
  
    // @LINE:450
    def show(categSlug:String, slug:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:447
    def form(categSlug:String): Call = {
      
      Call("GET", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categSlug", categSlug)) + "/form")
    }
  
  }

  // @LINE:396
  final class ReverseMod {

  
    // @LINE:401
    def warn(username:String, subject:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/warn" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("subject", subject)))))
    }
  
    // @LINE:399
    def troll(username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/troll/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:430
    def singleIpBan(v:Boolean, ip:String): Call = {
      
      Call("POST", "/" + "mod/ip/ban/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ip", ip)))
    }
  
    // @LINE:423
    def publicChat(): Call = {
      
      Call("GET", "/" + "mod/public-chat")
    }
  
    // @LINE:411
    def impersonate(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/impersonate")
    }
  
    // @LINE:414
    def refreshUserAssess(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/refreshUserAssess")
    }
  
    // @LINE:418
    def gamifyPeriod(period:String): Call = {
      
      Call("GET", "/" + "mod/leaderboard/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("period", period)))
    }
  
    // @LINE:407
    def communicationPublic(username:String): Call = {
      
      Call("GET", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/communication")
    }
  
    // @LINE:432
    def presetsUpdate(group:String): Call = {
      
      Call("POST", "/" + "mod/presets/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("group", group)))
    }
  
    // @LINE:433
    def eventStream(): Call = {
      
      Call("GET", "/" + "api/stream/mod")
    }
  
    // @LINE:416
    def notifySlack(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/notify-slack")
    }
  
    // @LINE:427
    def print(fh:String): Call = {
      
      Call("GET", "/" + "mod/print/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fh", fh)))
    }
  
    // @LINE:422
    def savePermissions(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/permissions")
    }
  
    // @LINE:397
    def engine(username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/engine/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:405
    def setTitle(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/title")
    }
  
    // @LINE:406
    def spontaneousInquiry(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/inquiry")
    }
  
    // @LINE:421
    def permissions(username:String): Call = {
      
      Call("GET", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/permissions")
    }
  
    // @LINE:398
    def booster(username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/booster/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:417
    def gamify(): Call = {
      
      Call("GET", "/" + "mod/leaderboard")
    }
  
    // @LINE:404
    def reopenAccount(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/reopen")
    }
  
    // @LINE:396
    def alt(username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/alt/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:410
    def reportban(username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/reportban/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:420
    def chatUser(username:String): Call = {
      
      Call("GET", "/" + "mod/chat-user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:400
    def deletePmsAndChats(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/delete-pms-and-chats")
    }
  
    // @LINE:409
    def rankban(username:String, v:Boolean): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/rankban/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)))
    }
  
    // @LINE:402
    def disableTwoFactor(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/disable-2fa")
    }
  
    // @LINE:425
    def chatPanic(): Call = {
      
      Call("GET", "/" + "mod/chat-panic")
    }
  
    // @LINE:403
    def closeAccount(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/close")
    }
  
    // @LINE:426
    def chatPanicPost(): Call = {
      
      Call("POST", "/" + "mod/chat-panic")
    }
  
    // @LINE:415
    def setEmail(username:String): Call = {
      
      Call("POST", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/email")
    }
  
    // @LINE:412
    def log(): Call = {
      
      Call("GET", "/" + "mod/log")
    }
  
    // @LINE:419
    def search(): Call = {
      
      Call("GET", "/" + "mod/search")
    }
  
    // @LINE:424
    def emailConfirm(): Call = {
      
      Call("GET", "/" + "mod/email-confirm")
    }
  
    // @LINE:408
    def communicationPrivate(username:String): Call = {
      
      Call("GET", "/" + "mod/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/communication/private")
    }
  
    // @LINE:431
    def presets(group:String): Call = {
      
      Call("GET", "/" + "mod/presets/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("group", group)))
    }
  
    // @LINE:413
    def table(): Call = {
      
      Call("GET", "/" + "mod/table")
    }
  
    // @LINE:428
    def printBan(v:Boolean, fh:String): Call = {
      
      Call("POST", "/" + "mod/print/ban/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("v", v)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("fh", fh)))
    }
  
    // @LINE:429
    def singleIp(ip:String): Call = {
      
      Call("GET", "/" + "mod/ip/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ip", ip)))
    }
  
  }

  // @LINE:80
  final class ReversePuzzle {

  
    // @LINE:88
    def show(id:Int): Call = {
      
      Call("GET", "/" + "training/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:90
    def vote(id:Int): Call = {
      
      Call("POST", "/" + "training/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/vote")
    }
  
    // @LINE:87
    def batchSolve(): Call = {
      
      Call("POST", "/" + "training/batch")
    }
  
    // @LINE:81
    def newPuzzle(): Call = {
      
      Call("GET", "/" + "training/new")
    }
  
    // @LINE:93
    def round2(id:Int): Call = {
      
      Call("POST", "/" + "training/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/round2")
    }
  
    // @LINE:558
    def activity(): Call = {
      
      Call("GET", "/" + "api/user/puzzle-activity")
    }
  
    // @LINE:83
    def frame(): Call = {
      
      Call("GET", "/" + "training/frame")
    }
  
    // @LINE:89
    def load(id:Int): Call = {
      
      Call("GET", "/" + "training/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/load")
    }
  
    // @LINE:91
    def round(id:Int): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:91
        case (id)  =>
          
          Call("POST", "/" + "training/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/round")
      
      }
    
    }
  
    // @LINE:80
    def home(): Call = {
      
      Call("GET", "/" + "training")
    }
  
    // @LINE:82
    def daily(): Call = {
      
      Call("GET", "/" + "training/daily")
    }
  
    // @LINE:86
    def batchSelect(): Call = {
      
      Call("GET", "/" + "training/batch")
    }
  
  }

  // @LINE:713
  final class ReverseDgtCtrl {

  
    // @LINE:716
    def generateToken(): Call = {
      
      Call("POST", "/" + "dgt/config/token")
    }
  
    // @LINE:714
    def play(): Call = {
      
      Call("GET", "/" + "dgt/play")
    }
  
    // @LINE:713
    def index(): Call = {
      
      Call("GET", "/" + "dgt")
    }
  
    // @LINE:715
    def config(): Call = {
      
      Call("GET", "/" + "dgt/config")
    }
  
  }

  // @LINE:205
  final class ReverseAnalyse {

  
    // @LINE:318
    def requestAnalysis(gameId:String): Call = {
      
      Call("POST", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/request-analysis")
    }
  
    // @LINE:205
    def embed(gameId:String, color:String): Call = {
    
      (gameId: @unchecked, color: @unchecked) match {
      
        // @LINE:205
        case (gameId, color) if color == "white" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("color", "white"))); _rrc
          Call("GET", "/" + "embed/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId))
      
        // @LINE:206
        case (gameId, color)  =>
          
          Call("GET", "/" + "embed/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("color", color))
      
      }
    
    }
  
  }

  // @LINE:736
  final class ReverseOptions {

  
    // @LINE:736
    def root(): Call = {
      
      Call("OPTIONS", "/")
    }
  
    // @LINE:737
    def all(url:String): Call = {
      
      Call("OPTIONS", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("url", url))
    }
  
  }

  // @LINE:46
  final class ReverseUser {

  
    // @LINE:54
    def show(username:String): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)))
    }
  
    // @LINE:564
    def apiWriteNote(name:String): Call = {
      
      Call("POST", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/note")
    }
  
    // @LINE:53
    def games(username:String, filterName:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("filterName", filterName)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:565
    def ratingHistory(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/rating-history")
    }
  
    // @LINE:50
    def tv(username:String): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/tv")
    }
  
    // @LINE:51
    def perfStat(username:String, perfKey:String): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/perf/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("perfKey", perfKey)))
    }
  
    // @LINE:60
    def online(): Call = {
      
      Call("GET", "/" + "player/online")
    }
  
    // @LINE:58
    def topNb(nb:Int, perfKey:String): Call = {
      
      Call("GET", "/" + "player/top/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("nb", nb)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("perfKey", perfKey)))
    }
  
    // @LINE:55
    def myself(): Call = {
      
      Call("GET", "/" + "player/myself")
    }
  
    // @LINE:46
    def mod(username:String): Call = {
      
      Call("GET", "/" + "api/stream/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/mod")
    }
  
    // @LINE:566
    def tvExport(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/current-game")
    }
  
    // @LINE:49
    def showMini(username:String): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/mini")
    }
  
    // @LINE:47
    def writeNote(username:String): Call = {
      
      Call("POST", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/note")
    }
  
    // @LINE:734
    def redirect(username:String): Call = {
      
      Call("GET", "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("username", username))
    }
  
    // @LINE:52
    def gamesAll(username:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "@/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/all" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:56
    def opponents(): Call = {
      
      Call("GET", "/" + "player/opponents")
    }
  
    // @LINE:57
    def list(): Call = {
      
      Call("GET", "/" + "player")
    }
  
    // @LINE:61
    def autocomplete(): Call = {
      
      Call("GET", "/" + "player/autocomplete")
    }
  
    // @LINE:59
    def topWeek(): Call = {
      
      Call("GET", "/" + "player/top/week")
    }
  
    // @LINE:48
    def deleteNote(id:String): Call = {
      
      Call("POST", "/" + "note/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:436
  final class ReverseIrwin {

  
    // @LINE:436
    def dashboard(): Call = {
      
      Call("GET", "/" + "irwin")
    }
  
    // @LINE:438
    def eventStream(): Call = {
      
      Call("GET", "/" + "api/stream/irwin")
    }
  
    // @LINE:437
    def saveReport(): Call = {
      
      Call("POST", "/" + "irwin/report")
    }
  
  }

  // @LINE:264
  final class ReverseSimul {

  
    // @LINE:268
    def show(id:String): Call = {
      
      Call("GET", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:275
    def abort(id:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/abort")
    }
  
    // @LINE:276
    def join(id:String, variant:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/join/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("variant", variant)))
    }
  
    // @LINE:269
    def edit(id:String): Call = {
      
      Call("GET", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:266
    def create(): Call = {
      
      Call("POST", "/" + "simul/new")
    }
  
    // @LINE:274
    def start(id:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/start")
    }
  
    // @LINE:265
    def form(): Call = {
      
      Call("GET", "/" + "simul/new")
    }
  
    // @LINE:273
    def reject(id:String, user:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/reject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:267
    def homeReload(): Call = {
      
      Call("GET", "/" + "simul/reload")
    }
  
    // @LINE:577
    def apiList(): Call = {
      
      Call("GET", "/" + "api/simul")
    }
  
    // @LINE:264
    def home(): Call = {
      
      Call("GET", "/" + "simul")
    }
  
    // @LINE:272
    def accept(id:String, user:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/accept/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("user", user)))
    }
  
    // @LINE:270
    def update(id:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/edit")
    }
  
    // @LINE:277
    def withdraw(id:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/withdraw")
    }
  
    // @LINE:271
    def hostPing(id:String): Call = {
      
      Call("POST", "/" + "simul/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id) + "/host-ping")
    }
  
  }

  // @LINE:444
  final class ReverseForumCateg {

  
    // @LINE:446
    def show(slug:String, page:Int = 1): Call = {
      
      Call("GET", "/" + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)) + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:444
    def index(): Call = {
      
      Call("GET", "/" + "forum")
    }
  
  }

  // @LINE:162
  final class ReverseMain {

  
    // @LINE:672
    def lag(): Call = {
      
      Call("GET", "/" + "lag")
    }
  
    // @LINE:670
    def webmasters(): Call = {
      
      Call("GET", "/" + "developers")
    }
  
    // @LINE:520
    def image(id:String, hash:String, name:String): Call = {
      
      Call("GET", "/" + "image/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("hash", hash)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:722
    def jslog(id:String): Call = {
      
      Call("POST", "/" + "jslog/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:673
    def getFishnet(): Call = {
      
      Call("GET", "/" + "get-fishnet")
    }
  
    // @LINE:669
    def captchaCheck(id:String): Call = {
      
      Call("GET", "/" + "captcha/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:700
    def legacyQaQuestion(id:Int, slug:String): Call = {
      
      Call("GET", "/" + "qa/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("slug", slug)))
    }
  
    // @LINE:671
    def mobile(): Call = {
      
      Call("GET", "/" + "mobile")
    }
  
    // @LINE:675
    def verifyTitle(): Call = {
      
      Call("GET", "/" + "verify-title")
    }
  
    // @LINE:732
    def robots(): Call = {
      
      Call("GET", "/" + "robots.txt")
    }
  
    // @LINE:695
    def faq(): Call = {
      
      Call("GET", "/" + "faq")
    }
  
    // @LINE:674
    def costs(): Call = {
      
      Call("GET", "/" + "costs")
    }
  
    // @LINE:162
    def movedPermanently(to:String): Call = {
    
      (to: @unchecked) match {
      
        // @LINE:162
        case (to) if to == "/patron" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "/patron"))); _rrc
          Call("GET", "/" + "donate")
      
        // @LINE:697
        case (to) if to == "/faq" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "/faq"))); _rrc
          Call("GET", "/" + "qa")
      
        // @LINE:698
        case (to) if to == "/contact" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "/contact"))); _rrc
          Call("GET", "/" + "help")
      
        // @LINE:725
        case (to) if to == "https://shop.spreadshirt.com/lichess-org" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "https://shop.spreadshirt.com/lichess-org"))); _rrc
          Call("GET", "/" + "swag")
      
        // @LINE:726
        case (to) if to == "https://www.youtube.com/channel/UCr6RfQga70yMM9-nuzAYTsA" =>
          implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("to", "https://www.youtube.com/channel/UCr6RfQga70yMM9-nuzAYTsA"))); _rrc
          Call("GET", "/" + "yt")
      
      }
    
    }
  
    // @LINE:731
    def manifest(): Call = {
      
      Call("GET", "/" + "manifest.json")
    }
  
    // @LINE:676
    def instantChess(): Call = {
      
      Call("GET", "/" + "InstantChess.com")
    }
  
    // @LINE:694
    def contact(): Call = {
      
      Call("GET", "/" + "contact")
    }
  
    // @LINE:723
    def jsmon(event:String): Call = {
      
      Call("POST", "/" + "jsmon/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("event", event)))
    }
  
    // @LINE:677
    def dailyPuzzleSlackApp(): Call = {
      
      Call("GET", "/" + "daily-puzzle-slack")
    }
  
    // @LINE:719
    def toggleBlindMode(): Call = {
      
      Call("POST", "/" + "toggle-blind-mode")
    }
  
    // @LINE:728
    def devAsset(v:String, file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "public"))); _rrc
      Call("GET", "/" + "assets/_" + implicitly[play.api.mvc.PathBindable[String]].unbind("v", v) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:533
  final class ReverseReport {

  
    // @LINE:540
    def process(id:String): Call = {
      
      Call("POST", "/" + "report/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/process")
    }
  
    // @LINE:535
    def flag(): Call = {
      
      Call("POST", "/" + "report/flag")
    }
  
    // @LINE:541
    def xfiles(id:String): Call = {
      
      Call("POST", "/" + "report/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/xfiles")
    }
  
    // @LINE:534
    def create(): Call = {
      
      Call("POST", "/" + "report")
    }
  
    // @LINE:538
    def listWithFilter(room:String): Call = {
      
      Call("GET", "/" + "report/list/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("room", room)))
    }
  
    // @LINE:536
    def thanks(reported:String): Call = {
      
      Call("GET", "/" + "report/thanks" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("reported", reported)))))
    }
  
    // @LINE:542
    def currentCheatInquiry(username:String): Call = {
      
      Call("GET", "/" + "report/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/cheat-inquiry")
    }
  
    // @LINE:533
    def form(): Call = {
      
      Call("GET", "/" + "report")
    }
  
    // @LINE:539
    def inquiry(id:String): Call = {
      
      Call("POST", "/" + "report/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/inquiry")
    }
  
    // @LINE:537
    def list(): Call = {
      
      Call("GET", "/" + "report/list")
    }
  
  }

  // @LINE:17
  final class ReverseTv {

  
    // @LINE:23
    def games(): Call = {
      
      Call("GET", "/" + "games")
    }
  
    // @LINE:21
    def onChannel(chanKey:String): Call = {
      
      Call("GET", "/" + "tv/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("chanKey", chanKey)))
    }
  
    // @LINE:19
    def feed(): Call = {
      
      Call("GET", "/" + "tv/feed")
    }
  
    // @LINE:18
    def frame(): Call = {
      
      Call("GET", "/" + "tv/frame")
    }
  
    // @LINE:22
    def sides(gameId:String, color:String): Call = {
      
      Call("GET", "/" + "tv/" + implicitly[play.api.mvc.PathBindable[String]].unbind("gameId", gameId) + "/" + implicitly[play.api.mvc.PathBindable[String]].unbind("color", color) + "/sides")
    }
  
    // @LINE:24
    def gamesChannel(chanKey:String): Call = {
      
      Call("GET", "/" + "games/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("chanKey", chanKey)))
    }
  
    // @LINE:17
    def index(): Call = {
      
      Call("GET", "/" + "tv")
    }
  
    // @LINE:20
    def channels(): Call = {
      
      Call("GET", "/" + "tv/channels")
    }
  
  }

  // @LINE:10
  final class ReverseSearch {

  
    // @LINE:10
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "games/search" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:553
  final class ReverseStat {

  
    // @LINE:553
    def ratingDistribution(perf:String): Call = {
      
      Call("GET", "/" + "stat/rating/distribution/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("perf", perf)))
    }
  
  }

  // @LINE:556
  final class ReverseApi {

  
    // @LINE:560
    def user(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:567
    def game(id:String): Call = {
      
      Call("GET", "/" + "api/game/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:569
    def tournament(id:String): Call = {
      
      Call("GET", "/" + "api/tournament/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:582
    def eventStream(): Call = {
      
      Call("GET", "/" + "api/stream/event")
    }
  
    // @LINE:580
    def crosstable(u1:String, u2:String): Call = {
      
      Call("GET", "/" + "api/crosstable/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("u1", u1)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("u2", u2)))
    }
  
    // @LINE:575
    def swissGames(id:String): Call = {
      
      Call("GET", "/" + "api/swiss/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/games")
    }
  
    // @LINE:572
    def tournamentTeams(id:String): Call = {
      
      Call("GET", "/" + "api/tournament/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/teams")
    }
  
    // @LINE:568
    def currentTournaments(): Call = {
      
      Call("GET", "/" + "api/tournament")
    }
  
    // @LINE:571
    def tournamentResults(id:String): Call = {
      
      Call("GET", "/" + "api/tournament/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/results")
    }
  
    // @LINE:557
    def usersByIds(): Call = {
      
      Call("POST", "/" + "api/users")
    }
  
    // @LINE:561
    def activity(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/activity")
    }
  
    // @LINE:581
    def gamesByUsersStream(): Call = {
      
      Call("POST", "/" + "api/stream/games-by-users")
    }
  
    // @LINE:576
    def swissResults(id:String): Call = {
      
      Call("GET", "/" + "api/swiss/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/results")
    }
  
    // @LINE:579
    def usersStatus(): Call = {
      
      Call("GET", "/" + "api/users/status")
    }
  
    // @LINE:559
    def tournamentsByOwner(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/tournament/created")
    }
  
    // @LINE:578
    def status(): Call = {
      
      Call("GET", "/" + "api/status")
    }
  
    // @LINE:596
    def cloudEval(): Call = {
      
      Call("GET", "/" + "api/cloud-eval")
    }
  
    // @LINE:556
    def index(): Call = {
      
      Call("GET", "/" + "api")
    }
  
    // @LINE:603
    def userGames(name:String): Call = {
      
      Call("GET", "/" + "api/user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + "/games")
    }
  
    // @LINE:570
    def tournamentGames(id:String): Call = {
      
      Call("GET", "/" + "api/tournament/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/games")
    }
  
  }

  // @LINE:240
  final class ReverseTournamentCrud {

  
    // @LINE:240
    def index(page:Int = 1): Call = {
      
      Call("GET", "/" + "tournament/manager" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:242
    def edit(id:String): Call = {
      
      Call("GET", "/" + "tournament/manager/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:245
    def create(): Call = {
      
      Call("POST", "/" + "tournament/manager")
    }
  
    // @LINE:241
    def cloneT(id:String): Call = {
      
      Call("GET", "/" + "tournament/manager/clone/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
    // @LINE:244
    def form(): Call = {
      
      Call("GET", "/" + "tournament/manager/new")
    }
  
    // @LINE:243
    def update(id:String): Call = {
      
      Call("POST", "/" + "tournament/manager/" + implicitly[play.api.mvc.PathBindable[String]].unbind("id", id))
    }
  
  }

  // @LINE:361
  final class ReverseNotify {

  
    // @LINE:361
    def recent(page:Int = 1): Call = {
      
      Call("GET", "/" + "notify" + play.core.routing.queryString(List(if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
  }

  // @LINE:651
  final class ReverseOAuthApp {

  
    // @LINE:657
    def revoke(id:String): Call = {
      
      Call("POST", "/" + "account/oauth/app/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/revoke")
    }
  
    // @LINE:654
    def edit(id:String): Call = {
      
      Call("GET", "/" + "account/oauth/app/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:652
    def create(): Call = {
      
      Call("GET", "/" + "account/oauth/app/create")
    }
  
    // @LINE:653
    def createApply(): Call = {
      
      Call("POST", "/" + "account/oauth/app/create")
    }
  
    // @LINE:656
    def delete(id:String): Call = {
      
      Call("POST", "/" + "account/oauth/app/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/delete")
    }
  
    // @LINE:655
    def update(id:String): Call = {
      
      Call("POST", "/" + "account/oauth/app/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/edit")
    }
  
    // @LINE:651
    def index(): Call = {
      
      Call("GET", "/" + "account/oauth/app")
    }
  
  }

  // @LINE:680
  final class ReverseDev {

  
    // @LINE:680
    def cli(): Call = {
      
      Call("GET", "/" + "dev/cli")
    }
  
    // @LINE:681
    def cliPost(): Call = {
      
      Call("POST", "/" + "dev/cli")
    }
  
    // @LINE:684
    def settingsPost(id:String): Call = {
      
      Call("POST", "/" + "dev/settings/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:682
    def command(): Call = {
      
      Call("POST", "/" + "cli")
    }
  
    // @LINE:683
    def settings(): Call = {
      
      Call("GET", "/" + "dev/settings")
    }
  
  }

  // @LINE:364
  final class ReverseVideo {

  
    // @LINE:367
    def show(id:String): Call = {
      
      Call("GET", "/" + "video/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:365
    def tags(): Call = {
      
      Call("GET", "/" + "video/tags")
    }
  
    // @LINE:366
    def author(author:String): Call = {
      
      Call("GET", "/" + "video/author/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("author", author)))
    }
  
    // @LINE:364
    def index(): Call = {
      
      Call("GET", "/" + "video")
    }
  
  }

  // @LINE:583
  final class ReverseAccount {

  
    // @LINE:642
    def signout(sessionId:String): Call = {
      
      Call("POST", "/" + "account/signout/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("sessionId", sessionId)))
    }
  
    // @LINE:583
    def apiMe(): Call = {
      
      Call("GET", "/" + "api/account")
    }
  
    // @LINE:631
    def kidPost(): Call = {
      
      Call("POST", "/" + "account/kid")
    }
  
    // @LINE:628
    def username(): Call = {
      
      Call("GET", "/" + "account/username")
    }
  
    // @LINE:620
    def email(): Call = {
      
      Call("GET", "/" + "account/email")
    }
  
    // @LINE:638
    def reopenLogin(token:String): Call = {
      
      Call("GET", "/" + "account/reopen/login/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
    // @LINE:633
    def setupTwoFactor(): Call = {
      
      Call("POST", "/" + "account/twofactor/setup")
    }
  
    // @LINE:621
    def emailApply(): Call = {
      
      Call("POST", "/" + "account/email")
    }
  
    // @LINE:584
    def apiNowPlaying(): Call = {
      
      Call("GET", "/" + "api/account/playing")
    }
  
    // @LINE:637
    def reopenSent(email:String): Call = {
      
      Call("GET", "/" + "account/reopen/sent/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("email", email)))
    }
  
    // @LINE:626
    def profile(): Call = {
      
      Call("GET", "/" + "account/profile")
    }
  
    // @LINE:644
    def nowPlaying(): Call = {
      
      Call("GET", "/" + "account/now-playing")
    }
  
    // @LINE:619
    def passwdApply(): Call = {
      
      Call("POST", "/" + "account/passwd")
    }
  
    // @LINE:641
    def security(): Call = {
      
      Call("GET", "/" + "account/security")
    }
  
    // @LINE:624
    def close(): Call = {
      
      Call("GET", "/" + "account/close")
    }
  
    // @LINE:630
    def kid(): Call = {
      
      Call("GET", "/" + "account/kid")
    }
  
    // @LINE:585
    def apiEmail(): Call = {
      
      Call("GET", "/" + "api/account/email")
    }
  
    // @LINE:587
    def apiKidPost(): Call = {
      
      Call("POST", "/" + "api/account/kid")
    }
  
    // @LINE:632
    def twoFactor(): Call = {
      
      Call("GET", "/" + "account/twofactor")
    }
  
    // @LINE:622
    def emailConfirmHelp(): Call = {
      
      Call("GET", "/" + "contact/email-confirm/help")
    }
  
    // @LINE:618
    def passwd(): Call = {
      
      Call("GET", "/" + "account/passwd")
    }
  
    // @LINE:634
    def disableTwoFactor(): Call = {
      
      Call("POST", "/" + "account/twofactor/disable")
    }
  
    // @LINE:639
    def data(): Call = {
      
      Call("GET", "/" + "account/personal-data")
    }
  
    // @LINE:629
    def usernameApply(): Call = {
      
      Call("POST", "/" + "account/username")
    }
  
    // @LINE:586
    def apiKid(): Call = {
      
      Call("GET", "/" + "api/account/kid")
    }
  
    // @LINE:625
    def closeConfirm(): Call = {
      
      Call("POST", "/" + "account/closeConfirm")
    }
  
    // @LINE:636
    def reopenApply(): Call = {
      
      Call("POST", "/" + "account/reopen/send")
    }
  
    // @LINE:635
    def reopen(): Call = {
      
      Call("GET", "/" + "account/reopen")
    }
  
    // @LINE:643
    def info(): Call = {
      
      Call("GET", "/" + "account/info")
    }
  
    // @LINE:627
    def profileApply(): Call = {
      
      Call("POST", "/" + "account/profile")
    }
  
    // @LINE:623
    def emailConfirm(token:String): Call = {
      
      Call("GET", "/" + "account/email/confirm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("token", token)))
    }
  
  }

  // @LINE:148
  final class ReverseLearn {

  
    // @LINE:149
    def score(): Call = {
      
      Call("POST", "/" + "learn/score")
    }
  
    // @LINE:148
    def index(): Call = {
      
      Call("GET", "/" + "learn")
    }
  
    // @LINE:150
    def reset(): Call = {
      
      Call("POST", "/" + "learn/reset")
    }
  
  }


}
