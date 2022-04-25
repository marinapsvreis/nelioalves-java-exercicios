package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		//Alerts.showAlert("Alert Title", "Alert Header", "Hello", AlertType.INFORMATION);
		//Alerts.showAlert("Alert Title", "Alert Header", "Hello", AlertType.ERROR);
		Alerts.showAlert("Alert Title", null, "Hello", AlertType.ERROR);
	}
}
