package main;

import classes.ContClient;

public class Main {
    public static void main(String[] args) {
        ContClient cont = new ContClient(1,"Popescu Ion",21);
        ContClient cont1 = (ContClient) cont.copiaza();
        cont1.setIdCont(2);
        System.out.println(cont.toString());
        System.out.println(cont1.toString());
    }
}