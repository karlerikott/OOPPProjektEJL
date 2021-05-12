package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MängijaInfoController {
    private Mängija player;
    @FXML
    private Label mängija, arv, klubi, särk, väravad, distants;

    public void setText(Mängija mängija){
        this.player = mängija;
        this.mängija.setText(mängija.getNimi());
        this.arv.setText(mängija.getVanus()+"");
        this.klubi.setText(mängija.getKlubi());
        this.särk.setText(mängija.getSärk()+"");
        this.väravad.setText(mängija.getVäravad()+"");
        String jooks = mängija.getJooks()+"";
        this.distants.setText(jooks.substring(0,4));
    }

    public void tagasi(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Klubivalik.fxml"));
        Parent root = Loader.load();
        KlubivalikController controller =  Loader.<KlubivalikController>getController();
        Scene scene = new Scene(root);
        Stage KlubivalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        KlubivalikStage.setScene(scene);
        KlubivalikStage.show();
    }

    public void salvestaMängija(ActionEvent event) throws IOException {
        Main.mängijadSalvestamiseks.add(player);
        tagasi(event);
    }
}
