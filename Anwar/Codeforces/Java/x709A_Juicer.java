
import java.util.*;

public class x709A_Juicer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b = input.nextInt();
        int d = input.nextInt();
        int squized = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if (num <= b) {
                if (squized + num <= d) {
                    squized += num;
                } else {
                    squized = 0;
                    counter++;
                }

            }
        }
        if (squized > d) {
            counter++;
        }
        System.out.println(counter);
    }

}
