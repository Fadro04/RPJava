import javax.swing.*;
import java.io.IOException;
import java.io.SerializablePermission;
import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws IOException, SpielAbbruchException {
        ArrayList<Spieler> spielerListeG = new ArrayList<>();
        ArrayList<Spieler> spielerListeH = new ArrayList<>();


        //Neue Instanzen
        Trainer hTrainer = new Trainer("Peter", 37, 5);
        Trainer gTrainer = new Trainer("Peter", 37, 5);
        Torwart G = new Torwart("Neuer", 30, 3, 7, 2);
        Torwart H = new Torwart("h", 45, 3, 2, 2);
        Mannschaft test4 = new Mannschaft("Werder", hTrainer, G, spielerListeG);
        Mannschaft test5 = new Mannschaft("Schalke", gTrainer, H, spielerListeH);
        Spiel test7 = new Spiel(test4, test5);

        for (int i = 0; i < 11; i++) {
            // Zufallszahlen
            int staerke = new java.util.Random().nextInt(12) - 1;
            int torschuss = new java.util.Random().nextInt(12) - 1;
            int motivation = new java.util.Random().nextInt(12) - 1;
            int anzahlDerTore = new java.util.Random().nextInt(40);
            int alter = new java.util.Random().nextInt(21) + 20;

            Spieler g = new Spieler("SpielerGast" + i, alter, staerke, torschuss, motivation, anzahlDerTore);
            spielerListeG.add(g);

            int staerke2 = new java.util.Random().nextInt(12) - 1;
            int torschuss2 = new java.util.Random().nextInt(12) - 1;
            int motivation2 = new java.util.Random().nextInt(12) - 1;
            int anzahlDerTore2 = new java.util.Random().nextInt(40);
            int alter2 = new java.util.Random().nextInt(21) + 20;

            Spieler h = new Spieler("SpielerHeim" + i, alter, staerke, torschuss, motivation, anzahlDerTore);
            spielerListeH.add(h);
        }

        try {
            Gameplay.spielen(test7);
        } catch (SpielAbbruchException e) {
            System.out.println(e.getMessage());
        }
        Gameplay.spielen(test7);
        System.out.println(test7.getErgebnis());
        System.out.println(test7.getSpielverlauf());
    }
}
