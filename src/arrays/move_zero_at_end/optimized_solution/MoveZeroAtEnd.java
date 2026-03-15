package arrays.move_zero_at_end.optimized_solution;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0, 0, 5, 4};

        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroesToEnd(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining array with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
}