public class Ergebnis {
    private int heimtore;
    private int gegnertore;

    public Ergebnis() {
        this.gegnertore = 0;
        this.heimtore = 0;
    }

    public int getGegnertore() {
        return gegnertore;
    }

    public int getHeimtore() {
        return heimtore;
    }

    public void heimtore1() {
        heimtore++;
    }

    public void gegentore1() {
        gegnertore++;
    }

    @Override
    public String toString() {
        return "Ergebnis{" +
                "heimtore=" + heimtore +
                ", gegnertore=" + gegnertore +
                '}';
    }
}