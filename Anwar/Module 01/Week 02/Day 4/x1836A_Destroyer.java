
import java.util.Scanner;

public class x1836A_Destroyer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        while (test-- > 0) {
            int n = input.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int val = input.nextInt();
                if (val < n) {
                    arr[val]++;
                } else {
                    arr[n] = 1000000;
                }
            }

            boolean good = true;
            for (int i = 1; i <= n; i++) {
                if (arr[i] > arr[i - 1]) {
                    good = false;
                    break;
                }
            }

            System.out.println(good ? "YES" : "NO");
        }
    }
}
