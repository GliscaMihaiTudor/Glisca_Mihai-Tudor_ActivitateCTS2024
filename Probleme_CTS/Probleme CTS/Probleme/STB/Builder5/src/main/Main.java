package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {

    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.setBauturaRacoritoare(true).setMuzica(true).build();
        System.out.println(rezervare);
    }
}
