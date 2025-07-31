package Lecture3;

public class LargestNum {
    public static void main(String[] args) {
        int[] numbers = {45, 67, 89, 23, 90, 12, 100, 56};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // if it's larger => max is updated
            }
        }

        System.out.println("The largest number in the array is: " + max);
    }
}
