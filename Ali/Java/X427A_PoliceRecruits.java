
import java.util.Scanner;

public class X427A_PoliceRecruits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int crimes = 0;
        int police = 0;

        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            if (number == -1) {
                if (police == 0) {
                    crimes++;
                } else {
                    police--;
                }
            } else {
                police += number;
            }
        }
        System.out.println(crimes);
    }
}
