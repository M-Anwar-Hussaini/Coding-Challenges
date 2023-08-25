
import java.util.Scanner;

public class X1328A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int moves = 0;
            if (a % b != 0) {
                moves = b - a % b;
            }
            System.out.println(moves);
        }
    }
}
