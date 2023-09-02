
import java.util.Scanner;

public class X1097A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tableCard = scanner.next();
        String[] handCards = new String[5];
        for (int i = 0; i < 5; i++) {
            handCards[i] = scanner.next();
        }
        boolean canPlay = false;
        for (String card : handCards) {
            if (card.charAt(0) == tableCard.charAt(0) || card.charAt(1) == tableCard.charAt(1)) {
                canPlay = true;
            }
        }
        System.out.println(canPlay?"YES":"NO");
    }
}
