package designpattern.structural.decorator;

public class Email implements EmailBody {
    @Override
    public void loadBoay() {
        System.out.println("This is the main Email Body.");
    }
}
