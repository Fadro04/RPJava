public class Banane extends Obst{
    private int kruemung;
    public Banane(String name, double gewicht, int vitaminCGehalt) {
        super(name, gewicht, vitaminCGehalt);
    }

    public int getKruemung() {
        return kruemung;
    }

    @Override
    public String toString() {
        return "Banane{" +
                "kruemung=" + kruemung +
                '}';
    }
}
