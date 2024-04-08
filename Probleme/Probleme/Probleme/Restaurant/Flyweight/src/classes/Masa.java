package classes;

public class Masa {
    private int idMasa;
    private int nrLocuri;
    private int ora;

    public Masa(int idMasa, int nrLocuri, int ora) {
        this.idMasa = idMasa;
        this.nrLocuri = nrLocuri;
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "idMasa=" + idMasa +
                ", nrLocuri=" + nrLocuri +
                ", ora=" + ora +
                '}';
    }
}
