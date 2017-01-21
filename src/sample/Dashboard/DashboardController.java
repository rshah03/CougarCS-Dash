package sample.Dashboard;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;

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
    private JFXButton checkinButton;

    @FXML
    private JFXTextField memberNamePayment;

    @FXML
    private JFXTextField memberIDPayment;

    @FXML
    private DatePicker paymentDate;

    ObservableList<String> paymentOptions = FXCollections.observableArrayList(
            "Cash",
            "Credit",
            "Check"
    );
    @FXML
    final private ComboBox paymentMethod = new ComboBox(paymentOptions);

    @FXML
    private JFXButton confirmPayment;

    @FXML
    void initCheckin(ActionEvent event) {
        String name = memberName.getText();
        String id = memberID.getText();
        String eventTitle = eventName.getText();
        LocalDate eventDateFetched = eventDate.getValue();

        if(!(name.equals("") && id.equals("") && eventTitle.equals("") && eventDateFetched.equals(""))) {
            //S.o.p is here for testing/development purposes
            System.out.println("Will submit the following details: \n" +
                    "Member Name: " + name + "\n" +
                    "Member ID: " + id + "\n" +
                    "Event Name: " + eventTitle + "\n" +
                    "Event Date: " + eventDateFetched + "\n");
        }
        else {
            System.out.println("Please enter valid details");
            //Change above to a dialog box and not S.o.p
        }
    }


    @FXML
    void initPayment(ActionEvent event) {
        String payerName = memberNamePayment.getText();
        String payerID = memberIDPayment.getText();
        LocalDate paymentDateFetched = paymentDate.getValue();
        String method = (String) paymentMethod.getValue();

        if(!(memberNamePayment.equals("") &&
                memberIDPayment.equals("") &&
                paymentDateFetched.equals("") &&
                paymentMethod.getValue() != null &&
                !method.isEmpty()
        )) {
            System.out.println("Member Name: " + payerName + "\n" +
                    "Member ID: " + payerID + "\n" +
                    "Date Paid: " + paymentDateFetched + "\n" +
                    "Payment Method: " + method + "\n"
            );
        } else {
            System.err.println("ERROR IN PAYMENT");
        }
    }

    @FXML
    void initialize(ActionEvent event) {

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
