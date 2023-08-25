
import java.util.Scanner;

public class X1619A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            String a = s.substring(0, s.length() / 2);
            String b = s.substring(s.length() / 2, s.length());
            System.out.println(a.equals(b)?"YES":"NO");
        }
    }
}
