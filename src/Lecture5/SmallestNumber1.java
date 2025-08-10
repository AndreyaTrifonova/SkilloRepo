package Lecture5;

public class SmallestNumber1 {
    public static void main(String[] args) {
        int[] numbers = {15,189,85};
        smallestNumber(numbers);
    }

    public static void smallestNumber(int[] numbers){
        int smallestNumber = numbers[0];
        for(int number : numbers){
            if (smallestNumber > number){
                smallestNumber = number;
            }
        }
        System.out.println("The smallest number is: " + smallestNumber);
    }
}
