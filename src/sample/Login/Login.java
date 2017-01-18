package sample.Login;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Stage {

    public Login() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("CougarCS Dash - All in One");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
