
import java.util.HashSet;
import java.util.Scanner;

public class X118A_StringTask {

    public static void main(String[] args) {

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        for (char c : string.toCharArray()) {
            char a = Character.toLowerCase(c);
            if (!vowels.contains(a)) {
                System.out.print("." + a);
            }
        }
        System.out.println("");
    }
}
