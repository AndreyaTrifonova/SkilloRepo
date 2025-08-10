package Lecture5;

public class SecondLargestNum5 {
    public static Integer findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? null : secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 1, 9, 3, 7, 9};
        Integer result = findSecondLargest(numbers);

        if (result != null) {
            System.out.println("Second largest number: " + result);
        } else {
            System.out.println("No second largest number found.");
        }
    }
}
