
import java.util.HashSet;
import java.util.Scanner;

public class X236A_BoyorGirl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        HashSet<Character> distinctChar = new HashSet<>();
        for (char c : userName.toCharArray()) {
            distinctChar.add(c);
        }
        System.out.println(distinctChar.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
