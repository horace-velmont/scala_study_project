package leetcode

import scala.collection.mutable.ArrayBuffer

object L221 {
  def maximalSquare(matrix: Array[Array[Char]]): Int = {
    val dp = ArrayBuffer(ArrayBuffer[Int]())
    var maxsqlen = 0
    val rows = matrix.length
    val cols = if (rows > 0) matrix(0).length else 0
    for (i <- 1 to rows) {
      for (j <- 1 to cols) {
        if (matrix(i - 1)(j - 1) == '1') {
          dp(i)(j) = Math.min(Math.min(dp(i)(j - 1), dp(i - 1)(j)), dp(i - 1)(j - 1)) + 1
          maxsqlen = Math.max(maxsqlen, dp(i)(j))
        }
      }
    }
    maxsqlen * maxsqlen
  }
}
