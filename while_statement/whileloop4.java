package while_statement;

import java.util.Scanner;
public class whileloop4 {
//to find biggest digit in a number

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int max = 0;

        while (num != 0) {
            int digit = num % 10;  // get last digit

            if (digit > max) {
                max = digit;       // update max
            }

            num = num / 10;        // remove last digit
        }

        System.out.println("Biggest digit = " + max);
        sc.close();
    }
}

