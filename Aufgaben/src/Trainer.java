public class Trainer extends Person{
    private int erfahrung;

    //Konstruktor
    public Trainer(String name, int alter, int erfahrung) {
        super(name, alter);
        this.erfahrung=erfahrung;
    }

    //Setter ung Getter Methoden
    public int getErfahrung() {
        return erfahrung;
    }

    public void setErfahrung(int erfahrung) {
        this.erfahrung = erfahrung;
    }

    //toString Methode
    @Override
    public String toString() {
        return "Trainer{" +
                ", erfahrung=" + erfahrung +
                '}';
    }
}