package Lecture2;

import java.util.Scanner;

public class VacationType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter type of vacation (Beach or Mountain): ");
        String vacationType = sc.nextLine();

        System.out.print("Enter budget per day: ");
        double budget = sc.nextDouble();

        if (vacationType.equals("Beach")) {
            if (budget < 50) {
                System.out.println("We recommend: Bulgaria");
            } else {
                System.out.println("We recommend: Outside Bulgaria");
            }
        } else if (vacationType.equals("Mountain")) {
            if (budget < 30) {
                System.out.println("We recommend: Bulgaria");
            } else {
                System.out.println("We recommend: Outside Bulgaria");
            }
        } else {
            System.out.println("No information about this type of vacation.");
        }
    }
}


