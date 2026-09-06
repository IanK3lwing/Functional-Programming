ThisBuild / organization := "practice"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.16"

Compile / scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked"
)

Compile / javacOptions ++= Seq(
  "-Xlint:all"
)

Test / parallelExecution := false