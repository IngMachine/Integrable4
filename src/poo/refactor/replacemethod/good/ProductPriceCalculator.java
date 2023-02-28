package poo.refactor.replacemethod.good;

public class ProductPriceCalculator {

    private double price;
    private int quantity;

    public ProductPriceCalculator(Product product) {
        this.price = product.getPrice();
        this.quantity = product.getQuantity();
    }

    public double calculatePrice(){
        double result = 0.0;

        // calculate

        return result;
    }
}
