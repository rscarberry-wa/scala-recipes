package rscarberry.recipes.numericops

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.util.Random
import NumericOps._

class NumericOpsSpec extends AnyFlatSpec with Matchers {

  "double values within a given tolerance" should "compare as approximately equal" in {
    val random = new Random()
    val tolerance = 1.0e-6

    for (i <- 1 to 1000) {
      val a = random.nextDouble()
      val b = a + (-tolerance + 2.0*tolerance*random.nextDouble())
      assert(~=(a, b, tolerance))
    }

    assert(~=(100.0, 100.0 + tolerance, tolerance))
    assert(~=(100.0, 100.0 - tolerance, tolerance))
  }
}
