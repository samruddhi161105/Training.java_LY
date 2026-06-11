package Opps;

class HDFC {
    String name;
    int AccNo;
    double balance;

    HDFC() {// it get called , when we create a new object
        name = "User";
        AccNo = 11111;
        balance = 00.00;
    }

    void Deposit() {
        System.out.println("Amount deposited");
    }

    void Withdraw() {
        System.out.println("Amount Debited!!");
    }
}