package designpattern.structural.adapter;

public class Main {
    public static void main(String[] args) {
        PayPalAdapter payPal = new PayPalAdapter(new PayPal());
        payPal.pay(20000);


        PayByCCAdapter payByCC = new PayByCCAdapter(new PayByCC());
        payByCC.pay(50000);
    }
}
