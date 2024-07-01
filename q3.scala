package practical_3

object q3 {
  def arithmeticMean(num1: Int,num2: Int): Double={
    val mean = (num1 + num2)/2.0
    math.round(mean*100.0)/100.0
  }

  def main(args :Array[String]): Unit={
    println("Enter num1 : ")
    var num1 = scala.io.StdIn.readInt()
    println("Enter num2 : ")
    var num2 = scala.io.StdIn.readInt()

    var mean = arithmeticMean(num1,num2)
    println(s"Arithmetic mean of $num1 and $num2 : $mean")

  }
}
