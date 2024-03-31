package model;

public class Builder implements IBuilder {

    private int id;
    private String detinator;

    public Builder() {

    }

    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    public Builder setDetinator(String detinator) {
        this.detinator = detinator;
        return this;
    }

    @Override
    public Cont build() {
        return new Cont(id,detinator);
    }
}
