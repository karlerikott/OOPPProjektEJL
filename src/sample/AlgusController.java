package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AlgusController {

    public void LiigaNupp(ActionEvent event) throws IOException{
        Parent liigaParent = FXMLLoader.load(getClass().getResource("Liigavalik.fxml"));
        Scene liigavalik = new Scene(liigaParent);
        Stage liigavalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        liigavalikStage.setScene(liigavalik);
        liigavalikStage.show();
    }

    public void KlubiNupp(ActionEvent event) throws IOException {
        Parent klubiParent = FXMLLoader.load(getClass().getResource("Klubivalik.fxml"));
        Scene klubivalik = new Scene(klubiParent);
        Stage klubivalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        klubivalikStage.setScene(klubivalik);
        klubivalikStage.show();
    }

    public void lõpeta(ActionEvent event) {
        if (Main.mängijadSalvestamiseks.size() != 0) {
            try (FileWriter out = new FileWriter(new File("info.txt"))) {
                for (Mängija mängija : Main.mängijadSalvestamiseks) {
                    String info = "Nimi: " + mängija.getNimi() +
                            ", Vanus: " + mängija.getVanus() +
                            ", Klubi: " + mängija.getKlubi() +
                            ", Särgi number: " + mängija.getSärk() +
                            ", Väravaid: " + mängija.getVäravad() +
                            ", Keskmiselt joostud km: " + mängija.getJooks() + "\n";
                    out.write(info);
                }
            } catch (IOException e) {
                System.out.println("Error failist lugemisel!");
            }
        }
        System.exit(0);
    }

}
