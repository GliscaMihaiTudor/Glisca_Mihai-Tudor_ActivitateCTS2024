package main;

import classes.FactoryAtacant;
import classes.FactoryJucator;
import classes.Jucator;

public class Main {

    public static void afisareJucator(FactoryJucator fabrica, String nume, int varsta, int inaltime, int nrTricouAtacant, int nrTricouFundas, int nrTricouPortar){
        Jucator jucator=fabrica.creazaJucator(nume,varsta,inaltime,nrTricouAtacant,nrTricouFundas,nrTricouPortar);
       System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afisareJucator(new FactoryAtacant(),"Andrei",26,1,15,0,1);

    }
}

