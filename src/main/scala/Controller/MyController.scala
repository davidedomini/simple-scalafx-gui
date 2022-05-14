package Controller

import Model.MyModel
import javafx.scene.control as jfxsc
import javafx.fxml as jfxf
import org.scalafx.extras.mvcfx.ControllerFX
import scalafx.Includes.*

class MyController(model: MyModel) extends ControllerFX :

  @jfxf.FXML
  private var pressMeButton: jfxsc.Button = _
  private var pressList: jfxsc.ListView[String] = _

  override def initialize(): Unit =
    println("initialize")
    pressMeButton.onAction = () => model.onClick()
    pressList.setItems(model.pressItems)