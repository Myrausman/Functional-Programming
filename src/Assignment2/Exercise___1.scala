package Assignment2

import scala.math.Ordering

object Exercise___1 {

  // Define an implicit ordering for Person based on age
  implicit val orderingByAge: Ordering[Person] = Ordering.by(_.age)

  // Define a list of people
  val people = List(
    Person("Myra", 19),
    Person("Abdul", 20),
    Person("Amna", 18)
  )
  case class Person(name: String, age: Int)
  def main(args: Array[String]): Unit = {


    // Sort the list using the implicit ordering defined above
    val sortedPeople = people.sorted

    // Print the sorted list
    sortedPeople.foreach(println)}



}
