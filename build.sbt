name := "view-twitter-stream"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "4.0.6",
  "org.twitter4j" % "twitter4j-stream" % "4.0.6"
)