import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList spielerListe) {
        this.name = name;
        this.spielerListe = spielerListe;
        this.torwart = torwart;
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
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

    @Override
    public String toString() {
        return "Mannschaft{" +
                "name='" + name + '\'' +
                ", trainer='" + trainer + '\'' +
                ", torwart='" + torwart + '\'' +
                ", spielerListe=" + spielerListe +
                '}';
    }
}