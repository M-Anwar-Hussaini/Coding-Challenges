
import java.util.*;

public class x1851A_EscalatorConversations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            int H = input.nextInt();
            int counter = 0;
            for (int i = 0; i < n; i++) {
                int num = Math.abs(H - input.nextInt());
                if (num != 0 && num % k == 0 && num / k < m) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }

}
