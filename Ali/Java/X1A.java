
import java.util.Scanner;

public class X1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        long x = (n + a - 1) / a;
        long y = (m + a - 1) / a;
        System.out.println(x * y);
    }
}
