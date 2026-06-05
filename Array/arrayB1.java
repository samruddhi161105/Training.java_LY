package Array;

public class arrayB1 {

    static int Bsearch(int arr[], int key) {
        int s = 0;
        int end = arr.length - 1;

        while (s <= end) {
            int mid = (s + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } 
            else if (arr[mid] > key) {
                end = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return -1; // element not found
    }

    public static void main(String[] args) {

        // Array must be sorted for Binary Search
        int arr[] = {19, 31, 42, 56, 18, 81, 67};
        int key = 81;

        int index = Bsearch(arr, key);

        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}