name := "CodilityScala"

version := "2.0"

scalaVersion := "2.13.4"

val scalacticVersion: String = "3.2.3"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.0",
  "org.scalactic" %% "scalactic" % scalacticVersion,
  "org.scalatest" %% "scalatest" % scalacticVersion % "test"
)

addCompilerPlugin(
  "org.wartremover" %% "wartremover" % "2.4.13" cross CrossVersion.full
)
//wartremoverWarnings ++= Warts.unsafe

scalacOptions ++= Seq("-deprecation", "-Xlint")
