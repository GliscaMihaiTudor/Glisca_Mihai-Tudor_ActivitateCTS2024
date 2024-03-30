package classes;

public class Atacant extends Jucator {
    private int nrTricouAtacant;

    public Atacant(String nume, int varsta, float inaltime,int nrTricouAtacant) {
        super(nume, varsta, inaltime);
        this.nrTricouAtacant=nrTricouAtacant;
    }


    @Override
    public void afiseazaJucator() {
        System.out.println("Acesta este un atacant");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append(super.toString());
        sb.append("nrTricouAtacant=").append(nrTricouAtacant);
        sb.append('}');
        return sb.toString();
    }
}
