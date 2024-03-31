package classes;

public class RezervareBuilder implements IBuilder{

    private boolean geam;
    private boolean scaunErgonomic;
    private boolean decorrareMasa;
    private boolean muzica;
    private String genMuzica;

    public RezervareBuilder(boolean geam, boolean scaunErgonomic, boolean decorrareMasa, boolean muzica, String genMuzica) {
        this.geam = geam;
        this.scaunErgonomic = scaunErgonomic;
        this.decorrareMasa = decorrareMasa;
        this.muzica = muzica;
        this.genMuzica = genMuzica;
    }

    public RezervareBuilder setGeam(boolean geam) {
        this.geam = geam;
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilder setDecorrareMasa(boolean decorrareMasa) {
        this.decorrareMasa = decorrareMasa;
        return this;
    }

    public RezervareBuilder setMuzica(boolean muzica) {
        this.muzica = muzica;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
    @Override
    public Rezervare build() {
        return new Rezervare(geam, scaunErgonomic,decorrareMasa,muzica,genMuzica);
    }
}
