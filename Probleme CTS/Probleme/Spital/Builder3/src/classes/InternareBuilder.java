package classes;

public class InternareBuilder implements IBuilder{
        private Internare internare;

    public InternareBuilder() {
        internare = new Internare(false,false,false,false);
    }

    public InternareBuilder setPatRabatabil(boolean patRabatabil){
        this.internare.setPatRabatabil(patRabatabil);
        return this;
    }

    public InternareBuilder setMicDejun(boolean micDejun){
        this.internare.setPatRabatabil(micDejun);
        return this;
    }

    public InternareBuilder setPapuci(boolean papuci){
        this.internare.setPapuci(papuci);
        return this;
    }

    public InternareBuilder setHalat(boolean halat){
        this.internare.setHalat(halat);
        return this;
    }


    @Override
    public Internare build() {
        return internare;
    }
}
