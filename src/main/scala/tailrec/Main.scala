package tailrec


object Main {

  def main(args: Array[String]): Unit = {

    def factorial(n: Int, fact:BigInt) :BigInt={
      if(n ==1)
        fact
      else
        factorial(n -1, fact *n)
    }
    println(factorial(4,BigInt(1)))

  }


}
