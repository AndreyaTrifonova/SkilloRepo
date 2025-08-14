package Lecture6;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        int wordCount = countWords(inputText);
        char middle = middleChar(inputText);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Middle character: " + middle);

        sc.close();
    }

    public static int countWords(String inputText) {
        if (inputText == null || inputText.trim().isEmpty()) {
            return 0;
        }
        String[] words = inputText.trim().split("\\s+");
        return words.length;
    }

    public static char middleChar(String inputText) {
        if (inputText == null || inputText.isEmpty()) {
            throw new IllegalArgumentException("Input text cannot be empty");
        }
        int length = inputText.length();
        int middleIndex = (length % 2 == 0) ? (length / 2 - 1) : (length / 2);
        return inputText.charAt(middleIndex);
    }
}

