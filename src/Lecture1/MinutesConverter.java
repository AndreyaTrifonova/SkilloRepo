package Lecture1;

public class MinutesConverter {
    public static void main(String[] args) {
        int minutes = 535701;
        int minutesInYear = 60 * 24 * 365;

        int years = minutes / minutesInYear;
        int remaining = minutes % minutesInYear;
        int days = remaining / (60 * 24);
        System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
    }
}
