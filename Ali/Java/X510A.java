
import java.util.Scanner;

public class X510A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                } else if (i % 4 == 1 && j == m - 1) {
                    System.out.print("#");
                } else if (i % 4 == 3 && j == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
