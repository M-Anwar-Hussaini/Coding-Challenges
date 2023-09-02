
import java.util.Scanner;

public class X1850A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a + b >= 10 || a + c >= 10 || b + c >= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
