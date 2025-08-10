package Lecture5;

public class IsEven8 {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(4));  // true
        System.out.println(isEven(7));  // false
    }
}

