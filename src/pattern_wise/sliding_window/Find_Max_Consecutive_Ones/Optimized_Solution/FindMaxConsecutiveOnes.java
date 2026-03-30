package pattern_wise.sliding_window.Find_Max_Consecutive_Ones.Optimized_Solution;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] arr = {1,1,0,0,1,0,1,1,0,1};
        int k = 2;
        int result = findMaxConsecutiveOnes(arr, k);
        System.out.println("Maximum consecutive ones : "+result);
    }

    // Finds max consecutive 1s by flipping at most k zeros
    public static int findMaxConsecutiveOnes(int[] arr, int k){
        if(arr == null || arr.length == 0)  return 0;

        int left = 0;
        int maxLen = 0;
        int zeros = 0;

        for(int right = 0; right < arr.length; right++){
            if(arr[right] == 0) zeros++;

            while(zeros > k){
                if(arr[left] == 0) {
                    zeros--;
                }
                left++;

            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
