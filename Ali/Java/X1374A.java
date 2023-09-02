
import java.util.Scanner;

public class X1374A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int n = scanner.nextInt();

            int k = (n - y) / x;
            int answer = k * x + y;

            System.out.println(answer);
        }
    }
}
