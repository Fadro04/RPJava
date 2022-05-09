package inventar;

public class MoebelNichtGefundenException extends Exception {
    private String inventarNr;

    public MoebelNichtGefundenException(String inventarNr) {
        this.inventarNr = inventarNr;
    }

    public String getInventarNr() {
        return inventarNr;
    }

    @Override
    public String getMessage() {
        return "Das Moebelstueck mit der Nummer " + getInventarNr() + " wurde nicht gefunden";
    }
}
