import Dependencies.{scalaOrganization, scalaTest, scalaVersion}
import sbt._

object Dependencies {
  val scalaOrganization       = "org.scala-lang"
  val scalaVersion            = "2.13.3"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"
}

trait Dependencies{
  val scalaOrganizationUsed = scalaOrganization
  val scalaVersionUsed      = scalaVersion

  val testDeps = Seq(scalaTest).map(_ % Test)
}
