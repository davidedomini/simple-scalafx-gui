import sbt.Keys.libraryDependencies
name := "simple-scalafx-gui"

version := "0.1"

scalaVersion := "3.1.2"

/*
scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-encoding",
  "utf8",
  "-feature",
  "-Ymacro-annotations",
  "-language:implicitConversions"
)
*/
// Add dependency on ScalaFX library
libraryDependencies += "org.scalafx" %% "scalafx" % "16.0.0-R25"
//libraryDependencies += "org.scalafx" %% "scalafxml-core-sfx8" % "0.5"
libraryDependencies += "org.scalafx" %% "scalafx-extras" % "0.5.0"

// Determine OS version of JavaFX binaries
lazy val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux")   => "linux"
  case n if n.startsWith("Mac")     => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}

// Add dependency on JavaFX libraries, OS dependent
lazy val javaFXModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
libraryDependencies ++= javaFXModules.map(m =>
  "org.openjfx" % s"javafx-$m" % "16" classifier osName
)


/*
// Add dependency on ScalaFX library
libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "16.0.0-R24",
  "org.scalafx" %% "scalafxml-core-sfx8" % "0.5"
)


// Add JavaFX dependencies
libraryDependencies ++= {
  // Determine OS version of JavaFX binaries
  lazy val osName = System.getProperty("os.name") match {
    case n if n.startsWith("Linux")   => "linux"
    case n if n.startsWith("Mac")     => "mac"
    case n if n.startsWith("Windows") => "win"
    case _                            => throw new Exception("Unknown platform!")
  }
  Seq("base", "controls", "fxml", "graphics", "media", "swing", "web").map(m =>
    "org.openjfx" % s"javafx-$m" % "16" classifier osName
  )
}

// Add ScalaTest dependencies
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

//Add Cats dependencies
libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"
libraryDependencies += "org.typelevel" %% "cats-effect" % "2.2.0"
// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true*/