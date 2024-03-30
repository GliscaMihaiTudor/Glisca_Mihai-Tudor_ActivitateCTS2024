package main;

import classes.Cont;

public class Main {
    public static void main(String[] args) {
        Cont cont = new Cont(1,"Ionescu","20-09-2024");
        Cont cont1 = cont.copiaza();
        System.out.println(cont);
        System.out.println(cont1);
    }
}
