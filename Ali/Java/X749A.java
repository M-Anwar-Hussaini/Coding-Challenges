
import java.util.Scanner;


public class X749A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int even = n / 2;
        int odd = n % 2 == 0 ? 0 : 1;
        System.out.println(even);
        String primes = "";
        for (int i = 0; i < even-odd; i++) {
            primes+="2 ";
        }
        if (odd == 1) {
            primes+="3";
        }
        System.out.println(primes);
    }
}
