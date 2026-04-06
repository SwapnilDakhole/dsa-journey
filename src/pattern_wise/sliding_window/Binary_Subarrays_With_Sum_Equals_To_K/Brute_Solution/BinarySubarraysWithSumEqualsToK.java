package pattern_wise.sliding_window.Binary_Subarrays_With_Sum_Equals_To_K.Brute_Solution;

public class BinarySubarraysWithSumEqualsToK {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1};
        int k = 2;
        int result = findBinarySubarrayWithSumEqualsToK(arr, k);
        System.out.println("Binary subarray with sum equals to k :"+result);
    }
    public static int findBinarySubarrayWithSumEqualsToK(int[] arr, int k){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum == k) count++;
                else if(sum > k) break;
            }
        }
        return count;
    }
}
