package constructor;
import java.util.Scanner;
public class App2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SBI cust1 = new SBI();

        int input = 0;

        while (input != 5) {
            System.out.println("1.Deposit  2.Withdraw  3.showBalance 4.showAccountDetails 5.exit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    int amt = sc.nextInt();
                    cust1.Deposit(amt);
                    break;
                case 2:
                    int amt2 = sc.nextInt();
                    cust1.Withdraw(amt2);
                    break;
                case 3:
                    cust1.CurrentBalace();
                    break;
                case 4:
                    System.out.println("Account Details:");
                    System.out.println("Account Holder: N/A");
                    System.out.println("Account Number: N/A");
                    cust1.CurrentBalace();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            sc.close();

        }

    }
}

