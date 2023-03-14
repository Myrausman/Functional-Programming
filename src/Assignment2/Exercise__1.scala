package Assignment2

  object Exercise__1 {

    def apply(l: List[String]) = println(l.reduce(_ + _))
    def apply1(l: List[Int]) = println(l.reduce(_ + _))
//    apply(l)
    def main(args:Array[String]): Unit = {
      val lst = List("myra","123")
      apply(lst)
      val lst1=List(1,2,3)
      apply1(lst1)
    }

  }

