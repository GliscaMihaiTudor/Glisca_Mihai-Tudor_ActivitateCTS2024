package classes;

public class BrancardierFactory implements Factory{
    @Override
    public PersonalSpital createAngajat() {
        return new Brancardier();
    }
}
