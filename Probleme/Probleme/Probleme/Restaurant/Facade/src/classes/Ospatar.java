package classes;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
    private List<Boolean> meseCurate;

    public Ospatar() {
        meseCurate = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            meseCurate.add(true);
        }
        for (int i = 10; i < 16; i++) {
            meseCurate.add(false);
        }
    }

    public boolean masaDebarasata(int cod){return meseCurate.contains(cod);}
    public boolean masaAreServetele(int cod){return meseCurate.contains(cod);}
}
