package Assignment1
object Exercise1{
  def main(args: Array[String]) {
//     method 1
    var myList1 = Array(1.8, 2.0, 3.4, 3.5)
    println(myList1.mkString("Array (",",",")"))
//    method 2
    var myList2= new Array[String](3)
    myList2(0)="MYRA"; myList2(1)="Usman";myList2(2)="HEllo"
    println(myList2.mkString("Array (",",",")"))
//    method 3
    val myList3:Array[Int] = Array(1,2,3)
    println(myList3.mkString("Array (",",",")"))


  }}