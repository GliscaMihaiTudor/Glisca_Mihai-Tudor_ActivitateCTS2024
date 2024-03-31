package classes;

public class FactoryAtacant implements FactoryJucator{

    @Override
    public Jucator creazaJucator(String nume, int varsta, float inaltime, int nrTicouAtacant, int nrTricouFundas, int nrTricouPortar) {
        return new Atacant(nume,varsta,inaltime,nrTicouAtacant);
    }
}
