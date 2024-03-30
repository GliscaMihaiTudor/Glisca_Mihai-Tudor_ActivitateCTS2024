package classes;

public class BodyFactory implements Factory {


    @Override
    public Medicament createMedicament(int a) {
        return new Body(a);
    }
}
