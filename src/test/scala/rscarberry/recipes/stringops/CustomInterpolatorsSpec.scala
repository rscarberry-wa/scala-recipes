package rscarberry.recipes.stringops

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import CustomInterpolators._

class CustomInterpolatorsSpec extends AnyFlatSpec with Matchers {

  "a list of strings" should "be capitalized as expected" in {
    val count = 10
    val name = "fred"

    val inputList = List(
      caps"",
      caps"this is my list",
      caps"$name is $count years old",
      caps"$name",
      caps"is $name here?")

    assert(inputList == List("", "This Is My List", "Fred Is 10 Years Old", "Fred", "Is Fred Here?"))
  }

  "using 'lst' on a multiline string" should "result in a list of trimmed lines" in {
    val lines = lst"""
         line1
         this is line2
           and this is line3
       """
    assert(lines == List("line1", "this is line2", "and this is line3"))
  }
}
