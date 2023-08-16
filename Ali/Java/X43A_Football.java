
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class X43A_Football {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> goals = new ArrayList<>();
        int testCase = input.nextInt();
        input.nextLine();
        while (testCase-- > 0) {
            goals.add(input.nextLine());
        }
        String item1 = goals.get(0);
        String item2 = "";
        for (String goal : goals) {
            if (!goal.equals(item1)) {
                item2 = goal;
                break;
            }
        }
        System.out.println(Collections.frequency(goals, item1) > Collections.frequency(goals, item2) ? item1 : item2);
    }
}
