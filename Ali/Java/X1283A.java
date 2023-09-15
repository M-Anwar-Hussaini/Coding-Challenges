import java.util.Scanner;
public class X1283A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int result = (24 * 60) - (h * 60 + m);
            System.out.println(result);
        }
    }
}
