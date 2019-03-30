package designpattern.structural.Strategy.shop;

public class PayByPayPal implements PayStrategy {
    @Override
    public String pay(int amount) {
        return "paying " + amount + " using PayPal";
    }
}
