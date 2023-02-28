package Assignment1

object Task3 extends App{
  def add(array1:Array[Double],array2:Array[Double]):Array[Double]={

    def adding(array1:Array[Double],array2:Array[Double],res_arr:Array[Double],index:Int,size:Int):Array[Double]={
      if (index==size) res_arr
      else adding(array1,array2, res_arr :+ array1(index) + array2(index),index+1,size)

    }
    if (array1.size == array2.size)
      adding(array1,array2,Array(),0,array1.size)
    else Array(0,0,0)
  }
//  val array1=
//  val array2=
  println(add(Array(1,2,3),Array(4,5,6)).mkString("Array (",",",")"))

}
