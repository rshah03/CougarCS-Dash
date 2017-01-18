package sample.Dashboard;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashboardMain {

    public DashboardMain() throws Exception {
        System.out.println("Inside DashboardMain");
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        primaryStage.setTitle("CougarCS Dash - All in One");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
