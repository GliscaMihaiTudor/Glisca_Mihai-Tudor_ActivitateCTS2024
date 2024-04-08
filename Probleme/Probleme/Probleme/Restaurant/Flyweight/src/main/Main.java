package main;

import classes.Client;
import classes.Flyweight;
import classes.Masa;


public class Main {
    public static void main(String[] args) {
        Masa masa1 = new Masa(1,3,20);
        Masa masa2 = new Masa(2,4,21);
        Flyweight flyweight = new Flyweight();
        Client client1 = flyweight.verificaClient("Ion","07333","str Azurului 1");
        client1.descriere(masa1);
    }
}
