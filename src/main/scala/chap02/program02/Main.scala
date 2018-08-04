package chap02.program02

object Main {
  def main(args: Array[String]): Unit = {
    val hello = new HelloSub
    println(hello.getMessage)
    hello.printMessage()
  }
}
