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
import java.util.List;

public class JooksjadController {
    @FXML
    private Label top1, top2, top3, top4, top5, top6, top7, top8, top9, top10;

    public void tagasi(ActionEvent event) throws IOException {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Liigavalik.fxml"));
        Parent root = Loader.load();
        LiigavalikController controller =  Loader.<LiigavalikController>getController();
        Scene scene = new Scene(root);
        Stage LiigavalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        LiigavalikStage.setScene(scene);
        LiigavalikStage.show();
    }


    public void SetTOP10() {
        List<String> top10väravad = Liiga.jooksjad(Main.mängijad);
        this.top1.setText(top10väravad.get(0));
        this.top2.setText(top10väravad.get(1));
        this.top3.setText(top10väravad.get(2));
        this.top4.setText(top10väravad.get(3));
        this.top5.setText(top10väravad.get(4));
        this.top6.setText(top10väravad.get(5));
        this.top7.setText(top10väravad.get(6));
        this.top8.setText(top10väravad.get(7));
        this.top9.setText(top10väravad.get(8));
        this.top10.setText(top10väravad.get(9));
    }
}
