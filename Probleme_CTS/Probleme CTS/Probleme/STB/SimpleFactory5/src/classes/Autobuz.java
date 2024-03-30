package classes;

public class Autobuz implements IMijlocTransport{
    private String nrInmatriculare;

    public Autobuz(String nrInmatriculareAutobuz) {
        this.nrInmatriculare = nrInmatriculareAutobuz;
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un autobuz");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrInmatriculareAutobuz='").append(nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
