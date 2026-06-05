package condition_statement;

public class SwitchStatementBanking {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Welcome to the Bank");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Calculate Interest");
        System.out.println("5. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: 10000");
                break;

            case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                System.out.println("You have deposited: " + depositAmount);
                break;

            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                if (withdrawAmount <= 1000) {
                    System.out.println("You have withdrawn: " + withdrawAmount);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;
            case 4:
                System.out.print("Enter principal amount: ");
                double principal = sc.nextDouble();
                System.out.print("Enter rate of interest: ");
                double rate = sc.nextDouble();
                System.out.print("Enter time in years: ");
                double time = sc.nextDouble();
                double interest = (principal * rate * time) / 100;
                System.out.println("Calculated interest: $" + interest);
                break;

            case 5:
                System.out.println("Thank you for banking with us!");
                break;

           

    
            default:
                System.out.println("Invalid choice! Please select a valid option.");    
        
        }

        sc.close();
    }
    
}