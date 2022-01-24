import java.io.IOException;
import java.io.SerializablePermission;

public class Programm {
    public static void main(String[] args) throws IOException {

        //Neue Instanzen
        Trainer test = new Trainer("Peter", 37, 5);
        Spieler test2 =new Spieler("Wilhelm", 30, 6, 10, 5, 9);
        Torwart test3 =new Torwart("Mafred", 30, 3, 7, 2);

        //Getter und setter Methoden test
        test3.setReaktion(1);
        test3.setAlter(33);
        test3.setName("Peter");
        test3.setStaerke(5);
        test3.setMotivation(5);
        System.out.println(test3.getReaktion());
        System.out.println(test3.getAlter());
        System.out.println(test3.getName());
        System.out.println(test3.getStaerke());
        System.out.println(test3.getMotivation());
    }
}
