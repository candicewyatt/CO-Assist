
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object twitterBootstrapInput_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.4*/("""
"""),format.raw/*6.1*/("""<div class="form-group """),_display_(/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""error""")))}),format.raw/*6.55*/("""">
    <label for=""""),_display_(/*7.18*/elements/*7.26*/.id),format.raw/*7.29*/("""">"""),_display_(/*7.32*/elements/*7.40*/.label),format.raw/*7.46*/("""</label>
    """),_display_(/*8.6*/elements/*8.14*/.input),format.raw/*8.20*/("""
    """),format.raw/*9.5*/("""<p class="help-inline">"""),_display_(/*9.29*/elements/*9.37*/.infos.mkString(", ")),format.raw/*9.58*/("""</p>
    """),_display_(/*10.6*/if(elements.hasErrors)/*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
        """),format.raw/*11.9*/("""<p class="help-inline">"""),_display_(/*11.33*/elements/*11.41*/.errors.mkString(", ")),format.raw/*11.63*/("""</p>
    """)))}),format.raw/*12.6*/("""
"""),format.raw/*13.1*/("""</div>"""))
      }
    }
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}


}

/**/
object twitterBootstrapInput extends twitterBootstrapInput_Scope0.twitterBootstrapInput
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 11:28:13 MST 2017
                  SOURCE: C:/WebDev/workspace/COAssist/app/views/twitterBootstrapInput.scala.html
                  HASH: 3c7e121dfad20f295dc0690b42491d0ea61572d3
                  MATRIX: 791->1|918->33|948->100|976->102|1026->126|1056->148|1095->150|1131->156|1178->177|1194->185|1217->188|1246->191|1262->199|1288->205|1328->220|1344->228|1370->234|1402->240|1452->264|1468->272|1509->293|1546->304|1577->326|1617->328|1654->338|1705->362|1722->370|1765->392|1806->403|1835->405
                  LINES: 27->1|32->1|34->5|35->6|35->6|35->6|35->6|35->6|36->7|36->7|36->7|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|40->11|41->12|42->13
                  -- GENERATED --
              */
          