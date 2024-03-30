package classes;

public class Portar extends Jucator {

    private int nrTricouPortar;

    public Portar(String nume, int varsta, float inaltime,int nrTricouPortar) {
        super(nume, varsta, inaltime);
        this.nrTricouPortar=nrTricouPortar;
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Acesta este un portar");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Portar{");
        sb.append(super.toString());
        sb.append("nrTricouPortar=").append(nrTricouPortar);
        sb.append('}');
        return sb.toString();
    }
}
