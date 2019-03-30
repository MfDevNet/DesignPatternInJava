package designpattern.structural.Strategy.calculater;

public class OperationAdd implements Sterategy {
    @Override
    public int doOperation(int number1, int number2) {
        return number1+number2;
    }
}
