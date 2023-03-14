package Assignment2

object EX_1 {
  val a=3
  val b=5
  val c=7
  def y(x:Int)=a*(x*x)+b*x+c

  def graph(from:Int,to:Int,res:List[Int]):List[Int]={
    if (from==to+1) res
    else graph(from+1,to,res:+from)
  }

  val lst = graph(-4, 4,List())
  def main(args: Array[String]): Unit = {
    val lstmap=lst.map(y(_))
    println(lstmap)
    println(lst.zip(lstmap))
  }
}