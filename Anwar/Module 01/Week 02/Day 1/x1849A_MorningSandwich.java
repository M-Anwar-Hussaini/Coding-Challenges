
import java.util.*;

public class x1849A_MorningSandwich {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int bread = input.nextInt();
            int cheese = input.nextInt() + input.nextInt();

            System.out.println(bread > cheese ? cheese + cheese + 1 : bread + bread - 1);

        }
    }

}
