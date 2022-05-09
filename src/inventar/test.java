package inventar;

public class test {
    public static void main(String[] args) throws MoebelNichtGefundenException {
        //1.
        Raum raum1 = new Raum("1");

        //2.
        Stuhl stuhl1 = new Stuhl("1", "Gut");
        Stuhl stuhl2 = new Stuhl("2", "Schlecht");
        Tisch tisch1 = new Tisch("3", "mittel");

        //3.
        stuhl1.setHoeheSitz(30);
        stuhl1.setBeschreibung("hoher Stuhl");
        stuhl1.setGewicht(20);
        stuhl1.setMaterial("Holz");

        stuhl2.setHoeheSitz(10);
        stuhl2.setBeschreibung("niedriger Stuhl");
        stuhl2.setGewicht(10);
        stuhl2.setMaterial("Stahl");

        tisch1.setBeschreibung("kleiner Tisch");
        tisch1.setBreite(20);
        tisch1.setMaterial("Holz");
        tisch1.setGewicht(45);
        tisch1.setHoehe(50);
        tisch1.setLaenge(30);

        //4.
        raum1.addMoebel(stuhl1);
        raum1.addMoebel(stuhl2);
        raum1.addMoebel(tisch1);


        //5.
        Kontakt kontakt1 = new Kontakt("Mann.Herrmann@kabelmail.de", "0421/4598448", "0187/34884385");
        Techniker techniker1 = new Techniker("Mann", "Herrman", kontakt1);

        //6.
        raum1.setTechniker(techniker1);

        //7.
        System.out.println(raum1);

        //8.
        try {
            System.out.println(raum1.getMoebel("2"));
        } catch (MoebelNichtGefundenException e) {
            System.out.println(e);
        }

        //9.
        try {
            System.out.println(raum1.getMoebel("4"));
        } catch (MoebelNichtGefundenException e) {
            System.out.println(e);
        }

        //10.
        try {
            raum1.removeMoebelstueck(stuhl2);
        } catch (MoebelNichtGefundenException e) {
            System.out.println(e);
        }

        //11.
        System.out.println(raum1);

        //12.
        try {
            raum1.removeMoebelstueck(stuhl2);
        } catch (MoebelNichtGefundenException e) {
            System.out.println(e);
        }
    }
}
