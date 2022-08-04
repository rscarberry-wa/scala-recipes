package rscarberry.recipes.stringops

/**
 * Demonstrates how strings in scala can be treated as sequences of characters
 */
object SequenceOps extends App {

  val s = "this is my string"

  println(s"The count of the letter s in '$s': ${s.count(_ == 's')}")

  println(s"Without spaces, the string is: '${s.filter(_ != ' ')}'")

  println(s"Sorting the characters, the string is: '${s.sortWith(_ < _)}''")

  println(s"Up to the first appearance of the letter m, s is: '${s.takeWhile(_ != 'm')}''")

  println(s"Taking the first 30 characters from s: '${s.take(30)}'")

  val firstHalfLength = s.length/2
  val lastHalfLength = if (s.length%2 == 0) firstHalfLength else firstHalfLength + 1

  println(s"Taking the first half of the characters: '${s.take(firstHalfLength)}'")

  println(s"Taking the last half: '${s.takeRight(lastHalfLength)}'")

  println(s"Which should be same as dropping the first half: '${s.drop(firstHalfLength)}'")

  println(s"And the first half should also result from dropping the last half: '${s.dropRight(lastHalfLength)}'")

  println(s"The number of vowels is: ${s.count(c => "aeiou".indexOf(c) >= 0)}")

  // And you can chain these methods together, since each return a new string
  println(s"Dropping 3 characters from each end and capitalizing: '${s.dropRight(3).drop(3).capitalize}'")
}
