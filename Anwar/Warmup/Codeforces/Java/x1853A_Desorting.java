
import java.util.*;

public class x1853A_Desorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int len = input.nextInt();
            int min = Integer.MAX_VALUE;
            int first = input.nextInt();
            for (int i = 1; i < len; i++) {
                int num = input.nextInt();
                min = Math.min(min, num - first);
                first = num;
            }
            min++;

            if (min < 0) {
                System.out.println(0);
            } else {
                System.out.println((int) Math.ceil(min / 2.0));
            }
        }
    }

}
