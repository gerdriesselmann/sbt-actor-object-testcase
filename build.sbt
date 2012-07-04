organization := "com.gerdriesselmann"

name := "sbttest"

version := "0.1"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1"
)

fork := true

javaOptions ++= Seq("-XX:+UseConcMarkSweepGC", "-Xmx1G")
