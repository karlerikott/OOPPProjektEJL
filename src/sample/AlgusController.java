package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AlgusController {

    public void LiigaNupp(){
        System.out.println("Vajutati Liiga");
    }

    public void KlubiNupp(ActionEvent event) throws IOException {
        Parent klubiParent = FXMLLoader.load(getClass().getResource("Klubivalik.fxml"));
        Scene klubivalik = new Scene(klubiParent);
        Stage klubivalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        klubivalikStage.setScene(klubivalik);
        klubivalikStage.show();
    }

    public void MängijaNupp(){
        System.out.println("Vajutati Mängija");
    }

}
