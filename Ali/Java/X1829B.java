
import java.util.Scanner;

public class X1829B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maxLength = 0;
            int currentLength = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    currentLength++;
                    maxLength = Math.max(maxLength, currentLength);
                } else {
                    currentLength = 0;
                }
            }

            System.out.println(maxLength);
        }
    }
}
