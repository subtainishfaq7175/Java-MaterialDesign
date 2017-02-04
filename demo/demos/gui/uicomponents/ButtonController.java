package demos.gui.uicomponents;

import io.datafx.controller.FXMLController;
import io.datafx.controller.flow.FlowException;
import io.datafx.controller.flow.action.ActionTrigger;
import io.datafx.controller.flow.context.FXMLViewFlowContext;
import io.datafx.controller.flow.context.ViewFlowContext;
import io.datafx.controller.util.VetoException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import javax.annotation.PostConstruct;

@FXMLController(value = "/resources/fxml/ui/Button.fxml" , title = "Material Design Example")
public class ButtonController {

    @FXML
    @ActionTrigger("generatetable")
    private Button generateTable;
	
	@FXMLViewFlowContext
	private ViewFlowContext context;

	@PostConstruct
	public void init() throws FlowException, VetoException {

    generateTable.setOnMouseClicked(event ->  {
        System.out.print("hello");

    });
    }

}
