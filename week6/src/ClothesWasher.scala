/**
  * Created by digibrose on 09/04/2016.
  */
class ClothesWasher(modelName: String, capacity: Double) {

def this(modelName: String){
  this(modelName, capacity = 10.00)
}

def this(capacity : Double){
  this(modelName = "Blank", capacity)
}

}

class ClothesWasher2(modelName: String = "Blank", capacity: Double = 10.00) {

}

import AtomicTest._

object ClothesTest extends App {
val zanusi = new ClothesWasher(20.00)

val zanusi2 = new ClothesWasher2(capacity = 20.00)

}





