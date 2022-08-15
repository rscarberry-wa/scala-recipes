package rscarberry.recipes.regex

object MatchAgainstMultipleRegexes extends App {

  val nearZip = "([A-Za-z]+)\\s+near\\s+(\\d{5})".r
  val nearCityState = "([A-Za-z]+)\\s+near\\s+([A-Za-z]+),\\s*([A-Za-z]+)".r

  def func(str: String): Unit = {
    str match {
      case nearZip(what, zip) => println(s"Looking for $what near zip code $zip")
      case nearCityState(what, city, state) => println(s"Looking for $what near the city of $city, $state")
      case _ => println("Do not know what you want")
    }
  }

  List(
    "Pharmacies near 02067",
    "Theaters near Columbus, OH",
    "Goats  near Cleveland,Ohio"
  ).foreach(func)

}
