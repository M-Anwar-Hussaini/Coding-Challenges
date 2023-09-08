
import java.util.Scanner;

public class X1352C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long k = scanner.nextLong();
            long result = (k) + (k - 1) / (n - 1);
            System.out.println(result);
        }
    }
}
