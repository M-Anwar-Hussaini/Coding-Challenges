
import java.util.*;

public class x1492A_Threeswimmers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            long p = input.nextLong();

            long min = Long.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                long num = input.nextLong();
                if (p % num == 0) {
                    num = 0;
                } else if(p > num){
                    num = num - (p % num);
                } else {
                    num -= p;
                }
                min = Math.min(min, num);
            }
            System.out.println(min);
        }
    }

}
