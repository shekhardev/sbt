package singletonobj

class Car{
def hello()={
  println("hello")
}
}

object Car extends App {
  def countOfInstances()={
    val car =new Car
    car.hello()
  }
}
