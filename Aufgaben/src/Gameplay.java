import javax.swing.*;
import java.awt.*;

public class Gameplay {
    private static final int spielzeit = 90;
    private static final int maxNachspielzeit = 5;
    private static final int aktion = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft, Trainer trainer) {
        return mannschaft.getMotivation() * mannschaft.getStaerke() * trainer.getErfahrung();
    }

    public static JFrame aufstellung(int[] ar, Graphics g) {
        JFrame wnd = new JFrame("Einfaches Fenster");
        wnd.setSize(1000, 800);

        g.setColor(Color.BLACK);
        g.drawRect(200, -200, 100, 100);
        wnd.setVisible(true);
        return wnd;
    }


    private static boolean erzieltTor(Spieler schuetze, Torwart torwart) {
        int r = new java.util.Random().nextInt(5) - 2;
        r = r + schuetze.getTorschuss();
        if (r < 1) {
            r = 1;
        }

        int r1 = new java.util.Random().nextInt(5) - 2;
        r1 = r1 + torwart.getReaktion();
        if (r1 < 1) {
            r1 = 1;
        }

        if (r > r1) {
            return true;
        } else return false;
    }

    private static boolean brecheSpielAb() {
        int zufalsZahl = new java.util.Random().nextInt(10000);
        if (zufalsZahl == 0) {
            return true;
        } else return false;
    }


    public static void spielen(Spiel spiel) throws SpielAbbruchException {
        int spielzeit1 = spielzeit + new java.util.Random().nextInt(maxNachspielzeit);
        int erste = new java.util.Random().nextInt(11);

        while (erste <= spielzeit1) {
            int heim =
                    ermittelMannschaftsWert(spiel.getHeimmannschaft(), spiel.getHeimmannschaft().getTrainer());
            int gegner =
                    ermittelMannschaftsWert(spiel.getGegenermannschaft(), spiel.getGegenermannschaft().getTrainer());
            int summe = heim + gegner;
            int zufalsZahl = new java.util.Random().nextInt(summe);

            if (brecheSpielAb()) {
                throw new SpielAbbruchException(spielzeit1);
            }

            if (zufalsZahl > heim) {
                Spieler zufalssSpieler = spiel.getHeimmannschaft().getSpielerListe().get(new java.util.Random().nextInt(10));
                boolean treffer = erzieltTor(zufalssSpieler, spiel.getHeimmannschaft().getTorwart());
                if (treffer) {
                    spiel.getErgebnis().heimtore1();
                    String torschuetze = zufalssSpieler.getName();
                    spiel.getSpielverlauf().append(torschuetze).append(" schießt ein Tor");
                } else
                    spiel.getSpielverlauf().append(spiel.getGegenermannschaft().getTorwart().getName()).append(" hält den Ball");

            } else {
                Spieler zufalssSpieler = spiel.getGegenermannschaft().getSpielerListe().get(new java.util.Random().nextInt(10));
                boolean treffer = erzieltTor(zufalssSpieler, spiel.getGegenermannschaft().getTorwart());
                if (treffer) {
                    spiel.getErgebnis().gegentore1();
                    String torschuetze = zufalssSpieler.getName();
                    spiel.getSpielverlauf().append(torschuetze).append(" schießt ein Tor");
                } else
                    spiel.getSpielverlauf().append(spiel.getHeimmannschaft().getTorwart().getName()).append(" hält den Ball");

            }
            erste = erste + new java.util.Random().nextInt(11);
        }
        spiel.getSpielverlauf().append(spiel.getErgebnis());
    }
}
