package appendix.program01

object Application{
  def main(args: Array[String]){
    val list = List(1,2,3,4,5)

    for (num <- list){
      println(getMessage(num))
    }
  }

  def getMessage(num: Int): String = {
    if (num > 3 ){
      num + " is greater than 3"
    }else if (num ==3 ){
      "3 is 3"
    }else{
      num + " is smaller than 3"
    }
  }
}