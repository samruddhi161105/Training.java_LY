package constructor;

public class App {
    public static void main(String[] args) {

        // use parameterized constructor to set fields (avoid direct field access)
        HDFC c1 = new HDFC("Pankaj", 101201, 500.25);

        c1.PrintCustomerDetails();

        HDFC c2 = new HDFC("Pushpa", 102502, 200.30);

        c2.PrintCustomerDetails();

        
    }
}

class HDFC {
    private String name;
    private int customerId;
    private double balance;

    HDFC(String name, int customerId, double balance) {
        this.name = name;
        this.customerId = customerId;
        this.balance = balance;
    }

    void PrintCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}
