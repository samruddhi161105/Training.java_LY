package Array;

import java.util.Scanner;

public class array7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] count = new int[10];

        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num = num / 10;
        }

        System.out.println("Repeated digits are:");             

        for (int i = 0; i < 10; i++) {
            if (count[i] > 1) {
                System.out.println(i + " repeated " + count[i] + " times");
            }
        }

        sc.close();
    }
}

