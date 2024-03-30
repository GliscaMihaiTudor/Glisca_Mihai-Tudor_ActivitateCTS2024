package classes;

public class FabricaAutobuz implements IFabrica{

    @Override
    public IMijlocTransport creazaObiect(String nrAutobuz, String nrTramvai, String nrTrolei) {
        return new Autobuz(nrAutobuz);
    }
}
