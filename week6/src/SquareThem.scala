/**
  * Created by digibrose on 11/02/2016.
  */
import AtomicTest._

object SquareThemtest extends App {

  SquareThem(2) is 4
  SquareThem(2, 4) is 20
  SquareThem(1, 2, 4) is 21

}

object SquareThem {
  def apply(num: Int*): Int = {
    var j = 0
    for (i <- num) j = j + (i * i)
    return j
  }
}

