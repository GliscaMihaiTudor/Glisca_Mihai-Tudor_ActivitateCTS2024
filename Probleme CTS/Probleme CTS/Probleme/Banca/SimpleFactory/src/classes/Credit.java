package classes;

public abstract class Credit {
    int sumaMaxima;
    int nrAni;

    public Credit(int sumaMaxima, int nrAni) {
        this.sumaMaxima = sumaMaxima;
        this.nrAni = nrAni;
    }

    public abstract void afiseazaDescriere();
}
