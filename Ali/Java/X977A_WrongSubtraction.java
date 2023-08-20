
import java.util.Scanner;

public class X977A_WrongSubtraction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            if (n % 10 != 0) {
                n--;
            } else {
                n = n / 10;
            }
        }
        System.out.println(n);
    }

}
