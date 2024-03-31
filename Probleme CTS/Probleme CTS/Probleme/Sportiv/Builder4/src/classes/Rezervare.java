package classes;

public class Rezervare {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzica;
    private boolean genMuzica;

    public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare, boolean muzica, boolean genMuzica) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoare = bauturaRacoritoare;
        this.muzica = muzica;
        this.genMuzica = genMuzica;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    public void setMuzica(boolean muzica) {
        this.muzica = muzica;
    }

    public void setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
    }

    public String toString() {
        return "Rezervare{mancareInclusa=" + this.mancareInclusa + ", scaunErgonomic=" + this.scaunErgonomic + ", bauturaRacoritoare=" + this.bauturaRacoritoare + ", muzica=" + this.muzica + ", genMuzica=" + this.genMuzica + "}";
    }
}
