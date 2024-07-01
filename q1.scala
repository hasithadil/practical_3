package practical_3

object q1 {
  def reverse(myWord:String):String={
    if(myWord.length > 0){
      var newString = reverse(myWord.slice(1,myWord.length)) + myWord.charAt(0)
      newString
    } else{
      ""
    }
  }
  def main(args:Array[String]):Unit={
    var myWord = "Hello World"
    var reverseString = reverse(myWord)
    println(s"Original string : $myWord")
    println(s"Reversed string : $reverseString")
  }
}
