package classes;

public class ContClient implements AbstractPrototype{
    private int idCont;
    private String denumireClient;
    private int varsta;

    public ContClient() {
    }

    public ContClient(int idCont, String denumireClient, int varsta) {
        this.idCont = idCont;
        this.denumireClient = denumireClient;
        this.varsta = varsta;
    }

    public void setIdCont(int idCont) {
        this.idCont = idCont;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "idCont=" + idCont +
                ", denumireClient='" + denumireClient + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public AbstractPrototype copiaza() {
        ContClient cont = new ContClient();
        cont.varsta=this.varsta;
        cont.denumireClient=this.denumireClient;
        cont.idCont=this.idCont;
        return cont;
    }
}
