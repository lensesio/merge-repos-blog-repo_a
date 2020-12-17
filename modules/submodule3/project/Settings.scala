import Dependencies.scalaTest
import sbt._
import sbt.Keys._

object Settings extends Dependencies {
  val commonSettings: Seq[Setting[_]] = Seq(
    version := "0.1.0-SNAPSHOT",
    organization := "io.lenses",
    organizationName := "Lenses.io",
    scalaOrganization := scalaOrganizationUsed,
    scalaVersion := scalaVersionUsed
  )
}
