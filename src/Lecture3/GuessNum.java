package Lecture3;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        int num = 15;
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Guess my number");
        do {
            guess = sc.nextInt();
            if (num == guess) {
                System.out.println("Yes. That's the number");
                break;
            } else if (num > guess) {
                System.out.println("The number is higher");
            } else {
                System.out.println("The number is lower");
            }
            System.out.println("Please try again");
            attempts++;
        } while (attempts < 10);
    }
}
