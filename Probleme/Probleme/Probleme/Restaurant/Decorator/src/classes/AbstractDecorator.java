package classes;

public abstract class AbstractDecorator implements INota{
    private INota nota;

    public AbstractDecorator(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printeazaNota() {
        nota.printeazaNota();
    }

    public abstract void printeazaFelicitare();
}
