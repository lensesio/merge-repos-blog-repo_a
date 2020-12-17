package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Submodule3AppSpec extends AnyFlatSpec with Matchers {
  "The Submodule3App object" should "say hello" in {
    Submodule3App.greeting shouldEqual "hello from Submodule 3 changed"
  }
}
