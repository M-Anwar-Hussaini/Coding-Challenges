
import java.util.*;

public class x1373B_01Game {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            String str = input.next();
            int result = 0;
            boolean flag = true;
            while (flag) {
                if (str.contains("01")) {
                    result++;
                    str = str.replaceFirst("01", "");
                } else if (str.contains("10")) {
                    str = str.replaceFirst("10", "");
                    result++;
                } else {
                    flag = false;
                }
            }
            System.out.println(result % 2 == 0 ? "NET" : "DA");
        }
    }

}
