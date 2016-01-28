/**
  * Created by digibrose on 28/01/2016.
  */


  object test extends App{


    def manyTimesString(S: String, num: Int): String = {
      var i = 0
      var SS: String = ""

      while (i <= num) {
        SS += SS + S
        i = i + 1
      }
      SS
    }

    println(manyTimesString("Test ", 2))
  }


