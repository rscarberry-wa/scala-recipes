package rscarberry.recipes.scalatest

import org.scalatest.funspec.AnyFunSpec

/**
 * The funspec lets you take the BDD (behavior driven development) approach.
 */
class BasicFunSpec extends AnyFunSpec {

  describe("an account") {

    describe("when being created") {

      it ("should throw an exception if given a negative balance") {
        assertThrows[IllegalArgumentException] {
          Account("freddy", "krueger", -10)
        }
      }

      it ("should throw an exception if given a blank first name") {
        assertThrows[IllegalArgumentException] {
          Account("", "krueger", 100)
        }
      }

      it ("should throw an exception if given a blank last name") {
        assertThrows[IllegalArgumentException] {
          Account("freddy", "", 100)
        }
      }

      it ("should provide a correctly formatted full name for the account holder") {
        assertResult("Freddy Krueger") {
          Account("freddy", "krueger", 100).getAccountFullName
        }
      }
    }
  }

}

case class Account(firstName: String, lastName: String, balance: Int) {
  require(firstName != null && !firstName.isEmpty, "first name is required")
  require(lastName != null && !lastName.isEmpty, "last name is required")
  require(balance >= 0, s"balance cannot be negative: $balance")
  def getAccountFullName = s"${firstName.toLowerCase.capitalize} ${lastName.toLowerCase.capitalize}"
}
