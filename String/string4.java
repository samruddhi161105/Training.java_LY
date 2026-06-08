package String;

public class string4 {
    
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3,2};
        int k=3;

        int MaxWindowSum = 0;
        for (int i = 0; i < k; i++) {
            MaxWindowSum += arr[i];
        }
        int CurrentMax = MaxWindowSum;

        for (int i = k; i < arr.length; i++) {
            int WindowSum = MaxWindowSum + arr[i] - arr[i - k];
            MaxWindowSum = Math.max(MaxWindowSum, WindowSum);

            if (MaxWindowSum > CurrentMax) {
                CurrentMax = MaxWindowSum;
            }
        }

        System.out.println("Maximum sum of a subarray of size " + k + " is: " + CurrentMax);
    }
}
