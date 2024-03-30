package main;

import classes.Fabrica;
import classes.Jucator;
import classes.TipJucator;

public class Main {
    public static void main(String[] args) throws Exception {
        Fabrica fabrica = new Fabrica();
        Jucator jucator1 = fabrica.creazaJucator(TipJucator.ATACANT,"Ionescu",23,1.8f,12,14,15);
        System.out.println(jucator1);
    }
}
