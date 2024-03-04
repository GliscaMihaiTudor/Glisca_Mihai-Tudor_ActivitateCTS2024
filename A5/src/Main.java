// Interfața Medicament
interface Medicament {
    void cumparaMedicament();
}


class MedicamentSpital implements Medicament {
    @Override
    public void cumparaMedicament() {
        System.out.println("Verificare rețetă...");
        prezintaReteta();
        achizitioneazaMedicament();
    }

    private void achizitioneazaMedicament() {
        System.out.println("Achiziționează medicamentul din magazinul spitalului...");
    }

    private void prezintaReteta() {
        System.out.println("Prezintă rețeta pentru verificare...");
    }
}


class MedicamentFarmacie implements Medicament {
    @Override
    public void cumparaMedicament() {
        System.out.println("Cumpără medicamentul din farmacie...");
        achizitioneazaMedicament();
    }

    private void achizitioneazaMedicament() {
        System.out.println("Achiziționează medicamentul din farmacie...");
    }
}


class ClientFarmacie {
    private Medicament medicament;

    public void setMedicament(Medicament medicament) {
        this.medicament = medicament;
    }

    public void cumparaMedicament() {
        if (medicament != null) {
            medicament.cumparaMedicament();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ClientFarmacie clientFarmacie = new ClientFarmacie();


        System.out.println("Clientul farmaciei alege un medicament din spital:");
        clientFarmacie.setMedicament(new MedicamentSpital());


        System.out.println("Clientul farmaciei cumpără medicamentul:");
        clientFarmacie.cumparaMedicament();


        System.out.println("\nClientul farmaciei alege un medicament din farmacie:");
        clientFarmacie.setMedicament(new MedicamentFarmacie());


        System.out.println("Clientul farmaciei cumpără medicamentul:");
        clientFarmacie.cumparaMedicament();
    }
}
