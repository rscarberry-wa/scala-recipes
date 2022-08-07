ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "scala-recipes"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.15.4" % Test
libraryDependencies += "org.scalatestplus" %% "scalatestplus-scalacheck" % "3.1.0.0-RC2" % Test