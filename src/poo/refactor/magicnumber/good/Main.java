package poo.refactor.magicnumber.good;

public class Main {
    private static final double PRICE_MINIMUM_BUY = 100;
    private static final double PRICE_SEND = 4.99;
    private static final double FREE_SHIPPING = 0;
    private static final double DISCOUNT = 0.10;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscountPrice(price);
        double shippingPrice = calculateShippingPrice(price);
    }

    private static double calculateShippingPrice(double price) {
        return price < PRICE_MINIMUM_BUY ? PRICE_SEND : FREE_SHIPPING; // hard coded
    }

    private static double calculateDiscountPrice(double price) {
        return price * DISCOUNT;
    }
}
