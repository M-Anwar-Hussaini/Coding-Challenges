
import java.util.Scanner;

public class X122A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {4, 7, 44, 47, 74, 77, 444, 447, 474, 744, 777, 774, 747, 477};
        boolean result = false;
        for (int lucky : arr) {
            if (n % lucky == 0) {
                result = true;
            }
        }
        System.out.println(result?"YES":"NO");
    }
}
