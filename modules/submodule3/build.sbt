import Settings._

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "RepoB",
    libraryDependencies ++= testDeps,
    description := "Root of the project RepoB"
  )
