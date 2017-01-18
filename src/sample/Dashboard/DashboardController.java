package sample.Dashboard;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class DashboardController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker eventDate;

    @FXML
    private Label memberNameLabel;

    @FXML
    private JFXTextField memberName;

    @FXML
    private Label memberIDLabel;

    @FXML
    private JFXTextField memberID;

    @FXML
    private JFXTextField eventName;

    @FXML
    void initialize(ActionEvent event) {
         LocalDate eventDateFetched = eventDate.getValue();
    }

    @FXML
    void initialize() {
        assert eventDate != null : "fx:id=\"eventDate\" was not injected: check your FXML file 'Dashboard.fxml'.";
        assert memberNameLabel != null : "fx:id=\"memberNameLabel\" was not injected: check your FXML file 'Dashboard.fxml'.";
        assert memberName != null : "fx:id=\"memberName\" was not injected: check your FXML file 'Dashboard.fxml'.";
        assert memberIDLabel != null : "fx:id=\"memberIDLabel\" was not injected: check your FXML file 'Dashboard.fxml'.";
        assert memberID != null : "fx:id=\"memberID\" was not injected: check your FXML file 'Dashboard.fxml'.";
        assert eventName != null : "fx:id=\"eventName\" was not injected: check your FXML file 'Dashboard.fxml'.";

    }
}
