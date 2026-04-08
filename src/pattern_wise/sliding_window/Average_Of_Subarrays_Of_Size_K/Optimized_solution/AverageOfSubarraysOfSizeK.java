package pattern_wise.sliding_window.Average_Of_Subarrays_Of_Size_K.Optimized_solution;

public class AverageOfSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6, 7, 4};
        int k = 3;

        float result = findAverageOfSubarrays(arr, k);

        System.out.println("Average of subarrays : " + result);
    }
    public static float findAverageOfSubarrays(int[] arr, int k){
        if(arr == null || arr.length == 0 || k > arr.length)   return 0;
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        float maxAvg = (float) windowSum / k;

        for(int i = k; i< arr.length; i++){
            windowSum += arr[i];
            windowSum -= arr[i-k];

            float avg = (float) windowSum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
}
