package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = (new RezervareBuilder()).setMuzica(true).setBauturaRacoritoare(true).build();
        Rezervare rezervare2 = (new RezervareBuilder()).setScaunErgonomic(true).setMancareInclusa(true).build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}
