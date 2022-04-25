public class Waffen extends Spieler {
    private final String waffenName;
    private final int schaden;
    private final String extraSchaden;

    public Waffen(String waffenName, int schaden, String extraSchaden, Spielfigur spielfigur) {
        this.waffenName = waffenName;
        this.schaden = schaden;
        this.extraSchaden = extraSchaden;
    }

    public String getName() {
        return waffenName;
    }

    public int getSchaden() {
        return schaden;
    }

    public String getExtraSchaden() {
        return extraSchaden;
    }

    @Override
    public String toString() {
        return "Waffen{" +
                "name='" + waffenName + '\'' +
                ", schaden=" + schaden +
                '}';
    }
}
