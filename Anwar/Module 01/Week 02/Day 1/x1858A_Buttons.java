
import java.util.*;

public class x1858A_Buttons {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            long a = input.nextLong();
            long b = input.nextLong();
            long c = input.nextLong();
            long d = a + b + c;
            if(a == b){
                System.out.println(c % 2 == 0 ? "Second":"First");
            } else if(a > b){
                System.out.println("First");
            }else {
                System.out.println("Second");
            }
        }
    }

}
