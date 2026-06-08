package Array;
  //merge 2 sorted array and they merge it will be sorted
public class array11 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7}; // first sorted array
        int[] arr2 = {2, 4, 6, 8}; // second sorted array
        int[] merged = new int[arr1.length + arr2.length]; // array to hold merged result

        int i = 0, j = 0, k = 0; // pointers for arr1, arr2 and merged

        // merge the two arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // copy remaining elements of arr1 if any
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // copy remaining elements of arr2 if any
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        printArray(merged); // print the merged array
    }

    // method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
