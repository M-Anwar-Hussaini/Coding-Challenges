
import java.util.HashSet;
import java.util.Scanner;

public class X1791A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        HashSet<Character> set = new HashSet<>();
        String codeforces = "codeforces";
        for (char ch : codeforces.toCharArray()) {
            set.add(ch);
        }
        while (t-- > 0) {
            char c = scanner.next().charAt(0);
            System.out.println(set.contains(c) ? "YES" : "NO");
        }
    }
}
