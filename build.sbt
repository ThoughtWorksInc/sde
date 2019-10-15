organization in ThisBuild := "com.thoughtworks.sde"

publish / skip := true

// Workaround for randomly Travis CI fail
parallelExecution in Global := false

fork in Global in compile := true

description in ThisBuild := "A collection of Scala language extension for specific domains."

lazy val core = crossProject.crossType(CrossType.Pure)

lazy val coreJVM = core.jvm

lazy val coreJS = core.js

lazy val `comprehension-monad` = crossProject.crossType(CrossType.Pure)

lazy val `comprehension-monadJVM` = `comprehension-monad`.jvm

lazy val `comprehension-monadJS` = `comprehension-monad`.js

startYear in ThisBuild := Some(2015)

ThisBuild / useCoursier := false
