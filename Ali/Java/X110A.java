
import java.util.Scanner;

public class X110A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int result = 0;
        String numberString = String.valueOf(n);
        for (char s : numberString.toCharArray()) {
            if (s == '4' || s == '7') {
                result++;
            }
        }
        System.out.println((result == 4 || result == 7) ? "YES" : "NO");
    }
}
