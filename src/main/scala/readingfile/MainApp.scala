package readingfile
import scala.io._

object MainApp {
  def main(args: Array[String]): Unit = {

    val stuff= Source.fromFile("C:\\SpringBoot\\SbtTests\\src\\main\\scala\\readingfile\\MainApp.scala").mkString
    println(stuff)
  }

}
