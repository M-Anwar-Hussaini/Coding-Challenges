
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class X1512A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            int n = scanner.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                a.add(num);
            }
            int index = -1;
            for (int num : a) {
                if (Collections.frequency(a, num) == 1) {
                    index = num;
                    break;
                }
            }
            System.out.println(a.indexOf(index)+1);
        }
    }
}
