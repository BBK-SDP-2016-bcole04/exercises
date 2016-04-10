/**
  * Created by digibrose on 10/04/2016.
  */
import AtomicTest._


object DogYears extends App{

  val DogYears = (x: Int) => x*7

  println(DogYears(10))

  var s = ""
  val v = Vector(1, 5, 7, 8)
  v.foreach(n => s = s + DogYears(n) + " ").toString
  println(v)
  s is "7 35 49 56 "



}
