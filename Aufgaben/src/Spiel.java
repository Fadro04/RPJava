public class Spiel {
    private Mannschaft heimmannschaft;
    private Mannschaft gegenermannschaft;
    private Ergebnis ergebnis;
    private StringBuilder spielverlauf;

    public Spiel(Mannschaft heimmannschaft, Mannschaft gegenermannschaft) {
        this.ergebnis = new Ergebnis();
        this.gegenermannschaft = gegenermannschaft;
        this.heimmannschaft = heimmannschaft;
        this.spielverlauf = new StringBuilder();
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public Mannschaft getGegenermannschaft() {
        return gegenermannschaft;
    }

    public Mannschaft getHeimmannschaft() {
        return heimmannschaft;
    }

    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }


    @Override
    public String toString() {
        return "Spiel{" +
                "heimmannschaft=" + heimmannschaft +
                ", gegenermannschaft=" + gegenermannschaft +
                ", ergebnis=" + ergebnis +
                ", spielverlauf=" + spielverlauf +
                '}';
    }

    private static boolean brecheSpielAb() {
        int zufalsZahl = new java.util.Random().nextInt(1000);
        if (zufalsZahl == 0) {
            return true;
        } else return false;
    }
}
