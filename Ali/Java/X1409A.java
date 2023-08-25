
import java.util.Scanner;


public class X1409A {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int diff = Math.abs(a - b);
            int m = diff / 10;
            int r = diff % 10;
            if (r > 0) {
                m++;
            }
            System.out.println(m);
        }
    }
}
