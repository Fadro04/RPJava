public class Spieler extends Person {
    private int staerke;
    private int torschuss;
    private int motivation;
    private int anzahlDerTore;

    //Konstruktor
    public Spieler(String name, int alter, int staerke, int torschuss, int motivation, int anzahlDerTore) {
        super(name, alter);
        this.staerke=staerke;
        this.torschuss=torschuss;
        this.motivation=motivation;
        this.anzahlDerTore=anzahlDerTore;
    }

    //Setter und Getter Methoden
    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }

    public int getTorschuss() {
        return torschuss;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setAnzahlDerTore(int anzahlDerTore) {
        this.anzahlDerTore = anzahlDerTore;
    }

    public int getAnzahlDerTore() {
        return anzahlDerTore;
    }

    //toString Methode
    @Override
    public String toString() {
        return "Spieler{" +
                ", staerke=" + staerke +
                ", torschuss=" + torschuss +
                ", motivation=" + motivation +
                ", anzahlDerTore=" + anzahlDerTore +
                '}';
    }
}
