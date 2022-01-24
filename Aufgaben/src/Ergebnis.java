public class Ergebnis {
    private int heimtore;
    private int gegnertore;

    public Ergebnis(int heimtore, int gegnertore) {
    }

    public int getGegnertore() {
        return gegnertore;
    }

    public int getHeimtore() {
        return heimtore;
    }

    public int heimtore1() {
        heimtore++;
        return heimtore;
    }

    public int gegentore1() {
        gegnertore++;
        return gegnertore;
    }

    @Override
    public String toString() {
        return "Ergebnis{" +
                "heimtore=" + heimtore +
                ", gegnertore=" + gegnertore +
                '}';
    }
}