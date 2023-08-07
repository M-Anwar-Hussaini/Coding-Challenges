// https://codeforces.com/problemset/problem/1462/C
import java.util.*;

public class x1462C_UniqueNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int num = input.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 9; i > 0; i--) {
                if(num >= i){
                    sb.insert(0, i);
                    num -= i;
                }
            }
            System.out.println(num == 0 ? sb : -1);
        }

    }

}
