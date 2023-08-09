
import java.util.Scanner;

public class X58A_Chatroom {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String string = input.next();
        String word = "hello";

        int i = 0;
        for (char c : string.toCharArray()) {
            if (c == word.charAt(i)) {
                i++;
            }
            if (i == word.length()) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
