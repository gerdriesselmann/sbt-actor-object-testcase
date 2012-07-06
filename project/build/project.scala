import sbt._

class TestProject(info:ProjectInfo) extends DefaultProject(info) {
 val spec = "org.scalatest" %% "scalatest" % "1.6.1"

}
