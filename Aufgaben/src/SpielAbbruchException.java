public class SpielAbbruchException extends Exception{
    private int spielminute;
    private String message;

    public SpielAbbruchException(int spielminute) {
        this.spielminute = spielminute;
    }

    public int getSpielminute() {
        return spielminute;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
