package classes;

public class CreditIpotecar extends Credit{
    public CreditIpotecar(int sumaMaxima, int nrAni) {
        super(sumaMaxima, nrAni);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Ipotecar");
    }
}
