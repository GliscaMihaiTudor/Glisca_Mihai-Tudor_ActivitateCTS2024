package classes;

public abstract class Jucator {
    private String nume;
    private int varsta;
    private float inaltime;

    public Jucator(String nume, int varsta, float inaltime) {
        this.nume = nume;
        this.varsta = varsta;
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }

    public abstract void afiseazaJucator();
}
