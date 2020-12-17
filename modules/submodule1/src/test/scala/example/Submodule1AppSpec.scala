package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Submodule1AppSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Submodule1App.greeting shouldEqual "hello from Submodule 1"
  }
}
