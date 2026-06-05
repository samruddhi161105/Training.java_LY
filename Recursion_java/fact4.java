package Recursion_java;

  import java.util.Scanner;

public class fact4 {

    public static int largestDigit(int num) {
        // Base case
        if (num < 10) {
            return num;
        }

        int digit = num % 10;
        int largestInRest = largestDigit(num / 10);

        return Math.max(digit, largestInRest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        System.out.println("Largest digit = " + largestDigit(num));

        sc.close();
    }
}

