package inventar;

public class Tisch extends Moebelstueck {
    private double hoehe;
    private double laenge;
    private double breite;

    public Tisch(String inventarNr, String bezeichnung) {
        super(inventarNr, bezeichnung);
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    @Override
    public String toString() {
        return "Tisch{" +
                "hoehe=" + hoehe +
                ", laenge=" + laenge +
                ", breite=" + breite +
                '}';
    }
}
