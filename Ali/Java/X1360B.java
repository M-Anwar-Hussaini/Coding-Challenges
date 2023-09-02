
import java.util.Arrays;
import java.util.Scanner;

public class X1360B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[n - 1];
            for (int i = 1; i < n; i++) {
                min = Math.min(min, arr[i] - arr[i - 1]);
            }
            System.out.println(min);
        }
    }

}
