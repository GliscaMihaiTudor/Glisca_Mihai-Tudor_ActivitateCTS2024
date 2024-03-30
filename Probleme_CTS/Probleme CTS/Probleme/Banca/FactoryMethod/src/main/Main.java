package main;

import classes.Credit;
import classes.CreditNevoiPersonaleFactory;
import classes.IFactory;

public class Main {
    public static void afiseaza(IFactory factory){
        Credit credit = factory.createCredit(2000,5);
        credit.afiseazaDescriere();
    }
    public static void main(String[] args) {
        afiseaza(new CreditNevoiPersonaleFactory());


    }
}
