package classes;

public class FacturaBuilder implements IBuilder {
    private Factura factura;

    public FacturaBuilder() {
        factura = new Factura(0,false,false,0);
    }
    public FacturaBuilder setNrPungi(int nrPungi) {
        this.factura.setNrPungi(nrPungi);
        return this;
    }

    public FacturaBuilder setPlataCard(boolean plataCard) {
        this.factura.setPlataCard(plataCard);
        return this;
    }

    public FacturaBuilder setCardFidelitate(boolean cardFidelitate) {
        this.factura.setCardFidelitate(cardFidelitate);
        return this;
    }

    public FacturaBuilder setCotaTVA(int cotaTVA) {
        this.factura.setCotaTVA(cotaTVA);
        return this;
    }


    @Override
    public Factura build() {
        return factura;
    }
}
