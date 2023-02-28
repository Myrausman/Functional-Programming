object MyModule {
  def abs(n:Int) :Int= {
    if (n<0){
      -n
    } else{
      n
    }
  }

  private def formatAbs(x: Int): String = {
    val msg = "The absolute of %d is %d"
    msg.format(x, abs(x))
  }


  def main(args:Array[String]):Unit  = {
    println(formatAbs(42))
    println(2+3)
    println(2.+(3))
    println(MyModule.abs(3))
    println(MyModule abs 3)

  }
}
