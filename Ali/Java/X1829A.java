
import java.util.Scanner;

public class X1829A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != "codeforces".charAt(i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
