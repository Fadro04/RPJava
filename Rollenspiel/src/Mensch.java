public class Mensch extends Spielfigur{
    private int willensStaerke;

    public Mensch(int staerkepunkte, int hp, int staerke) {
        super("Mensch", 20, 2000, staerke, "mensch");
        this.willensStaerke = willensStaerke;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
