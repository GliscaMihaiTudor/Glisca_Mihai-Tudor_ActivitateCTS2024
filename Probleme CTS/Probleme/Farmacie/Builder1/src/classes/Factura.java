package classes;

public class Factura {
    private int nrPungi;
    private boolean plataCard;
    private boolean cardFidelitate;
    private int cotaTVA;

    public Factura(int nrPungi, boolean plataCard, boolean cardFidelitate, int cotaTVA) {
        this.nrPungi = nrPungi;
        this.plataCard = plataCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }


    public void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Factura{");
        sb.append("nrPungi=").append(nrPungi);
        sb.append(", plataCard=").append(plataCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }
}
