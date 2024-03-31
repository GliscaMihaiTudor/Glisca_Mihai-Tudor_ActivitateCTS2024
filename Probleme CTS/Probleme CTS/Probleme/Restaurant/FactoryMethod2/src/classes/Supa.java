package classes;

public abstract class Supa {
    int timpPreparare;
    int calorii;

    public Supa(int timpPreparare, int calorii) {
        this.timpPreparare = timpPreparare;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "timpPreparare=" + timpPreparare +
                ", calorii=" + calorii +
                '}';
    }
}
