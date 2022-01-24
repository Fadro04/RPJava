import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bruch {
    int zaeler;
    int nenner;

    public Bruch(int z, int n){
        zaeler=z;
        nenner=n;
    }

    public void erweitern(int k) throws IOException {
        zaeler=zaeler*2;
        nenner=nenner*2;
    }

    public void kuerze(int k) throws IOException {
        zaeler=zaeler/4;
        nenner=nenner/4;
    }
}