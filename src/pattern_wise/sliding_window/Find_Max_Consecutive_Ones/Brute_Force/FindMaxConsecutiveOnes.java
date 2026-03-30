package pattern_wise.sliding_window.Find_Max_Consecutive_Ones.Brute_Force;

public class FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,1,0,1};
        int k = 2;
        int result = findMaxConsecutiveOnes(arr, k);
        System.out.println("Maximum consecutive ones : "+result);
    }
    public static int findMaxConsecutiveOnes(int[] arr, int k){
        if(arr == null || arr.length == 0) return 0;

        int maxLen = 0;

        for(int i = 0; i < arr.length; i++){
            int zeros = 0;

            for(int j = i; j < arr.length; j++){
                if(arr[j] == 0) zeros++;

                if(zeros > k)   break;

                maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}
