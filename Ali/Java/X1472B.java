
import java.util.Scanner;

public class X1472B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                int w = scanner.nextInt();
                if (w == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }
            System.out.println((count2 % 2 == 0 && count1 % 2 == 0 || (count2 % 2 == 1 && count1 % 2 == 0 && count1 > 0)) ? "YES" : "NO");
        }
    }
}
