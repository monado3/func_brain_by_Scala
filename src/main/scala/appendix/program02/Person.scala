package appendix.program02

import java.util.Date

/*
class Person(gn: String, fn: String, bd: Date) {
  var givenName: String = gn
  var familyName: String = fn
  var birthDate: Date = bd
*/

class Person(var givenName: String, var familyName: String, var birthDate: Date) {
  def fullName = givenName + " " + familyName
}
