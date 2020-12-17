import sbt._
import Settings._

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "RepoA",
    libraryDependencies ++= testDeps,
    description := "Root of the project",
    publish / skip := true
  ).aggregate(submodule1, submodule2)


lazy val submodule1 = (project in file("modules/submodule1"))
  .settings(commonSettings)
  .settings(
    name := "Submodule1",
    libraryDependencies ++= testDeps,
    description := "Code for submodule 1",
  )


lazy val submodule2 = (project in file("modules/submodule2"))
  .settings(commonSettings)
  .settings(
    name := "Submodule2",
    libraryDependencies ++= testDeps,
    description := "Code for submodule 2",
  )

