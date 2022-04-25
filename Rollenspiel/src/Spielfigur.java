public abstract class Spielfigur extends Spieler {
    private final String name;
    private int staerkepunkte;
    private int hp;
    private final int staerke;
    private String angriffArt;

    public Spielfigur(String name, int staerkepunkte, int hp, int staerke, String angriffArt) {
        this.name = name;
        this.staerkepunkte = staerkepunkte;
        this.hp = hp;
        this.staerke = staerke;
        this.angriffArt = angriffArt;
    }

    public String getAngriffArt() {
        return angriffArt;
    }

    public void setAngriffArt(String angriffArt) {
        this.angriffArt = angriffArt;
    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    public void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        hp = hp;
    }

    public int getStaerke() {
        return staerke;
    }

    public void laufen() throws KeineKraftException {
        System.out.println(getName() + " laeuft");
        if (getStaerkepunkte() > 0) {
            setStaerkepunkte(getStaerkepunkte() - 1);
        } else throw new KeineKraftException("laufen", getName());
    }

    public void klettern() throws KeineKraftException {
        System.out.println(getName() + " klettert");
        if (getStaerkepunkte() > 1) {
            setStaerkepunkte(getStaerkepunkte() - 2);
        } else throw new KeineKraftException("Klettern", getName());
    }

    public void kaempfen(Waffen waffe) throws KeineKraftException{
        System.out.println(getName() + " kaempft");
        if (getStaerkepunkte() > 2) {
            setStaerkepunkte(getStaerkepunkte() - 3);
        } else throw new KeineKraftException("Kämpfen", getName());
    }

    @Override
    public String toString() {
        return "Spielfigur{" +
                "name='" + name + '\'' +
                ", staerkepunkte=" + staerkepunkte +
                '}';
    }
}
