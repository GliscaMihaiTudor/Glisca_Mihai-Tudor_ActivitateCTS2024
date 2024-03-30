package classes;

public class MedicFactory implements Factory{
    @Override
    public PersonalSpital createAngajat() {
        return new Medic();
    }
}
