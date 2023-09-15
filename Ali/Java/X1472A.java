
import java.util.Scanner;

public class X1472A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int n = scanner.nextInt();
            
            int pieces = 1;
            while (w % 2 == 0) {
                w /= 2;
                pieces *= 2;
            }
            
            while (h % 2 == 0) {
                h /= 2;
                pieces *= 2;
            }
            
            if (pieces >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
