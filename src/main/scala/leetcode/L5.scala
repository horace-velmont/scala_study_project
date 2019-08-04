package leetcode

object L5 {
  def main(args: Array[String]): Unit = {
    println(longestPalindrome("a"))
  }

  def longestPalindrome(s: String): String = {
    def findPal(stt: Int, lst: Int, orig: String, pal: String): String = {
      if (orig.length == 0)
        return orig
      val strs = orig.substring(stt, lst + 1)
      var pals = pal
      if (isPal(strs) && strs.length > pal.length)
        pals = strs
      if (lst == orig.length - 1)
        if (stt == orig.length - 1)
          pals
        else
          findPal(stt + 1, stt + 1, orig, pals)
      else
        findPal(stt, lst + 1, orig, pals)
    }

    findPal(0, 0, s, "")
  }

  def isPal(str: String): Boolean = {
    val len = str.length
    for (i <- 0 until len / 2)
      if (str(i) != str(len - i - 1))
        return false
    true
  }
}
