
import java.util.Scanner;

public class X1296A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }

            if (sum % 2 == 1) {
                System.out.println("YES");
            } else {
                boolean hasOdd = false;
                boolean hasEven = false;

                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 == 0) {
                        hasEven = true;
                    } else {
                        hasOdd = true;
                    }
                }
                System.out.println(hasOdd && hasEven ? "YES" : "NO");
            }
        }
    }
}
