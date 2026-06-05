package condition_statement.functions;

import java.util.Scanner;

public class function {

    static double balance = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayMenu();

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                checkBalance();
                break;

            case 2:
                deposit(sc);
                break;

            case 3:
                withdraw(sc);
                break;

            case 4:
                calculateInterest(sc);
                break;

            case 5:
                exit();
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }

    // Module 1
    static void displayMenu() {
        System.out.println("===== BANK MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Calculate Interest");
        System.out.println("5. Exit");
    }

    // Module 2
    static void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }

    // Module 3
    static void deposit(Scanner sc) {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();

        balance += amount;

        System.out.println("Deposited Amount = " + amount);
        System.out.println("Updated Balance = " + balance);
    }

    // Module 4
    static void withdraw(Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount = " + amount);
            System.out.println("Remaining Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Module 5
    static void calculateInterest(Scanner sc) {
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (Years): ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("Interest = " + interest);
    }

    // Module 6
    static void exit() {
        System.out.println("Thank you for banking with us!");
    }
}