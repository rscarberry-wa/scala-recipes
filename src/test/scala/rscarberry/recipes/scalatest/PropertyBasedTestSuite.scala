package rscarberry.recipes.scalatest

import org.scalatest.matchers.should.Matchers
import org.scalatest.propspec.AnyPropSpec
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class PropertyBasedTestSuite extends AnyPropSpec
  with ScalaCheckDrivenPropertyChecks
  with Matchers {

  // One that will always pass
  property("when you add 2 strings, the result should start with the first one") {
    forAll { (s1: String, s2: String) =>
      (s1 + s2) should startWith(s1)
    }
  }

  property("the minimum and maximum of two numbers should always be one of the numbers") {
    forAll { (n1: Int, n2: Int) => {
        Seq(n1, n2) should contain(math.min(n1, n2))
        Seq(n1, n2) should contain(math.max(n1, n2))
      }
    }
  }

  // One that will fail for extremely large numbers.
  ignore /*property*/("the square root of the square of n should equal the absolute value of n") {
    forAll {(n: Double) => math.sqrt (n * n) should be (math.abs (n) )}
  }
}

