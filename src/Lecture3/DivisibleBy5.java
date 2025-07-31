package Lecture3;

public class DivisibleBy5 {
    public static void main(String[] args) {
        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int number : list) {
            if (number > 150) {
                break; // Stop the loop if number is greater than 150
            }
            if (number % 5 == 0) {
                System.out.println(number);
            }
        }
    }
}
