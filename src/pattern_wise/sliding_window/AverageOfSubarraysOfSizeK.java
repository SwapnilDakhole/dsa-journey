package pattern_wise.sliding_window;


public class AverageOfSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6, 7, 4};
        int k = 3;

        float result = findAverageOfSubarrays(arr, k);

        System.out.println("Average of subarrays : " + result);
    }

    public static float findAverageOfSubarrays(int[] arr, int k){
        if(arr == null || arr.length == 0 || k > arr.length){
            throw new IllegalArgumentException("Invalid input");
        }
        int sumWindow = 0;

        for (int i = 0; i < k; i++){
            sumWindow += arr[i];
        }

        int maxSum = sumWindow;

        for (int i = k; i < arr.length; i++){
            sumWindow += arr[i];
            sumWindow -= arr[i - k];

            maxSum = Math.max(maxSum, sumWindow);
        }

        return (float) maxSum / k;
    }
}
