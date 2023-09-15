
import java.util.Scanner;

public class X208A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String result = string.replaceAll("WUB", " ");
        System.out.println(result);
    }
}
