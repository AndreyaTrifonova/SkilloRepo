package Lecture5;

public class WordCounter4 {

    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String text = "Java is fun to learn";
        System.out.println("Word count: " + countWords(text)); // Output: 5
    }
}

