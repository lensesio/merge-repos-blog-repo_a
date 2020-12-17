package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Submodule2AppSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Submodule2App.greeting shouldEqual "hello from Submodule 2 (changed)"
  }
}
