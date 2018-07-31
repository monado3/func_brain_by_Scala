package appendix.program03

import java.util.Date

class Person(var givenName: String, var familyName: String, var birthDate: Date) {
  def fullName = givenName + " " + familyName

  import Person._

  def isDefault = {
    if (givenName == defaultGivenName &&
      familyName == defaultFamilyName) {
      true
    } else {
      false
    }
  }
}

object Person {
  val defaultGivenName = "Martin"
  val defaultFamilyName = "Odersky"

  def apply(givenName: String, familyName: String, birthDate: Date) = {
    new Person(givenName, familyName, birthDate)
  }

  def apply() = {
    new Person(defaultGivenName, defaultFamilyName, new Date)
  }
}