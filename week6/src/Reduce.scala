/**
  * Created by digibrose on 10/04/2016.
  */

import AtomicTest._

object Reduce extends App{

  def sumIt(x :Int*) :Int = {
    val y = x.reduce(_+_)
    y
  }

  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195

}
