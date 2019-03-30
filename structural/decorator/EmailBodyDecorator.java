package designpattern.structural.decorator;

public abstract class EmailBodyDecorator implements EmailBody {

    protected EmailBody emailBody;

    public EmailBodyDecorator(EmailBody emailBody) {
        this.emailBody = emailBody;
    }

    abstract public void loadBoay();

}
