package main;

import classes.IMijlocTransport;
import classes.TipTransport;
import classes.Fabrica;

public class Main {
    public static void main(String[] args) throws Exception {
        Fabrica fabrica =new Fabrica();

        IMijlocTransport autobuz1=fabrica.createObject(TipTransport.autobuz,"BV43TTR","VL67UIB","B789RDD");
        System.out.println(autobuz1.toString());
    }
}
