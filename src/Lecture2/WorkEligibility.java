package Lecture2;

import java.util.Scanner;

public class WorkEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre your age: ");
        int age = sc.nextInt();

        if (age >= 16) {
            System.out.println("You're " + age + " years old and eligible to work. Go to work...");
        } else if (age >= 0) {
            System.out.println("You're " + age + " years old and not quite ready for a job. Enjoy being a kid while it lasts!");
        } else {
            System.out.println("Wait...Negative age? Stop jocking! Enter a valid age!");
        }
    }
}
