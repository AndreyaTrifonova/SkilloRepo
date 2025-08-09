package Lecture4;

import java.util.Scanner;
import java.util.Stack;

public class FiveBookPile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> books = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter title for book " + i + ": ");
            books.push(sc.nextLine());
        }

        System.out.print("\nEnter the title of the book you want to get: ");
        String searchTitle = sc.nextLine();

        Stack<String> tempStack = new Stack<>();
        boolean found = false;

        while (!books.isEmpty()) {
            String topBook = books.pop();
            if (topBook.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found and retrieved: " + topBook);
                found = true;
                break;
            } else {
                tempStack.push(topBook);
            }
        }

        while (!tempStack.isEmpty()) {
            books.push(tempStack.pop());
        }

        if (!found) {
            System.out.println("Book not found in the pile.");
        }

        System.out.println("\nRemaining books in the pile:");
        for (String book : books) {
            System.out.println(book);
        }

        sc.close();
    }
}
