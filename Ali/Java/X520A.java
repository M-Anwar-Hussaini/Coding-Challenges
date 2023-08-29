
import java.util.HashSet;
import java.util.Scanner;

public class X520A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine().toLowerCase();
        HashSet<Character> charlist = new HashSet<>();
        for (char c : input.toCharArray()) {
            charlist.add(c);
        }
        System.out.println((charlist.size() == 26) ? "YES" : "NO");
    }

}
