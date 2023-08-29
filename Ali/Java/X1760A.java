
import java.util.Arrays;
import java.util.Scanner;

public class X1760A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] numbers = new int[3];
            numbers[0] = scanner.nextInt();
            numbers[1] = scanner.nextInt();
            numbers[2] = scanner.nextInt();
            Arrays.sort(numbers);
            System.out.println(numbers[1]);
        }
    }

}
