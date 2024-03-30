package classes;

public class RacealaFactory implements Factory {

    @Override
    public Medicament createMedicament(int a) {
        return new Raceala(a);
    }
}
