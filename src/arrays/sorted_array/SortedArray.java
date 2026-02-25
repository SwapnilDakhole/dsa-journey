package arrays.sorted_array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,5};
        System.out.println(isSortedArray(arr));
    }

    private static boolean isSortedArray(int[] arr) {
        if(arr == null || arr.length <= 1) return false;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]) return false;
        }
        return true;
    }
}
