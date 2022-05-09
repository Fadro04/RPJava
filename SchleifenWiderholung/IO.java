import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    //readString
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        return text;
    }

    //readInteger
    public static int readInteger() throws IOException {
        while (true) {
            try {
                String eingabe = readString();
                int zahl = Integer.parseInt(eingabe.trim());
                return zahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
            }
        }
    }

    //readDouble
    public static double readDouble() throws IOException {
        while (true) {
            try {
                String eingabe = readString();
                double kommazahl = Double.parseDouble(eingabe.trim().replace(',', '.'));
                return kommazahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl oder Kommazahl! Bitte erneut versuchen: ");
            }
        }
    }

    //readBoolean
    public static boolean readBoolean() throws IOException {
        while (true) {
            String eingabe = readString();
            if (eingabe != null) {
                if ((eingabe.equalsIgnoreCase("ja"))
                        || (eingabe.equalsIgnoreCase("j"))
                        || (eingabe.equalsIgnoreCase("yes"))
                        || (eingabe.equalsIgnoreCase("y"))
                        || (eingabe.equalsIgnoreCase("true"))) {
                    return true;
                }
                else if ((eingabe.equalsIgnoreCase("nein"))
                        || (eingabe.equalsIgnoreCase("n"))
                        || (eingabe.equalsIgnoreCase("no"))
                        || (eingabe.equalsIgnoreCase("false"))){
                    return false;
                }
            }
            System.out.print("Ungültige Eingabe! Bitte erneut versuchen: ");
        }
    }

    //readLong
    public static long readLong() throws IOException {
        while (true) {
            try {
                String eingabe = readString();
                long zahl = Long.parseLong(eingabe.trim());
                return zahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");
            }
        }
    }
}