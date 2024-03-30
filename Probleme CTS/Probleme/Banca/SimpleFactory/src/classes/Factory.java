package classes;

public class Factory {
    public  Credit createCredit(TipCredit tip,int suma , int nrAni) throws Exception {
        switch (tip){
            case NevoiPersonale: return new CreditNevoiPersonale(suma,nrAni);
            case Ipotecar: return new CreditIpotecar(suma,nrAni);
            default: throw new Exception("Nu este un tip valid");
        }
    }

}
