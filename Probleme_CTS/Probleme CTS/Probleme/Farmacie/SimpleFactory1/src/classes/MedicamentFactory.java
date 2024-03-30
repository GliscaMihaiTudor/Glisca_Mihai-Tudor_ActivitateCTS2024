package classes;

public class MedicamentFactory {

    public Medicament createMedicament(TipMedicament tip, int pret) throws Exception {
        switch (tip){
            case Body:return new Body(pret);
            case Duerere:return new Durere(pret);
            case Raceala:return new Raceala(pret);
            default:throw new Exception("Nue este o categorie valida");
        }
    }
}
