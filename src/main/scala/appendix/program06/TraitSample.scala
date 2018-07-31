package appendix.program06

class Base {
  def decorate(strings: String) = println(strings)
}

trait Strong extends Base {
  abstract override def decorate(strings: String): Unit = super.decorate("* " + strings + " *")
}

trait Lines extends Base {
  abstract override def decorate(strings: String): Unit = {
    val line = Array.fill(strings.length)("*").mkString
    super.decorate(line + "\n" + strings + "\n" + line)
  }
}

class DecoratedText extends Base with Lines with Strong