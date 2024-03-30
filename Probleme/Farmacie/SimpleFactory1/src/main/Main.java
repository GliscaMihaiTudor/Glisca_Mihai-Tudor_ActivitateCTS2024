package main;


import classes.MedicamentFactory;
import classes.Medicament;
import classes.TipMedicament;

public class Main {
    public static void main(String[] args) {
    MedicamentFactory medicamentFactory = new MedicamentFactory();
    Medicament medicament = null;
    Medicament medicament2 = null;

    try{
        medicament = medicamentFactory.createMedicament(TipMedicament.Body,45);
        medicament2 = medicamentFactory.createMedicament(TipMedicament.Raceala,200);
        System.out.println(medicament.getPretBaza());
        System.out.println(medicament2.getPretBaza());
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}