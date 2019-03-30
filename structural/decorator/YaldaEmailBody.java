package designpattern.structural.decorator;

public class YaldaEmailBody extends EmailBodyDecorator {


        public YaldaEmailBody(EmailBody emailBody){
            super(emailBody);
        }

        @Override
        public void loadBoay() {
        System.out.println("This is the extea content for Yalda .");
        this.emailBody.loadBoay();
    }


}
