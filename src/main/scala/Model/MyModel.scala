package Model

import javafx.collections.ObservableList
import javafx.concurrent as jfxc
import org.scalafx.extras.*
import org.scalafx.extras.mvcfx.ModelFX
import scalafx.Includes.*
import javafx.collections.FXCollections.*

class MyModel extends ModelFX :

  val pressItems: ObservableList[String] = emptyObservableList()

  def onClick(): Unit =
    println("pressed")
    pressItems.add("Pressed")

