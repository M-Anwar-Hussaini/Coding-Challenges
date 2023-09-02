
import java.util.Scanner;

public class X1186A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (m >= n && k >= n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
