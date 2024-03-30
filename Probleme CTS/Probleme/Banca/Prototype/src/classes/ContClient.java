package classes;

import builder.classes.Cont;

public class ContClient implements Cloneable{
    private int idCont;
    private String denumireClient;
    private int varstaClient;

    public ContClient(int idCont, String denumireClient, int varstaClient) {
        this.idCont = idCont;
        this.denumireClient = denumireClient;
        this.varstaClient = varstaClient;
    }

    public ContClient() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("idCont=").append(idCont);
        sb.append(", denumireClient='").append(denumireClient).append('\'');
        sb.append(", varstaClient=").append(varstaClient);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ContClient cont = new ContClient();
        cont.idCont  = this.idCont;
        cont.denumireClient=this.denumireClient;
        this.varstaClient=this.varstaClient;
        return this;
    }
}
