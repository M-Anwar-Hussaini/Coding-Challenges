
import java.util.Scanner;

public class X282A_Bit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        input.nextLine();
        for (int i = 0; i < n; i++) {
            String statement = input.nextLine();
            if (statement.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
