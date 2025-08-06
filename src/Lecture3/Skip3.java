package Lecture3;

public class Skip3 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7, 9, 10, 12, 14};

        for (int number : numbers) {
            if (number % 3 == 0) {
                continue;
            }
            System.out.println(number);
        }
    }
}
