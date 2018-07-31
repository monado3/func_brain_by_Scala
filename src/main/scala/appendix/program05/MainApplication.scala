package appendix.program05

object MainApplication {
  def main(args: Array[String]): Unit = {
    val np: Person = new NaturalPerson("Taro", "Yamada")
    println(np.name)

    val lp: Person = new LegalPerson("Foo Co., Ltd.")
    print(lp.name)
  }
}
