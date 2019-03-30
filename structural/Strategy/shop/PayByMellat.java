package designpattern.structural.Strategy.shop;

public class PayByMellat implements PayStrategy{
    @Override
    public String pay(int amount) {
        return "paying" + amount + " using Mellat Paying";
    }
}
