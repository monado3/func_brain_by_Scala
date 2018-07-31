package appendix.program04

class ASuper {
  val aSuperValue = "ASuper"

  def aSuperMethod = this.getClass

  def commonMethod = println(aSuperValue + " " + this.getClass)
}

class A extends ASuper {
  val aValue = "A"

  def aMethod = this.getClass

  override def commonMethod = {
    super.commonMethod
    println(aValue + " " + this.getClass)
  }
}

class ASub extends A {
  val aSubValue = "ASub"

  def aSubMethod = this.getClass

  override def commonMethod = {
    super.commonMethod
    println(aSubValue + " " + this.getClass)
  }
}
