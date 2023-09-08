
import java.util.Scanner;

public class X677A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a <= h) {
                result++;
            } else {
                result += 2;
            }
        }
        System.out.println(result);
    }
}
