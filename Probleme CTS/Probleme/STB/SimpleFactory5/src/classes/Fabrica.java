package classes;

public class Fabrica {
    public IMijlocTransport createObject(TipTransport mijlocTransport, String nrInmatriculareTr, String nrInmatriculareAuto, String nrInmatriculareRrolei) throws Exception{
        switch (mijlocTransport){
            case autobuz:
                return new Autobuz(nrInmatriculareAuto);
            case tramvai:
                return new Tramvai(nrInmatriculareTr);
            case troleibuz:
                return new Troleibuz(nrInmatriculareRrolei);
            default:
                throw new Exception("Tipul nu este valid");
        }
    }
}
