
import java.util.Scanner;

public class X1551A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long c1, c2;
            if (n % 3 == 0) {
                c1 = n / 3;
                c2 = n / 3;
            } else {
                c1 = (n / 3) + 1;
                c2 = n / 3;
            }
            if (c1 + c2 * 2 != n) {
                System.out.println(c2 + " " + c1);
            } else {
                System.out.println(c1 + " " + c2);
            }
        }
    }
}
