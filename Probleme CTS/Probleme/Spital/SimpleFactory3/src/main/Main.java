package main;

import classes.FactoryPersonal;
import classes.PersonalSpital;
import classes.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonalSpital personal1 = (new FactoryPersonal()).creazaPersonal(TipPersonal.MEDIC,"Ionescu",45,11);
        PersonalSpital personal2 = (new FactoryPersonal()).creazaPersonal(TipPersonal.ASISTENT,"Popescu",54,12);
        PersonalSpital personal3 = (new FactoryPersonal()).creazaPersonal(TipPersonal.BRANCARDIER,"Gheorghe",32,5);
        PersonalSpital personal4 = (new FactoryPersonal()).creazaPersonal(TipPersonal.MEDIC,"Georgescu",38,7);
        personal1.afisarePersonal();
        personal2.afisarePersonal();
        personal3.afisarePersonal();
        personal4.afisarePersonal();
    }
}
