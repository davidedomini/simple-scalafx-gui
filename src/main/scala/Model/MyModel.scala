package Model

import javafx.collections.ObservableList
import javafx.concurrent as jfxc
import org.scalafx.extras.*
import org.scalafx.extras.mvcfx.ModelFX
import scalafx.Includes.*
import javafx.collections.FXCollections.*
import scalafx.beans.property.IntegerProperty
class MyModel extends ModelFX :

  val count: IntegerProperty = IntegerProperty(0)

  def onClick(): Unit =
    count.value = count.value + 1
