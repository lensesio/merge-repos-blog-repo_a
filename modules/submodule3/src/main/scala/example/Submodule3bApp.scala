package example

object Submodule3bApp extends Greeting3b with App {
  println(greeting)
}

trait Greeting3b {
  lazy val greeting: String = "this is the best app ever"
}
