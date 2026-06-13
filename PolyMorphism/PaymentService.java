package PolyMorphism;

public class PaymentService {
    
    void pay(double amt) {
        System.out.println("Paid with cash " + amt);
    }

    void pay(double amt, String UpiId) {
        System.out.println("Paid with Upi " + UpiId + " amt = " + amt);
    }

    void pay(double amt, int CardNumber) {
        System.out.println("Paid with Credit Card " + CardNumber + " amt = " + amt);
    }

}
