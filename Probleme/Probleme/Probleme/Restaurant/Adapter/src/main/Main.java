package main;

import classes.Adapter;
import classes.Bar;
import classes.IBar;
import classes.IBucatarie;

public class Main {
    public static void printeaza(IBucatarie bucatarie) {
        bucatarie.printeazaFactura();
    }

    public static void main(String[] args) {
        IBar bar = new Bar("Alex");
        Adapter adapter = new Adapter(bar);
        printeaza(adapter);
    }
}