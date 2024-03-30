package classes;

public class Cont implements IPrototype{
    private int idCont;
    private String numeClient;
    private String dataInfiintareCont;

    public Cont(int idCont, String numeClient, String dataInfiintareCont) {
        this.idCont = idCont;
        this.numeClient = numeClient;
        this.dataInfiintareCont = dataInfiintareCont;
    }

    public Cont() {
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("idCont=").append(idCont);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", dataInfiintareCont='").append(dataInfiintareCont).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Cont copiaza() {
        Cont copie = new Cont();
        copie.dataInfiintareCont=this.dataInfiintareCont;
        copie.idCont=this.idCont;
        copie.numeClient = this.numeClient;
        return copie;
    }
}
