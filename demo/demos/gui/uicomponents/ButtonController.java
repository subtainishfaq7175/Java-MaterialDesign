package demos.gui.uicomponents;

import com.jfoenix.controls.JFXHamburger;
import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.Flow;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.flow.FlowHandler;
import io.datafx.controller.flow.context.FXMLViewFlowContext;
import io.datafx.controller.flow.context.ViewFlowContext;
import io.datafx.controller.util.VetoException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import javax.annotation.PostConstruct;

@FXMLController(value = "/resources/fxml/ui/Button.fxml" , title = "AmmaraTimeTable")
public class ButtonController {
	
	@FXMLViewFlowContext
	private ViewFlowContext context;
@FXML
private Button generatetable;
	@PostConstruct
	public void init() throws FlowException, VetoException {
        generatetable.setOnMouseClicked((e)->{

            FlowHandler contentFlowHandler = (FlowHandler) context.getRegisteredObject("ContentFlowHandler");

            Flow contentFlow = (Flow) context.getRegisteredObject("ContentFlow");
            try {
                contentFlowHandler.handle("facultyView");
            } catch (VetoException e1) {
                e1.printStackTrace();
            } catch (FlowException e1) {
                e1.printStackTrace();
            }

        });


    }



}
