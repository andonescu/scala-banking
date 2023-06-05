ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "Scala-Banking",
    idePackagePrefix := Some("ro.andonescu.scala.banking")
  )

libraryDependencies += "org.typelevel" %% "cats-effect" % "3.6-0142603"