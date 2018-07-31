package appendix.program02

import java.text.SimpleDateFormat

object MainApplication{
  def main(args: Array[String]) {
    val date_1978_05_05 =
      new SimpleDateFormat("yyyy/MM/dd").parse("1978/05/05")
    val pl = new Person("Tarou", "Yamada", date_1978_05_05)

    println(pl.givenName)
    println(pl.familyName)
    println(pl.birthDate)
    println(pl.fullName)
  }
}
