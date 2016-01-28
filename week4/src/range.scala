/**
  * Created by digibrose on 28/01/2016.
  */
object Range{

  def Step(low: Integer, high: Integer): String ={
    var i=low
    var S=""
    while(i <= high){
      S = S + i + " "
    }
    S
  }

}

object RangeTest {
  def Main(args: Array[String]): Unit = {
    println(Range.Step(1, 5))
  }
}