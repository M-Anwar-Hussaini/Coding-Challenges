import java.util.Scanner;

public class X1327A_SumofOddIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        while (testCase-- > 0) {
            long n = input.nextLong();
            long k = input.nextLong();
            
            if ((n % 2 == k % 2) && (k * k <= n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
