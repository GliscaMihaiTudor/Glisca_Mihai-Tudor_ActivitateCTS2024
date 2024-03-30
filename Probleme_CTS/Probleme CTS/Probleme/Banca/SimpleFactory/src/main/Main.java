package main;

import classes.Credit;
import classes.Factory;
import classes.TipCredit;

public class Main {
    public static void main(String[] args) {
        try {
            Factory factory = new Factory();
            Credit credit1 = factory.createCredit(TipCredit.Ipotecar,2300,10);
            Credit credit2 = factory.createCredit(TipCredit.NevoiPersonale,4000,5);
            credit1.afiseazaDescriere();
            credit2.afiseazaDescriere();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
