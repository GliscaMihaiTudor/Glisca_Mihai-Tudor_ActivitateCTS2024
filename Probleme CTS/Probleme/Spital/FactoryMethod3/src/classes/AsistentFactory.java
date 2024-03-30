package classes;

public class AsistentFactory implements Factory{

    @Override
    public PersonalSpital createAngajat() {
        return new Asistent();
    }
}
