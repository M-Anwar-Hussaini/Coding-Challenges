
import java.util.Scanner;

public class X1692A_Marathon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while (testCase-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();

            int front = 0;

            if (a < b) {
                front++;
            }
            if (a < c) {
                front++;
            }
            if (a < d) {
                front++;
            }

            System.out.println(front);
        }
    }

}
