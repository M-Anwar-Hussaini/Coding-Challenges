
import java.util.Scanner;

public class X1814A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if ((n % 2 == 1 && k % 2 == 1) || n % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
