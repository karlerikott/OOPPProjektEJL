package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LiigavalikController {

    public void väravad (ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("väravad.fxml"));
        Parent root = Loader.load();
        VäravadController controller = Loader.<VäravadController>getController();
        controller.SetTOP10();
        Scene scene = new Scene(root);
        Stage väravadStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        väravadStage.setScene(scene);
        väravadStage.show();
    }

    public void tagasi(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Algus.fxml"));
        Parent root = Loader.load();
        AlgusController controller =  Loader.<AlgusController>getController();
        Scene scene = new Scene(root);
        Stage AlgusStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        AlgusStage.setScene(scene);
        AlgusStage.show();
    }

    public void jooksjad(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("jooksjad.fxml"));
        Parent root = Loader.load();
        JooksjadController controller = Loader.<JooksjadController>getController();
        controller.SetTOP10();
        Scene scene = new Scene(root);
        Stage jooksjadStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        jooksjadStage.setScene(scene);
        jooksjadStage.show();
    }
}
