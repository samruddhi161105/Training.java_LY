package condition_statement.functions;

import java.util.Scanner;

public class function4 {

    public static double discount(double bill) {

        if (bill > 5000) {
            return bill - (bill * 25 / 100);
        }
        else if (bill > 2000) {
            return bill - (bill * 20 / 100);
        }
        else if (bill > 1000) {
            return bill - (bill * 10 / 100);
        }
        else {
            return bill;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        double finalBill = discount(bill);

        System.out.println("Original Bill = " + bill);
        System.out.println("Final Bill After Discount = " + finalBill);

        sc.close();
    }
}