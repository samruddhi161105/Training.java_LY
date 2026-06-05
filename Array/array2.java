package Array;

import java.util.Scanner;

public class array2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        
        //input ->5 subjects ->avg ->sum of all element/no of element

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter marks: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double) sum / arr.length);

        sc.close();
    }
}
