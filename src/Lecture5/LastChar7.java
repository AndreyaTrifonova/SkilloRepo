package Lecture5;

public class LastChar7 {

    public static void displayLastCharacter(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("The string is empty. No last character.");
        } else {
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Last character: " + lastChar);
        }
    }

    public static void main(String[] args) {
        displayLastCharacter("Hello");
        displayLastCharacter("");
    }
}

