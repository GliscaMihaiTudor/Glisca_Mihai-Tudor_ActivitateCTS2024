package classes;

public class Troleibuz implements IMijlocTransport{

    private String nrInmatriculareTraleibuz;

    public Troleibuz(String nrInmatriculareTraleibuz) {
        this.nrInmatriculareTraleibuz = nrInmatriculareTraleibuz;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un troleibuz");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("nrInmatriculareTraleibuz='").append(nrInmatriculareTraleibuz).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
