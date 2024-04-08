package classes;

public class Adapter implements IBucatarie{
    private IBar bar;

    public Adapter(IBar bar) {
        this.bar = bar;
    }

    @Override
    public void printeazaFactura() {
        bar.printeazaNota();
    }
}
