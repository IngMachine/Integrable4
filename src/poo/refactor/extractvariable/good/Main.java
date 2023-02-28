package poo.refactor.extractvariable.good;

public class Main {

    void printProductPrice(Order order) {
        // Calculate price total

        // 1. price of the products
        Double quantityPrice = order.getPrice() * order.getQuantity();

        // 2. Discount
        Double offerPrice = order.getPrice() * order.getOffer();

        // 3. calculate price products with the discount included
        Double finalPrice = quantityPrice - offerPrice;

        // 4. price send
        Double shippingCost = 0.0;
        if(finalPrice > 50.0){
            shippingCost = 2.99;
        }


        // price definitive
        System.out.println(finalPrice + shippingCost);
    }
}
