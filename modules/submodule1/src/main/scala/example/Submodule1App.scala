package example

object Submodule1App extends Greeting1 with App {
  println(greeting)
}

trait Greeting1 {
  lazy val greeting: String = "hello from Submodule 1"
}
