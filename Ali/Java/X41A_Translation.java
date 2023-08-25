
import java.util.Scanner;

public class X41A_Translation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String one = input.nextLine();
        String two = input.nextLine();
        String result = "";
        for (int length = one.length() - 1; length >= 0; length--) {
            result += one.charAt(length);
        }
        System.out.println(result.equals(two) ? "YES" : "NO");
    }
}
