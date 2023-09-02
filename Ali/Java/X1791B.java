
import java.util.Scanner;

public class X1791B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String moves = scanner.nextLine();
            int x = 0, y = 0;
            for (char move : moves.toCharArray()) {
                if (move == 'L') {
                    x--;
                } else if (move == 'R') {
                    x++;
                } else if (move == 'U') {
                    y++;
                } else if (move == 'D') {
                    y--;
                }
                if (x == 1 && y == 1) {
                    System.out.println("YES");
                    break;
                }
            }
            if (x != 1 || y != 1) {
                System.out.println("NO");
            }
        }
    }
}
