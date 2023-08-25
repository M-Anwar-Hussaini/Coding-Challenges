
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class X758A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arraylist.add(input.nextInt());
        }
        int maxNumber = Collections.max(arraylist);
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += maxNumber - arraylist.get(i);
        }
        System.out.println(total);
    }
}
