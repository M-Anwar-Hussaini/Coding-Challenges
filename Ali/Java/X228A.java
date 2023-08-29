
import java.util.HashSet;
import java.util.Scanner;

public class X228A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<Integer> colors = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            colors.add(scanner.nextInt());
        }
        int result = 4 - colors.size();
        System.out.println(result);
    }
}
