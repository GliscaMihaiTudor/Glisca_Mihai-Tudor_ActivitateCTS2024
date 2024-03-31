package main;


import classes.BrancardierFactory;
import classes.Factory;
import classes.PersonalSpital;

public class Main {

    public static void afisare(Factory fabrica){
        PersonalSpital angajat = fabrica.createAngajat();
        angajat.descriere();
    }

    public static void main(String[] args) {
        afisare(new BrancardierFactory());
    }
}
