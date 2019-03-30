package designpattern.structural.Strategy.calculater;

public class Main {
    public static void main(String[] args) {

        Context context=new Context(new OperationAdd());
        System.out.println(context.executSterategy(2,5));

        context=new Context(new OperationSubstract());
        System.out.println(context.executSterategy(5,3));

        context=new Context(new OperationMulitply());
        System.out.println(context.executSterategy(2,5));

    }


}
