package classes;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype{
    private int idReteta;
    private List<String> listSubstante = new ArrayList<>();
    public Reteta() {
    }

    public Reteta(int idReteta, List<String> listSubstante) {
        this.idReteta = idReteta;
        this.listSubstante = listSubstante;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("idReteta=").append(idReteta);
        sb.append(", listSubstante=").append(listSubstante);
        sb.append('}');
        return sb.toString();
    }

    public void adaugaSubtanta(String s ){
        listSubstante.add(s);
    }
    @Override
    public AbstractPrototype copiaza() {
        Reteta copie = new Reteta();
        copie.idReteta=this.idReteta;
        for(var a : listSubstante){
            copie.adaugaSubtanta(a);
        }
        return copie;
    }
}
