package example

object Submodule3App extends Greeting3 with App {
  println(greeting)
}

trait Greeting3 {
  lazy val greeting: String = "hello from Submodule 3 changed"
}
