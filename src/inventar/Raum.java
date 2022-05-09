package inventar;

import java.util.ArrayList;

public class Raum  {
    private final String raumNr;
    private Techniker techniker;
    private ArrayList<Moebelstueck> moebelListe = new ArrayList<Moebelstueck>();

    public Raum(String raumNr) {
        this.raumNr = raumNr;
    }

    public String getRaumNr() {
        return raumNr;
    }

    public Techniker getTechniker() {
        return techniker;
    }

    public void setTechniker(Techniker techniker) {
        this.techniker = techniker;
    }

    public void addMoebel(Moebelstueck moebel) {
        moebelListe.add(moebel);
    }

    public Moebelstueck getMoebel(String inventarNr) throws MoebelNichtGefundenException {
        Moebelstueck inventar = moebelListe.get(0);
        for (int i = 0;i < moebelListe.size();i++) {
            if (moebelListe.get(i).getInventarNr() == inventarNr) {
                inventar = moebelListe.get(i);
            } else inventar = null;

        }
        if (inventar == null) {
            throw new MoebelNichtGefundenException(inventarNr);
        }
        return inventar;
    }

    public void removeMoebelstueck(Moebelstueck moebelstueck) throws MoebelNichtGefundenException {
        int size = moebelListe.size();
        for (int i = 0;i < moebelListe.size();i++) {
            if (moebelListe.get(i) == moebelstueck) {
                moebelListe.remove(moebelstueck);
            }
        }
        if (size == moebelListe.size()){
            throw new MoebelNichtGefundenException(moebelstueck.getInventarNr());
        }
    }

    public int getAnzahlMoebel() {
        return moebelListe.size();
    }

    public double getGewichtGesamt() {
        double g = 0;
        for (int i = 0;i < moebelListe.size();i++) {
            g = g + moebelListe.get(i).getGewicht();
        }
        return g;
    }

    @Override
    public String toString() {
        return "Raum{" +
                "raumNr='" + raumNr + '\'' +
                ", techniker=" + techniker +
                ", moebelListe=" + moebelListe +
                '}';
    }
}


