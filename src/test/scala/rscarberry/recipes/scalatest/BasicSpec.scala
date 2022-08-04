package rscarberry.recipes.scalatest

import org.scalatest.flatspec.AnyFlatSpec

/**
 * Basic test using a flatspec
 */
class BasicSpec extends AnyFlatSpec {

  "An empty list" should "have size 0" in {
    assert(List.empty.size == 0)
  }

}
