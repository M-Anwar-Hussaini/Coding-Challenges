
import java.util.*;

public class x1650B_DivOrMod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {

            
            int l = input.nextInt();
            int r = input.nextInt();
            int a = input.nextInt();

            int max = (r / a) + (r % a);
            int x = r - (r % a) - 1;
            if (x >= l && x <= r) {
                max = Math.max(max, ((x / a) + (x % a)));
            }
            System.out.println(max);
        }

    }

}
