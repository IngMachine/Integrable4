package poo.refactor.removeassing.good;

public class Main {
    double calculateDiscount(Order order, double totalPrice) {
        double result = totalPrice;
        if (order == null || order.getPrice() == null) // defensive programming
                return totalPrice;
        if (order.getPrice() > 100)
            result += order.getPrice() * order.getOffer();
        return result;
    }
}
