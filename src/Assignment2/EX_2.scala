package Assignment2

object EX_2 {
  val a = 3
  val b = 5
  val c = 7

  def y(x: Int) = a * (x * x) + b * x + c

  def graph(from: Int, to: Int, res: List[Int]): List[Int] = {
    if (from == to + 1) res
    else graph(from + 1, to, res :+ from)
  }

  val lst = graph(-4, 4, List())

  def main(args: Array[String]): Unit = {
    val lstmap = lst.zipWithIndex.map { case (x, i) => (x, y(x), i) }
    println(lstmap)
  }

}
