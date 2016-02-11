import scala.Int

/**
  * Created by digibrose on 11/02/2016.
  */
object MyForecastTest extends App{

import AtomicTest._

  forecast(100) is "Sunny"
  forecast(80) is "Mostly Sunny"
  forecast(50) is "Partly Sunny"
  forecast(20) is "Mostly Sunny"
  forecast(0) is "Cloudy"
  forecast(15) is "Unknown"

val SunnyData = Vector(100, 80, 50, 20, 0)


  for (i <- SunnyData) println(forecast(i))


def forecast(temp: Int) :String = temp match {
  case 100 => "Sunny"
  case 80 => "Mostly Sunny"
  case 50 => "Partly Sunny"
  case 20 => "Mostly Cloudy"
  case 0 => "Cloudy"
  case _ => "Unknown"
}

}