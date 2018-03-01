import java.io._

import scala.io.Source

object MainObject{
  def main(args:Array[String]){
    val filename = "ex.txt"
    val fileSource = Source.fromFile(filename)
    while(fileSource.hasNext){
      println(fileSource.next)
    }
    fileSource.close()
  }
}