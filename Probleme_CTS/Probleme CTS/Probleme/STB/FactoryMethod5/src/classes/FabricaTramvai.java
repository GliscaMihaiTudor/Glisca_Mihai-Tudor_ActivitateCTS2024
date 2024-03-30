package classes;

public class FabricaTramvai implements IFabrica{
    @Override
    public IMijlocTransport creazaObiect(String nrAutobuz, String nrTramvai, String nrTrolei) {
        return new Tramvai(nrTramvai);
    }
}
