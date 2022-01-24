public class Wurfel {
    int augenzahl;

    //Konstruktor
    public Wurfel(int augenzahl) {
        werfeWuerfel();
        getAugenzahl();
    }

    //Methode werfeWuerfel
    public int werfeWuerfel() {
        augenzahl = new java.util.Random().nextInt(6);
        augenzahl += 1;
        return augenzahl;
    }

    //Methode getAugenzahl
    public int getAugenzahl() {
        return augenzahl;
    }
}
