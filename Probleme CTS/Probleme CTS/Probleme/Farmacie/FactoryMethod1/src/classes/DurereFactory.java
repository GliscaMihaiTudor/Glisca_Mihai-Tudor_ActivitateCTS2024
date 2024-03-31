package classes;

public class DurereFactory implements Factory{
    @Override
    public Medicament createMedicament(int a) {
        return new Durere(a);
    }
}
