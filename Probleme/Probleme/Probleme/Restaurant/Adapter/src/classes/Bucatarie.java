package classes;

public class Bucatarie implements IBucatarie{
    private String ospatar;

    public Bucatarie(String ospatar) {
        this.ospatar = ospatar;
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Ospatarul "+ospatar+" a adus nota");
    }
}
