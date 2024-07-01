package practical_3

object q4 {
  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    var sum = 0
    for (num <- numbers) {
      if (num % 2 == 0) {
        sum += num
      }
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    //list cannot be changed.array can be change
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sum = sumOfEvenNumbers(numbers)
    println(s"Sum of even numbers: $sum")
  }

}
