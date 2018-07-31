package appendix.program05

abstract class Person {
  def name: String
}

class NaturalPerson(val givenName: String, val familyName: String) extends Person {
  override def name: String = givenName + " " + familyName
}

class LegalPerson(val corporateName: String) extends Person {
  override def name: String = corporateName
}