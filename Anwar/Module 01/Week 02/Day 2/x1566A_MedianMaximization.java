
import java.util.*;

public class x1566A_MedianMaximization {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int s = input.nextInt();
            int k = (n/2) + 1;
            System.out.println(s / k);
        }
    }

}
