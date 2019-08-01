package leetcode

object L884 {
  def main(args: Array[String]): Unit = {
    println(uncommonFromSentences("hi every", "one who"))
    val a: Array[String] = Array[String]()
    a.foreach(s => println(s))
  }

  def uncommonFromSentences(A: String, B: String): Array[String] = {
    val a = A.split(" ")
    val b = B.split(" ")
    val c = (a ++ b).toList


    def foldLeft(a: List[String], b: Array[String], filter: Array[String]): Array[String] = {
      val head = a.head
      var newFilter = filter
      var newB = b
      if (!filter.contains(head)) {
        newFilter = filter :+ head
        newB = b :+ head
        filter.foreach(s => println(s))
      } else {
        b.filter(s => s != a.head)
      }
      a match {
        case str :: Nil => b
        case str :: tail => foldLeft(tail, newB, newFilter)
        case _ => Array[String]()
      }
    }

    foldLeft(c, Array[String](), Array[String]())
  }
}
