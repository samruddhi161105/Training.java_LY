package Array;

public class array5 {
     
    public static void main(String[]args){
   //reverse an array using two pointer approach

        int arr[] = {2,3,5,8,9};
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // move the pointers
            start++;
            end--;
        }

        // print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
} 
