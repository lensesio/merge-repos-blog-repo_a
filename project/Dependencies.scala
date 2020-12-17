import sbt._

object Dependencies {
  val scalaOrganization       = "org.scala-lang"
  val scalaVersion            = "2.12.12"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"
}

import Dependencies._

trait Dependencies{
  val scalaOrganizationUsed = scalaOrganization
  val scalaVersionUsed      = scalaVersion

  val testDeps = Seq(scalaTest).map(_ % Test)
}
