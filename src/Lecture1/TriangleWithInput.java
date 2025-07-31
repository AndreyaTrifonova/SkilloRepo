package Lecture1;

import java.util.Scanner;

public class TriangleWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side a: ");
        double a = sc.nextDouble();
        System.out.println("Enter side b: ");
        double b = sc.nextDouble();
        System.out.println("Enter side c: ");
        double c = sc.nextDouble();

        double perimeter = a + b + c;
        System.out.println("P = " + a + " + " + b + " + " + c + " = " + perimeter);

        double s = perimeter/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("A = √[ " + s + " * (" + s+ " - " + a+ ") * (" + s+ " - " + b +") * (" + s+ " - " + c +" )] = " + area );
    }
}
