import mill._, scalalib._, scalafmt._

class ExampleModule(val crossScalaVersion: String) extends CrossScalaModule {
  object test extends Tests {
    def ivyDeps = Agg(ivy"com.lihaoyi::utest:0.7.7")
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
object example extends Cross[ExampleModule]("2.13.4", "3.0.0-M3"){

}
