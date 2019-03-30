package designpattern.structural.Strategy.calculater;

public class Context {
    private Sterategy sterategy;

    public Context(Sterategy sterategy){
        this.sterategy=sterategy;
    }



    public int executSterategy(int numebr1,int numebr2){
        return sterategy.doOperation(numebr1,numebr2);
    }

}
