package classes;

public class Asistent implements PersonalSpital {
    private String nume;
    private int varsta;
    private int aniVechime;

    public Asistent(String nume, int varsta, int aniVechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.aniVechime = aniVechime;
    }


    @Override
    public void afisarePersonal() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
