import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType} 

organization in ThisBuild := "com.thoughtworks.sde"

publish / skip := true

// Workaround for randomly Travis CI fail
parallelExecution in Global := false

fork in Global in compile := true

description in ThisBuild := "A collection of Scala language extension for specific domains."

lazy val core = crossProject(JVMPlatform, JSPlatform).crossType(CrossType.Pure).build

lazy val `comprehension-monad` = crossProject(JVMPlatform, JSPlatform).crossType(CrossType.Pure).build

startYear in ThisBuild := Some(2015)

ThisBuild / useCoursier := false
