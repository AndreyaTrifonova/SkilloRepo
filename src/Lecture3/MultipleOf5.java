package Lecture3;

public class MultipleOf5 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 12, 18, 21, 25};
        boolean found = false;

        for (int number : numbers) {
            if (number % 5 == 0) {
                System.out.println("The first multiple of 5 is: " + number);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No multiple of 5 found in the array.");
        }
    }
}
