
import java.util.*;

public class x1296A_ArraywithOddSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int odds = 0;
            int evens = 0;
            long total = 0;
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();
                total += num;
                if (num % 2 == 0) {
                    evens++;
                } else {
                    odds++;;
                }
            }
            if (total % 2 == 1) {
                System.out.println("YES");
            } else if (odds > 0 && evens > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}
