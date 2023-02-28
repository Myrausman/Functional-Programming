package Assignment1

object Exercise4 extends App{
  var arr= Array(1,2,3,4)
  val new_arr=arr.map(x => x *4)
  println(new_arr.mkString("Array (",",",")"))
  println(new_arr.count(_ >= 8))
}
