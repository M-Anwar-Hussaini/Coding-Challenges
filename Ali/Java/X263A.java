
import java.util.Scanner;

public class X263A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int x = 0;
        int y = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = scanner.nextInt();
                if (temp == 1) {
                    x = i;
                    y = j;
                }
                matrix[i][j] = temp;
            }
        }
        System.out.println(Math.abs(2 - x) + Math.abs(2 - y));
    }
}
