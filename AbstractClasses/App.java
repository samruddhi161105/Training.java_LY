package AbstractClasses;

public class App {
    public static void main(String[] args) {
        Account a1 = new CorporateAccount("Samruddhi", 3000.50);

        System.out.println(a1);

        a1.withdraw(2000);

        System.out.println(a1);

        // a1.deposit(5000);

        // a1.withdraw(2000);

    }
}