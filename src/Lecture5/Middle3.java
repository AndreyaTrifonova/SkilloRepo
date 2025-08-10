package Lecture5;

public class Middle3 {

    public static void displayMiddleCharacter(String str) {
        int length = str.length();

        if (length == 0) {
            System.out.println("The string is empty.");
            return;
        }

        if (length % 2 == 0) {
            int mid1 = (length / 2) - 1;
            int mid2 = length / 2;
            System.out.println("Middle characters: " + str.charAt(mid1) + str.charAt(mid2));
        } else {
            int mid = length / 2;
            System.out.println("Middle character: " + str.charAt(mid));
        }
    }

    public static void main(String[] args) {
        displayMiddleCharacter("hello");
        displayMiddleCharacter("worlds");
        displayMiddleCharacter("");
    }
}

