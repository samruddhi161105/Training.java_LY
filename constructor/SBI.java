package constructor;

public class SBI {
   
    public String name;
    public String AccNo;
    public int balance;

    SBI() {
        name = "User";
        AccNo = "1X1X1X";
        balance = 0;
    }

    SBI(String name, String AccNo, int balance) {
        this.name = name;
        this.AccNo = AccNo;
        this.balance = balance;
    }

    void Deposit(int amt) {
        balance += amt;
    }

    void Withdraw(int amt) {
        if (balance < amt) {
            System.out.println("Not enough balance");
        } else {
            balance -= amt;
        }
    }

    void CurrentBalace() {
        System.out.println(balance);
    }

    void CheckAccount() {
        if (AccNo.contains("COR")) {
            System.out.println("Its a corporate acc");
        } else if (AccNo.contains("BUIS")) {
            System.out.println("Its a buiness acc");
        } else {
            System.out.println("Its a saving account");
        }
    }

    void showDetails() {
        System.out.println(name + " " + AccNo + " " + balance);
    }

    static void BankChori() {
        System.out.println("LOOOTTT lloooo!!1");
    }
}
