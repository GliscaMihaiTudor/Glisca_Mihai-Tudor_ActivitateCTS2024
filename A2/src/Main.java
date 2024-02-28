
interface PersonalSpital {
    void afiseazaRol();
}

class Brancardier implements PersonalSpital {
    public void afiseazaRol() {
        System.out.println("Sunt un brancardier.");
    }
}

class Asistent implements PersonalSpital {
    public void afiseazaRol() {
        System.out.println("Sunt un asistent.");
    }
}

class Medic implements PersonalSpital {
    public void afiseazaRol() {
        System.out.println("Sunt un medic.");
    }
}


class FactoryPersonalSpital {
    public static PersonalSpital creazaPersonal(TipPersonal tip) {
        switch (tip) {
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                throw new IllegalArgumentException("Tipul de personal necunoscut.");
        }
    }
}


enum TipPersonal {
    BRANCARDIER, ASISTENT, MEDIC
}


public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = FactoryPersonalSpital.creazaPersonal(TipPersonal.MEDIC);
        medic.afiseazaRol();

        PersonalSpital asistent = FactoryPersonalSpital.creazaPersonal(TipPersonal.ASISTENT);
        asistent.afiseazaRol();

        PersonalSpital brancardier = FactoryPersonalSpital.creazaPersonal(TipPersonal.BRANCARDIER);
        brancardier.afiseazaRol();
    }
}
