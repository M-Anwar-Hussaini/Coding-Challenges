
import java.util.Scanner;

public class X200B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) {
            int pi = scanner.nextInt();
            total += pi;
        }
        double result = (double) total / n;
        System.out.println(result);
    }
}
