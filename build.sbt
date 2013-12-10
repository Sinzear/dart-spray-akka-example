name := "sprayDartGiter8"

version := "0.1.0"

scalaVersion := "2.10.2"

resolvers ++= Seq(
  "spray" at "http://repo.spray.io/",
  "Spray Nightlies" at "http://nightlies.spray.io/",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.0",
  "io.spray" % "spray-can" % "1.2-20130712",
  "io.spray" %% "spray-json" % "1.2.5",
  "io.spray" % "spray-routing" % "1.2-20130710"
)