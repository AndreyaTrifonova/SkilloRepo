package Lecture2;

import java.util.Scanner;

public class TrianglesTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle of the triangle: ");
        int angle1 = sc.nextInt();
        System.out.println("Enter the second angle: ");
        int angle2 = sc.nextInt();
        System.out.println("Enter the third angle: ");
        int angle3 = sc.nextInt();
        int angleSum = angle1 + angle2 + angle3;

        if (angleSum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            if (angle1 > 90 && angle2 > 90 && angle3 > 90) {
                System.out.println("Obtuse- angled (тъпоъгълен)");
            } else if (angle1 == 90 && angle2 == 90 && angle3 == 90){
                System.out.println("Right-angled (правоъгълен)");
            } else {
                System.out.println("Acute-angled (остроъгълен)");
            }

            if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
                System.out.println("Isosceles (равнобедрен)");
            } else {
                System.out.println("Multifaced (разностраннем)");
            }
        }  else {
            System.out.println("Triangle not possible");
        }
    }
}
