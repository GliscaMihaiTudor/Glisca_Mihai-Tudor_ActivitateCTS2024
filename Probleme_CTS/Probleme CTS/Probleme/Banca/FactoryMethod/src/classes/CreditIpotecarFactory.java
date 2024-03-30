package classes;

public class CreditIpotecarFactory implements IFactory{
    @Override
    public Credit createCredit(int suma, int nr) {
        return new CreditIpotecar(suma,nr);
    }
}
