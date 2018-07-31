package appendix.program06

object MainApplication {
  def main(args: Array[String]): Unit = {
    val text1 = new Base with Strong
    text1.decorate("test1")
    val text2 = new Base with Lines
    text2.decorate("test2")
    val text3 = new DecoratedText
    text3.decorate("test3")
  }
}
