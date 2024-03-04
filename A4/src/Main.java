import java.util.HashMap;
import java.util.Map;


class Reteta {
    private String nume;
    private Map<String, Integer> ingrediente;

    public Reteta(String nume, Map<String, Integer> ingrediente) {
        this.nume = nume;
        this.ingrediente = ingrediente;
    }

    public String getNume() {
        return nume;
    }

    public Map<String, Integer> getIngrediente() {
        return ingrediente;
    }
}


class ManagerRetete {
    private static ManagerRetete instance;
    private Map<String, Reteta> retete = new HashMap<>();

    private ManagerRetete() {
        // Constructor privat pentru Singleton
    }

    public static ManagerRetete getInstance() {
        if (instance == null) {
            instance = new ManagerRetete();
        }
        return instance;
    }

    public Reteta getReteta(String nume) {
        return retete.get(nume);
    }

    public void adaugaReteta(Reteta reteta) {
        retete.put(reteta.getNume(), reteta);
    }
}

public class Main {
    public static void main(String[] args) {

        ManagerRetete managerRetete = ManagerRetete.getInstance();


        Reteta reteta1 = new Reteta("Reteta 1", new HashMap<>());
        managerRetete.adaugaReteta(reteta1);


        Reteta retetaDinManager = managerRetete.getReteta("Reteta 1");


        System.out.println(reteta1 == retetaDinManager);


        Reteta reteta2 = new Reteta("Reteta 2", new HashMap<>());
        managerRetete.adaugaReteta(reteta2);


        Reteta retetaDinManager2 = managerRetete.getReteta("Reteta 2");


        System.out.println(reteta2 == retetaDinManager2);


    }
}
