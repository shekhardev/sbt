  var nums = List(4,5,9,6,3)
  //for(n <- nums) println(n)
  //nums.reverse
  nums.drop(2).take(2)
  //nums.foreach{i:Int => print(i)}

def totalPrices(prices:List[Int],
                selector :Int => Boolean)={
  var total = 0
  for(price <- prices){
    if(selector(price)) total += price

  }

  total
}
  val prices = List(10,20,15,25,30,35,40)
  println(totalPrices(prices,{price => true}))
  println(totalPrices(prices,{prices => prices > 25}))
  println(totalPrices(prices,{prices => prices < 25}))







