package classes;

public class Decorator extends AbstractDecorator{
    public Decorator(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("S aa printat felicitarea");
    }
}
