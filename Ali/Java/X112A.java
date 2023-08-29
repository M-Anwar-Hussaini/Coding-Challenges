
import java.util.Scanner;


public class X112A {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        String string1 = scanner.nextLine().toLowerCase();
        String string2 = scanner.nextLine().toLowerCase();
        
        int result = string1.compareTo(string2);
        
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

}
