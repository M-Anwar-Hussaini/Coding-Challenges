
import java.util.Scanner;

public class X313A_BankAccount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        long lastNumber = number % 10;
        long lastTwoDigits = (number / 10) % 10;
        long result = 0;
        if (number < 0) {
            if (lastNumber > lastTwoDigits) {
                long temp = number / 100;
                result = temp *10 +lastNumber;
            } else {
                result = number / 10;
            }
        }
        System.out.println(number > 0 ? number : result);
    }
}
