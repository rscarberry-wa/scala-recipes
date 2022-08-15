package rscarberry.recipes.stringops

import scala.util.Random

object RandomStrings extends App {

  val random = new Random()

  def randomPrintableString(random: Random)(n: Int): String = {
    val randomSeq = for (i <- 0 to n) yield random.nextPrintableChar()
    randomSeq.mkString
  }

  // Will generate unusual output, because it generates unicode which may not
  // display well.
  println(s"Just using random.nextString(12), we get: ${random.nextString(12)}")

  // But this will generate alphanumeric strings. Since it generates a LazyList,
  // mkstring is called to turn them into strings.
  for (i <- 1 to 10)
    println(s"Random alphanumeric $i: ${random.alphanumeric.take(12).mkString}")

  println()

  val randomPrintable: Int => String = randomPrintableString(random)

  for (i <- 1 to 10)
    println(s"Random strings made from all printable chars: $i: ${randomPrintable(12)}")
}
