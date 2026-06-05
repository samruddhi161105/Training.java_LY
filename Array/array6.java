package Array;

public class array6 {
    public static void main(String[] args) {
        // to find that the given numbers are sorted in ascending order
        int arr[] = {43,56,52,60,70,80};
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}

