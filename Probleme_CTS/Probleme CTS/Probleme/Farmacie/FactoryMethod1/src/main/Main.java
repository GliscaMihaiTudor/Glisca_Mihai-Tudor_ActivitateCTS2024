package main;


import classes.BodyFactory;
import classes.Factory;
import classes.Medicament;

public class Main {

    public static void afisare(Factory fabrica) {
        Medicament medicament = fabrica.createMedicament(240);
        System.out.println(medicament.getPretBaza());
    }

    public static void main(String[] args) {
        afisare(new BodyFactory());
    }
}
