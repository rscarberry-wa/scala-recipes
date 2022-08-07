package rscarberry.recipes.scalatest

import org.scalatest.Inspectors.forAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class InspectorMatchersSpec extends AnyFlatSpec with Matchers {

  val listOfPositiveIntLists = List(
    List(1, 2, 3),
    List(4, 5, 6),
    List(7, 8, 9)
  )

  it should "contain lists which contain ints greater than zero" in {
    forAll (listOfPositiveIntLists) { lst =>
      forAll (lst) {
        n => n should be > 0
      }
    }
  }

}
