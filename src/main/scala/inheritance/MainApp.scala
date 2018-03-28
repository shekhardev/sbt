package inheritance

object MainApp extends App {
   val v1= new Car(200)
  println(v1.mph)
  val v2 = new Bike(100)
  println(v2.mph)
  v2.race()
}

class Vehicle(speed:Int){
      val mph:Int=speed
    def race()=println("Racing .....")
}
class Car(speed:Int) extends Vehicle(speed){
  override val mph: Int = speed

  override def race()= println("Racing Car ...")
}
class Bike(speed:Int) extends Vehicle(speed){
  override val mph: Int = speed

  override def race() =println("Racing Bike....")
}
