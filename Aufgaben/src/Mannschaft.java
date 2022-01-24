import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private String trainer;
    private String torwart;
    private ArrayList<Spieler> spielerListe;

    public Mannschaft(String name, String trainer, String torwart, ArrayList spielerListe) {
        this.name = name;
        this.spielerListe = spielerListe;
        this.torwart = torwart;
        this.trainer = trainer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTorwart(String torwart) {
        this.torwart = torwart;
    }

    public String getTorwart() {
        return torwart;
    }

    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }

    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }

    public int getMotivation() {
        int motivation = 0;
        for (Spieler i : spielerListe) {
            motivation = motivation + i.getMotivation();
        }
        motivation = motivation / spielerListe.size();
        return motivation;
    }

    public int getStaerke() {
        int staerke = 0;
        for (Spieler i : spielerListe) {
            staerke = staerke + i.getStaerke();
        }
        staerke = staerke / spielerListe.size();
        return staerke;
    }
}