package chap02.program04

import chap02.program03._

class MorningGreeting extends AbstractGreeting with GreetingTrait {
  override def getMessage(): String = {
    "Good morning!"
  }
}
