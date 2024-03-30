package main;

import classes.Rezervare;
import classes.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder(false,false,false,false,"NA");
        builder.setGeam(true).setGenMuzica("Clasica");
        Rezervare rezervare1 = builder.build();
        builder.setDecorrareMasa(true);
        Rezervare rezervare2 = builder.build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }

}
