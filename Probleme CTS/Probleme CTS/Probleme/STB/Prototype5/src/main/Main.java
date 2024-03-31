package main;

import classes.Autobuz;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz = new Autobuz("BV67TDY","Dacos");
        Autobuz autobuz1 = autobuz.clone();
        System.out.println(autobuz1);
        System.out.println(autobuz);
    }
}
