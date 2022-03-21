public class Kunde extends Person{
    private Mitarbeiter betreuer;

    public Kunde(String vorname, String nachname, Addresse addresse, Mitarbeiter betreuer) {
        super(vorname, nachname, addresse);
        this.betreuer = betreuer;
    }

    public Mitarbeiter getBetreuer() {
        return betreuer;
    }

    public void setBetreuer(Mitarbeiter betreuer) {
        this.betreuer = betreuer;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "betreuer=" + betreuer +
                '}';
    }
}
