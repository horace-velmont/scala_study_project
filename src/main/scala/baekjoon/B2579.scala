package baekjoon

object B2579 {
  def main(args: Array[String]): Unit = {
    println(solution(List(10, 20, 15, 25, 10, 20)));
  }

  def solution(ar: List[Int]): Int = {
    def findSum(ar: List[Int], sumNext: List[Int], sumJump: List[Int]): Int = {
      ar match {
        case h :: tail =>
          val tailOfSumNext = if (sumNext.isEmpty) sumNext else sumNext.tail
          val tailOfSumJump = if (sumJump.isEmpty) sumJump else sumJump.tail
          val nextElem = if (sumJump.isEmpty) h else sumJump.head + h
          val jumpElem = if (tailOfSumNext.isEmpty) h else Math.max(tailOfSumNext.head, tailOfSumJump.head) + h
          findSum(tail, nextElem :: sumNext, jumpElem :: sumJump)
        case Nil => Math.max(sumNext.head, sumJump.head);
      }
    }

    findSum(ar.tail, List(ar.head), List(ar.head))
  }
}
