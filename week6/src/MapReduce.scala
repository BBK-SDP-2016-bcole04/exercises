/**
  * Created by digibrose on 10/04/2016.
  */
import AtomicTest._

object MapReduce extends App{

  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)

  val v2 = Vector(1, 2, 3, 4)
  v2.map(n => n*11 + 10) is Vector(21, 32, 43, 54)

  val v3 = Vector(1,2,3,4)
  v3.foreach(n => n + 1) is Vector(2,3,4,5)

  //it's empty because foreach does not have a return value



}
