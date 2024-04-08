package classes;

public class Bar implements IBar{
    private String numeBarman;

    public Bar(String numeBarman) {

        this.numeBarman = numeBarman;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Barmanul "+numeBarman+" a adus nota");
    }
}
