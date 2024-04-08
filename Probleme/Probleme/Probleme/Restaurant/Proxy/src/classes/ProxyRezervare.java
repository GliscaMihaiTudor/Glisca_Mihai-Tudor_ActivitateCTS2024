package classes;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva() {
        if(rezervare.getNrPersoane()>4)
        {rezervare.rezerva();}else{
            System.out.println("Sunt prea putine persoane");
        }
    }
}
