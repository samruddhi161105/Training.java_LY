package Array;
//move all zero to end using two pointers [1,0,2,0,3,0,4] => [1,2,3,4,0,0,0]

public class array10 {
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4}; // sample array

        // move all zeros to the end
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                arr[left] = arr[right];
                left++;
            }
        }
        while (left < arr.length) {
            arr[left] = 0;
            left++;
        }

        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
