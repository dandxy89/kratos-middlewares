organization := "com.dandxy89"
scalaVersion := "2.12.10"
version := "0.0.1-SNAPSHOT"
name := "kratos-middleware"

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(
    Defaults.itSettings,
    libraryDependencies ++= ProjectDependencies(),
    ScalacOptions.settings
  )

Test / fork := false
Test / testForkedParallel := false
IntegrationTest / fork := false
IntegrationTest / testForkedParallel := false
publishArtifact := false
publishArtifact in (Compile, packageBin) := true
