public class Schwert extends Waffen{

    private int schaden2;

    public Schwert(int schaden, String extraSchaden, Spielfigur spielfigur, int schaden2) {
        super("Schwert", schaden, extraSchaden, spielfigur);
        this.schaden2 = schaden2;
    }

    public int schwertHieb(Spielfigur spielfigur) {
        spielfigur.setAngriffArt("schwertHieb");
         if (spielfigur.getName() == "Mensch") {
             schaden2 = getSchaden() + spielfigur.getStaerke() + 100;
         } else schaden2 = getSchaden() + spielfigur.getStaerke();
         return schaden2;
    }
}
