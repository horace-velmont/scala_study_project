package leetcode

object L268 {
  def missingNumber(nums: Array[Int]): Int = {
    val n = nums.length
    val expect = (1 + n) * n / 2
    val actual = nums.sum
    expect - actual
  }
}
