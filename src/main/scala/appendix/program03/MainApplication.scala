package appendix.program03

import java.text.SimpleDateFormat

object MainApplication {
  def main(args: Array[String]) {
    val p1 = Person()

    val date_1978_05_05 =
      new SimpleDateFormat("yyyy/MM/dd").parse("1978/05/05")
    val p2 = new Person("Tarou", "Yamada", date_1978_05_05)

    println(p1.fullName + " /defalut:" + p1.isDefault)
    println(p2.fullName + " /defalut:" + p2.isDefault)
  }
}
