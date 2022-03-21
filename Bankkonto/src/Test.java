public class Test {
    public static void main(String[] args) {
        Addresse addresse1 = new Addresse("Chaukenhügel", "35", "28759", "Bremen");
        Addresse addresse2 = new Addresse("Chaukenhügel", "35", "28759", "Bremen");
        Addresse addresse3 = new Addresse("Chaukenhügel", "35", "28759", "Bremen");
        Addresse addresse4 = new Addresse("Chaukenhügel", "35", "28759", "Bremen");
        Addresse addresse5 = new Addresse("Chaukenhügel", "35", "28759", "Bremen");
        Addresse addresse6 = new Addresse("Chaukenhügel", "35", "28759", "Bremen");

        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Hans", "Müller", addresse1);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Sebastian", "Müller", addresse2);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Cedrik", "Müller", addresse3);

        Kunde kunde1 = new Kunde("Jan", "Absolon", addresse4, mitarbeiter1);
        Kunde kunde2 = new Kunde("Fabian", "Droste", addresse5, mitarbeiter2);
        Kunde kunde3 = new Kunde("Jan", "Absolon", addresse6, mitarbeiter3);

        Girokonto girokonto1 = new Girokonto(kunde1, 1000, 50, 10);
        Girokonto girokonto2 = new Girokonto(kunde2, 2000, 40, 20);
        Sparkonto sparkonto1 = new Sparkonto(kunde3, 5);

        girokonto1.einzahlen(20000);
        girokonto2.einzahlen(20000);
        sparkonto1.einzahlen(20000);

        System.out.println(girokonto1.getKontoStand());
        System.out.println(girokonto2.getKontoStand());
        System.out.println(sparkonto1.getKontoStand());

        girokonto1.auszahlen(200);
        girokonto2.auszahlen(200);

        System.out.println(girokonto1.getKontoStand());
        System.out.println(girokonto2.getKontoStand());

        girokonto1.ueberweisen(200, girokonto2);
        System.out.println(girokonto1.getKontoStand());
        System.out.println(girokonto2.getKontoStand());
    }
}
