object ExpensiveResource {
  lazy val resource: Int = init()

  def init(): Int = {
    //시간이 오래걸리는 작업 수행
    0
  }
}