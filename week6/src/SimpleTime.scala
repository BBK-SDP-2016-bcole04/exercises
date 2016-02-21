/**
  * Created by digibrose on 11/02/2016.
  */
case class SimpleTime(hours:Int, minutes:Int = 0 ) {

}

import AtomicTest._

object TestSimpleTime extends App{

  val t = new SimpleTime(hours=5, minutes=30)
  t.hours is 5
  t.minutes is 30

  val t2 = new SimpleTime(hours = 10)
  t2.hours is 10
  t2.minutes is 0

}
