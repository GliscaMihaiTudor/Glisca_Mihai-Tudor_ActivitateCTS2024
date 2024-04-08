package main;

import classes.AbstractDecorator;
import classes.Decorator;
import classes.INota;
import classes.Nota;


public class Main {
    public static void main(String[] args) {
        INota nota = new Nota(1000f);
        nota.printeazaNota();
        AbstractDecorator facturaDecorata = new Decorator(nota);
        facturaDecorata.printeazaNota();
        facturaDecorata.printeazaFelicitare();
    }
}
