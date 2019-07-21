package baekjoon

object Solution {
  def main(args: Array[String]): Unit = {
    findPerm(4, 3).foreach(println)
  }

  def findPerm(N: Int, num: Int): List[Int] = {
    val perm = List.range(1, N + 1).permutations

    def getPerm(iterator: Iterator[List[Int]]): List[Int] = {
      var cnt = 0
      while (iterator.hasNext && cnt < num) {
        println("cnt : " + cnt)
        cnt = cnt + 1
        val list = iterator.next()
        if (cnt == num)
          return list
      }
      null
    }

    getPerm(perm)
  }
}