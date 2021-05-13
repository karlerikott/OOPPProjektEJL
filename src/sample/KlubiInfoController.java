package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class KlubiInfoController {
    @FXML
    private Label Klubinimi,asukoht,arv;
    @FXML
    private ListView mängijatelist;



    private String klubi;

    public void setText(String klubinimi){
        this.Klubinimi.setText(klubinimi);
        this.klubi = klubinimi;
        this.asukoht.setText(Main.premiumLiiga.getKlubi(klubinimi).getAsukoht());
        int arv = Main.premiumLiiga.getKlubi(klubinimi).getMängijad().size();
        this.arv.setText(""+arv);


    }

    public void looMängijad(){
        List<Mängija> mängijad =  Main.premiumLiiga.getKlubiMängijad(klubi);
        for (Mängija mängija : mängijad) {
            mängijatelist.getItems().add(mängija.getNimi());
        }
    }

    public void mängijaValik(ActionEvent event) throws IOException {
        int valitud = mängijatelist.getSelectionModel().getSelectedIndex();
        Mängija mängija = getMängija(mängijatelist.getItems().get(valitud).toString());

        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Mängijainfo.fxml"));
        Parent root = (Parent)Loader.load();
        MängijaInfoController controller =  Loader.<MängijaInfoController>getController();
        controller.setText(mängija);
        Scene scene = new Scene(root);
        Stage klubivalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        klubivalikStage.setScene(scene);
        klubivalikStage.show();
    }

    public Mängija getMängija(String nimi){
        for (Mängija mängija : Main.mängijad) {
            if(nimi.equalsIgnoreCase(mängija.getNimi())) return mängija;
        }
        return null;
    }

    public void tagasi (ActionEvent event) throws IOException{
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("Klubivalik.fxml"));
        Parent root = Loader.load();
        KlubivalikController controller =  Loader.<KlubivalikController>getController();
        Scene scene = new Scene(root);
        Stage KlubivalikStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        KlubivalikStage.setScene(scene);
        KlubivalikStage.show();
    }
}
