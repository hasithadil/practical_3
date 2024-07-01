package practical_3

object q2 {
  def filter(stringList:List[String]):List[String] = stringList match{
    case Nil => Nil
    case head :: tail =>
      if(head.length > 5) head :: filter(tail)
      else filter(tail)
  }
  def main(args: Array[String]):Unit={
    var stringList = List("banana","mango","apple","orange")
    var newList = filter(stringList)
    println(newList)
  }
}
