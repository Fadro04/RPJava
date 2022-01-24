public abstract class Obst {
    private String name;
    private double gewicht;

    public Obst(String name, double gewicht, int vitaminCGehalt) {
    }

    public String getName() {return name;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "Obst{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
