
import java.util.*;


public class x1833A_MusicalPuzzle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-- > 0){
            int n = input.nextInt();
            String str = input.next();
            HashSet<String> set = new HashSet<>();
            for(int i = 0; i < n-1; i++){
                set.add(str.substring(i, i + 2));
            }
            System.out.println(set.size());
        }
    }

}
