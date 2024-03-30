package classes;

public class Reteta implements AbstractPrototype{
    private int idReteta;
    private String denumireReteta;
    public Reteta() {
    }

    public Reteta(int idReteta, String denumireReteta) {
        this.idReteta = idReteta;
        this.denumireReteta = denumireReteta;
    }

    public void setIdReteta(int idReteta) {
        this.idReteta = idReteta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("idReteta=").append(idReteta);
        sb.append(", denumireReteta='").append(denumireReteta).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copie = new Reteta();
        copie.idReteta=this.idReteta;
        copie.denumireReteta=this.denumireReteta;
        return copie;
    }
}
