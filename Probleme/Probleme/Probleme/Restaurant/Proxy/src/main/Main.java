package main;

import classes.ProxyRezervare;
import classes.Rezervare;


public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1,5);
        ProxyRezervare proxyRezervare= new ProxyRezervare(rezervare);
        proxyRezervare.rezerva();
    }
}
