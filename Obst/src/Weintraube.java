public class Weintraube extends Obst{
    private boolean kernlos;
    public Weintraube(String name, double gewicht, int vitaminCGehalt) {
        super(name, gewicht, vitaminCGehalt);
    }

    public boolean isKernlos() {
        return kernlos;
    }

    @Override
    public String toString() {
        return "Weintraube{" +
                "kernlos=" + kernlos +
                '}';
    }
}
