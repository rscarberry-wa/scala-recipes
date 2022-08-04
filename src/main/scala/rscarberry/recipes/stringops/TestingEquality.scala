package rscarberry.recipes.stringops

object TestingEquality extends App {

  // Unlike Java, you can test whether 2 string are equal with the == operator
  val s1 = "charlie brown"
  val s2 = "charlie brown"
  val s3 = "Charlie Brown"
  // Using explicit nulls is frowned upon and won't compile with the -Yexplicit-nulls
  // compiler option, but it's used here to demonstrate that it won't generate a
  // NullPointerException when used with ==
  val s4 = null

  println(s"s1 == s2: ${s1 == s2}")
  println(s"s4 == s1: ${s4 == s1}") // NullPointerException is NOT thrown.
  println(s"s2.toUpperCase == s3.toUpperCase: ${s2.toUpperCase == s3.toUpperCase}")

}
