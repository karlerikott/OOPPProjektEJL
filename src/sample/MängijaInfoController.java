package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MängijaInfoController {
    @FXML
    private Label mängija,arv,klubi,särk,väravad,distants;

    public void setText(Mängija mängija){
        this.mängija.setText(mängija.getNimi());
        this.arv.setText(mängija.getVanus()+"");
        this.klubi.setText(mängija.getKlubi());
        this.särk.setText(mängija.getSärk()+"");
        this.väravad.setText(mängija.getVäravad()+"");
        String jooks = mängija.getJooks()+"";
        this.distants.setText(jooks.substring(0,4));
    }
}
