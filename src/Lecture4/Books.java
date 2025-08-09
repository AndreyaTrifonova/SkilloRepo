package Lecture4;

import java.util.Scanner;
import java.util.Stack;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> books = new Stack<>();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Book Stack Menu ===");
            System.out.println("1. Add a book");
            System.out.println("2. View the last book");
            System.out.println("3. Remove the last book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the title of the book: ");
                    String newBook = sc.nextLine();
                    books.push(newBook);
                    System.out.println("\"" + newBook + "\" has been added to the stack.");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books in the stack.");
                    } else {
                        System.out.println("The last book is: " + books.peek());
                    }
                    break;

                case 3:
                    if (books.isEmpty()) {
                        System.out.println("No books to remove.");
                    } else {
                        String removed = books.pop();
                        System.out.println("\"" + removed + "\" has been removed from the stack.");
                    }
                    break;

                case 4:
                    System.out.println("Closing the Book Stack Manager. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select from 1 to 4.");
            }
        }

        sc.close();
    }
}

