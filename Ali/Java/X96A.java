
import java.util.Scanner;

public class X96A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int Zeros = 0;
        int Ones = 0;

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);

            if (a == '0') {
                Zeros++;
                Ones = 0;
            } else {
                Ones++;
                Zeros = 0;
            }
            if (Zeros >= 7 || Ones >= 7) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
