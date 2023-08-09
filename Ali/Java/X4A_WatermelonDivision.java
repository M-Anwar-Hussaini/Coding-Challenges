
import java.util.Scanner;

public class X4A_WatermelonDivision {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int weight = input.nextInt();

        System.out.println((weight % 2 == 0 && weight > 2) ? "YES" : "NO");
    }
}
