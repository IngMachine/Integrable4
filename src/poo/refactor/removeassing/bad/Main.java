package poo.refactor.removeassing.bad;

public class Main {
    double calculateDiscount(Order order, double totalPrice) {
        if (order == null || order.getPrice() == null)
                return totalPrice;
        if (order.getPrice() > 100)
            totalPrice += order.getPrice() * order.getOffer();
        return totalPrice;
    }
}
