package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Submodule3bAppSpec extends AnyFlatSpec with Matchers {
  "The Submodule3bApp object" should "say hello" in {
    Submodule3bApp.greeting shouldEqual "this is the best app ever"
  }
}
