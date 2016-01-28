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
var sky = "sunny"
var temp = 90
val nice = sky.equals("sunny") && temp > 80
val variable = sky.equals("sunny") || sky.equals("partly cloudy")  && temp < 20 || temp > 80
sky = "partly cloudy"
variable
var Cel = 5*(temp - 32.0 )/9
var Far = (9*Cel)/5 + 32
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
object Range{
  def Step(low: Integer, high: Integer): String ={
    var i=low
    var S=""
    while(i <= high){
      S = S + i + " "
      i = i+1
    }
    S
  }

}

Range.Step(1,4)















