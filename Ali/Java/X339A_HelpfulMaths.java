
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class X339A_HelpfulMaths {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String arr = input.nextLine();
        ArrayList<Integer> number = new ArrayList<>();
        for (char c : arr.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                number.add(num);
            }
        }
        Collections.sort(number);
        for (int i = 0; i < number.size(); i++) {
            if (i == number.size() - 1) {
                System.out.print(number.get(i));
            } else {
                System.out.print(number.get(i) + "+");
            }
        }
        System.out.println("");
    }
}
