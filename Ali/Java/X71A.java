
import java.util.Scanner;

public class X71A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                word = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
            }
            System.out.println(word);
        }
    }
}
