package rscarberry.recipes.stringops

import scala.language.postfixOps
import scala.util.Random

object TransformerDemo1 extends App {

  val s = "foo bar baz"
  println(s.dropWhile(_ != ' ')) // " bar baz"
  println(s.filter(_ != 'a'))    // "foo bar baz"
  println(s.takeWhile(_ != 'r')) // "foo bar baz"

  val numberStr = "abcd123ddd456 hello bar 11 nine 10 ddd"
  val regex = "\\d+"r

//  for (elem <- regex.findAllIn(numberStr)) {
//    println(elem)
//  }

  val nums: Iterator[String] = for {
    str <- regex.findAllIn(numberStr)
  } yield str

  println(nums.toList)

  val address = "123 Main Street".replaceAll("\\d", "x")

  println(address)

  val pattern = "(\\d+) ([A-Za-z]+)".r

  "100 Bananas" match {
    case pattern(count, fruit) => println(s"You have $count $fruit")
    case _ => println("Didn't match")
  }

  val d: Double = 100.0
  println(s"$d.toByte = ${d.toByte}, is it a valid byte? ${d.isValidByte}")

  val bd = BigDecimal(100)
  println(s"${bd}.toIntExact = ${bd.toIntExact}")

  val r = new Random()

  // IndexedSeq[Int], which Vector[Int] is.
  val seq = for( i <- 1 to 5) yield r.nextInt(100)
  println(s"$seq")

  val seqShuffled = r.shuffle(seq)
  println(s"Shuffled, seq is: $seqShuffled")
  println(s"seq eq seqShuffled: ${seq eq seqShuffled}")

  val pi = scala.math.Pi

  println(f"${pi}%06.3f")

  for (i <- 1 to 3) println(i)

  for (i <- 1 to 10) {
    if (i > 3 && i < 6) println(i)
  }

  def multBy2 = (n: Int) => n*2


}
