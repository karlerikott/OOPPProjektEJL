package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    public static final Liiga premiumLiiga = new Liiga("Premium Liiga");

    @Override
    public void start(Stage primaryStage) throws Exception{
        Peaklass.teeLiigadKlubid();
        Parent root = FXMLLoader.load(getClass().getResource("Algus.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
