package Lecture2;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int dayNumber = sc.nextInt();

        String dayName;
        String suffix;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                suffix = "-st";
                break;
            case 2:
                dayName = "Tuesday";
                suffix = "-nd";
                break;
            case 3:
                dayName = "Wednesday";
                suffix = "-rd";
                break;
            case 4:
                dayName = "Thursday";
                suffix = "-th";
                break;
            case 5:
                dayName = "Friday";
                suffix = "-th";
                break;
            case 6:
                dayName = "Saturday";
                suffix = "-th";
                break;
            case 7:
                dayName = "Sunday";
                suffix = "-th";
                break;
            default:
                System.out.println("Invalid day number (Enter a number between 1 and 7).");
                return;
        }

        System.out.println("The " + dayNumber + suffix + " day of the week is " + dayName + ".");

    }
}

