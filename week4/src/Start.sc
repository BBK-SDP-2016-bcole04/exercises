3

3+3

"blahblah" take 3

val x: Array[String]
val num = 17

//num = 20
//changed to make it changeable
var S = "1234"
println(S)

S = "DEF1234"

val num2 = 15.56

println(num2)

//Expressions

var sky = "sunny"
var temp = 90
val nice = sky.equals("sunny") && temp > 80
val variable = sky.equals("sunny") || sky.equals("partly cloudy")  && temp < 20 || temp > 80
sky = "partly cloudy"
variable
var Cel = 5*(temp - 32.0 )/9
var Far = (9*Cel)/5 + 32

//Methods

def getSquare(num : Integer) = num*num
getSquare(3)
getSquare(9)
getSquare(5)
def Arg1GreaterThanArg2(num1: Double, num2: Double) = num1 > num2
val t1 = Arg1GreaterThanArg2(4.1, 4.12)
//assert(t1 == true)
assert(t1 == false)
val t2 =Arg1GreaterThanArg2(2.1, 1.2)
def manyTimesString(S: String, num: Integer): String = {
    var i = 0
    var SS: String = ""

    while (i < num) {
      SS = SS + S
      i= i + 1
    }
    SS
  }

  var SN = manyTimesString("Test ", 2)
val m1 = manyTimesString("abc", 3)
assert("abcabcabc" == m1, "correct")
val m2 = manyTimesString("123", 2)
assert("123123" == m2, "Your message here")
/*object Range{
  def Step(low: Integer, high: Integer, step: Integer): String ={
    var i=low
    var S=""
    var st=step
    while(i <= high){
      S = S + i + " "
      i = i+st
    }
    S
  }

}
*/

//Classes and Objects

val R1 = Range(1, 10)
val R2 = Range(1, 10, 2)
var s1 = "Sally"
var s2 = "Sally"
assert(s1.equals(s2))
val eq:Boolean =  s1.equals(s2)
//if (eq) {println("equal")} else {println"not equal"}

//Creating Classes

class Hippo
class Lion
class Tiger
class Monkey
class Giraffe
val edna = new Hippo
val Bert = new Lion
val Thomas = new Tiger
val Gerald = new Monkey
val Sydney = new Giraffe
println(edna)
val doris = new Hippo
println(doris)

//Methods In Classes

class Sailboat{
  def Raise(): String ="Sails Raised"
  def Lower(): String ="Sails Lowered"
  def signal(): String = {
    val F = new Flare
    F.light()
  }

}

class Motorboat{

  def Start(): String = "Motor On"
  def Stop(): String = "Motor Off"

  def signal(): String = {
    val F = new Flare
    F.light()
  }

}

val sailboat = new Sailboat
val r1 = sailboat.Raise()

assert(r1 == "Sails Raised", "Expected Sails Raised, Got " + r1)
val r2 = sailboat.Lower()
assert(r2 == "Sails Lowered", "Expected Sails Lowered, Got " + r2)
val motorboat = new Motorboat
val mo1 = motorboat.Start()
assert(mo1 == "Motor On", "Expected Motor On, Got " + mo1)
val mo2 = motorboat.Stop()
assert(mo2 == "Motor Off", "Expected Motor Off, Got " + mo2)
class Flare(){
  def light(): String = "Flare used!"
}
val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
val sailboat2 = new Sailboat
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
val motorboat2 = new Motorboat
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

//Fields In Classes

class Cup {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull < 0){
      percentFull =0
    }
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }
  def set(s:Int):Unit = {
    this.percentFull = s
  }
  def get():Int = percentFull
}

val cup = new Cup

cup.add(45)
cup.add(-15)
cup.add(-50)
import java.io.FileWriter
import scala.language.implicitConversions

class AtomicTest[T](val target: T) {
  val errorLog = "_AtomicTestErrors.txt"
  def tst[E](expected: E)(test: => Boolean) {
    println(target)
    if (test == false) {
      val msg = "[Error] expected:\n" +
        expected
      println(msg)
      val el = new FileWriter(errorLog, true)
      el.write(target + msg + "\n")
      el.close()
    }
  }

  def str = // Safely convert to a String
    Option(target).getOrElse("").toString

  def is(expected: String) = tst(expected) {
    expected.replaceAll("\r\n", "\n") == str
  }

  def is[E](expected: E) = tst(expected) {
    expected == target
  }

  def beginsWith(exp: String) = tst(exp) {
    str.startsWith(
      exp.replaceAll("\r\n", "\n"))
  }
}

object AtomicTest {
  implicit def any2Atomic[T](target: T) =
    new AtomicTest(target)
}

import AtomicTest._

cup.add(45) is 45
cup.add(-55) is 0
cup.add(10) is 10
cup.add(-9) is 1
cup.add(-2) is 0
cup.percentFull = 56
cup.percentFull is 56
cup.set(56)
cup.get() is 56
val v1 = Vector(1, 2, 3, 4)
val v2 = Vector(new Cup, new Cup, new Cup)
val v3 = Vector("one", "two", "three")
val v4 = Vector(v1, v2, v3)

val v5 = Vector("The ", "dog ", "visited ", "the ", "fire ", "station")
var string1 = ""

for (s <- v5){
  string1 = string1 + s
}

println(string1)

val v6 = Vector(1, 2, 3, 4)
val v7 = Vector(1.0, 1.1, 1.2, 1.3)
v6.sum
v7.sum

v6.min
v7.min
cup.get

v6.max
v7.max

//Vectors

val myVector1 = Vector(1, 2, 3, 4, 5, 6)
val myVector2 = Vector(1, 2, 3, 4, 5, 6)

myVector1.equals(myVector2) is true































