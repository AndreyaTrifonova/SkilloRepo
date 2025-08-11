package Lecture4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> winningNumbers = new ArrayList<>();

        while (true) {
            System.out.println("\nLottery Number Manager");
            System.out.println("1. Add a winning number");
            System.out.println("2. View winning numbers");
            System.out.println("3. Check if a number is winning");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add: ");
                    int num = scanner.nextInt();
                    if (!winningNumbers.contains(num)) {
                        winningNumbers.add(num);
                        System.out.println("Number added!");
                    } else {
                        System.out.println("This number is already in the list.");
                    }
                    break;

                case 2:
                    System.out.println("Winning numbers:");
                    if (winningNumbers.isEmpty()) {
                        System.out.println("No winning numbers yet.");
                    } else {
                        for (int number : winningNumbers) {
                            System.out.print(number + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter number to check: ");
                    int checkNum = scanner.nextInt();
                    if (winningNumbers.contains(checkNum)) {
                        System.out.println("Congratulations! It's a winning number.");
                    } else {
                        System.out.println("Sorry, not a winning number.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return; // exits the program

                default:
                    System.out.println("Invalid option, try again.");
                    break;
            }
        }
    }
}
