package classes;

public class Medic implements PersonalSpital{
    private String nume;
    private int varsta;
    private int aniVechime;

    public Medic(String nume, int varsta, int aniVechime) {
        this.nume = nume;
        this.varsta = varsta;
        this.aniVechime = aniVechime;
    }


    @Override
    public void afisarePersonal() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", aniVechime=").append(aniVechime);
        sb.append('}');
        System.out.println(sb.toString());
    }

}
