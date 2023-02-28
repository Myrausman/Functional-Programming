package Assignment1

object Task2 extends App{
  def CharArray(start: Int) = {

      def generate_list(list: List[Char], num: Int, stop: Int): List[Char] = {
        if (num > stop) generate_list(num.toChar :: list, num - 1, stop)
        else list
      }
      generate_list(List(), start+25, start-1)
    }
//    // a == 97
    println(CharArray(65))
    println(CharArray(97))

}
