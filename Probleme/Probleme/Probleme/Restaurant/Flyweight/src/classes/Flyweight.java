package classes;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {

    private Map<String, Client> mapClient;

    public Flyweight() {
        mapClient = new HashMap<>();
    }

    public Client verificaClient(String nume, String nrTelefon, String adresa) {
        if (!mapClient.containsKey(nume)) {
            mapClient.put(nume,new Client(nume,nrTelefon,adresa));
            return mapClient.get(nume);
        }
        return mapClient.get(nume);
    }

}
