
import java.util.HashMap;
import java.util.Scanner;

public class X4C_RegistrationSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        input.nextLine();
        HashMap<String, Integer> data = new HashMap<>();
        while (testCase-- > 0) {
            String temp = input.nextLine();
            if (!data.containsKey(temp)) {
                data.put(temp, 0);
                System.out.println("OK");
            } else {
                int newCount = data.get(temp) + 1;
                data.put(temp, newCount);
                System.out.println(temp + newCount);
            }
        }
    }
}
