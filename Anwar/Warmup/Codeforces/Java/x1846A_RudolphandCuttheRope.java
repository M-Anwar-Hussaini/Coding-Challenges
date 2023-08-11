//https://codeforces.com/problemset/problem/1846/A
import java.util.*;

public class x1846A_RudolphandCuttheRope {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int counter = 0;
            for(int i = 0; i < n; i++){
                if(input.nextInt() - input.nextInt() > 0){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }

}
