package Lecture4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> customerLine = new LinkedList<>();
        boolean open = true;

        while (open) {
            System.out.println("\n=== Coffee Shop Queue ===");
            System.out.println("1. Add a customer to the line");
            System.out.println("2. Serve the next customer");
            System.out.println("3. View current line");
            System.out.println("4. Close shop");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = input.nextLine();
                    customerLine.add(customerName);
                    System.out.println(customerName + " has joined the line.");
                    break;

                case 2:
                    if (customerLine.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        String servedCustomer = customerLine.poll();
                        System.out.println("Serving: " + servedCustomer);
                    }
                    break;

                case 3:
                    if (customerLine.isEmpty()) {
                        System.out.println("The line is empty.");
                    } else {
                        System.out.println("Current line: " + customerLine);
                    }
                    break;

                case 4:
                    System.out.println("Closing the coffee shop. Goodbye!");
                    open = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1–4.");
            }
        }

        input.close();
    }
}

