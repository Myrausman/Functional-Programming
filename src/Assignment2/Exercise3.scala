package Assignment2

object Exercise3 {
  def map() {
    val lst = List(1, 2, 3, 4, 5)
    println(lst," ========> ",lst.map(_ * 2))
    val mapp = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(mapp," =======> ",mapp.map { case (k, v) => k -> (v * 2) })
    val arr=Array(1,2,3,4,5,6)
    println(arr.mkString("Array (",",",")")," ======> ",arr.map(_*2).mkString("Array (",",",")"))
    val seq= Seq(1,2,3,4,5)
    println(seq," ======> ",seq.map(_*2))
  }
  def flatmap(): Unit = {
    val list1 = List(1, 2, 3)
    val list2 = List('a', 'b', 'c')
    println(list1.flatMap(x => list2.map(y => (x, y))))
    val words = Array("hello", "world")
    println(words.mkString("Array (\",\",\",\")\")", " ======> ",(words.flatMap(word => word.toList)).mkString("Array (",",",")")))
    val seq = Seq("MYRA","Usman")
    println(seq, " ======> ", seq.flatMap(x=>x.toList))
    val map1 = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println( map1, " ======> ",map1.flatMap { case (k, v) => Map(k -> (v *2), k.toUpperCase -> (v * 3)) })
  }
  def main (args:Array[String]): Unit = {
    println("\n      collections with higher order function : map() \n")
    map()
    println("\n      collections with higher order function : map() \n")
    flatmap()
  }
}
