package designpattern.structural.adapter;

public class PayByCCAdapter implements PaymentAdapter {

    private PayByCC payByCC;

    public PayByCCAdapter(PayByCC payByCC){
        this.payByCC=payByCC;
    }


    @Override
    public void pay(int amount) {
    payByCC.pleasePayThePrice(amount);
    }
}
