import utest._
import scala.util.{
  Try, Success, Failure
}

object misc extends TestSuite {

  val tests = Tests {
    // this leads to a runtime error in utest under Scala 3.0.0-M3
    test("direct1") { // runtime error: java.lang.ClassCastException: class scala.None$ cannot be cast to class scala.Some
      (None: Option[Int]) match {
        case Some(a) =>
        case None =>
      }
    }
    test("direct2") { // works
      (None: Option[Int]) match {
        case None =>
        case Some(a) =>
      }
    }
    test("direct3") { // works
      (Some(1): Option[Int]) match {
        case Some(a) =>
        case None =>
      }
    }
    test("direct4") { // works
      (Some(1): Option[Int]) match {
        case None =>
        case Some(a) =>
      }
    }
    test("indirect") { // works
      runTest()
    }
  }

  def runTest() = {
    (None: Option[Int]) match {
      case Some(a) =>
      case None =>
    }
  }

}
