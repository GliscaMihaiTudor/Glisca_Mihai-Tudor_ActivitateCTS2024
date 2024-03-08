import java.util.ArrayList;
import java.util.List;


class Pacient {
    private String nume;
    private String starea;

    public Pacient(String nume, String starea) {
        this.nume = nume;
        this.starea = starea;
    }

    public String getNume() {
        return nume;
    }

    public String getStarea() {
        return starea;
    }
}


class Medic {
    public boolean trebuieInternat(Pacient pacient) {

        return true;
    }
}


class Salon {
    private List<String> paturiLibere;
    private List<String> paturiOcupate;

    public Salon() {
        paturiLibere = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            paturiLibere.add("Pat" + i);
        }
        paturiOcupate = new ArrayList<>();
    }

    public boolean existaPatLiber() {
        return !paturiLibere.isEmpty();
    }

    public void internarePacient(Pacient pacient) {
        if (existaPatLiber()) {
            String pat = paturiLibere.remove(0);
            paturiOcupate.add(pat);
            System.out.println("Pacientul " + pacient.getNume() + " a fost internat în " + pat);
        } else {
            System.out.println("Nu există paturi libere disponibile pentru internarea pacientului " + pacient.getNume());
        }
    }
}


class VerificareFacila {
    private Medic medic;
    private Salon salon;

    public VerificareFacila(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void verificareInternare(Pacient pacient) {
        if (medic.trebuieInternat(pacient) && salon.existaPatLiber()) {
            salon.internarePacient(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat în acest moment.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("John", "grav");
        Pacient pacient2 = new Pacient("Maria", "usor");

        Medic medic = new Medic();
        Salon salon = new Salon();

        VerificareFacila modul = new VerificareFacila(medic, salon);

        modul.verificareInternare(pacient1);
        modul.verificareInternare(pacient2);
    }
}
