package Exercise1;

public class TriangleArea {
    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double c = 9;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("A = √[ " + s + " * (" + s+ " - " + a+ ") * (" + s+ " - " + b +") * (" + s+ " - " + c +" )] = " + area );
    }
}
