trait Friend{
  val name:String
  def listen()={println("I'm " +name+ " Listing")}
}
class Human(val name:String) extends Friend {

}
var sam = new Human("Tom")
sam.listen()
