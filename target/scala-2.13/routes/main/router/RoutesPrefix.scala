// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/daniel.moreno/proyecto/admin-lte-3.0-play-framework/conf/routes
// @DATE:Wed Sep 11 07:45:37 CST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
