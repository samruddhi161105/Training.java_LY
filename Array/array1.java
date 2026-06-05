package Array;

import java.util.Scanner;

public class array1 {
 //find the value of array

    public static void main(String[] args) {
        int arr[] = {5};

       // System.out.print(arr[0]);

       Scanner sc = new Scanner(System.in);

       for(int i = 0; i < arr.length; i++){
        System.out.print("Enter the value of arr ");
        arr[i] = sc.nextInt();
    
       }
       System.out.println("The values in the array are:");
         for(int i = 0; i < arr.length; i++){
          System.out.println("Element at index " + i + ": " + arr[i]);
         }
         
       sc.close();
    }
}
