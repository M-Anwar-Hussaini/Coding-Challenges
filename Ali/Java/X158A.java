
import java.util.Scanner;

public class X158A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int kScore = arr[k - 1];
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] >= kScore) {
                result++;
            }
        }
        System.out.println(result);
    }
}
