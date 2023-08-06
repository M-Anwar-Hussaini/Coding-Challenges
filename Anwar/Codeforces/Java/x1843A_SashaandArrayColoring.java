
import java.util.*;

public class x1843A_SashaandArrayColoring {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while (test-- > 0) {
            int len = input.nextInt();
            LinkedList<Integer> list = new LinkedList();
            for (int i = 0; i < len; i++) {
                list.add(input.nextInt());
            }
            Collections.sort(list);
            int result = 0;
            for (int i = 0; i < len / 2; i++) {
                result += list.pollLast() - list.pollFirst();
            }
            System.out.println(result);
        }
    }

}
