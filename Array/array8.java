package Array;

public class array8 {

    static int Search(int arr[], int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                return i;
            }
        }
    return -1;
    }

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};
        int target = 10;
        int result = Search(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }
}
    