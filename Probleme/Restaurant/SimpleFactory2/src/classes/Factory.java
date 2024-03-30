package classes;

public class Factory {
    public Supa createSupa(TipSupa tip,int timp , int calorii) throws Exception {
        switch (tip) {
            case SupaCiuperci: return new SupaCiuperci(timp,calorii);
            case SupaLegume: return new SupaLegume(timp,calorii);
            case SupaVita: return new SupaVita(timp,calorii);
            default:throw new Exception("Nu este un tip valid");
        }
    }
}
