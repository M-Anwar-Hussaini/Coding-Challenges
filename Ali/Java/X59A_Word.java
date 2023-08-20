
import java.util.Scanner;

public class X59A_Word {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                upper++;
            } else {
                lower++;
            }
        }
        System.out.println(upper>lower?word.toUpperCase():word.toLowerCase());
    }
}
