package main;


import model.Builder;
import model.Cont;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setDetinator("Alin").setId(1);
        Cont cont  = builder.build();
        System.out.println(cont);
    }
}
