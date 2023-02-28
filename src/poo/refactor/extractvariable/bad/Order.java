package poo.refactor.extractvariable.bad;

public class Order {
    private Double price;
    private Double quantity;
    private Double offer;
    private Double shipping;
    public Double getPrice() {
        return price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getOffer() {
        return offer;
    }

    public Double getShipping() {
        return shipping;
    }
}
