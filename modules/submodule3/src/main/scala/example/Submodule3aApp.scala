package example

object Submodule3aApp extends Greeting3a with App {
  println(greeting)
}

trait Greeting3a {
  lazy val greeting: String = "hello from Submodule 3a"
}
