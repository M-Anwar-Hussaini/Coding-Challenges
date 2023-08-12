
import java.util.*;

public class x1529A_EshagLovesBigArrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i = 0; i < n; i++){
                int num = input.nextInt();
                int value = map.getOrDefault(num, 0) + 1;
                map.put(num, value);
            }
            System.out.println(n - map.get(map.firstKey()));
        }
    }

}
