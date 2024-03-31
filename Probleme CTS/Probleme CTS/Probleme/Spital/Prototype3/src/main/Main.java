package main;

import classes.AbstractPrototype;
import classes.Reteta;

public class Main {
    public static void main(String[] args) {
        AbstractPrototype reteta = new Reteta(1,"Algocalimn");
        AbstractPrototype reteta1 = reteta.copiaza();
        System.out.println(reteta1.toString());
        System.out.println(reteta.toString());
    }
}
