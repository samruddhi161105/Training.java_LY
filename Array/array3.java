package Array;
//to find largest and smallest element in an array
public class array3 {

    public static void main(String[] args) {

        // input -> 7-8 -> largest & smallest
        int arr[] = new int[8];

        // sample values
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 1;
        arr[3] = 9;
        arr[4] = 2;
        arr[5] = 8;
        arr[6] = 5;
        arr[7] = 4;

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
