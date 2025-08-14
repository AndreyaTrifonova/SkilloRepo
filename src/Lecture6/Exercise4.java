package Lecture6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> books = new Stack<>();

        while (true) {
            System.out.println("Please use one of the following commands");
            System.out.println("PUSH <book title>");
            System.out.println("POP");
            System.out.println("PEEK");
            System.out.println("SEARCH <keyword>");
            System.out.println("EXIT");

            String input = scanner.nextLine().trim();
            String lowerInput = input.toLowerCase();

            if (lowerInput.equals("exit")) {
                break;
            }

            if (lowerInput.startsWith("push ")) {
                String title = input.substring(5).trim();
                books.push(title);
                System.out.println("Added book to the stack with title: " + title);

            } else if (lowerInput.equals("pop")) {
                if (books.isEmpty()) {
                    System.out.println("Book stack is empty.");
                } else {
                    String title = books.pop();
                    System.out.println("The book removed from the stack is: " + title);
                }

            } else if (lowerInput.equals("peek")) {
                if (books.isEmpty()) {
                    System.out.println("Book stack is empty.");
                } else {
                    System.out.println("The top book title is: " + books.peek());
                }

            } else if (lowerInput.startsWith("search ")) {
                String keyword = input.substring(7).trim().toLowerCase();
                ArrayList<String> foundTitles = new ArrayList<>();

                for (String title : books) {
                    if (title.toLowerCase().contains(keyword)) {
                        foundTitles.add(title);
                    }
                }

                if (!foundTitles.isEmpty()) {
                    System.out.println("Keyword found in: " + String.join(", ", foundTitles));
                } else {
                    System.out.println("Keyword not found in any title.");
                }

            } else {
                System.out.println("Invalid command. Please use one of: PUSH, POP, PEEK, SEARCH, EXIT.");
            }
        }

        scanner.close();
        System.out.println("Program ended.");
    }
}
