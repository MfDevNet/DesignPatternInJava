package designpattern.structural.adapter;

public class PayPalAdapter implements PaymentAdapter {

    private PayPal payPal;

    public PayPalAdapter(PayPal payPal){
        this.payPal=payPal;
    }


    @Override
    public void pay(int amount) {
        payPal.pleasePayThePrice(amount);
    }
}
