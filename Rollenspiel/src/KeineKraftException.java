public class KeineKraftException extends Exception{
    private String aktion;
    private String name;


    public KeineKraftException(String aktion, String name) {
        super(name + " hat keine Kraft mehr fuer die Aktion " + aktion);
    }
}
