package main;

import classes.IFabrica;
import classes.FabricaAutobuz;
import classes.IMijlocTransport;

public class Main {

    public static void afisare(IFabrica fabrica){
        IMijlocTransport mijlocTransport = fabrica.creazaObiect("B333HJG","IS45FDS","VL45TGG");
        mijlocTransport.descriere();
    }
    public static void main(String[] args) {
        afisare(new FabricaAutobuz());
    }
}
