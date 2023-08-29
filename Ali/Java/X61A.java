
import java.util.Scanner;

public class X61A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number1 = input.nextLine();
        String number2 = input.nextLine();
        String result = "";
        for (int i = 0; i < number1.length(); i++) {
            if (number1.charAt(i) == number2.charAt(i)) {
                result += '0';
            } else {
                result += '1';
            }
        }
        System.out.println(result);
    }
}
