package Assignment2

object Exercise___2 {
  def add(x: Any, y: Any): String = x.toString + y.toString

  def main(args: Array[String]): Unit = {
    val a=43.5
    val b=12
    println(a.toString," + ",b.toString," = ",add(a,b))
  }

}
