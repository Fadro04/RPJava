public class Zauberer extends Spielfigur {
    private int zauberpunkte;

    public Zauberer( int staerke, int zauberpunkte) {
        super("Zauberer", 750, 1500, staerke);
        this.zauberpunkte = zauberpunkte;
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }

    public void zaubern() throws KeineKraftException {
        if (getZauberpunkte() > 0) {
            System.out.println(getName() + " zaubert");
            zauberpunkte--;
        } else throw new KeineKraftException("zaubern", getName());
    }

    @Override
    public String toString() {
        return "Zauberer{" +
                "zauberpunkte=" + zauberpunkte +
                '}';
    }
}
