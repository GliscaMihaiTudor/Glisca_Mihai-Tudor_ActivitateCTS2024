package classes;

public class Fabrica {
    public Jucator creazaJucator(TipJucator tip, String nume, int varsta, float inaltime,int nrTricouPortar, int nrTricouFundas,int nrTricouAtacant) throws Exception {
        switch(tip){
            case FUNDAS:return new Fundas(nume, varsta, inaltime, nrTricouFundas);
            case PORTAR:return new Portar(nume, varsta, inaltime, nrTricouPortar);
            case ATACANT:return new Atacant(nume, varsta, inaltime, nrTricouAtacant);
            default:throw new Exception("Nu este un tip valid");
        }
    }
}
