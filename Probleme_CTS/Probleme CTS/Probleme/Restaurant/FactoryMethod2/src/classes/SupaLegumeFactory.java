package classes;

public class SupaLegumeFactory implements Factory{
    @Override
    public Supa createSupa(int a, int b) {
        return new SupaLegume(a,b);
    }
}
