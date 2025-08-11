package Lecture5;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate6 {

    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        int[] result = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 5, 9, 4, 5, 7, 9, 1};
        int[] uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Unique array: " + Arrays.toString(uniqueNumbers));
    }
}
