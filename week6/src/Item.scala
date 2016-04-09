/**
  * Created by digibrose on 09/04/2016.
  */
class Item(name: String, price: Double ) {

  def cost(medication : Boolean = false, grocery: Boolean = false, taxRate: Double = 0.10) = {
    var truecost : Double = price
    if (!grocery && !medication)truecost = truecost + (truecost*taxRate)
    truecost
  }

}

import AtomicTest._

object TestItem extends App {
  val flour = new Item(name = "flour", 4)
  flour.cost(grocery = true) is 4
  val sunscreen = new Item(
    name = "sunscreen", 3)
  sunscreen.cost() is 3.3
  val tv = new Item(name = "television", 500)
  tv.cost(taxRate = 0.06) is 530
}