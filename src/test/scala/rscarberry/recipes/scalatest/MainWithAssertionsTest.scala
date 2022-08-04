package rscarberry.recipes.scalatest

import org.scalatest.Assertions._
import org.scalatest.exceptions.TestFailedException

/**
 * Demonstrates using scalatest assertions with no testring style. This is NOT
 * the preferred way of testing, but it's here for demonstration.
 *
 * This is NOT run by 'sbt test'
 */
object MainWithAssertionsTest extends App {

  val s1 = "hello"
  val s2 = "Hello"

  assert(s1 != s2)
  assert(s1.toLowerCase == s2.toLowerCase)

  try {
    assertResult("HELLO") {
      s1.toLowerCase
    }
  } catch {
    case e: TestFailedException => println("Test failed!")
  }
}
