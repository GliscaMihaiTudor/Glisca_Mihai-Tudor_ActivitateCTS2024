package main;

import classes.ContClient;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ContClient cont = new ContClient(101,"Ionescu",34);
        ContClient cont1 = (ContClient) cont.clone();
        System.out.println(cont);
        System.out.println(cont1);
    }

}
