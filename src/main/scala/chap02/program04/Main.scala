package chap02.program04

object Main {
  def main(args: Array[String]): Unit = {
    val mg: GreetingTrait = new MorningGreeting
    println(mg.getMessage())
  }
}
