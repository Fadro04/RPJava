public class TestWuerfel {
    public static void main(String[] args) {
        int anzahl=new Wurfel();
        System.out.println(anzahl);

        //for Schleife
        int ergebnis=0;
        for (int i=0;i<10;i++){
            int anzahl2=new Wurfel();
            ergebnis+=anzahl2;
        }
        System.out.println(ergebnis);
    }
}
