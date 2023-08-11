
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class X405A_GravityFlip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            numbers.add(input.nextInt());
        }
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
