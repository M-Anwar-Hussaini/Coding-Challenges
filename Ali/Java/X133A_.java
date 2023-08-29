
import java.util.Scanner;

public class X133A_ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'H' || c == 'Q' || c == '9') {
                result = "YES";
                break;
            }
        }
        System.out.println(result == "YES" ? result : "NO");
    }
}
