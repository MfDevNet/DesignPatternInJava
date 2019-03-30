package designpattern.structural.Strategy.calculater;

public class OperationMulitply implements Sterategy {
    @Override
    public int doOperation(int number1, int number2) {
        return number1*number2;
    }


}
