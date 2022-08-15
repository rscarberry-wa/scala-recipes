package rscarberry.recipes.stringops

import java.lang


object CustomInterpolators {

  implicit class CapsInterpolator(sc: StringContext) {

    def caps(args: Any*): String = {

      // If there are no expressions in the string, strings will be one element.
      // If there is one expression in the string, say "$expr", then strings will contain 2 empty elements, and
      // expressions will be a single element with the value of $expr inserted.
      val strings: Iterator[String] = sc.parts.iterator
      val expressions: Iterator[Any] = args.iterator

      // [2] populate a StringBuilder from the values in the iterators
      val sb = new lang.StringBuilder(strings.next())
      while (strings.hasNext) {
        sb.append(expressions.next().toString)
        sb.append(strings.next())
      }

      sb.toString
        .split(" ")
        .map(_.trim)
        .map(_.capitalize)
        .mkString(" ")
    }
  }

  implicit class ListerInterpolator(sc: StringContext) {
    def lst(args: Any*): List[String] = {
      val strings: Iterator[String] = sc.parts.iterator
      val expressions: Iterator[Any] = args.iterator

      // [2] populate a StringBuilder from the values in the iterators
      val sb = new lang.StringBuilder(strings.next())
      while (strings.hasNext) {
        sb.append(expressions.next().toString)
        sb.append(strings.next())
      }

      sb.toString.split("\n")
        .map(_.trim)
        .filter(_ != "")
        .toList
    }
  }
}
