package example

object Submodule2App extends Greeting2 with App {
  println(greeting)
}

trait Greeting2 {
  lazy val greeting: String = "hello from Submodule 2 (changed)"
}
