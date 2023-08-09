
import java.util.Scanner;

public class X379A_NewYearCandles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int initialCandles = input.nextInt();
        int reusealbeCandles = input.nextInt();
        System.out.println(reuseableCandlesAmount(initialCandles, reusealbeCandles));
    }

    static int reuseableCandlesAmount(int candles, int unit) {
        if (candles >= unit) {
            int newCandles = candles / unit;
            int leftoverCandles = candles % unit;
            return candles - leftoverCandles + reuseableCandlesAmount(newCandles + leftoverCandles, unit);
        } else {
            return candles;
        }
    }
}
