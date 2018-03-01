package imparativestyle

object Impa {
  def main(args: Array[String]): Unit = {

  }
  //imperative style of programming
  val numbers = List(1,2,3,4,5,6)

  var total =0
  for(i <- numbers){
    total +=i
  }
  println(total)

  //declarative style of programming
  println(
    numbers.foldLeft(0){(c,e) => c+e}
  )

  println(numbers.map{e=> e *2})

  def factorial(n:Int) ={
    var fact =1
    for (i <- 1 to n){
      fact *=i
    }
    fact
  }
  println(factorial(5))
}
