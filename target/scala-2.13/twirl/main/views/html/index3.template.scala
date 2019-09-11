
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

object index3 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="x-ua-compatible" content="ie=edge">

        <title>AdminLTE 3 | Dashboard 3</title>

            <!-- Font Awesome Icons -->
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.at("plugins/fontawesome-free/css/all.min.css")),format.raw/*13.99*/("""">
            <!-- IonIcons -->
        <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
            <!-- Theme style -->
        <link rel="stylesheet" href=""""),_display_(/*17.39*/routes/*17.45*/.Assets.at("stylesheets/adminlte.min.css")),format.raw/*17.87*/("""">
            <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
    </head>
        <!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to to the body tag
to get the desired effect
|---------------------------------------------------------|
|LAYOUT OPTIONS | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
                <!-- Navbar -->
            <nav class="main-header navbar navbar-expand navbar-white navbar-light">
                    <!-- Left navbar links -->
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
                    </li>
                    <li class="nav-item d-none d-sm-inline-block">
                        <a href="index3.scala.html" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item d-none d-sm-inline-block">
                        <a href="#" class="nav-link">Contact</a>
                    </li>
                </ul>

                    <!-- SEARCH FORM -->
                <form class="form-inline ml-3">
                    <div class="input-group input-group-sm">
                        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
                        <div class="input-group-append">
                            <button class="btn btn-navbar" type="submit">
                                <i class="fas fa-search"></i>
                            </button>
                        </div>
                    </div>
                </form>

                    <!-- Right navbar links -->
                <ul class="navbar-nav ml-auto">
                        <!-- Messages Dropdown Menu -->
                    <li class="nav-item dropdown">
                        <a class="nav-link" data-toggle="dropdown" href="#">
                            <i class="far fa-comments"></i>
                            <span class="badge badge-danger navbar-badge">3</span>
                        </a>
                        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                            <a href="#" class="dropdown-item">
                                    <!-- Message Start -->
                                <div class="media">
                                    <img src=""""),_display_(/*72.48*/routes/*72.54*/.Assets.at("images/user1-128x128.jpg")),format.raw/*72.92*/("""" alt="User Avatar" class="img-size-50 mr-3 img-circle">
                                    <div class="media-body">
                                        <h3 class="dropdown-item-title">
                  Brad Diesel
                                            <span class="float-right text-sm text-danger"><i class="fas fa-star"></i></span>
                                        </h3>
                                        <p class="text-sm">Call me whenever you can...</p>
                                        <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                                    </div>
                                </div>
                                    <!-- Message End -->
                            </a>
                            <div class="dropdown-divider"></div>
                            <a href="#" class="dropdown-item">
                                    <!-- Message Start -->
                                <div class="media">
                                    <img src=""""),_display_(/*88.48*/routes/*88.54*/.Assets.at("images/user8-128x128.jpg")),format.raw/*88.92*/("""" alt="User Avatar" class="img-size-50 img-circle mr-3">
                                    <div class="media-body">
                                        <h3 class="dropdown-item-title">
                  John Pierce
                                            <span class="float-right text-sm text-muted"><i class="fas fa-star"></i></span>
                                        </h3>
                                        <p class="text-sm">I got your message bro</p>
                                        <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                                    </div>
                                </div>
                                    <!-- Message End -->
                            </a>
                            <div class="dropdown-divider"></div>
                            <a href="#" class="dropdown-item">
                                    <!-- Message Start -->
                                <div class="media">
                                    <img src=""""),_display_(/*104.48*/routes/*104.54*/.Assets.at("images/user3-128x128.jpg")),format.raw/*104.92*/("""" alt="User Avatar" class="img-size-50 img-circle mr-3">
                                    <div class="media-body">
                                        <h3 class="dropdown-item-title">
                  Nora Silvester
                                            <span class="float-right text-sm text-warning"><i class="fas fa-star"></i></span>
                                        </h3>
                                        <p class="text-sm">The subject goes here</p>
                                        <p class="text-sm text-muted"><i class="far fa-clock mr-1"></i> 4 Hours Ago</p>
                                    </div>
                                </div>
                                    <!-- Message End -->
                            </a>
                            <div class="dropdown-divider"></div>
                            <a href="#" class="dropdown-item dropdown-footer">See All Messages</a>
                        </div>
                    </li>
                        <!-- Notifications Dropdown Menu -->
                    <li class="nav-item dropdown">
                        <a class="nav-link" data-toggle="dropdown" href="#">
                            <i class="far fa-bell"></i>
                            <span class="badge badge-warning navbar-badge">15</span>
                        </a>
                        <div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
                            <span class="dropdown-item dropdown-header">15 Notifications</span>
                            <div class="dropdown-divider"></div>
                            <a href="#" class="dropdown-item">
                                <i class="fas fa-envelope mr-2"></i> 4 new messages
                                <span class="float-right text-muted text-sm">3 mins</span>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a href="#" class="dropdown-item">
                                <i class="fas fa-users mr-2"></i> 8 friend requests
                                <span class="float-right text-muted text-sm">12 hours</span>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a href="#" class="dropdown-item">
                                <i class="fas fa-file mr-2"></i> 3 new reports
                                <span class="float-right text-muted text-sm">2 days</span>
                            </a>
                            <div class="dropdown-divider"></div>
                            <a href="#" class="dropdown-item dropdown-footer">See All Notifications</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#"><i
                        class="fas fa-th-large"></i>
                        </a>
                    </li>
                </ul>
            </nav>
                <!-- /.navbar -->

                <!-- Main Sidebar Container -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                    <!-- Brand Logo -->
                <a href="index3.scala.html" class="brand-link">
                    <img src=""""),_display_(/*160.32*/routes/*160.38*/.Assets.at("images/AdminLTELogo.png")),format.raw/*160.75*/("""" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                    style="opacity: .8">
                    <span class="brand-text font-weight-light">AdminLTE 3</span>
                </a>

                    <!-- Sidebar -->
                <div class="sidebar">
                        <!-- Sidebar user panel (optional) -->
                    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                        <div class="image">
                            <img src=""""),_display_(/*170.40*/routes/*170.46*/.Assets.at("images/user2-160x160.jpg")),format.raw/*170.84*/("""" class="img-circle elevation-2" alt="User Image">
                        </div>
                        <div class="info">
                            <a href="#" class="d-block">Alexander Pierce</a>
                        </div>
                    </div>

                        <!-- Sidebar Menu -->
                    <nav class="mt-2">
                        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                                <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
                            <li class="nav-item has-treeview menu-open">
                                <a href="#" class="nav-link active">
                                    <i class="nav-icon fas fa-tachometer-alt"></i>
                                    <p>
                Dashboard
                                        <i class="right fas fa-angle-left"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="./index.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Dashboard v1</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="./index2.html" class="nav-link">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Dashboard v2</p>
                                        </a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="index3.scala.html" class="nav-link active">
                                            <i class="far fa-circle nav-icon"></i>
                                            <p>Dashboard v3</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </nav>
                        <!-- /.sidebar-menu -->
                </div>
                    <!-- /.sidebar -->
            </aside>

                <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1 class="m-0 text-dark">Dashboard v3</h1>
                            </div>
                                <!-- /.col -->
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                                    <li class="breadcrumb-item active">Dashboard v3</li>
                                </ol>
                            </div>
                                <!-- /.col -->
                        </div>
                            <!-- /.row -->
                    </div>
                        <!-- /.container-fluid -->
                </div>
                    <!-- /.content-header -->

                    <!-- Main content -->
                <div class="content">
                    <div class="container-fluid">
                        
                    </div>
                        <!-- /.container-fluid -->
                </div>
                    <!-- /.content -->
            </div>
                <!-- /.content-wrapper -->

                <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                    <!-- Control sidebar content goes here -->
            </aside>
                <!-- /.control-sidebar -->

                <!-- Main Footer -->
            <footer class="main-footer">
                <strong>Copyright &copy; 2014-2019 <a href="http://adminlte.io">AdminLTE.io</a>.</strong>
                All rights reserved.
                <div class="float-right d-none d-sm-inline-block">
                    <b>Version</b> 3.0.0-rc.1
                </div>
            </footer>
        </div>
            <!-- ./wrapper -->

            <!-- REQUIRED SCRIPTS -->

            <!-- jQuery -->
        <script src=""""),_display_(/*273.23*/routes/*273.29*/.Assets.at("plugins/jquery/jquery.min.js")),format.raw/*273.71*/(""""></script>
            <!-- Bootstrap -->
        <script src=""""),_display_(/*275.23*/routes/*275.29*/.Assets.at("plugins/bootstrap/js/bootstrap.bundle.min.js")),format.raw/*275.87*/(""""></script>
            <!-- AdminLTE -->
        <script src=""""),_display_(/*277.23*/routes/*277.29*/.Assets.at("javascripts/adminlte.js")),format.raw/*277.66*/(""""></script>

            <!-- OPTIONAL SCRIPTS -->
        <script src=""""),_display_(/*280.23*/routes/*280.29*/.Assets.at("plugins/chart.js/Chart.min.js")),format.raw/*280.72*/(""""></script>
        <script src=""""),_display_(/*281.23*/routes/*281.29*/.Assets.at("javascripts/demo.js")),format.raw/*281.62*/(""""></script>
        <script src=""""),_display_(/*282.23*/routes/*282.29*/.Assets.at("javascripts/pages/dashboard3.js")),format.raw/*282.74*/(""""></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-09-11T08:04:02.761
                  SOURCE: C:/Users/daniel.moreno/proyecto/admin-lte-3.0-play-framework/app/views/index3.scala.html
                  HASH: 1eb9b1a08dd63433651509eda049164167fb0260
                  MATRIX: 942->1|1038->4|1065->5|1434->347|1449->353|1524->407|1761->617|1776->623|1839->665|4588->3387|4603->3393|4662->3431|5750->4492|5765->4498|5824->4536|6907->5591|6923->5597|6983->5635|10367->8991|10383->8997|10442->9034|10967->9531|10983->9537|11043->9575|15873->14377|15889->14383|15953->14425|16046->14490|16062->14496|16142->14554|16234->14618|16250->14624|16309->14661|16410->14734|16426->14740|16491->14783|16553->14817|16569->14823|16624->14856|16686->14890|16702->14896|16769->14941
                  LINES: 28->1|33->2|34->3|44->13|44->13|44->13|48->17|48->17|48->17|103->72|103->72|103->72|119->88|119->88|119->88|135->104|135->104|135->104|191->160|191->160|191->160|201->170|201->170|201->170|304->273|304->273|304->273|306->275|306->275|306->275|308->277|308->277|308->277|311->280|311->280|311->280|312->281|312->281|312->281|313->282|313->282|313->282
                  -- GENERATED --
              */
          