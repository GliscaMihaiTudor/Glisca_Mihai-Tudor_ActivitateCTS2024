package classes;

public class Nota implements INota{
    private double suma;

    public Nota(double v) {
        this.suma = v;
    }

    @Override
    public void printeazaNota() {
        System.out.println("S a printat nota in valoare de "+suma);
    }
}
