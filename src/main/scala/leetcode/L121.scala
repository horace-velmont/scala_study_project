package leetcode

object L121 {
  def main(args: Array[String]): Unit = {
    println(maxProfit(Array(7, 1, 5, 3, 6, 4)));
  }

  def maxProfit(prices: Array[Int]): Int = {
    def loop(ps: List[Int], max: Int, buy: Int): Int = {
      ps match {
        case h :: px => loop(px, math.max(max, h - buy), math.min(buy, h))
        case _ => max
      }
    }

    if (prices.nonEmpty) loop(prices.toList, 0, prices.head)
    else 0
  }
}
