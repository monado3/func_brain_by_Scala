val list = List(1, 2, 3, 4, 5)

def getMessage(num: Int): String = {
  if (num > 3) {
    num + " is greater than 3"
  } else if (num == 3) {
    "3"
  } else {
    num + " is smaller than 3"
  }
}

for (num <- list) {
  println(getMessage(num))
}
