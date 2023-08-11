
import java.util.Scanner;

public class X546A_SoldierandBananas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int firstBanana = input.nextInt();
        int dollarAmount = input.nextInt();
        int neededBanana = input.nextInt();
        int lastBanana = firstBanana * neededBanana;
        int result = (((firstBanana + lastBanana) * neededBanana) / 2) - dollarAmount;
        System.out.println(result > 0 ? result : 0);
    }
}
