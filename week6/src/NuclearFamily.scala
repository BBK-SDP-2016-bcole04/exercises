/**
  * Created by digibrose on 11/02/2016.
  */
class NuclearFamily (dad: String,mum: String, kids:String* ) {

  def familySize(): Int = {
    var count = 2
    for (str <- kids) {
      count = count + 1
    }
    count
  }

}

import AtomicTest._

  object TestNuclearFamily extends App{
  val family3 = new NuclearFamily("Mum", "Dad", "Sally", "Dick")
  family3.familySize() is 4
  val family4 = new NuclearFamily("Dad", "Mom", "Harry")
  family4.familySize() is 3

}
