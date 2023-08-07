
import java.util.*;

public class x230A_Dragons {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kirito_initial_Strength = input.nextInt();
        int dragons_amount = input.nextInt();

        int[][] dragons = new int[dragons_amount][2];

        for (int i = 0; i < dragons_amount; i++) {
            int dragon_Strength = input.nextInt();
            int bonus = input.nextInt();
            dragons[i][0] = dragon_Strength;
            dragons[i][1] = bonus;
        }

        Arrays.sort(dragons, (dragon1, dragon2) -> Integer.compare(dragon1[0], dragon2[0]));

        boolean flag = true;

        for (int[] dragon : dragons) {
            if (kirito_initial_Strength > dragon[0]) {
                kirito_initial_Strength += dragon[1];
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}
