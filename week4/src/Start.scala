object Test {

  def name(name: String) = name
}

object A {
  def main(args: Array[String]): Unit = {
    println(Test.name("Betty"))
    assert(3 != 3, "Not correct")
  }
}
