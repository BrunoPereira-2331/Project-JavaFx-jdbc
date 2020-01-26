package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

//fonte: https://github.com/acenelio/javafx5/blob/master/src/gui/util/Alerts.java
public class Alerts {

	public static void showAlert(String title, String header, String content, AlertType type) {
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(header);
		alert.setContentText(content);
		alert.show();
	}
}