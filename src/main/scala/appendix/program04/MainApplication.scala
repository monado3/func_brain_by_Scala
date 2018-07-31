package appendix.program04

object MainApplication {
  def main(args: Array[String]) {
    val aSub = new ASub
    println(aSub.aSuperValue)
    println(aSub.aSuperMethod)
    println(aSub.aValue)
    println(aSub.aMethod)
    println(aSub.aSubValue)
    println(aSub.aSubMethod)
    aSub.commonMethod
  }
}
