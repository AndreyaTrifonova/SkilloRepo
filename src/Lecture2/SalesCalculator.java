package Lecture2;

import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = unitPrice * quantity;
        double discountRate;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15; // (15 /100)
        } else if (quantity > 120) {
            discountRate = 0.20;
        } else {
            discountRate = 0.0;
        }

        double discount = totalPrice * discountRate;
        double revenue = totalPrice - discount;

        System.out.printf("The revenue from sale: %.2f$\n", revenue);
        System.out.printf("Discount: %.2f$ (%.1f%%)\n", discount, discountRate * 100);

    }
}

