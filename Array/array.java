package Array;

public class array {
    public static void main(String[] args) {

        int[] arr2 = new int[5];

        arr2[0] = 2;
        arr2[1] = 7;
        arr2[2] = 8;
        arr2[3] = 9;
        arr2[4] = 6;

        System.out.println("Length: " + arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}