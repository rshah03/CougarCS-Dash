package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Login.Login;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        new Login();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
