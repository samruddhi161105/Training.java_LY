package while_statement;
import java.util.Scanner;
public class whileloop5 {
   // to check if a number is an Armstrong number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = num;

        
        System.out.print("Calculation: ");

        while (temp != 0) {
            int digit = temp % 10;
            int power = (int) Math.pow(digit, count);

            sum = sum + power;

            System.out.print(digit + "^" + count);

            temp = temp / 10;

            if (temp != 0) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + sum);

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
            System.out.println("Because " + sum + " = " + original);
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
            System.out.println("Because " + sum + " != " + original);
        }
        sc.close();
    }
}