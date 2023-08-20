
import java.util.*;

public class x1454B_UniqueBidAuction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int n = input.nextInt();
            TreeMap<Integer, Integer> indexes = new TreeMap<>();
            TreeMap<Integer, Integer> map = new TreeMap();
            for (int i = 0; i < n; i++) {
                int key = input.nextInt();
                int value = map.getOrDefault(key, 0) + 1;
                map.put(key, value);
                if (!indexes.containsKey(key)) {
                    indexes.put(key, i + 1);
                }
            }

            int target = -1;
            for (int key : map.keySet()) {
                if (map.get(key) == 1) {
                    target = indexes.get(key);
                    break;
                }
            }
            System.out.println(target);
        }
    }

}
