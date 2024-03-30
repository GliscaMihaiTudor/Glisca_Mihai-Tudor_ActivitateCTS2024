package main;

import classes.AbstractPrototype;
import classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Ibuprofen");
        lista.add("Paracetamol");
        AbstractPrototype reteta = new Reteta(1,lista);
        AbstractPrototype reteta1 = reteta.copiaza();
        System.out.println(reteta1.toString());
        System.out.println(reteta.toString());
    }
}
