package Assignment1
import scala.util.Random
object Task1 extends App{

//    generating random numbers from 50-500
    def func(count: Int, list: List[Int]): List[Int]= {
      if (count < 15 ) func(count + 1, Random.between(50, 500) :: list)
      else list
    }
    val list = func(0, List())
    println("List of random numbers between 50-500: " + list)


//filtering prime numbers using lambda function and putting it in iterator
    def prime(list:List[Int]):Iterable[Int]={
      val primeNumbers = list.filter(n => (2 to Math.sqrt(n).toInt).forall(i => n % i != 0) && n > 1)
      primeNumbers
    }
//    val p_list=prime(List(1,2,3,4,5,6,7,8,9,10,19,17,18,15,14))
    val p_list=prime(list)
//    println(p_list)
    println("prime numbers in list: ",p_list)


//sorting prime numbers in ascending order
    def sortedlist(list:Iterable[Int]):Iterable[Int]={
      val s_list=list.toList.sorted
      s_list.toIterable
    }
    val sorted_list=sortedlist(p_list)
    println("sorted list",sorted_list)

    def mapping(map:Map[Int, Int],list:List[Int],index:Int):Map[Int,Int]={
      if (index==list.size) map
      else mapping(map+(index -> list(index)),list,index+1)

    }
    val map:Map[Int, Int] = Map()
    val mapped =mapping(map,sorted_list.toList,0)
    println("MApped elements of list: ",mapped)

}
