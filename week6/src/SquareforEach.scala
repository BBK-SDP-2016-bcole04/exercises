/**
  * Created by digibrose on 10/04/2016.
  */
import AtomicTest._


object  SquareforEach extends App{

  def square = (x :Int) => x*x

  var s = ""
  val numbers = Vector(1, 2, 5, 3, 7)
  numbers.foreach(n => s = s + square(n) + " ")
  s is "1 4 25 9 49 "


}
