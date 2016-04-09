/**
  * Created by digibrose on 09/04/2016.
  */
class Planet(Name: String, Moon :Int = 0, Description :String) {

  def hasMoon(): Boolean = Moon != 0

}

import AtomicTest._

object TestPlanet extends App {
  val p = new Planet(Name = "Mercury",
    Description = "small dull planet", Moon = 0)
  p.hasMoon is false

  val earth = new Planet(Moon = 1, Name = "Earth",
    Description = "a hospitable planet")
  earth.hasMoon is true

}


