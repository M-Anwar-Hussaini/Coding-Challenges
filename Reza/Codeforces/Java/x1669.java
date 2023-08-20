
import java.util.Scanner;

public class x1669A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        while (t-- > 0) {
            int n = in.nextInt();
            boolean div1 = n >= 1900;
            boolean div2 = n>=1600 && n<1900;
            boolean div3 = n>=1400 && n<1600;
            
            if(div1) System.out.println("Division 1");
            else if (div2) System.out.println("Division 2");
            else if (div3) System.out.println("Division 3");
            else System.out.println("Division 4");
        }
    }
    
}
