package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Liiga {
    private static List<Klubi> klubid;
    private final String nimi;

    public Liiga(String nimi) {
        this.nimi = nimi;
        this.klubid = new ArrayList<>();
    }

    public static List<Klubi> getKlubid() {
        return klubid;
    }

    public void lisaKlubi(Klubi klubi) {
        klubid.add(klubi);
    }

    public Klubi getKlubi(String nimi){
        for (Klubi klubi : klubid) {
            if(nimi.equalsIgnoreCase(klubi.getNimi())) return klubi;
        }
        return null;
    }

    public List<Mängija> getKlubiMängijad(String klubinimi){
        for (Klubi klubi : klubid) {
            if(klubinimi.equalsIgnoreCase(klubi.getNimi())){
                return klubi.getMängijad();
            }
        }
        return null;
    }

    public static List<String> väravalööjad(List<Mängija> mängijad) { //Peab sorteerima kõik premium liiga mängijad väravate põhjal ja tagastama top 10;
        Collections.sort(mängijad, new Comparator<Mängija>() {
            @Override
            public int compare(Mängija nr1, Mängija nr2) {
                return nr1.getVäravad() - nr2.getVäravad();
            }
        }.reversed());
        List<String> top10 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Mängija mängija = mängijad.get(i);
            top10.add(i + 1 + ". " + mängija.getNimi() + ", väravaid: " + mängija.getVäravad());
        }
        return top10;
    }

    public static List<String> jooksjad(List<Mängija> mängijad) { //Peab sorteerima kõik Premium liiga mängijad jooksudistantsi põhjal ja tagastama top10;
        Collections.sort(mängijad, new Comparator<Mängija>() {
            @Override
            public int compare(Mängija nr1, Mängija nr2) {
                return (int)nr1.getJooks() - (int)nr2.getJooks();
            }
        }.reversed());
        List<String> top10 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Mängija mängija = mängijad.get(i);
            top10.add(i + 1 + ". " + mängija.getNimi() + ", keskmiselt joostud km: " + Math.ceil(mängija.getJooks()*100.0)/100.0);
        }
        return top10;
    }
}
