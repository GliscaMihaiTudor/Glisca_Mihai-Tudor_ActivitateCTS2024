package classes;

public class FactoryPortar implements FactoryJucator{

    @Override
    public Jucator creazaJucator(String nume, int varsta, float inaltime, int nrTicouAtacant, int nrTricouFundas, int nrTricouPortar) {
        return new Portar(nume,varsta,inaltime,nrTricouPortar);
    }
}
