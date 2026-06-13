package constructor;

public class HDFC {
    String name;
    int AccNo;
    double balance;

    HDFC() {// it get called , when we create a new object
        System.out.println("default constructor called");
        name = "User";// Initialise
        AccNo = 11111;
        balance = 00;
    }

    HDFC(String UserName, int UserAccNo, double UserBalance) {// parameter
        System.out.println("parametrized constructor called");
        name = UserName;
        AccNo = UserAccNo;
        balance = UserBalance;
    }

    void Deposit() {
        System.out.println("Amount deposited");
    }

    void Withdraw() {
        System.out.println("Amount Debited!!");
    }

    void PrintCustomerDetails() {
        System.out.println("Name " + name + " Acc no " + AccNo + " Balance " + balance);
    }
}
