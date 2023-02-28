package poo.refactor.magicnumber.bad;

public class Main {
    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscountPrice(price);
        double shippingPrice = calculateShippingPrice(price);
    }

    private static double calculateShippingPrice(double price) {
        return price < 100 ? 4.99 : 0; // hard coded
    }

    private static double calculateDiscountPrice(double price) {
        return price * 0.1;
    }
}
