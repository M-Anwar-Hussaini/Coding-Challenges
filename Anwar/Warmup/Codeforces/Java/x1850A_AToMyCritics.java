
import java.util.*;

public class x1850A_AToMyCritics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int result = (a + b + c) - Math.min(a, Math.min(b, c));
            System.out.println(result >= 10 ? "YES" : "NO");
        }
    }

}
