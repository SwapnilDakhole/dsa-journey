package pattern_wise.sliding_window.Average_Of_Subarrays_Of_Size_K.Brute_solution;

public class AverageOfSubarraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 6, 7, 4};
        int k = 3;

        float result = findAverageOfSubarrays(arr, k);

        System.out.println("Average of subarrays : " + result);
    }
    public static float findAverageOfSubarrays(int[] arr, int k){
        if(arr == null || k > arr.length)   return 0;

        float maxAvg = Float.MIN_VALUE;

        for(int i = 0; i <= arr.length - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }
            float avg = (float) sum / k;
            maxAvg = Math.max(maxAvg, avg);
        }
        return maxAvg;
    }
}
