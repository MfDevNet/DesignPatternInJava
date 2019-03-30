package designpattern.structural.Strategy.shop;

public class PayByCC implements PayStrategy {

    @Override
    public String pay(int amount) {
        return "paying " + amount+ " using Credit Card";
    }
}
