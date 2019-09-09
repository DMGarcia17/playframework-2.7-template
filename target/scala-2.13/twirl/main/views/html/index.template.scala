
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(dato:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>
  
  <p>This is the data: """),_display_(/*6.25*/dato),format.raw/*6.29*/("""</p>
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(dato:String): play.twirl.api.HtmlFormat.Appendable = apply(dato)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (dato) => apply(dato)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-09-09T13:33:48.904
                  SOURCE: C:/Users/daniel.moreno/proyecto/admin-lte-3.0-play-framework/app/views/index.scala.html
                  HASH: bfad4bc1b171c47a1543f6299ce95e3c29ac8dd4
                  MATRIX: 948->1|1056->14|1086->19|1117->42|1156->44|1186->48|1267->103|1291->107|1327->114
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|38->6|38->6|39->7
                  -- GENERATED --
              */
          