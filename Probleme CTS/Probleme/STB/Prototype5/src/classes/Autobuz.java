package classes;

public class Autobuz implements Cloneable{
    private String nrInmatriculare;
    private String firma;

    public Autobuz(String nrInmatriculareAutobuz,String firma) {
        this.nrInmatriculare = nrInmatriculareAutobuz;
        this.firma = firma;
    }

    public Autobuz() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", firma='").append(firma).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Autobuz clone() throws CloneNotSupportedException {
        Autobuz autobuz = new Autobuz();
        autobuz.firma=this.firma;
        autobuz.nrInmatriculare=this.nrInmatriculare;
        return autobuz;
    }
}
