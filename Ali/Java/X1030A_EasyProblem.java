
import java.util.Scanner;

public class X1030A_EasyProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isEasy = true;
        while (n-- > 0) {
            int opinion = input.nextInt();
            if (opinion == 1) {
                isEasy = false;
                break;
            }
        }
        System.out.println(isEasy ? "EASY" : "HARD");
    }

}
