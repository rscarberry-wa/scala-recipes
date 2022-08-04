package rscarberry.recipes.scalatest

import org.scalatest.funsuite.AnyFunSuite
/**
 * Uses the basic XUnit style of testing, where tests are done using assertions in test blocks.
 */
class BasicFunSuite extends AnyFunSuite {

  test("test string equality") {
    val s1 = "hello"
    val s2 = "world"
    val s3 = s"$s1 $s2"
    assert(s3 == "hello world")
  }

  test("test ops on an array") {
    val array = Array("hello", "world")
    assert(array(0) == "hello")
    assertThrows[IndexOutOfBoundsException] {
      array(2)
    }
  }

}
