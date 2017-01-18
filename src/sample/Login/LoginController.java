package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sample.Dashboard.DashboardMain;

public class LoginController {

    @FXML
    private JFXTextField user;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton register;

    @FXML
    private JFXPasswordField pass;

    @FXML
    void makeLogin(ActionEvent event) throws Exception {
        String username = user.getText();
        String password = pass.getText();

        if(username.equals("admin") && password.equals("cougarcs214")) {
            System.out.println("Welcome, " + username + "!");
            System.out.println("Opening DashboardMain... (From LoginController)");
            new DashboardMain();

        }
        else {
            System.out.println("Incorrect credentials, try again.");
        }

    }

    @FXML
    void makeRegister(ActionEvent event) {

    }

}