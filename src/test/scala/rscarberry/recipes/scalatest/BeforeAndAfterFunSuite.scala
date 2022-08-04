package rscarberry.recipes.scalatest

import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll}
import org.scalatest.funsuite.AnyFunSuite

/**
 * Demonstrates the before and after test fixtures.
 */
class BeforeAndAfterFunSuite extends AnyFunSuite
  with BeforeAndAfter {

  var listToTest: List[String] = Nil

  // This fixture is run before each test.
  before {
    println("Initializing listToTest!")
    listToTest = "this is my list".split(" ").toList
  }

  test("test list length") {
    assert(listToTest.size == 4)
  }

  test("test list contains the word my") {
    assert(listToTest.contains("my"))
  }

  // And this fixture is performed after each test.
  after {
    println("In the after clause!")
  }
}
