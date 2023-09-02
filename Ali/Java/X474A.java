
import java.util.Scanner;

public class X474A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char shift = scanner.next().charAt(0);
        String word = scanner.next();

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String message = "";

        for (char c : word.toCharArray()) {
            int index = keyboard.indexOf(c);
            if (shift == 'L') {
                index += 1;
            } else {
                index -= 1;
            }
            message += keyboard.charAt(index);
        }

        System.out.println(message);
    }
}
