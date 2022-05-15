# simple-scalafx-gui

This project aims to investigate how to build a gui with scalafx and fxml files

## Requirements 

The following dependencies are required:
- sbt v1.6.2 - Build tool required to execute the source code or tests
- Scala v3.1.2
- JVM >= v1.11 - Java Virtual Machine on which is executed Scala

## Why fxml ?

Fxml files are used to build GUIs in a efficent way, instead of define yourself the GUI in the code you can use a graphic drag-and-drop tool (like [SceneBuilder](https://www.oracle.com/java/technologies/javase/javafxscenebuilder-info.html) ) and export it in a `.fxml` file. Since this option is not included in the  `scalafx-core` you have to add in the  `sbt.build` file the following dependency: `libraryDependencies += "org.scalafx" %% "scalafx-extras" % "0.5.0"`

## And then ?
Once you have created the fxml files you have to import the static GUI in your Scala application, you need some components:
- __Controller__: can be used to bind static elements of the GUI with a dynamic behavior (which is contained in the model)
- __Model__: contains the business logic of the gui 
- __JFX3App__: instantiate the gui
- __MVCfx__: load the `.fxml` file

