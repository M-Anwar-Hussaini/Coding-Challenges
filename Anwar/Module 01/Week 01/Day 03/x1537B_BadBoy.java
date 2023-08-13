
import java.util.*;

public class x1537B_BadBoy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int i = input.nextInt();
            int j = input.nextInt();
            if (n != i || m != j) {
                System.out.printf("%d %d %d %d\n", n, m, 1, 1);
            } else {
                System.out.printf("%d %d %d %d\n", 1, 1, n, m);

            }
        }
    }

}
