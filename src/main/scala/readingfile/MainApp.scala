package readingfile
import scala.io._

object MainApp {
  def main(args: Array[String]): Unit = {

    val stuff= Source.fromFile("MainApp.scala").mkString
    println(stuff)
  }

}
