package Lecture6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter integer numbers per line or 'end' to finish:");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter an integer or 'end'.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers were added.");
        } else {
            // Find min, max, sum
            int minNumber = numbers.get(0);
            int maxNumber = numbers.get(0);
            int sum = 0;

            for (int number : numbers) {
                if (number < minNumber) minNumber = number;
                if (number > maxNumber) maxNumber = number;
                sum += number;
            }

            double average = (double) sum / numbers.size();

            System.out.println("Min number: " + minNumber);
            System.out.println("Max number: " + maxNumber);
            System.out.printf("Average: %.2f%n", average);

            System.out.println("Numbers divisible by 5 until first element > 150:");
            for (int number : numbers) {
                if (number > 150) break;
                if (number % 5 == 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
