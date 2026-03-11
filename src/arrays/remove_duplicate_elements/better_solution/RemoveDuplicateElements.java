package arrays.remove_duplicate_elements.better_solution;

// Remove duplicate elements and returns the final count of unique elements

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3};
        int result = removeDuplicateElements(arr);
        System.out.println("Unique count: " + result);
    }

    private static int removeDuplicateElements(int[] arr) {
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array can not be null or empty");
        }
        int index = 0;
        Set<Integer> uniqueNumber = new LinkedHashSet<>();
        for (int num: arr){
            uniqueNumber.add(num);
        }
        for (int num: uniqueNumber){
            arr[index++] = num;
        }
        return index;
    }
}
