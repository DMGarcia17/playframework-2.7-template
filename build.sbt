name := """admin-lte-3.0-play-framework"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  javaJdbc,
  "com.typesafe.play" %% "play-guice" % "2.7.3",
  "org.postgresql" % "postgresql" % "9.4-1202-jdbc42"
)
