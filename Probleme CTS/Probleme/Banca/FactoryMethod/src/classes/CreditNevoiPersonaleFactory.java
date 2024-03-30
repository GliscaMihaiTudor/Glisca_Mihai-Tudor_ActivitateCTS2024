package classes;

public class CreditNevoiPersonaleFactory implements IFactory{
    @Override
    public Credit createCredit(int suma, int nr) {
        return new CreditNevoiPersonale(suma,nr);
    }
}
