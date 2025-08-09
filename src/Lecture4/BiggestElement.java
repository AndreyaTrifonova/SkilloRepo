package Lecture4;

public class BiggestElement {
    public static void main(String[] args) {
        int[] numbers = {15, 42, 7, 89, 23};
        int biggest = numbers[0];

        // Loop through the array starting from second element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }

        System.out.println("The biggest element is: " + biggest);
    }
}

