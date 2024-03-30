package classes;

public class Fundas extends Jucator{

    private int nrTricouFundas;

    public Fundas(String nume, int varsta, float inaltime,int nrTricouFundas) {
        super(nume, varsta, inaltime);
        this.nrTricouFundas=nrTricouFundas;
    }

    @Override
    public void afiseazaJucator() {
        System.out.println("Acesta este un fundas");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append(super.toString());
        sb.append("nrTricouFundas=").append(nrTricouFundas);
        sb.append('}');
        return sb.toString();
    }
}
