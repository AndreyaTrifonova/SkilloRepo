package Lecture2;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.println("Choose conversion direction:");
        System.out.println("1 - Celsius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Celsius");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            double result = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C is %.2f°F\n", temperature, result);
        } else if (choice == 2) {
            double result = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F is %.2f°C\n", temperature, result);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

    }
}
