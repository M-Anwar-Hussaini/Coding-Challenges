
import java.util.Scanner;

public class X1475A_OddDivisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while (testCase-- > 0) {
            long number = input.nextLong();
            boolean result = isOddDivisor(number);
            System.out.println(result ? "YES" : "NO");
        }
    }

    static boolean isOddDivisor(long number) {
        if (number == 1) {
            return false;
        } else if (number % 2 == 1) {
            return true;
        }
        return isOddDivisor(number / 2);
    }
}
