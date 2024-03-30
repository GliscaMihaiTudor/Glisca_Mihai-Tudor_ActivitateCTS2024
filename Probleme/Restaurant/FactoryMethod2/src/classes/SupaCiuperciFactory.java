package classes;

public class SupaCiuperciFactory implements Factory{
    @Override
    public Supa createSupa(int a, int b) {
        return new SupaCiuperci(a,b);
    }
}
