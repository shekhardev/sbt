package filereading

import scala.io.Source

object Main extends App {
  //def main(args: Array[String]) {
   // println("Hello")
    //  val  source = Source.fromFile("matrix.txt")
    //  val lines = source.getLines()
    //  lines.next()
    Source.fromFile("C:\\SpringBoot\\SbtTests\\src\\main\\scala\\filereading\\matrix.txt").foreach {
      print
    }
  //}
}
