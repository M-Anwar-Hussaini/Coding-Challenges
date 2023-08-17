
import java.util.Scanner;

public class X1335A_CandiesAndTwoSisters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        while (testCase-- > 0) {
            int number = input.nextInt();
            int ways = (number - 1) / 2;
            System.out.println(ways);
        }
    }
}
