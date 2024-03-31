package main;


import classes.Supa;
import classes.TipSupa;
import classes.Factory;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        try {
            Supa supa1 = factory.createSupa(TipSupa.SupaCiuperci, 20, 300);
            Supa supa2 = factory.createSupa(TipSupa.SupaLegume, 40, 350);
            System.out.println(supa1.toString());
            System.out.println(supa2.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

