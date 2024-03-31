package classes;

public class SupaVitaFactory implements Factory{
    @Override
    public Supa createSupa(int a, int b) {
        return new SupaVita(a,b);
    }
}
