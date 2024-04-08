package classes;

public class Client implements IRezervare{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Client(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    @Override
    public void descriere(Masa masa) {
        System.out.println(this.toString()+masa.toString());
    }
}
