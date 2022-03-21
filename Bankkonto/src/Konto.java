public abstract class Konto {
    private Kunde inhaber;
    private double kontoStand;
    private double kreditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kreditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kontoStand = kontoStand;
        this.kreditLimit = kreditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setKreditLimit(double kreditLimit) {
        kreditLimit = kreditLimit;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public void einzahlen(double betrag) {
        kontoStand = kontoStand + betrag;
    }
    public boolean auszahlen(double betrag) {
        if (betrag > kreditLimit) {
            return false;
        } else {
            kontoStand -= betrag;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Konto{" +
                "inhaber=" + inhaber +
                ", kontoStand=" + kontoStand +
                ", KreditLimit=" + kreditLimit +
                ", zinsGuthaben=" + zinsGuthaben +
                '}';
    }
}
