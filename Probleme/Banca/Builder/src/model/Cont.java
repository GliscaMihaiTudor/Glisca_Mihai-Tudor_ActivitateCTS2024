package model;

public class Cont {
    private int id;
    private String detinator;

    public Cont(int id, String detinator) {
        this.id = id;
        this.detinator = detinator;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDetinator(String detinator) {
        this.detinator = detinator;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "id=" + id +
                ", detinator='" + detinator + '\'' +
                '}';
    }
}
