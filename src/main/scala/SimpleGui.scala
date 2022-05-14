import scalafx.Includes.*
import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.control.Label
import scalafx.scene.layout.BorderPane
import scalafx.scene.paint.Color.*
import scalafx.scene.shape.Rectangle
import scalafx.geometry.Insets

object SimpleGui extends JFXApp3:

  override def start(): Unit =
    stage = new JFXApp3.PrimaryStage{
      title = "Simple Gui"
      width = 800
      height = 700
      scene =  new Scene {
        root = new MyMVCfx().view
      }
    }
