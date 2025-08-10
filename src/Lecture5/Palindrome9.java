package Lecture5;

public class Palindrome9 {

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(5));         // true
        System.out.println(isPalindrome(121));       // true
        System.out.println(isPalindrome(3443));      // true
        System.out.println(isPalindrome(123454321)); // true
        System.out.println(isPalindrome(123));       // false
    }
}

