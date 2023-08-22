import java.util.*;

public class x1822A_TubeTubeFeed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            int t = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = input.nextInt();
            }
            
            for(int i = 0; i < n; i++){
                b[i] = input.nextInt();
            }
            int max = -2;
            int entertainment = -2;
            for(int i = 0; i < n; i++){
                if(t-i >= a[i] && b[i] >= entertainment){
                    max = i;
                    entertainment = b[i];
                }
            }
            System.out.println(max + 1);
        }
    }

}
