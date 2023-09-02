
import java.util.Scanner;

public class X742A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastDigit = 6;
        if (n == 0) {
            lastDigit = 1;
        } else if (n % 4 == 1) {
            lastDigit = 8;
        } else if (n % 4 == 2) {
            lastDigit = 4;
        } else if (n % 4 == 3) {
            lastDigit = 2;
        }

        System.out.println(lastDigit);
    }
}
