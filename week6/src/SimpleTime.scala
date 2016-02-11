/**
  * Created by digibrose on 11/02/2016.
  */
case class SimpleTime(hours:Int, minutes:Int ) {

}

import AtomicTest._

object TestSimpleTime extends App{

  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30

}
