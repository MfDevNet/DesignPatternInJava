package designpattern.structural.decorator;

public class NewYearEmailBody extends EmailBodyDecorator {


    public NewYearEmailBody(EmailBody emailBody) {
        super(emailBody);
    }

    @Override
    public void loadBoay() {
        System.out.println("This is the extea content for New Year .");
        this.emailBody.loadBoay();
    }
}
