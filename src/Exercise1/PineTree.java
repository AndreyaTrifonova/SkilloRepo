package Exercise1;

public class PineTree {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i * 2); k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
