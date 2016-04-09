/**
  * Created by digibrose on 09/04/2016.
  */
class Tea(decaf: Boolean = false, sugar: Boolean = false, milk: Boolean = false, name: String = "Earl Grey") {

  def describe() : String = {
    var d :String = name
  if(decaf){ d = d + " decaf"}
    if(milk){d = d + " + milk"}
    if(sugar){d = d + " + sugar"}
d
  }

  def calories() :Int ={
    var c :Int = 0
      if(milk){c += 100}
    if(sugar){c += 16}
    c
  }

}

import AtomicTest._

object TeaTest extends App {

  val tea = new Tea
  tea.describe is "Earl Grey"
  tea.calories is 0
  val lemonZinger = new Tea(decaf = true, name="Lemon Zinger")
  lemonZinger.describe is "Lemon Zinger decaf"
  lemonZinger.calories is 0
  val sweetGreen = new Tea( name="Jasmine Green", sugar=true)
  sweetGreen.describe is "Jasmine Green + sugar"
  sweetGreen.calories is 16
  val teaLatte = new Tea(sugar=true, milk=true)
  teaLatte.describe is "Earl Grey + milk + sugar"
  teaLatte.calories is 116

}

