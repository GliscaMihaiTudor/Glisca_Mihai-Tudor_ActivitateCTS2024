package classes;

public class Internare {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    public Internare(boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        return "Internare{" +
                "patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuci=" + papuci +
                ", halat=" + halat +
                '}';
    }
}
