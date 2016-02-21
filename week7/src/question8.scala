object MyMain extends App {

  sealed trait LinkedList[A]{
    def head() :Option[A]
  }


  final case class Pair[A](h: A, Tail: LinkedList[A]) extends LinkedList[A] {
    def head(): Option[A] = return Some(h)
  }

final case class Empty[A]() extends LinkedList[A] {
  override def head():Option[A] = return None
}

  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))

  val list2: LinkedList[Int] = Pair(1, Empty())

  println(list.head())


  sealed trait IntList
  final case object End extends IntList
  final case class Pair2(head: Int, tail: IntList) extends IntList

  Pair2(1, Pair2(2, Pair2(3, End)))

  val d = End
  val c = Pair2(3, d)
  val b = Pair2(2, c)
  val a :IntList= Pair2(1, b)

 // println(a.head)


}
