
import java.util.Scanner;

public class X703A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int mishka = 0;
        int chris = 0;

        while (n-- > 0) {
            int mi = input.nextInt();
            int ci = input.nextInt();

            if (mi > ci) {
                mishka++;
            } else if (mi < ci) {
                chris++;
            }
        }
        if (mishka > chris) {
            System.out.println("Mishka");
        } else if (mishka < chris) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
    }
}
