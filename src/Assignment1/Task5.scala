package Assignment1
import scala.collection.mutable.Map
object Task5 extends App{
  def buildMap[A, B](data: Seq[A], f: A => B):Map[A,B]={
    def map(data: Seq[A], f: A => B, res_map: Map[A, B], index: Int): Map[A,B] = {
      if (index ==data.size) res_map
      else map(data, f, res_map + (data(index) -> f(data(index))), index +1)
    }
      map(data, f, Map[A,B](), 0)

  }
    val lst = Array(1, 2, 3, 4, 5)
    def func(x: Int): Boolean = x % 2 == 0 // entry is even or not
    val result: Map[Int, Boolean] = buildMap(lst, func)
    println(result)

}
