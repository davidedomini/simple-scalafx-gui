package Controller

import Model.MyModel
import javafx.scene.control as jfxsc
import javafx.fxml as jfxf
import org.scalafx.extras.mvcfx.ControllerFX
import scalafx.Includes.*

class MyController(model: MyModel) extends ControllerFX :

  @jfxf.FXML
  private var pressMeButton: jfxsc.Button = _
  @jfxf.FXML
  private var countLabel: jfxsc.Label = _

  override def initialize(): Unit =
    pressMeButton.onAction = () => model.onClick()
    model.count.onChange{ (_, _, v) => countLabel.setText( "" + v) }