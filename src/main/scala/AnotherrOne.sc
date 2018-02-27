case class Car(val year:Int , var miles:Int)
var car = new Car(2008, 0)
//Tuple
def createPerson()={
  new {
    var first = "James"
    var last = "Bond"
  }
}
var doubleOSeven = createPerson()
println(doubleOSeven.first,doubleOSeven.last)

def factorial(fact :  BigInt,n:  BigInt) :  BigInt={
 if(n == BigInt(1))
   fact
  else
    factorial(fact * n, n-1)
}
println(factorial(1, 5))

