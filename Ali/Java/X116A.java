
import java.util.Scanner;

public class X116A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minCap = 0;
        int currentCap = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            currentCap -= a;
            currentCap += b;
            if (currentCap > minCap) {
                minCap = currentCap;
            }
        }
        System.out.println(minCap);
    }
}
