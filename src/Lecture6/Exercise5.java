package Lecture6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> books = new Stack<>();

        while (true) {
            showMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                case "2":
                case "3":
                case "4":
                    booksOperations(choice, books, scanner);
                    break;
                case "5":
                    numbersStatistics(scanner);
                    break;
                case "0":
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    // ---------------- Menu ----------------
    private static void showMenu() {
        System.out.println("\n=== Main Menu ===");
        System.out.println("1 - PUSH a book");
        System.out.println("2 - POP a book");
        System.out.println("3 - PEEK top book");
        System.out.println("4 - SEARCH a book");
        System.out.println("5 - Enter numbers and view stats");
        System.out.println("0 - EXIT");
        System.out.print("Choose an option: ");
    }

    // ---------------- Books Operations ----------------
    private static void booksOperations(String option, Stack<String> books, Scanner scanner) {
        switch (option) {
            case "1": // PUSH
                System.out.print("Enter book title: ");
                String title = scanner.nextLine().trim();
                if (!title.isEmpty()) {
                    books.push(title);
                    System.out.println("Added book: " + title);
                } else {
                    System.out.println("Title cannot be empty.");
                }
                break;
            case "2": // POP
                if (books.isEmpty()) {
                    System.out.println("Book stack is empty.");
                } else {
                    System.out.println("Removed book: " + books.pop());
                }
                break;
            case "3": // PEEK
                if (books.isEmpty()) {
                    System.out.println("Book stack is empty.");
                } else {
                    System.out.println("Top book: " + books.peek());
                }
                break;
            case "4": // SEARCH
                System.out.print("Enter keyword: ");
                String keyword = scanner.nextLine().trim().toLowerCase();
                ArrayList<String> found = new ArrayList<>();
                for (String b : books) {
                    if (b.toLowerCase().contains(keyword)) {
                        found.add(b);
                    }
                }
                if (!found.isEmpty()) {
                    System.out.println("Found in books: " + String.join(", ", found));
                } else {
                    System.out.println("Keyword not found in any book.");
                }
                break;
        }
    }

    // ---------------- Numbers Statistics (Exercise 3) ----------------
    private static void numbersStatistics(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter integers (type 'end' to finish):");

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("end")) break;

            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, try again.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        int min = numbers.get(0), max = numbers.get(0), sum = 0;
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
            sum += n;
        }

        double average = (double) sum / numbers.size();
        System.out.printf("Min: %d, Max: %d, Average: %.2f%n", min, max, average);

        System.out.print("Numbers divisible by 5 until first > 150: ");
        for (int n : numbers) {
            if (n > 150) break;
            if (n % 5 == 0) System.out.print(n + " ");
        }
        System.out.println();
    }
}
