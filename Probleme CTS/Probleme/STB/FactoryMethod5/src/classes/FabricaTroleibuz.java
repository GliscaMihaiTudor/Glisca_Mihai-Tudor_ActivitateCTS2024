package classes;

public class FabricaTroleibuz implements IFabrica{
    @Override
    public IMijlocTransport creazaObiect(String nrAutobuz, String nrTramvai, String nrTrolei) {
        return new Troleibuz(nrTrolei);
    }
}
