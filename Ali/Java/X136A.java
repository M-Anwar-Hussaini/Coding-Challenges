
import java.util.Scanner;

public class X136A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            arr[a - 1] = i + 1;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
