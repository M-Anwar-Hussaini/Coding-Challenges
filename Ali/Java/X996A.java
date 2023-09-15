
import java.util.Scanner;

public class X996A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        int[] arr = {100, 20, 10, 5, 1};
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            while (n >= a) {
                n -= a;
                result++;
            }
        }
        System.out.println(result);
    }
}
