import java.util.ArrayList;
import java.util.List;


class Departament {
    private String nume;
    private List<Departament> subdepartamente;

    public Departament(String nume) {
        this.nume = nume;
        this.subdepartamente = new ArrayList<>();
    }

    public void adaugaSubdepartament(Departament subdepartament) {
        subdepartamente.add(subdepartament);
    }

    public void afiseazaArbore(int nivel) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            sb.append("  ");
        }
        sb.append(nume);
        System.out.println(sb.toString());


        for (Departament subdep : subdepartamente) {
            subdep.afiseazaArbore(nivel + 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Departament spital = new Departament("Spitalul Central");

        Departament departamentChirurgie = new Departament("Chirurgie");
        Departament departamentPediatrie = new Departament("Pediatrie");

        Departament sectieChirurgieGeneral = new Departament("Chirurgie Generală");
        Departament sectieChirurgieCardio = new Departament("Chirurgie Cardiovasculară");
        Departament sectieNeonatologie = new Departament("Neonatologie");
        Departament sectiePediatrieGeneral = new Departament("Pediatrie Generală");


        departamentChirurgie.adaugaSubdepartament(sectieChirurgieGeneral);
        departamentChirurgie.adaugaSubdepartament(sectieChirurgieCardio);

        departamentPediatrie.adaugaSubdepartament(sectieNeonatologie);
        departamentPediatrie.adaugaSubdepartament(sectiePediatrieGeneral);


        spital.adaugaSubdepartament(departamentChirurgie);
        spital.adaugaSubdepartament(departamentPediatrie);


        spital.afiseazaArbore(0);
    }
}
