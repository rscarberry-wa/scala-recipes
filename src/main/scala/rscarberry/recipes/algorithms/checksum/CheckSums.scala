package rscarberry.recipes.algorithms.checksum

object CheckSums {

  /**
   * A checksum algorithm with by Mark Adler in 1995. (See https://en.wikipedia.org/wiki/Adler-32)
   */
  def adler32sum(s: String): Int = {
    val MOD_ADLER = 0xfff1
    var a = 1
    var b = 0
    s.getBytes.foreach { byte =>
      a = (byte + a) % MOD_ADLER
      b = (b + a) % MOD_ADLER
    }
    (b << 16) | a
  }

}
