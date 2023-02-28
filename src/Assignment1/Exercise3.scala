package Assignment1

object Exercise3 extends App {
  def func(n: Option[Int]) = {
    println(n)
  }
  val lst=List(1,2,3,4,5)
  func(lst.find(_ >5))
  func(lst.find(_ >4))

}