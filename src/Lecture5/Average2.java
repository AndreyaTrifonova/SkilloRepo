package Lecture5;

public class Average2 {

    public static double averageOfThree(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
    public static void main(String[] args) {
        double avg = averageOfThree(10, 20, 30);
        System.out.println("Average: " + avg);
    }
}

