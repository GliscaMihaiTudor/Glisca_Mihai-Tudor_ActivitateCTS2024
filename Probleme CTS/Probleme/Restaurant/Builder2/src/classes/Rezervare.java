package classes;

public class Rezervare {
    private boolean geam;
    private boolean scaunErgonomic;
    private boolean decorrareMasa;
    private boolean muzica;
    private String genMuzica;

    public Rezervare(boolean geam, boolean scaunErgonomic, boolean decorrareMasa, boolean muzica, String genMuzica) {
        this.geam = geam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorrareMasa = decorrareMasa;
        this.muzica = muzica;
        this.genMuzica = genMuzica;
    }

    public void setGeam(boolean geam) {
        this.geam = geam;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setDecorrareMasa(boolean decorrareMasa) {
        this.decorrareMasa = decorrareMasa;
    }

    public void setMuzica(boolean muzica) {
        this.muzica = muzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "geam=" + geam +
                ", scaunErgonomic=" + scaunErgonomic +
                ", decorrareMasa=" + decorrareMasa +
                ", muzica=" + muzica +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
