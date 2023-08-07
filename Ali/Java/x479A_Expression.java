import java.util.Scanner;

public class x479A_Expression {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int center = input.nextInt();
        int right = input.nextInt();
        int uzb1 = (center + Math.min(left, right)) * Math.max(left, right);
        int uzb2 = (center + Math.max(left, right)) * Math.min(left, right);
        int multi = left * center * right;
        int sum = left + center + right;
        int maxResult_1 = Math.max(multi, sum);
        int maxResult_2 = Math.max(uzb1, uzb2);
        System.out.println(maxResult_1 >= maxResult_2 ? maxResult_1 : maxResult_2);
    }
}
