package Assignment1

object factorial extends App {
  def factorial(n: Int, acc: Int = 1): Int = {
    if (n == 0) acc
    else factorial(n - 1, acc * n)
  }
}
