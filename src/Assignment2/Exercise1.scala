package Assignment2
import scala.util.control.Breaks._
object Exercise1 extends Enumeration {

  val first = "start"
  val up= "up"
  val down ="down"
  val quit = "exit"

  def main(args:Array[String]): Unit = {
    val obj = new Exercise_1()
  }
}
class Exercise_1 {
  val initial = 0
  val max = 10
  var state = Exercise1.first
  var count=initial

  while (true) {
    state match {
      case "start" => {
        print(s"${count}\n")
        count = count + 1
        state = Exercise1.up
      }
      case "up" => {
        if (count == max) {
          println(count)
          count = count - 1
          state = Exercise1.down
        }
        else {
          println(count)
          count = count + 1

        }
      }
      case "down" => {
        if (count == initial) {
          println(count)
          state = Exercise1.quit

        } else {
          println(count)
          count = count -1

        }
      }
      case "exit" => {
        println("program ended")
        break
        }
    }
  }
  println(state)
}


