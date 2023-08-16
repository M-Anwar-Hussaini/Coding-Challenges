
import java.util.Scanner;


public class X266A_StonesOnTheTable {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String colors = input.nextLine();
        int removals = 0;
        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                removals++;
            }
        }
        System.out.println(removals);
    }
    
}
