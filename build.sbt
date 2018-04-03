name := "view-twitter-stream"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "org.twitter4j" % "twitter4j-core" % "4.0.6",
  "org.twitter4j" % "twitter4j-stream" % "4.0.6"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xfuture",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-unused-import",
  "-Ywarn-value-discard"
)

assemblyMergeStrategy in assembly := {
  case PathList("javax", "servlet", xs @ _*)         => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".html" => MergeStrategy.first
  case "application.conf"                            => MergeStrategy.concat
  case "unwanted.txt"                                => MergeStrategy.discard
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}
