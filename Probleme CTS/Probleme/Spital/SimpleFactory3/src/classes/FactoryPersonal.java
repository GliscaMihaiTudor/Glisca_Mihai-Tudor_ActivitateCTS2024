package classes;

public class FactoryPersonal {

    public PersonalSpital creazaPersonal(TipPersonal tip, String nume, int varsta, int aniVechime) throws Exception {
        switch (tip){
            case MEDIC: return new Medic(nume, varsta, aniVechime);
            case ASISTENT: return new Asistent(nume, varsta, aniVechime);
            case BRANCARDIER:return new Brancardier(nume, varsta, aniVechime);
            default:throw new Exception("Nu e un tip valid");
        }
    }
}
