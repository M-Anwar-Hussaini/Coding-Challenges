
import java.util.*;

public class x1519B_TheCakeIsaLie {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();

            int result = (n - 1) + ((m - 1) * n);
            System.out.println(result == k ? "YES" : "NO");
        }
    }

}
