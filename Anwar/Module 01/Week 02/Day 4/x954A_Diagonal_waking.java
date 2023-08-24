
import java.util.Scanner;

public class x954A_Diagonal_waking {

    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        input.nextInt();
        String str = input.next();
        System.out.println(str.replaceAll("RU|UR", "R").length());
    }
}
