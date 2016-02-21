import java.io.FileWriter

import sun.font.TrueTypeFont

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
//question 1a
val v = Vector(1, 2, 3, 4)
 v.map(n => n + 1) is Vector(2, 3, 4, 5)
v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)
//question 1b
val v2 = v.foreach(n => n + 1)

v2 is Vector(2, 3, 4, 5)
//foreach doesn't return anything and is meant for sideeffects only
//question 1c
for (i <- v) yield i + 1
for (i <- v) yield i * 10 + 11
val v3 = for (i <- v) yield i + 2
v3 is Vector(3, 4, 5, 6)
//question 2
val v4 = for (i <- v) yield i + 1
  v4 is Vector(2, 3, 4, 5)
//question 3
val v5 = Vector(1, 10, 100, 1000)
v5.reduce((sum, n) => sum + n) is 1111
var v6 = 0
for (n <- v5) v6 = v6 + n
v6 is 1111
//question 4
def sumIt( n : Int*) :Int =
  n.reduce( (value, n) => value + n)
val v7 = sumIt(1, 2, 3, 4)
//question 5
sealed trait Shape {
  var  c :Colour
  def sides() :Int
  def perimeter() :Double
  def area() :Double
}
case class circle(r :Int, C :Colour) extends Shape {
  override def sides(): Int = 1
  override def perimeter(): Double = 2*math.Pi*r
  override def area(): Double = math.Pi*(r*r)

  override var c: Colour = C
}

abstract class rectangular extends Shape
case class rectangle(a :Double, b :Double, C :Colour) extends rectangular {
  override def sides(): Int = 4

  override def perimeter(): Double = a*2 + b*2

  override def area(): Double = a*b

  override var c: Colour = C
}
case class square(a :Double, C: Colour) extends rectangular {
  override def sides(): Int = 4
  override def perimeter(): Double = a*4

  override def area(): Double = a*a

  override var c: Colour = C
}
//question 5c
object Draw{

  def apply(S : Shape): String ={
    S match {
      case circle(r, c :Colour) => "A circle of radius " + r + "cm and coloured " + c
      case rectangle(a, b, c : Colour) => "A rectangle of width " + a + "cm and height " + b + "cm and coloured " + c
      case square(a, c :Colour) => "A square with " + a + "cm sides and coloured " +c
      case circle(r, c :newColour) => "A circle of radius " + r + "cm and coloured " + lightTest(c)
      case rectangle(a, b, c : newColour) => "A rectangle of width " + a + "cm and height " + b + "cm and coloured " + lightTest(c)
      case square(a, c :newColour) => "A square with " + a + "cm sides and coloured " + lightTest(c)
    }
  }
}
Draw(circle(10, new Red))
Draw(square(5, new Yellow))

//question 5d

sealed trait Colour {
  var R: Int
  var G: Int
  var B: Int
  def setRGB(r: Int, g: Int, b: Int): Unit ={
    R=r
    G=g
    B=b
  }
}

class newColour(r :Int, g : Int, b :Int) extends Colour {
  override var R: Int = r
  override var G: Int = g
  override var B: Int = b

  override def toString(): String
  ="RGB = " + R + " " + G + " " + B
}

case class Red(r :Int = 255, g :Int = 0, b :Int =0) extends Colour{
  override var R: Int = r
  override var G: Int = g
  override var B: Int = b
}

case class Pink(r :Int = 255, g :Int = 192, b :Int = 200) extends Colour{
  override var R: Int = r
  override var G: Int = g
  override var B: Int = b
}
case class Yellow(r :Int = 255, g :Int = 255, b :Int = 0) extends Colour{
  override var R: Int = r
  override var G: Int = g
  override var B: Int = b
}


var Blue = new newColour(0, 0, 255)

def lightTest( c :Colour): Boolean ={

  if (c.R > 200 || c.G > 200 || c.B > 200) true else false

}

lightTest(Blue)
Draw(new square(30, new Red))
Draw(new rectangle(30, 20, new newColour(0, 0, 255)))
//Question 6

sealed trait DivisionResult

case class Finite( r :Int) extends DivisionResult
case class Infinite() extends DivisionResult
object Divide{
def apply(a :Int, b :Int) :DivisionResult = {
if (b == 0) return new Infinite else return new Finite(a/b)
}
}
Divide(1,2)
Divide(1,0)
def Divider(a:Int, b:Int): String ={
  Divide(a, b) match {
    case Finite(r) => "A value of "  + r
    case Infinite() => "Can't divide by zero"
  }
}

Divider(1, 2)
Divider(2, 0)
//question 7

trait publication

class Manuscript(Length :Int)

case class book(Aut :String, Text :Manuscript) extends publication
case class periodical(vol :Int, Iss :Int, Ed :String, Scripts :Seq[Manuscript]) extends publication
//question 8
sealed trait LinkedList[A] {
  def head :A
  def tail :LinkedList[A]
  def length() :Int
  def apply(n :Int) :Option[A]
}
final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A] {
  override def length() :Int = 1 + tail.length()
  override def apply(n :Int) :Option[A] = if (n > length) return None
  else if (n == length()) return Some(head)
  else { return tail.apply(n)
  }
}

final case class Empty[A]() extends LinkedList[A] {
  override def head: A = ???
  override def tail: LinkedList[A] = ???
  override def length() = 0
  override def apply(n :Int) = None
}
val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))

val list2: LinkedList[Int] = Pair(1, Empty())
list.head
list.tail.head
list.tail.tail
list.length()
list.apply(1)
list.apply(2)
list.apply(3)
list.apply(4)
list.apply(5)
































































