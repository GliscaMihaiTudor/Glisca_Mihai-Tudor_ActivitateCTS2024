package classes;

public class Rezervare implements IRezervare{
    private int codMasa;
    private int nrPersoane;

    public Rezervare(int codMasa, int nrPersoane) {
        this.codMasa = codMasa;
        this.nrPersoane = nrPersoane;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void rezerva() {
        System.out.println("Masa "+codMasa+" a fost rezervata de "+nrPersoane+" persoane");
    }
}
