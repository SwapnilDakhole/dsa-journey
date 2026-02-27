package arrays.left_rotate;

public class LeftRotateByDPlace {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5, 6};
        int d = 2;

        int n = arr.length-1;
        d = d % n;
        reverse(arr, 0, d-1);
        reverse(arr, d, n);
        reverse(arr, 0, n);

        for (int num: arr){
            System.out.print(num+" ");
        }
    }
    private static void reverse(int[] arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
