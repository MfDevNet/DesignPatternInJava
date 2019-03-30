package designpattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        EmailBody email=new Email();
//        email.loadBoay();


        email=new YaldaEmailBody(email);
        email=new NewYearEmailBody(email);
        email.loadBoay();

    }
}
