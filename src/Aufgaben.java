import java.io.IOException;

public class Aufgaben {

    public static void main(String[] args) throws IOException {
        do {
            System.out.println("[1] Für Aufgabe 1");
            System.out.println("[2] Für Aufgabe 2");
            System.out.println("[3] Für Aufgabe 3");
            System.out.println("[4] Für Aufgabe 4");
            System.out.println("[5] Für Aufgabe 5");
            System.out.println("[6] Für Aufgabe 6");

            String programm = IO.readString();
            if (programm.equalsIgnoreCase("1")) {
                aufgabe1();
            } else if (programm.equalsIgnoreCase("2")) {
                aufgabe2();
            } else if (programm.equalsIgnoreCase("3")) {
                aufgabe3();
            } else if (programm.equalsIgnoreCase("4")) {
                aufgabe4();
            } else if (programm.equalsIgnoreCase("5")) {
                aufgabe5();
            } else if (programm.equalsIgnoreCase("6")) {
                aufgabe6();
            }
            System.out.println("Soll das Programm nochmal durchgeführt werden?");
        } while (IO.readBoolean());
    }

    public static void aufgabe1() {
        for (int i = 20; i >= 1; i--) {
            System.out.println(i);
        }
        int o = 20;
        while (o >= 1) {
            System.out.println(o);
            o--;
        }
    }

    public static void aufgabe2(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
        int o = 0;
        while (o <= n) {
            System.out.println(o);
            o++;
        }
    }

    public static void aufgabe3() {
        double s = 0;
        for (int i = 1; i <= 1000; i++) {
            int r = new java.util.Random().nextInt(10);
            s = s + i;
        }
        System.out.println(s / 1000);
    }

    public static void aufgabe4(int ganzeZahl) {
        double s = 0;
        for (int i = 0; i <= ganzeZahl; i++) {
            s = s + Math.pow(i, 2);
        }
        System.out.println(s);
    }

    public static void aufgabe5() {
        double bestimmtZahl = 1 / 6;
        double bestimmteZahl = bestimmtZahl * bestimmtZahl;
        double chance = bestimmteZahl*6;
        System.out.println(chance*100+"%");
    }

    public static void aufgabe6() {
        for (int i=0;i>=0;i++){
            System.out.println(i);
        }

        int o=0;
        while (o>=0){
            System.out.println(o);
            o++;
        }

        int p=0;
        do {
            System.out.println(p);
            p++;
        } while (p>=0);
    }
}