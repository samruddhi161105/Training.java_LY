package Recursion_java;

import java.util.Scanner;

public class fact3 {
    static int reverse = 0;

    public static int reverseNumber(int num) {
        if (num == 0) {
            return reverse;
        }

        int digit = num % 10;
        reverse = reverse * 10 + digit;

        return reverseNumber(num / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = reverseNumber(num);

        System.out.println("Reversed number = " + result);

        sc.close();
    }
}

