import javax.swing.*;
import java.io.IOException;
import java.io.SerializablePermission;
import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) throws IOException {
        ArrayList<String> spielerListeG=new ArrayList<String>();
        ArrayList<String> spielerListeH=new ArrayList<String>();


        //Neue Instanzen
        Trainer test = new Trainer("Peter", 37, 5);
        Spieler test2 =new Spieler("Wilhelm", 30, 6, 10, 5, 9);
        Torwart G =new Torwart("Neuer", 30, 3, 7, 2);
        Torwart H = new Torwart("h", 45, 3, 2, 2);
        Mannschaft test4 = new Mannschaft("Werder", "Peter", "Manfred", spielerListeG);
        Mannschaft test5 = new Mannschaft("Schalke", "Hans", "Jürgen", spielerListeH);
        Ergebnis test6 = new Ergebnis(5,4);
        Spiel test7 = new Spiel(test4, test5, test6);


        //Test Mannschaft
        spielerListeG.add("Kroos");
        spielerListeG.add("Müller");
        spielerListeG.add("Hummels");
        spielerListeG.add("Boateng");
        spielerListeG.add("Kimich");
        spielerListeG.add("Götze");
        spielerListeG.add("Schweinsteiger");
        spielerListeG.add("Öziel");
        spielerListeG.add("Podolski");
        spielerListeG.add("Kloose");

        spielerListeH.add("Ronaldo");
        spielerListeH.add("Schürrle");
        spielerListeH.add("Reuß");
        spielerListeH.add("Khidira");
        spielerListeH.add("Krama");
        spielerListeH.add("Draxler");
        spielerListeH.add("Ginter");
        spielerListeH.add("Lahm");
        spielerListeH.add("Zieler");
        spielerListeH.add("Weidenfeller");

        for (int i=0; i<spielerListeG.size();i++) {
            System.out.println(spielerListeG.get(i));
        }
        for (int i=0; i<spielerListeH.size();i++) {
            System.out.println(spielerListeH.get(i));
        }

        //Test Ergebnis
        System.out.println(test6);

        test6.gegentore1();
        test6.heimtore1();

        System.out.println(test6);

        //Test Spiel
        System.out.println(test7);
    }
}
