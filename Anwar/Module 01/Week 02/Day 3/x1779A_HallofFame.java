
import java.util.*;

public class x1779A_HallofFame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            String str = input.next();
            if (!str.contains("R") || !str.contains("L")) {
                System.out.println("-1");
            } else if (str.charAt(0) == 'R' && str.charAt(n-1) == 'L') {
                System.out.println("0");
            } else {
                System.out.println(str.indexOf("LR") +1);
            }
        }
    }

}
