public class Spiel {
    private Mannschaft heimmannschaft;
    private Mannschaft gegenermannschaft;
    private Ergebnis ergebnis;
    private StringBuilder spielverlauf;

    public Spiel(Mannschaft heimmannschaft, Mannschaft gegenermannschaft, Ergebnis ergebnis) {
        this.ergebnis=ergebnis;
        this.gegenermannschaft=gegenermannschaft;
        this.heimmannschaft=heimmannschaft;
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
}
