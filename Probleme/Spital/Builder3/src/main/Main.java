package main;

import classes.Internare;
import classes.InternareBuilder;

public class Main {
    public static void main(String[] args) {
        Internare internare = new InternareBuilder().setHalat(true).setMicDejun(true).build();
        Internare internare1 = new InternareBuilder().setPapuci(true).setMicDejun(true).build();
        System.out.println(internare);
        System.out.println(internare1);

    }
}
