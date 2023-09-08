
import java.util.Scanner;

public class X540A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int moves = 0;
        for (int i = 0; i < n; i++) {
            int ac = a.charAt(i);
            int bc = b.charAt(i);
            int diff = Math.abs(ac - bc);

            moves += Math.min(diff, 10 - diff);
        }
        System.out.println(moves);
    }
}
