package chap03.program04

class MyMath {
  def max(a: Int, b: Int): Int = if (a > b) a else b
}

object Driver {
  def main(args: Array[String]): Unit = {
    var myMath = new MyMath
    println(myMath.max(10, 20))
  }
}