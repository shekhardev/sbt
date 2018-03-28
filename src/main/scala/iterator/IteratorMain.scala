package iterator

import java.util.stream.IntStream

object IteratorMain extends App {

  val iterator = IntStream.range(1, 10).iterator()
  while (iterator.hasNext()) {
    println(iterator.next()) // requesting data in the cycle
  }

}
