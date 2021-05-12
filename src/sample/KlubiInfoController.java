package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.List;

public class KlubiInfoController {
    @FXML
    private Label Klubinimi,asukoht;
    @FXML
    private ListView mängijatelist;

    private String klubi;

    public void setText(String klubinimi){
        this.Klubinimi.setText(klubinimi);
        this.klubi = klubinimi;
        this.asukoht.setText(Main.premiumLiiga.getKlubi(klubinimi).getAsukoht());

    }

    public void looMängijad(){
        List<Mängija> mängijad =  Main.premiumLiiga.getKlubiMängijad(klubi);
        for (Mängija mängija : mängijad) {
            mängijatelist.getItems().add(mängija.getNimi());
        }
    }
}
