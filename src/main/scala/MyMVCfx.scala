import Controller.MyController
import Model.MyModel
import org.scalafx.extras.mvcfx.MVCfx

class MyMVCfx(val model: MyModel = MyModel())
  extends MVCfx[MyController]("SimpleView.fxml"):

  def controllerInstance: MyController = MyController(model)