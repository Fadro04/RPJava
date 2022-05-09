package inventar;

public class Stuhl extends Moebelstueck {
    private double hoeheSitz;

    public Stuhl(String inventarNr, String bezeichnung) {
        super(inventarNr, bezeichnung);
    }

    public double getHoeheSitz() {
        return hoeheSitz;
    }

    public void setHoeheSitz(double hoeheSitz) {
        this.hoeheSitz = hoeheSitz;
    }

    @Override
    public String toString() {
        return "Stuhl{" +
                "hoeheSitz=" + hoeheSitz +
                '}';
    }
}
