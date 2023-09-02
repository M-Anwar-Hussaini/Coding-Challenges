
import java.util.Scanner;


public class X460A {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int days = n + (n - 1) / (m - 1);
        
        System.out.println(days);
    }
    
}
