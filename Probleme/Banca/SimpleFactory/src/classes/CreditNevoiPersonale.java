package classes;

public class CreditNevoiPersonale extends Credit {
    public CreditNevoiPersonale(int sumaMaxima, int nrAni) {
        super(sumaMaxima, nrAni);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Nevoi Personale");
    }
}
