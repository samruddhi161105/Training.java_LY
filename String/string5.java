package String;

public class string5 {
    public class SlidingWindowAvg {
    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};
        int k = 2;

        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        double maxAvg = (double) maxSum / k;

        System.out.println(" Your Highest Average in a window is  = " + maxAvg);
    }
}
}

