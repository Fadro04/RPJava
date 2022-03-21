public abstract class Person {
    private String vorname;
    private String nachname;
    private Addresse addresse;

    public Person(String vorname, String nachname, Addresse addresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.addresse = addresse;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Addresse getAddresse() {
        return addresse;
    }

    public void setAddresse(Addresse addresse) {
        this.addresse = addresse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", addresse=" + addresse +
                '}';
    }
}
