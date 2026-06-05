package while_statement;

import java.util.Scanner;

public class doloop6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1 = 25; // Number to guess
        int p2;

        do {
            System.out.print("Guess the number: ");
            p2 = sc.nextInt();

            if (p2 > p1) {
                System.out.println("bigger!");
            } else if (p2 < p1) {
                System.out.println("smaller!");
            } else {
                System.out.println("Correct! You guessed the number.");
            }

        } while (p2 != p1);
        sc.close();
    }
}