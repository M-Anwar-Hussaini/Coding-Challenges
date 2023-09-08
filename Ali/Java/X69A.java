
import java.util.Scanner;

public class X69A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumX = 0, sumY = 0, sumZ = 0;

        for (int i = 0; i < n; i++) {
            int xi = scanner.nextInt();
            int yi = scanner.nextInt();
            int zi = scanner.nextInt();

            sumX += xi;
            sumY += yi;
            sumZ += zi;
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
