public class Elfe extends Spielfigur{
    public Elfe(int staerke) {
        super("Elf", 20, 2000, staerke, "elf");
    }

    public void rennen() throws KeineKraftException {
        if (getStaerkepunkte() > 0) {
            System.out.println(getName() + " rennt");
            setStaerkepunkte(getStaerkepunkte() - 2);
        } else throw new KeineKraftException("rennen", getName());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
