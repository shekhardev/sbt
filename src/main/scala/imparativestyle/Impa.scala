package imparativestyle

object Impa {
  def main(args: Array[String]): Unit = {

  }
  val numbers = List(1,2,3,4,5,6)

  var total =0
  for(i <- numbers){
    total +=i
  }
  println(total)
}
