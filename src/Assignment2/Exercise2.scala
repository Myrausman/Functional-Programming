package Assignment2

object Exercise2 {
  case class Numbers(var roll: String, var seat: Int)

  case class Student(var name: String, var num: Numbers) {
    def shallowCopy(): Student = Student(name, num)

    def deepCopy(): Student = Student(name, Numbers(num.roll, num.seat))
  }


  def main(args: Array[String]): Unit = {
    val student1 = Student("Alice", Numbers("21B-010-SE", 21072))
    val student2 = student1.shallowCopy()
    val student3 = student1.deepCopy()

    println(s"Student 1: $student1")
    println(s"Student 2 (shallow copy): $student2")
    println(s"Student 3 (deep copy): $student3")

    // Changing the roll number of student1's Numbers object
    student1.num.roll = "21B-011-SE"
    println(s"Student 2 (after changing roll number in student1)-shallowcopy: $student2")
    println(s"Student 3 (after changing roll number in student1)-deepcopy: $student3")
  }
}