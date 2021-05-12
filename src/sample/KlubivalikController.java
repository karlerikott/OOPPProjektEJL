package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class KlubivalikController {
    @FXML
    private Button Flora, Levadia, Kure, Tammeka;

    public void FloraNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati Flora");
        goNextScene("FC Flora",event);
    }
    public void LevadiaNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("FCI Levadia",event);
    }
    public void KureNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("FC Kuressaare",event);

    }
    public void TammekaNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("Tartu JK Tammeka",event);

    }
    public void KaljuNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("Nõmme Kalju FC",event);

    }
    public void PaideNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("Paide Linnameeskond",event);

    }
    public void ViljandiNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("Viljandi JK Tulevik",event);

    }
    public void KaleviNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("JK Tallinna Kalev",event);

    }
    public void TransiNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("JK Narva Trans",event);

    }
    public void LegioniNupp(ActionEvent event) throws IOException {
        System.out.println("Vajutati kure");
        goNextScene("JK Legion",event);
    }

    public void goNextScene(String nimi, ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Klubiinfo.fxml"));
        Parent root = (Parent)Loader.load();
        KlubiInfoController controller =  Loader.<KlubiInfoController>getController();
        controller.setText(nimi);
        controller.looMängijad();
        Scene scene = new Scene(root);
        Stage klubivalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        klubivalikStage.setScene(scene);
        klubivalikStage.show();
    }


}
