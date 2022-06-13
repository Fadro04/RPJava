import java.util.HashMap;

public class Lotto {
    public static void main(String[] args) {

        HashMap<Integer, Integer> lotto = zahlenZiehen();

        ausgabe(lotto);
    }

    public static HashMap zahlenZiehen() {
        HashMap<Integer, Integer> lotto = new HashMap<Integer, Integer>();
        for (int i = 1; i <= 49; i++) {
            lotto.put(i, null);
        }
        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < 6; i++) {
                int r = new java.util.Random().nextInt(49) + 1;

                if (lotto.get(r) == null) {
                    lotto.put(r, 1);
                } else {
                    lotto.put(r, lotto.get(r) + 1);
                }

            }
        }
        return lotto;
    }

    public static void ausgabe(HashMap lotto) {
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "  =  " + lotto.get(i));
        }

    }
}