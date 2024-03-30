package classes;

public class Tramvai implements IMijlocTransport {

    private String nrInmatriculareTramvai;

    public Tramvai(String nrInmatriculareTramvai) {
        this.nrInmatriculareTramvai = nrInmatriculareTramvai;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un tramvai");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("nrInmatriculareTramvai='").append(nrInmatriculareTramvai).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
