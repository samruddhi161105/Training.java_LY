package Opps;

public class opps3 {
    static class SBI {
    String name, acNo;
    double balance;

    SBI(String name, String acNo, double balance) {
        this.name = name;
        this.acNo = acNo;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + acNo);
        System.out.println("Balance: " + balance);
    }

    static void bankChori() {
        System.out.println("Bank Chori Alert!");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SBI acc = new SBI("Samruddhi", "SBIN09768COR", 50000);

        acc.deposit(10000);
        acc.withdraw(5000);

        acc.showDetails();
        SBI.bankChori();
    }
}
}
