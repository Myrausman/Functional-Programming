package Assignment2

object EX_3 {
  def euclidean_norm(lst:List[Int]):Double={
    def adding(lst:List[Int],i:Int,res:Int):Int={
      if (i==lst.size) res
      else adding(lst,i+1,res+(lst(i)*lst(i)))

    }
    return math.sqrt(adding(lst,0,0))


  }
  def main(args:Array[String]): Unit = {
    val a=List(1,2,3,4,5,6)
    val res=euclidean_norm(a)
    print(res)
  }


}
