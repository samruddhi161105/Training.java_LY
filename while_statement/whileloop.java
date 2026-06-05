package while_statement;

import java.util.Scanner;

public class whileloop {
   // to print Fibonacci series up to n terms

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many terms? ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= n; i++) {
            int c = a + b;

            System.out.print(c + " ");

            a = b;  // old B becomes new A
            b = c;  // new number becomes new B
        }
        sc.close();
    }
}