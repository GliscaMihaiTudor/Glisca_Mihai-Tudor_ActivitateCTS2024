package main;

import classes.Factura;
import classes.FacturaBuilder;

public class Main {

    public static void main(String[] args) {
        Factura factura1 = (new FacturaBuilder()).setCardFidelitate(true).setNrPungi(2).build();
        Factura factura2 = (new FacturaBuilder()).setCardFidelitate(true).setNrPungi(4).setPlataCard(true).build();
        Factura factura3 = (new FacturaBuilder()).setCotaTVA(12).setNrPungi(1).build();
        System.out.println(factura1);
        System.out.println(factura2);
        System.out.println(factura3);
    }
}
