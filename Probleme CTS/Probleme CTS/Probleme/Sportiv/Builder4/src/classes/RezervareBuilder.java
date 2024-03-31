package classes;
public class RezervareBuilder implements IBuilder {
    private Rezervare rezervare = new Rezervare(false, false, false, false, false);

    public RezervareBuilder() {
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
        this.rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
        this.rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.rezervare.setBauturaRacoritoare(bauturaRacoritoare);
        return this;
    }

    public RezervareBuilder setMuzica(boolean muzica) {
        this.rezervare.setMuzica(muzica);
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public Rezervare build() {
        return this.rezervare;
    }
}
