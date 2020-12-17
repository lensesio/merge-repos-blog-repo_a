package example

object Submodule1BisApp extends Greeting1Bis with App {
  println(greeting)
}

trait Greeting1Bis {
  lazy val greeting: String = "hello from Submodule 1 once again"
}
