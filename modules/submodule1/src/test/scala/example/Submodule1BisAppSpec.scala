package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Submodule1BisAppSpec extends AnyFlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Submodule1BisApp.greeting shouldEqual "hello from Submodule 1 once again"
  }
}
