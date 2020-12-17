package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Submodule3aAppSpec extends AnyFlatSpec with Matchers {
  "The Submodule3aApp object" should "say hello" in {
    Submodule3aApp.greeting shouldEqual "hello from Submodule 3a"
  }
}
