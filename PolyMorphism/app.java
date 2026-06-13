package PolyMorphism;

public class app {
   
    public static void main(String[] args) {
        // PaymentService payment = new PaymentService();

        // payment.pay(500);

        // payment.pay(2000, 50504040);

        // payment.pay(1000, "Pankaj@oksbi");

        Notification s1 = new EmailNotification();
        s1.send();
        
        SMSNotification s2 = new SMSNotification();
        s2.send();
        
        Notification s3 = new WhatsAppNotification();
        s3.send();

    }
}

