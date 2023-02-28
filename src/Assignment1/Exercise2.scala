package Assignment1

object Exercise2 {
  def main(args:Array[String]): Unit = {
    var map1 = Map("a" -> "b")
    map1 += ("c" -> "d")
    println(map1)
    var set1 = Set(2,4,6)
    set1+= (4,8)
    println(set1)
  }

}
