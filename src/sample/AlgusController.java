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

    public void LiigaNupp(ActionEvent event) throws IOException{
        Parent liigaParent = FXMLLoader.load(getClass().getResource("Liigavalik.fxml"));
        Scene liigavalik = new Scene(liigaParent);
        Stage liigavalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        liigavalikStage.setScene(liigavalik);
        liigavalikStage.show();
        System.out.println("Vajutati Liiga");
    }

    public void KlubiNupp(ActionEvent event) throws IOException {
        Parent klubiParent = FXMLLoader.load(getClass().getResource("Klubivalik.fxml"));
        Scene klubivalik = new Scene(klubiParent);
        Stage klubivalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        klubivalikStage.setScene(klubivalik);
        klubivalikStage.show();
    }

}
