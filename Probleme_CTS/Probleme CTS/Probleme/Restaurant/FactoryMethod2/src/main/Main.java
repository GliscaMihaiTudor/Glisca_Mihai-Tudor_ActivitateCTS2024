package main;

import classes.Factory;
import classes.Supa;
import classes.SupaLegumeFactory;

public class Main {
    public static void afisare(Factory farbica){
        Supa supa = farbica.createSupa(20,300);
        System.out.println(supa.toString());
    }

    public static void main(String[] args) {
        afisare(new SupaLegumeFactory());
    }
}
