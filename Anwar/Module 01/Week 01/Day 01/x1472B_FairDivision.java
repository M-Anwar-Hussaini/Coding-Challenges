
import java.util.*;

public class x1472B_FairDivision {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int len = input.nextInt();
            int ones = 0;
            int twos = 0;
            for (int i = 0; i < len; i++) {
                if (input.nextInt() == 1) {
                    ones++;
                } else {
                    twos++;
                }
            }

            if (ones % 2 == 1) {
                System.out.println("NO");
                continue;
            }

            if (twos % 2 == 0) {
                System.out.println("YES");
            } else {
                if (ones >= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
