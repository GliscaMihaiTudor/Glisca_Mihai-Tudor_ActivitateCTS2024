package classes;

import java.util.ArrayList;
import java.util.List;

public class MeseLibere {
    private List<Integer> meseLibere;


    public MeseLibere() {
        meseLibere = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            meseLibere.add(i);

        }
    }

    public boolean verificaMasaLibera(int cod){
        return meseLibere.contains(cod);
    }

}
