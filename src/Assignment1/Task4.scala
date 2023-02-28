package Assignment1

object Task4 extends App{
  def even_array(array:Array[Int],res_arr:Array[Int],index:Int):Array[Int]={
    if (array.size==index) res_arr
    else even_array(array,if (array(index)%2==0) res_arr:+array(index) else res_arr,index+1)
  }
  val array = Array.fill(100)(util.Random.nextInt((100)))
  println(even_array(array,Array(),0).sorted.mkString("Array (",",",")"))

  val res_array= array.count(_%2==0)
  println(res_array)
}
