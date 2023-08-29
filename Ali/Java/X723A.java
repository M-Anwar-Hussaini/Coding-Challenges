
import java.util.Arrays;
import java.util.Scanner;

public class X723A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = new int[3];
        coordinates[0] = scanner.nextInt();
        coordinates[1] = scanner.nextInt();
        coordinates[2] = scanner.nextInt();
        Arrays.sort(coordinates);
        System.out.println(coordinates[2] - coordinates[0]);
    }
}
