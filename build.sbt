
scalaVersion in ThisBuild := "2.12.6"

val enumeratumVersion = "1.5.13"

lazy val root = project
  .in(file("."))
  .aggregate(sharedJS, sharedJVM)
  .settings(
    publish := {},
    publishLocal := {}
  )

lazy val shared = crossProject
  .in(file("."))
  .settings(
    name := "shared",
    organization := "org.bitbucket.wakfuthesaurus",
    version := "0.2-SNAPSHOT",
    libraryDependencies ++= Seq(
      "com.beachape" %%% "enumeratum" % enumeratumVersion
    )
  )

lazy val sharedJS = shared.js
lazy val sharedJVM = shared.jvm
