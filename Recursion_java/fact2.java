package Recursion_java;
import java.util.Scanner;
// Count the number of digits in a number using recursion
public class fact2 {
    public static int countDigits(int num) {
        if (num < 10) {      // Base case
            return 1;
        }
        return 1 + countDigits(num / 10);  // Recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num; // Handle negative numbers
        }
        int digits = countDigits(num);
        System.out.println("Number of digits = " + digits);
        sc.close();
    }
}

