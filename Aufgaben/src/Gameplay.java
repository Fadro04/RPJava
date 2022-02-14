public class Gameplay {
    private static final int spielzeit = 90;
    private static final int maxNachspielzeit = 5;
    private static final int aktion = 10;

    private static int ermittelMannschaftsWert(Mannschaft mannschaft, Trainer trainer) {
        return mannschaft.getMotivation() * mannschaft.getStaerke() * trainer.getErfahrung();
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

    public static void spielen(Spiel spiel) {
        int spielzeit1 = spielzeit + new java.util.Random().nextInt(maxNachspielzeit);
        int erste = new java.util.Random().nextInt(11);

        while (erste <= spielzeit1) {

            erste = erste + new java.util.Random().nextInt(11);
        }
    }
}
